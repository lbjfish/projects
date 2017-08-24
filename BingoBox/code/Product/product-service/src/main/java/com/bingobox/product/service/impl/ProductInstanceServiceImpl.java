package com.bingobox.product.service.impl;

import com.bingobox.product.dao.ProductInstanceDao;
import com.bingobox.product.po.ProductInstancePO;
import com.bingobox.product.service.ProductInstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by zhangfubin on 2017/7/5.
 */
@Service("productInstanceService")
public class ProductInstanceServiceImpl implements ProductInstanceService {


    @Autowired
    private ProductInstanceDao productInstanceDao;
    @Override
    public ProductInstancePO getProductInstance(Long productInstanceId) {
        return productInstanceDao.getProductInstanceById(productInstanceId);
    }

    @Override
    public Integer updateProductInstancePaidStatus(Map paramMap) throws Exception {
        Integer updateCount = productInstanceDao.updateProductInstanceStatus(paramMap);
        return updateCount;
    }

    @Override
    public List<ProductInstancePO> listProductInstanceByRfId(List<String> rfIdList) throws Exception{
        List<ProductInstancePO> productInstancePOs = productInstanceDao.listProductInstanceByRfId(rfIdList);
        return productInstancePOs;
    }
}
