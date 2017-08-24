package com.bingobox.product.dao;

import com.bingobox.product.po.BoxScenarioPriceMappingPO;

import java.util.List;

/**
 * Created by zhangfubin on 2017/7/19.
 */
public interface BoxScenarioPriceMappingDao {
    Integer saveBoxScenarioPriceMapping(BoxScenarioPriceMappingPO boxScenarioPriceMappingPO);

    List<BoxScenarioPriceMappingPO> listBoxScenarioPriceMapping(BoxScenarioPriceMappingPO boxScenarioPriceMappingPO);
}
