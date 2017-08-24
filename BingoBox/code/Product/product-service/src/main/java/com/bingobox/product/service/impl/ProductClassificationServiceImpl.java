package com.bingobox.product.service.impl;

import com.bingobox.framework.util.BingoBoxBeanUtils;
import com.bingobox.product.dao.ProductClassificationDao;
import com.bingobox.product.po.ProductClassificationPO;
import com.bingobox.product.service.ProductClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhangfubin on 2017/7/17.
 */
@Service("productClassificationService")
public class ProductClassificationServiceImpl implements ProductClassificationService{

    @Autowired
    private ProductClassificationDao productClassificationDao;

    @Override
    public Integer saveProductClassification(ProductClassificationPO productClassificationPO) throws Exception {
        return productClassificationDao.saveProductClassification(productClassificationPO);
    }
}
