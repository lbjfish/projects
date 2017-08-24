package com.pfgh.dao;

import java.util.List;

import com.pfgh.annotation.MyBatisDao;
import com.pfgh.entity.Pfgh_Fkb;

@MyBatisDao
public interface Pfgh_FkbDao {
	/**
	 * 获取防空兵所有数据
	 */
	List<Pfgh_Fkb> findFkb(String fkb);
	/**
	 * 
	 */
	List<String> findNlzblxToBdmc(String nlzblx);
}
