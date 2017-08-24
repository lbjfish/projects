package com.bingobox.product.dao;

import com.bingobox.product.po.ScenarioPricePO;

import java.util.List;

/**
 * Created by zhangfubin on 2017/7/5.
 */
public interface ScenarioPriceDao {
    ScenarioPricePO getScenarioPriceById(Long scenarioPriceId);

    List<ScenarioPricePO> listScenarioPriceByParam(ScenarioPricePO scenarioPricePO);

    Integer saveScenarioPrice(ScenarioPricePO scenarioPricePO);

    Integer updateScenarioPrice(ScenarioPricePO scenarioPricePO);

    Integer deleteScenarioPrice(Long scenarioPriceId);
}
