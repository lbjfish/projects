package com.bingobox.product.service.impl;

import com.bingobox.framework.redis.RedisClient;
import com.bingobox.product.dao.BoxScenarioPriceMappingDao;
import com.bingobox.product.dao.ScenarioPriceDetailDao;
import com.bingobox.product.framework.constant.RedisConstant;
import com.bingobox.product.po.BoxScenarioPriceMappingPO;
import com.bingobox.product.po.ScenarioPriceDetailPO;
import com.bingobox.product.service.ScenarioPriceDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangfubin on 2017/7/17.
 */
@Service("scenarioPriceDetailService")
public class ScenarioPriceDetailServiceImpl implements ScenarioPriceDetailService{
    final private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ScenarioPriceDetailDao scenarioPriceDetailDao;

    @Autowired
    private BoxScenarioPriceMappingDao boxScenarioPriceMappingDao;

    @Override
    public Integer saveScenarioPriceDetail(ScenarioPriceDetailPO scenarioPriceDetailPO) throws Exception {
        Integer count = scenarioPriceDetailDao.saveScenarioPriceDetail(scenarioPriceDetailPO);
        BoxScenarioPriceMappingPO boxScenarioPriceMappingPO = new BoxScenarioPriceMappingPO();
        boxScenarioPriceMappingPO.setScenarioPriceId(scenarioPriceDetailPO.getScenarioPriceId());
        List<BoxScenarioPriceMappingPO> boxScenarioPriceMappingPOs = boxScenarioPriceMappingDao.listBoxScenarioPriceMapping(boxScenarioPriceMappingPO);
        List<Long> boxIdList = new ArrayList<>();
        if(boxScenarioPriceMappingPOs != null && boxScenarioPriceMappingPOs.size() > 0) {
            RedisClient redisClient = new RedisClient();
            for(int i=0; i<boxScenarioPriceMappingPOs.size(); i++) {
                Long boxId = boxScenarioPriceMappingPOs.get(i).getBoxId();
                boxIdList.add(boxScenarioPriceMappingPOs.get(i).getBoxId());
                redisClient.del(RedisConstant.SCENARIO_PRICE + "bId_" + boxId + "pId_" + scenarioPriceDetailPO.getProductId());
                String result = redisClient.set(RedisConstant.SCENARIO_PRICE + "bId_" + boxId + "pId_" + scenarioPriceDetailPO.getProductId(), scenarioPriceDetailPO, -1);
                if(!("OK").equals(result)){
                    logger.warn("ScenarioPriceDetailServiceImpl类,saveScenarioPriceDetail()方法,读入缓存失败");
                }
            }
        }

        return count;
    }
}
