package com.bingobox.product.service.impl;

import com.bingobox.product.dao.BoxScenarioPriceMappingDao;
import com.bingobox.product.po.BoxScenarioPriceMappingPO;
import com.bingobox.product.service.BoxScenarioPriceMappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangfubin on 2017/7/19.
 */
@Service("boxScenarioPriceMappingService")
public class BoxScenarioPriceMappingServiceImpl implements BoxScenarioPriceMappingService {

    @Autowired
    private BoxScenarioPriceMappingDao boxScenarioPriceMappingDao;

    @Override
    public Integer saveBoxScenarioPriceMapping(BoxScenarioPriceMappingPO boxScenarioPriceMappingPO) throws Exception {
        return boxScenarioPriceMappingDao.saveBoxScenarioPriceMapping(boxScenarioPriceMappingPO);
    }

    @Override
    public List<BoxScenarioPriceMappingPO> listBoxScenarioPriceMapping(BoxScenarioPriceMappingPO boxScenarioPriceMappingPO) throws Exception {
        List<BoxScenarioPriceMappingPO> boxScenarioPriceMappingPOs = boxScenarioPriceMappingDao.listBoxScenarioPriceMapping(boxScenarioPriceMappingPO);
        return boxScenarioPriceMappingPOs;
    }
}
