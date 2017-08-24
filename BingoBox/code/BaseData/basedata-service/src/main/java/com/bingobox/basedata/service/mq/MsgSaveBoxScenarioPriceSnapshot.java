package com.bingobox.basedata.service.mq;

import com.aliyun.openservices.ons.api.Action;
import com.aliyun.openservices.ons.api.ConsumeContext;
import com.aliyun.openservices.ons.api.Message;
import com.aliyun.openservices.ons.api.MessageListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhangfubin
 * 2017/7/19.16:26
 * projectName:Snapshot
 * com.bingobox.snapshot.service.mq
 */

public class MsgSaveBoxScenarioPriceSnapshot implements MessageListener {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Override
    public Action consume(Message message, ConsumeContext consumeContext) {
        Integer i = 0;
        /*logger.info("Receive message: {}", message.getMsgID());
        BoxScenarioPriceSnapshotDTO boxScenarioPriceSnapshotDTO = JsonUtils.parseObject(new String(message.getBody()), BoxScenarioPriceSnapshotDTO.class);
        Integer saveCount = 0;
        if(boxScenarioPriceSnapshotDTO != null) {
            try {
                saveCount = boxScenarioPriceSnapshotService.saveBoxScenarioPriceSnapshot(boxScenarioPriceSnapshotDTO);

            } catch (Exception e) {
                logger.warn("MsgSaveBoxScenarioPriceSnapshot类,consume()方法,消费失败");
                e.printStackTrace();
            }

        }
        if(saveCount == 0){
            logger.warn("MsgSaveBoxScenarioPriceSnapshot类,consume()方法,消费失败");
            return Action.ReconsumeLater;
        } else {
            logger.info("MsgSaveBoxScenarioPriceSnapshot类,consume()方法,新增{}条盒子场景价格快照记录", saveCount);
            return Action.CommitMessage;
        }*/
        System.out.println("hello");
        return Action.CommitMessage;
    }
}
