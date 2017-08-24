package com.tarena.dao;

import java.util.List;
import java.util.Map;

import com.tarena.annotation.MyBatisDao;
import com.tarena.entity.Cost;
import com.tarena.entity.page.CostPage;

@MyBatisDao
public interface CostMapper {
	List<Cost> findAllCost();
	
	void addCost(Cost cost);
	Cost findById(Integer id);
	void updateCost(Cost c);
	void deleteCost(Integer id);
	//分页查询方法
	List<Cost> findByPage(CostPage pa);
	//查询总行数
	int findByRow();
	
	List<Map<String,Object>> findNameId();
	
	
}
