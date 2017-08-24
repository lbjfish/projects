package com.bingobox.product.service.impl;

import com.bingobox.product.dao.BoxInventoryDao;
import com.bingobox.product.po.BoxInventoryPO;
import com.bingobox.product.service.BoxInventoryService;
import com.bingobox.order.dto.OrderDetailDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangfubin on 2017/7/5.
 */
@Service("boxInventoryService")
public class BoxInventoryServiceImpl implements BoxInventoryService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private BoxInventoryDao boxInventoryDao;


    @Override
    public Integer updateBoxInventoryCount(Long boxId, List<OrderDetailDTO> orderDetailDTOList) throws Exception {

        //修改商品记录数量
        Integer updateCount = 0;
        if(orderDetailDTOList != null && orderDetailDTOList.size() > 0) {
            for(OrderDetailDTO orderDetailDTO : orderDetailDTOList) {
                BoxInventoryPO boxInventoryPO = new BoxInventoryPO();
                boxInventoryPO.setBoxId(boxId);
                boxInventoryPO.setProductId(orderDetailDTO.getProductId());
                List<BoxInventoryPO> boxInventoryPOs = boxInventoryDao.listBoxInventoryByParam(boxInventoryPO);

                if(boxInventoryPOs != null && boxInventoryPOs.size() > 0){
                    BoxInventoryPO tempBoxInventory = boxInventoryPOs.get(0);
                    tempBoxInventory.setInventoryCount(tempBoxInventory.getInventoryCount() - orderDetailDTO.getProductCount());
                    boxInventoryDao.updateBoxInventory(tempBoxInventory);
                    updateCount++;
                }else {
                    logger.warn("BoxInventoryServiceImpl类,updateBoxInventoryCount()方法,盒子id={}, 商品id={}修改库存失败!", boxId, orderDetailDTO.getProductId());
                }
            }
        }
        return updateCount;
    }

    @Override
    public BoxInventoryPO getBoxInventory(Long boxInventoryId) {
        return boxInventoryDao.getBoxInventoryById(boxInventoryId);
    }
}
