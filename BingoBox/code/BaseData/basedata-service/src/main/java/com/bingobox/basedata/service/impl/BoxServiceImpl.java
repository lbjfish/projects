package com.bingobox.basedata.service.impl;

import com.aliyun.openservices.ons.api.Message;
import com.aliyun.openservices.ons.api.SendResult;
import com.aliyun.openservices.ons.api.bean.ProducerBean;
import com.aliyun.openservices.shade.com.alibaba.fastjson.JSONObject;
import com.bingobox.basedata.dao.BoxDao;
import com.bingobox.basedata.framework.basedataenum.BoxBindingEnum;
import com.bingobox.basedata.framework.constant.BaseDataConstant;
import com.bingobox.basedata.framework.constant.MQConstant;
import com.bingobox.basedata.po.BoxFranchiseePO;
import com.bingobox.basedata.po.BoxPO;
import com.bingobox.basedata.service.BoxService;
import com.bingobox.framework.common.CommonPage;
import com.bingobox.framework.util.JsonUtils;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangfubin on 2017/7/5.
 */
@Service("boxService")
public class BoxServiceImpl implements BoxService {

    private final Logger logger = LoggerFactory.getLogger(BoxServiceImpl.class);

    @Autowired
    private BoxDao boxDao;

    @Override
    public Integer updateBox(BoxPO boxPO) throws Exception {
        Integer updateCount = boxDao.updateBox(boxPO);
        //发送消息, 插入快照
        ApplicationContext ctx = new ClassPathXmlApplicationContext("mq/mq-producer.xml");
        ProducerBean producer = (ProducerBean) ctx.getBean("producer");
        producer.start();
        Message saveBoxMsg = new Message(MQConstant.TOPIC_NAME, MQConstant.SAVE_BOX_TAG, JsonUtils.toJSon(boxPO).getBytes("UTF-8"));
        SendResult sendResult = producer.send(saveBoxMsg);
        if(sendResult != null) {
            logger.info("BoxServiceImpl类,updateBox()方法，"
                    + "异步消息发送结果：修改盒子,插入盒子快照成功（"
                    + sendResult.toString() + "）");
        }else {
            logger.warn("BoxServiceImpl类,updateBox()方法，"
                    + "异步消息发送结果：修改盒子,插入盒子快照失败!");
        }
        return updateCount;
    }

    @Override
    public Integer saveBox(BoxPO boxPO) throws Exception {
        Integer saveCount = boxDao.saveBox(boxPO);

        //发送消息, 插入快照
        ApplicationContext ctx = new ClassPathXmlApplicationContext("mq/mq-producer.xml");
        ProducerBean producer = (ProducerBean) ctx.getBean("producer");
        producer.start();
        Message saveBoxMsg = new Message(MQConstant.TOPIC_NAME, MQConstant.SAVE_BOX_TAG, JsonUtils.toJSon(boxPO).getBytes("UTF-8"));
        SendResult sendResult = producer.send(saveBoxMsg);
        if(sendResult != null) {
            logger.info("BoxServiceImpl类,saveBox()方法，"
                    + "异步消息发送结果：新增盒子,插入盒子快照成功（"
                    + sendResult.toString() + "）");
        }else {
            logger.warn("BoxServiceImpl类,saveBox()方法，"
                    + "异步消息发送结果：新增盒子,插入盒子快照失败!");
        }
        return saveCount;
    }

    @Override
    public List<BoxPO> listBoxFuzzyByBoxCode(String boxCode) throws Exception {
        BoxPO boxPO = new BoxPO();
        boxPO.setBoxCode(boxCode);
        boxPO.setIsBinding(BoxBindingEnum.BINDINGED.getKey());
        return boxDao.listBoxFuzzyByBoxCode(boxPO);
    }

    @Override
    public CommonPage<BoxFranchiseePO> listBoxByPage(BoxFranchiseePO boxFranchiseePO, Integer pageNum, Integer pageSize) throws Exception {
        if(pageNum == null) {
            pageNum = BaseDataConstant.PageConstant.PageNum;
        }
        if(pageSize == null) {
            pageSize = BaseDataConstant.PageConstant.PageSize;
        }
        PageHelper.startPage(pageNum, pageSize);
        List<BoxFranchiseePO> boxFranchiseePOList = boxDao.listBoxByPage(boxFranchiseePO);
        CommonPage<BoxFranchiseePO> commonPage = new CommonPage<>(boxFranchiseePOList);
        return commonPage;
    }

    @Override
    public BoxPO getBoxByBoxId(Long boxId) {
        return boxDao.getBoxById(boxId);
    }

	@Override
	public List<BoxPO> franchiseeBoxList(JSONObject param) {
		List<BoxPO> boxList = boxDao.franchiseeBoxList(param);
		return boxList;
	}

    @Override
    public List<BoxPO> listBoxByFranchiseeId(Long franchiseeId) throws Exception {
        return boxDao.listBoxByFranchiseeId(franchiseeId);
    }
}
