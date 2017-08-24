package com.bingobox.product.dao;

import com.bingobox.product.po.ProductPO;

import java.util.List;

/**
 * Created by zhangfubin on 2017/7/5.
 */
public interface ProductDao {
    ProductPO getProductById(Long productId);

    List<ProductPO> listProductByParam(ProductPO productPO);

    Integer saveProduct(ProductPO productPO);

    Integer updateProduct(ProductPO productPO);

    Integer deleteProduct(Long productId);

    List<ProductPO> listProductByIdList(List<Long> productIdList);


}
