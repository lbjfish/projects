package com.bingobox.product.service.api;

import com.bingobox.order.dto.OrderInfoDTO;
import com.bingobox.product.dto.ProductPriceSnapshotDTO;

import java.util.List;

/**
 * Created by zhangfubin on 2017/7/5.
 */
public interface ProductServiceApi {

    List<ProductPriceSnapshotDTO> listProductByBoxIdAndRfId(OrderInfoDTO orderInfoDTO) throws Exception;
}
