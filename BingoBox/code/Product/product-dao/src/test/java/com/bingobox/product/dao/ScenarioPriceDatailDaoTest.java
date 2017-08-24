package com.bingobox.product.dao;

import com.bingobox.product.po.ScenarioPriceDetailPO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by zhangfubin on 2017/7/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class ScenarioPriceDatailDaoTest {


    @Resource
    private ScenarioPriceDetailDao scenarioPriceDetailDao;

    @Test
    public void getScenarioPriceDetailById() throws Exception{
        ScenarioPriceDetailPO scenarioPriceDetailPO = scenarioPriceDetailDao.getScenarioPriceDetailById(2L);
        System.out.println(scenarioPriceDetailPO.getProductScenarioPrice());

    }

    @Test
    public void listScenarioPriceDetailByParam() throws Exception{
        ScenarioPriceDetailPO scenarioPriceDetailPO = new ScenarioPriceDetailPO();

/*        scenarioPriceDetailPO.setScenarioPriceDetailId(1L);
        scenarioPriceDetailPO.setScenarioPriceId(1L);
        scenarioPriceDetailPO.setProductId(1L);
        scenarioPriceDetailPO.setProductScenarioPrice(100.00);*/
        scenarioPriceDetailPO.setIsDelete(0);
        List<ScenarioPriceDetailPO> results = scenarioPriceDetailDao.listScenarioPriceDetailByParam(scenarioPriceDetailPO);

        for(int i=0; i<results.size(); i++){
            System.out.println(results.get(i).getProductScenarioPrice());
        }
    }

    @Test
    public void saveScenarioPriceDetail() throws Exception{
        ScenarioPriceDetailPO scenarioPriceDetailPO = new ScenarioPriceDetailPO();

        scenarioPriceDetailPO.setScenarioPriceDetailId(1L);
        scenarioPriceDetailPO.setScenarioPriceId(1L);
        scenarioPriceDetailPO.setProductId(1L);
        scenarioPriceDetailPO.setProductScenarioPrice(500.00);
        scenarioPriceDetailPO.setIsDelete(0);
        scenarioPriceDetailPO.setCreateTime(new Date());
        scenarioPriceDetailPO.setCreateUserId(1L);
        scenarioPriceDetailPO.setLastUpdateTime(new Date());
        scenarioPriceDetailPO.setLastUpdateUserId(1L);
        scenarioPriceDetailDao.saveScenarioPriceDetail(scenarioPriceDetailPO);
    }

    @Test
    public void updateScenarioPriceDetail() throws Exception{
        ScenarioPriceDetailPO scenarioPriceDetailPO = new ScenarioPriceDetailPO();
        scenarioPriceDetailPO.setScenarioPriceDetailId(1L);
        scenarioPriceDetailPO.setScenarioPriceId(1L);
        scenarioPriceDetailPO.setProductId(1L);
        scenarioPriceDetailPO.setProductScenarioPrice(5300.00);
        scenarioPriceDetailPO.setIsDelete(0);
        scenarioPriceDetailPO.setCreateTime(new Date());
        scenarioPriceDetailPO.setCreateUserId(1L);
        scenarioPriceDetailPO.setLastUpdateTime(new Date());
        scenarioPriceDetailPO.setLastUpdateUserId(1L);
        scenarioPriceDetailDao.updateScenarioPriceDetail(scenarioPriceDetailPO);
    }

    @Test
    public void deleteScenarioPriceDetail() throws Exception{
        scenarioPriceDetailDao.deleteScenarioPriceDetail(1L);
    }

    @Test
    public void listScenarioPriceDetailByScenarioPriceIdAndProductId() throws Exception{
        List<Long> productIds = new ArrayList<>();
        productIds.add(1L);
        Map<String, Object> map = new HashMap<>();
        map.put("productIds", productIds);
        map.put("scenarioPriceId", 1L);
        scenarioPriceDetailDao.listScenarioPriceDetailByScenarioPriceIdAndProductId(map);
    }
}
