package com.tarena.dao;

import java.util.List;
import java.util.Map;

import com.tarena.annotation.MyBatisDao;
import com.tarena.entity.page.ServicePage;

import com.tarena.entity.Service;
@MyBatisDao
public interface ServiceMapper {
	/**
	 * 分页查询业务账号
	 * @param page
	 * @return Map<String, Object>
	 * 	其中key存放的是字段名（大写的）；
	 * 	value存放的是字段值。
	 */
	List<Map<String,Object>> findByPage(ServicePage page);
	
	int findByRow(ServicePage page);
	//开通业务帐号
	void start(int id);
	
	//暂停业务帐号
	void pause(int id);
	
	Service findById(int id);
	/**
	 * 根据账务账号暂停其对应的全部业务账号
	 */
	void pauseByAccount(int accountId);
	
	List<Map<String,Object>> findAll();
	
	//void updateName(Map<String,Integer> map);
	
	void updateName2(Map<String,Integer> map);
}
