package com.bingobox.product.service.mq;

import com.aliyun.openservices.ons.api.Action;
import com.aliyun.openservices.ons.api.ConsumeContext;
import com.aliyun.openservices.ons.api.Message;
import com.aliyun.openservices.ons.api.MessageListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhangfubin
 * 2017/6/30.16:26
 * projectName:Product
 * com.bingobox.product.service.impl
 */

public class ProductMessageListener implements MessageListener {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Action consume(Message message, ConsumeContext consumeContext) {
        logger.debug("Receive message: {}", message.getMsgID());
        System.out.println("Receive message: " + message.getMsgID());
        return Action.CommitMessage;
        //try {
        //    //TODO 业务逻辑
        //    return Action.CommitMessage;
        //} catch (Exception e) {
        //    //消费失败
        //    return Action.ReconsumeLater;
        //}
    }
}
