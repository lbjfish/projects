package com.bingobox.product.service.impl;

import com.bingobox.product.dao.ScenarioPriceDao;
import com.bingobox.product.po.ScenarioPricePO;
import com.bingobox.product.service.ScenarioPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhangfubin on 2017/7/17.
 */
@Service("scenarioPriceService")
public class ScenarioPriceServiceImpl implements ScenarioPriceService {

    @Autowired
    private ScenarioPriceDao scenarioPriceDao;

    @Override
    public Integer saveScenarioPrice(ScenarioPricePO scenarioPricePO) throws Exception {
        return scenarioPriceDao.saveScenarioPrice(scenarioPricePO);
    }
}
