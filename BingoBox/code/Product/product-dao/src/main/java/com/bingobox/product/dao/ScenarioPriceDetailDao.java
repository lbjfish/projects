package com.bingobox.product.dao;

import com.bingobox.product.po.ScenarioPriceDetailPO;

import java.util.List;
import java.util.Map;

/**
 * Created by zhangfubin on 2017/7/5.
 */
public interface ScenarioPriceDetailDao {
    ScenarioPriceDetailPO getScenarioPriceDetailById(Long scenarioPriceDetailId);

    List<ScenarioPriceDetailPO> listScenarioPriceDetailByParam(ScenarioPriceDetailPO scenarioPriceDetailPO);

    Integer saveScenarioPriceDetail(ScenarioPriceDetailPO scenarioPriceDetailPO);

    Integer updateScenarioPriceDetail(ScenarioPriceDetailPO scenarioPriceDetailPO);

    Integer deleteScenarioPriceDetail(Long scenarioPriceDetailId);

    List<ScenarioPriceDetailPO> listScenarioPriceDetailByScenarioPriceIdAndProductId(Map<String, Object> params);

    ScenarioPriceDetailPO getScenarioPriceDetailByScenarioPriceIdAndProductId(Long scenarioPriceId, Long productId);
}
