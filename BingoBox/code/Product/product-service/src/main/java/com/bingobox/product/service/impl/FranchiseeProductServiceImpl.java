package com.bingobox.product.service.impl;

import com.bingobox.product.dao.FranchiseeProductDao;
import com.bingobox.product.po.FranchiseeProductPO;
import com.bingobox.product.service.FranchiseeProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhangfubin on 2017/7/17.
 */
@Service("franchiseeProductService")
public class FranchiseeProductServiceImpl implements FranchiseeProductService {

    @Autowired
    private FranchiseeProductDao franchiseeProductDao;

    @Override
    public Integer saveFranchiseeProduct(FranchiseeProductPO franchiseeProductPO) throws Exception {
        Integer count = franchiseeProductDao.saveFranchiseeProduct(franchiseeProductPO);
        return count;
    }
}
