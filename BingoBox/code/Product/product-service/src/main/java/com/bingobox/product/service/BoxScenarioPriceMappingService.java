package com.bingobox.product.service;

import com.bingobox.product.po.BoxScenarioPriceMappingPO;

import java.util.List;

/**
 * Created by zhangfubin on 2017/7/19.
 */
public interface BoxScenarioPriceMappingService {
    Integer saveBoxScenarioPriceMapping(BoxScenarioPriceMappingPO boxScenarioPriceMappingPO) throws Exception;

    List<BoxScenarioPriceMappingPO> listBoxScenarioPriceMapping(BoxScenarioPriceMappingPO boxScenarioPriceMappingPO) throws Exception;


}
