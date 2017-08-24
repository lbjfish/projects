package com.bingobox.basedata.dao;

import com.bingobox.basedata.po.CityPO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

/**
 * Created by qingweil on 2017/7/5.
 */
public interface CityDao {
    List<CityPO> queryCityList(CityPO var1) throws Exception;

	List<CityPO> queryOverseaCountries(CityPO cityPO);

	List<CityPO> queryOne(CityPO vo);


	void saveCity(CityPO vo);

	void updateCity(CityPO vo);

	List<CityPO> queryCityByCityId(Long cityId);

	List<CityPO> queryCityListByCities(@Param("set") Set<Long> cityIds);

	List<CityPO> queryCitySuggest(CityPO vo);

	List<CityPO> list(CityPO cityPO);


}
