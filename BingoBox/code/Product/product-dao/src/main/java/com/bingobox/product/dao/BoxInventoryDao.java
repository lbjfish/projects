package com.bingobox.product.dao;

import com.bingobox.product.po.BoxInventoryPO;

import java.util.List;

/**
 * Created by zhangfubin on 2017/7/5.
 */
public interface BoxInventoryDao {
    BoxInventoryPO getBoxInventoryById(Long boxInventoryId);

    List<BoxInventoryPO> listBoxInventoryByParam(BoxInventoryPO boxInventoryPO);

    Integer updateBoxInventory(BoxInventoryPO boxInventoryPO);
}
