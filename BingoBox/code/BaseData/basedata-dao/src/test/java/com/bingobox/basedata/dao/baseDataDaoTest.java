package com.bingobox.basedata.dao;

import com.bingobox.basedata.po.BoxFranchiseePO;
import com.bingobox.basedata.po.BoxPO;
import com.bingobox.basedata.po.CityPO;
import com.bingobox.framework.util.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;

/**
 * Created by zhangfubin on 2017/7/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class baseDataDaoTest {
    @Autowired
    private BoxDao boxDao;
    
    @Autowired
    private CityDao cityDao;

    @Test
    public void getBoxById(){
        boxDao.getBoxById(1L);
    }

    @Test
    public void listBoxByParam() throws JsonProcessingException {
        BoxPO boxPO = new BoxPO();
        boxPO.setBoxCode("111");
        boxPO.setBoxName("222");
        boxPO.setDeviceName("333");
        boxPO.setProvinceId(1);
        boxPO.setCityId(1);
        boxPO.setDistrictId(1);
        boxPO.setAddress("123124");
        boxPO.setCoordinateSystem(1);
        boxPO.setIsValid(1);
        boxPO.setIsDelete(1);
        boxPO.setCreateTime(new Date());
        boxPO.setCreateUserId(1L);
        boxPO.setLastUpdateTime(new Date());
        boxPO.setLastUpdateUserId(1L);
        boxPO.setIsDelete(0);
        boxPO.setBoxId(2L);
        //boxDao.saveBox(boxPO);

       // boxDao.updateBox(boxPO);
        String jsonStr = JsonUtils.toJSon(boxPO);
        System.out.println(jsonStr);
    }
    
    @Test
    public void selectAllOverseaCity(){
    	CityPO vo = new CityPO();
    	vo.setCityId(4000L);
    	vo.setIsActive(1);
    	List<CityPO> cities = cityDao.queryOverseaCountries(vo);
    	System.out.println(cities.size());
    	System.out.println(cities.get(0));
    }
    
    
    @Test 
    public void selectCityByCityIds(){
    	
    	Set<Long> cityIds = new HashSet();
    	cityIds.add(1L);
    	cityIds.add(2L);
    	
    	List<CityPO> cities = cityDao.queryCityListByCities(cityIds);
    	System.out.println(cities);
    }
    
    @Test
    public void selectBySuggest(){
    	CityPO city  = new CityPO();
    	city.setPinyin("da");
    	System.out.println(cityDao.queryCitySuggest(city));
    	
    	city.setCityName("富");
    	
    	List<CityPO> cities = cityDao.queryCitySuggest(city);
    	System.out.println(cities.size());
    	
    	System.out.println(cities);
    }
    
    @Test
    public void insertDemo(){
    	CityPO city = new CityPO();
    	
    	city.setCityName("测试");
    	city.setEnumCitySettingFlag(0);
    	city.setEnumMapType(1);
    	city.setShortPinyin("aa");
    	city.setAssociationWords("www");
    	city.setFirstLetter("w");
    	city.setInternalName("eee");
    	city.setCityId(555555L);
    	city.setIsActive(1);
    	city.setLongitude(3.3F);
    	city.setLatitude(4.4F);
    	city.setEnumRegionInfoLevel(2);
    	city.setParentRegionInfoId(3L);
    	city.setCreateTime(new Date());
    	city.setLastUpdateTime(new Date());
    	city.setIsOversea(0);
    	cityDao.saveCity(city);
    	System.out.println(111);
    }
    
    @Test
    public void updateDemo(){
    	CityPO city  = new CityPO();
    	city.setCityId(-1L);
    	city.setCityName("修改测试");
    	city.setLastUpdateTime(new Date());
    	cityDao.updateCity(city);
    	System.out.println(222);
    }
    
    @Test
    public void selectOversea(){
    	CityPO city = new CityPO();
    	city.setIsActive(1);
    	city.setIsOversea(1);
    	List<CityPO> cities = cityDao.queryOverseaCountries(city);
    	System.out.println(cities.size());
    	
    }
    
    @Test
    public void queryOneDemo(){
    	CityPO city = new CityPO();
    	city.setCityId(1L);
    	city.setIsActive(1);
    	List<CityPO> cities = cityDao.queryOne(city);
    	System.out.println(cities.get(0));
    	
    }

    @Test
    public void listBoxByPage() throws Exception{
        BoxFranchiseePO boxFranchiseePO = new BoxFranchiseePO();
        boxFranchiseePO.setIsValid(1);
        boxFranchiseePO.setIsBinding(1);
        boxFranchiseePO.setFranchiseeCode("111");
        boxFranchiseePO.setBoxCode("aaa");
        boxFranchiseePO.setProvinceId(1);
        boxFranchiseePO.setCityId(1);
        boxFranchiseePO.setDistrictId(1);
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("boxFranchiseePO", boxFranchiseePO);
        paramMap.put("start", 1);
        paramMap.put("pageSize", 1);
        boxDao.listBoxByPage(boxFranchiseePO);

    }

}

