package com.bingobox.product.service;

import com.bingobox.product.po.BoxInventoryPO;
import com.bingobox.order.dto.OrderDetailDTO;

import java.util.List;

/**
 * Created by zhangfubin on 2017/7/5.
 */
public interface BoxInventoryService {
    BoxInventoryPO getBoxInventory(Long boxInventoryId);

    Integer updateBoxInventoryCount(Long boxId, List<OrderDetailDTO> orderDetailDTOList) throws Exception;
}
