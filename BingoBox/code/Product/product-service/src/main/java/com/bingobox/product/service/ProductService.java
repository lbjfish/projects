package com.bingobox.product.service;

import com.bingobox.product.po.ProductPO;

/**
 * Created by zhangfubin on 2017/7/5.
 */
public interface ProductService {
    ProductPO getProduct(Long productId) throws Exception;

    Integer saveProduct(ProductPO productPO) throws Exception;
}
