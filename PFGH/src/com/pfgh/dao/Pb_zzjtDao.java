package com.pfgh.dao;

import java.util.List;
import java.util.Map;

import com.pfgh.annotation.MyBatisDao;
import com.pfgh.entity.Pfgh_pb_hjjhs;
import com.pfgh.entity.Pfgh_pb_hkbhs;
import com.pfgh.entity.Pfgh_pb_pbyzhs;
import com.pfgh.entity.base.BasePb_zzjt;

@MyBatisDao
public interface Pb_zzjtDao {
	/*
	 * 我方兵力选择
	 */
	BasePb_zzjt findWfbl(int zy);
	
	/*
	 * 敌方兵力选择
	 */
	BasePb_zzjt findDfbl(int zy);
	
	/*
	 * 压制火炮标准数
	 */
	List<Map<String,Object>> findByBh(String bdbh);
	
	/**
	 * @param bdbh
	 * @return List<Map<String,Object>>
	 */
	List<String> findByBh2(String bdbh);
	
	/**
	 * 炮兵压制火力毁伤能力
	 * @return
	 */
	List<Pfgh_pb_pbyzhs> findZhs();
	
	/**
	 * 火箭军火力毁伤能力
	 * @return
	 */
	List<Pfgh_pb_hjjhs> findJhs();
	
	/**
	 * 航空兵火力毁伤能力
	 * @return
	 */
	List<Pfgh_pb_hkbhs> findBhs();
}
