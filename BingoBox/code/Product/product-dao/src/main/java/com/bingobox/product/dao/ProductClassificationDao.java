package com.bingobox.product.dao;

import com.bingobox.product.po.ProductClassificationPO;

import java.util.List;

/**
 * Created by zhangfubin on 2017/7/5.
 */
public interface ProductClassificationDao {
    ProductClassificationPO getProductClassificationById(Long productClassificationId);

    List<ProductClassificationPO> listProductClassificationByParam(ProductClassificationPO productClassificationPO);

    Integer saveProductClassification(ProductClassificationPO productClassificationPO);

    Integer updateProductClassification(ProductClassificationPO productClassificationPO);

    Integer deleteProductClassification(Long productClassificationId);
}
