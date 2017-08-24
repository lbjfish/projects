package com.bingobox.product.dao;

import com.bingobox.product.po.FranchiseeProductPO;

import java.util.List;

/**
 * Created by zhangfubin on 2017/7/5.
 */
public interface FranchiseeProductDao {
    FranchiseeProductPO getFranchiseeProduct(Long franchiseeProductId);

    List<FranchiseeProductPO> listFranchiseeProductByParam(FranchiseeProductPO franchiseeProductPO);

    Integer saveFranchiseeProduct(FranchiseeProductPO franchiseeProductPO);

    Integer updateFranchiseeProduct(FranchiseeProductPO franchiseeProductPO);

    Integer deleteFranchiseeProduct(Long franchiseeProductId);
}
