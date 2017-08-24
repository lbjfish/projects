package com.bingobox.product.dao;

import com.bingobox.product.po.ProductInstancePO;

import java.util.List;
import java.util.Map;

/**
 * Created by zhangfubin on 2017/7/5.
 */
public interface ProductInstanceDao {
    ProductInstancePO getProductInstanceById(Long productInstanceId);

    List<ProductInstancePO> listProductInstanceByParam(ProductInstancePO productInstancePO);

    List<ProductInstancePO> listProductInstanceByRfId(List<String> rfIdList);

    Integer updateProductInstance(ProductInstancePO productInstancePO);

    Integer updateProductInstanceStatus(Map<String, Object> paramMap);
}
