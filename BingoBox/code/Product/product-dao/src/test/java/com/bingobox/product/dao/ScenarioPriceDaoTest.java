package com.bingobox.product.dao;

import com.bingobox.product.po.ScenarioPricePO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by zhangfubin on 2017/7/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class ScenarioPriceDaoTest {

    @Resource
    private ScenarioPriceDao scenarioPriceDao;

    @Test
    public void getById() throws Exception{
        ScenarioPricePO scenarioPricePO = scenarioPriceDao.getScenarioPriceById(2L);
        System.out.println(scenarioPricePO.getBeginTime());
    }

    @Test
    public void listScenarioPriceByParam() throws Exception{
        ScenarioPricePO scenarioPricePO = new ScenarioPricePO();
        /*scenarioPricePO.setScenarioPriceId(1L);
        scenarioPricePO.setFranchiseeId(1L);
        scenarioPricePO.setScenarioName("小区");*/
        scenarioPricePO.setIsDelete(0);

        List<ScenarioPricePO> results = scenarioPriceDao.listScenarioPriceByParam(scenarioPricePO);
        for(int i =0; i< results.size(); i++){
            System.out.println(results.get(i).getScenarioName());
        }
    }

    @Test
    public void saveScenarioPrice() throws Exception{
        ScenarioPricePO scenarioPricePO = new ScenarioPricePO();
        scenarioPricePO.setFranchiseeId(1L);
        scenarioPricePO.setScenarioName("火车站");
        scenarioPricePO.setIsDelete(0);
        scenarioPricePO.setCreateUserId(1L);
        scenarioPricePO.setLastUpdateUserId(1L);
        scenarioPricePO.setBeginTime(new Date());
        scenarioPricePO.setEndTime(new Date());
        scenarioPricePO.setCreateTime(new Date());
        scenarioPricePO.setLastUpdateTime(new Date());
        scenarioPriceDao.saveScenarioPrice(scenarioPricePO);

    }

    @Test
    public void updateScenarioPrice() throws Exception{
        ScenarioPricePO scenarioPricePO = new ScenarioPricePO();
        scenarioPricePO.setScenarioPriceId(1L);
        scenarioPricePO.setFranchiseeId(1L);
        scenarioPricePO.setScenarioName("高档小区");
        scenarioPricePO.setIsDelete(0);
        scenarioPricePO.setCreateUserId(1L);
        scenarioPricePO.setLastUpdateUserId(1L);
        scenarioPricePO.setBeginTime(new Date());
        scenarioPricePO.setEndTime(new Date());
        scenarioPricePO.setCreateTime(new Date());
        scenarioPricePO.setLastUpdateTime(new Date());
        scenarioPriceDao.updateScenarioPrice(scenarioPricePO);
    }

    @Test
    public void deleteScenarioPrice() throws Exception{
        scenarioPriceDao.deleteScenarioPrice(1L);
    }
}
