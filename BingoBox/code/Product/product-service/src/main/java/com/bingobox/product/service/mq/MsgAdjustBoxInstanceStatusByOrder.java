package com.bingobox.product.service.mq;

import com.aliyun.openservices.ons.api.*;
import com.aliyun.openservices.ons.api.bean.ProducerBean;
import com.bingobox.framework.constant.OrderConstant;
import com.bingobox.framework.util.JsonUtils;
import com.bingobox.order.dto.OrderInfoDTO;
import com.bingobox.order.dto.OrderInstanceDetailDTO;
import com.bingobox.product.framework.constant.MQConstant;
import com.bingobox.product.service.ProductInstanceService;
import com.bingobox.snapshot.dto.OrderProcessSnapshotDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by zhangfubin
 * 2017/7/15.16:26
 * projectName:Box
 * com.bingobox.box.service.mq
 */

public class MsgAdjustBoxInstanceStatusByOrder implements MessageListener {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ProductInstanceService productInstanceService;

    @Override
    public Action consume(Message message, ConsumeContext consumeContext) {
        logger.info("MsgAdjustBoxInstanceStatusByOrder.consume(message = {}, consumeContext = {})", message, consumeContext);

        OrderInfoDTO orderInfoDTO = null;
        try {
            orderInfoDTO = JsonUtils.parseObject(new String(message.getBody()), OrderInfoDTO.class);
        } catch (IOException e) {
            logger.warn("MsgAdjustBoxInstanceStatusByOrder.consume(),消息体转OrderInfoDTO失败");
        }

        try {
            if(orderInfoDTO != null && orderInfoDTO.getListOrderInstanceDetail() != null && orderInfoDTO.getListOrderInstanceDetail().size() > 0){
                List<String> rfIdList = new ArrayList<>();
                List<OrderInstanceDetailDTO> orderInstanceDetailDTOs = orderInfoDTO.getListOrderInstanceDetail();
                rfIdList.addAll(orderInstanceDetailDTOs.stream().map(OrderInstanceDetailDTO::getRfId).collect(Collectors.toList()));
                Map<String, Object> mapParam = new HashMap<>();
                mapParam.put("isPaid", 0);
                mapParam.put("productInstanceIdList", rfIdList);
                Integer updateCount = null;
                try {
                    updateCount = productInstanceService.updateProductInstancePaidStatus(mapParam);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                logger.info("MsgListenerAdjustBoxInventoryByOrder类,consume()方法,修改商品实例状态数量={}", updateCount);

                //向订单系统返回状态
                OrderProcessSnapshotDTO orderProcessSnapshotDTO = new OrderProcessSnapshotDTO();
                orderProcessSnapshotDTO.setOrderInfoId(orderInfoDTO.getOrderInfoId());
                orderProcessSnapshotDTO.setProcessStatus(OrderConstant.PayProcessStatus.ASYNC_UPDATE_BOX_INSTANCE_STATUS);
                orderProcessSnapshotDTO.setCreateTime(new Date());
                orderProcessSnapshotDTO.setCreateUserId(orderInfoDTO.getCreateUserId());
                orderProcessSnapshotDTO.setRemark("更新商品实例状态成功");

                ApplicationContext ctx = new ClassPathXmlApplicationContext("mq/mq-producer.xml");
                ProducerBean producer = (ProducerBean) ctx.getBean("producer");
                producer.start();

                // 异步消息：获取缓存中订单实例并处理产品实例状态
                byte[] orderProcessSnapshotDTOByte = JsonUtils.toJSon(orderProcessSnapshotDTO).getBytes("UTF8");
                Message orderProcessSnapshotMsg = new Message(MQConstant.TOPIC_NAME, MQConstant.TAG_MSG_SAVE_ORDER_PROCESS_SNAPSHOT, orderProcessSnapshotDTOByte);

                SendResult sendResult = producer.send(orderProcessSnapshotMsg);
                if(sendResult != null) {
                    logger.info("MsgAdjustBoxInstanceStatusByOrder.consume()方法，"
                            + "异步消息发送结果：根据订单调整盒子中产品实例状态（"
                            + sendResult.toString() + "）");
                }

            }else {
                logger.warn("MsgAdjustBoxInstanceStatusByOrder类,consume()方法,消息体错误或为null");
            }
            //消费成功
            return Action.CommitMessage;
        } catch (Exception e) {
            //消费失败
            return Action.ReconsumeLater;
        }
    }
}
