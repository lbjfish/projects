package com.bingobox.product.service.mq;

import com.aliyun.openservices.ons.api.*;
import com.aliyun.openservices.ons.api.bean.ProducerBean;
import com.bingobox.framework.constant.OrderConstant;
import com.bingobox.framework.util.JsonUtils;
import com.bingobox.order.dto.OrderInfoDTO;
import com.bingobox.product.framework.constant.MQConstant;
import com.bingobox.product.service.BoxInventoryService;
import com.bingobox.snapshot.dto.OrderProcessSnapshotDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.Date;

/**
 * Created by zhangfubin
 * 2017/7/15.16:26
 * projectName:Box
 * com.bingobox.box.service.mq
 */

public class MsgAdjustBoxInventoryByOrder implements MessageListener {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BoxInventoryService boxInventoryService;

    @Override
    public Action consume(Message message, ConsumeContext consumeContext) {
        logger.info("MsgListenerAdjustBoxInventoryByOrder.consume(message = {}, consumeContext = {})", message, consumeContext);

        OrderInfoDTO orderInfoDTO = null;
        try {
            orderInfoDTO = JsonUtils.parseObject(new String(message.getBody()), OrderInfoDTO.class);
        } catch (IOException e) {
            logger.warn("MsgAdjustBoxInventoryByOrder类,consume()方法, 消息体转OrderInfoDTO失败");
        }

        try {
            if(orderInfoDTO != null && orderInfoDTO.getListOrderDetail() != null && orderInfoDTO.getListOrderDetail().size() > 0){
                Integer updateCount = boxInventoryService.updateBoxInventoryCount(orderInfoDTO.getBoxId(), orderInfoDTO.getListOrderDetail());
                logger.info("MsgListenerAdjustBoxInventoryByOrder类,consume()方法,修改商品数量={}", updateCount);
                OrderProcessSnapshotDTO orderProcessSnapshotDTO = new OrderProcessSnapshotDTO();
                orderProcessSnapshotDTO.setOrderInfoId(orderInfoDTO.getOrderInfoId());
                orderProcessSnapshotDTO.setProcessStatus(OrderConstant.PayProcessStatus.ASYNC_UPDATE_BOX_INVENTORY);
                orderProcessSnapshotDTO.setCreateTime(new Date());
                orderProcessSnapshotDTO.setCreateUserId(orderInfoDTO.getCreateUserId());
                orderProcessSnapshotDTO.setRemark("修改盒子库存成功");

                ApplicationContext ctx = new ClassPathXmlApplicationContext("mq/mq-producer.xml");
                ProducerBean producer = (ProducerBean) ctx.getBean("producer");
                producer.start();

                // 异步消息：获取缓存中订单实例并处理产品实例状态
                byte[] orderProcessSnapshotDTOByte = JsonUtils.toJSon(orderProcessSnapshotDTO).getBytes("UTF8");
                Message orderProcessSnapshotMsg = new Message(MQConstant.TOPIC_NAME, MQConstant.TAG_MSG_SAVE_ORDER_PROCESS_SNAPSHOT, orderProcessSnapshotDTOByte);

                SendResult sendResult = producer.send(orderProcessSnapshotMsg);
                if(sendResult != null) {
                    logger.info("MsgAdjustBoxInventoryByOrder.consume()方法，"
                            + "异步消息发送结果：添加订单操作流程--修改盒子库存成功（"
                            + sendResult.toString() + "）");
                }

            }else {
                logger.warn("MsgAdjustBoxInventoryByOrder类,consume()方法,消息体错误或为null");
            }
            //消费成功
            return Action.CommitMessage;
        } catch (Exception e) {
            //消费失败
            logger.error("MsgAdjustBoxInventoryByOrder类,consume()方法,MsgId={}消费失败", message.getMsgID());
            return Action.ReconsumeLater;
        }
    }
}
