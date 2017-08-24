package com.pfgh.dao;

import java.util.List;

import com.pfgh.annotation.MyBatisDao;
import com.pfgh.entity.Pfgh_Zbxn_tp;
import com.pfgh.entity.Pfgh_Zbxn_zbsx;
import com.pfgh.entity.Pfgh_Zbxn_zbxh;
import com.pfgh.entity.Pfgh_Zbxn_zy;

@MyBatisDao
public interface Pfgh_Zbxn_zyDao {
	/**
	 * 获取敌我方阵营
	 */
	List<String> getZy();
	
	List<Pfgh_Zbxn_zy> getZyList();
	/**
	 * 获取装备的所有数据
	 */
	List<Pfgh_Zbxn_zbxh> findZbxhList();
	/**
	 * 获取装备详情的数据
	 */
	List<Pfgh_Zbxn_zbsx> findZbsxList(String zbsxid);
	/**
	 * 获取装备图片
	 */
	Pfgh_Zbxn_tp getImg(String zbxhnm);
}
