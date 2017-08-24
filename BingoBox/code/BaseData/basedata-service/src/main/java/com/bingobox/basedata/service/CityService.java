package com.bingobox.basedata.service;


import com.bingobox.basedata.po.CityPO;

import java.util.List;
import java.util.Set;

/**
 * Created by qingweil on 2017/7/5.
 */
public interface CityService {
    List<CityPO> queryCityList(CityPO var1) throws Exception;

    List<CityPO> queryOverseaCountries(CityPO var1) throws Exception;

    CityPO queryOne(CityPO var1) throws Exception;

    void insertCity(CityPO var1) throws Exception;

    void updateCity(CityPO var1) throws Exception;

    CityPO queryCityByCityId(Long var1) throws Exception;

    List<CityPO> queryCitySuggest(CityPO var1) throws Exception;

    List<CityPO> queryCityListByCities(Set<Long> var1) throws Exception;
}
