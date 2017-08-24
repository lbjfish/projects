package com.bingobox.product.service;

import com.bingobox.product.po.ProductInstancePO;

import java.util.List;
import java.util.Map;

/**
 * Created by zhangfubin on 2017/7/5.
 */
public interface ProductInstanceService {

    ProductInstancePO getProductInstance(Long productInstanceId);

    Integer updateProductInstancePaidStatus(Map<String, Object> paramMap) throws Exception;

    List<ProductInstancePO> listProductInstanceByRfId(List<String> rfIdList) throws Exception;

}
