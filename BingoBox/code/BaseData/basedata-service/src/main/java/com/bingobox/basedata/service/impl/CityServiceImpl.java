package com.bingobox.basedata.service.impl;

import com.bingobox.basedata.dao.CityDao;
import com.bingobox.basedata.po.CityPO;
import com.bingobox.basedata.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * Created by qingweil on 2017/7/24.
 */
@Service("cityService")
public class CityServiceImpl implements CityService {
    private final Logger logger = LoggerFactory.getLogger(CityServiceImpl.class);

    @Autowired
    @Qualifier(value = "cityDao")
    private CityDao cityDao;


    /**
     * <p>Title: queryCities</p>
     * <p>Description: </p>
     * @param CityPO
     * @return
     * @throws Exception
     */
    @Override
    public List<CityPO> queryOverseaCountries(CityPO vo) throws Exception {
        logger.info("{}类{}方法({})", "CityServiceImpl", "queryCities", vo);
        vo.setIsOversea(1);
        vo.setIsActive(1);
        return cityDao.queryOverseaCountries(vo);
    }

    /**
     * <p>Title: queryOne</p>
     * <p>Description: 获取城市信息</p>
     * @param CityPO
     * @return
     * @throws Exception
     */
    @Override
    public CityPO queryOne(CityPO vo) throws Exception {
        logger.info("{}类{}方法({})", "CityServiceImpl", "queryOne", vo);
        List<CityPO> cities = cityDao.queryOne(vo);
        if(null != cities && cities.size()>0){
        	return cities.get(0);
        }
        return null;
    }

    /**
     * <p>Title: isnertCity</p>
     * <p>Description: 插入城市信息，主要用于更新坐标信息</p>
     * @param CityPO
     */
    @Override
    public void insertCity(CityPO vo) throws Exception {
        logger.info("{}类{}方法({})", "CityServiceImpl", "insertCity", vo);
        cityDao.saveCity(vo);
    }

    /**
     * <p>Title: updateCity</p>
     * <p>Description: </p>
     * @param CityPO
     * @throws Exception
     */
    @Override
    public void updateCity(CityPO vo) throws Exception {
        logger.info("{}类{}方法({})", "CityServiceImpl", "updateCity", vo);
        cityDao.updateCity(vo);
    }

    @Override
    public List<CityPO> queryCityList(CityPO vo) throws Exception {
        logger.info("{}类{}方法({})", "CityServiceImpl", "queryCityList", vo);
        return cityDao.queryCityList(vo);
    }

    @Override
    public CityPO queryCityByCityId(Long cityId) throws Exception {
        logger.info("{}类{}方法({})", "CityServiceImpl", "queryCityByCityId", cityId);
        List<CityPO> cities = cityDao.queryCityByCityId(cityId);
        if(null != cities && cities.size()>0){
        	return cities.get(0);
        }
        return null;
    }

    @Override
    public List<CityPO> queryCitySuggest(CityPO vo) throws Exception {
        logger.info("{}类{}方法({})","CityServiceImpl","queryCitySuggest",vo);
        List<CityPO> cities = cityDao.queryCitySuggest(vo);
        if(null != cities && cities.size()>0){
        	return cities;
        }
        return null;
    }

    @Override
    public List<CityPO> queryCityListByCities(Set<Long> cityIds) throws Exception {
        return cityDao.queryCityListByCities(cityIds);
    }

}
