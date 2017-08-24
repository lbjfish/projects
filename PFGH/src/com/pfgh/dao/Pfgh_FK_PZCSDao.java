package com.pfgh.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.pfgh.annotation.MyBatisDao;
import com.pfgh.entity.Pfgh_FK_DKDDBZ;
import com.pfgh.entity.Pfgh_FK_GPBZ;
import com.pfgh.entity.Pfgh_FK_PZCS;
import com.pfgh.entity.Pfgh_FK_ZCYJBZ;
import com.pfgh.entity.Pfgh_fk_ddxq;
import com.pfgh.entity.Pfgh_fk_gpxq;
import com.pfgh.entity.Pfgh_fk_ldxq;

@MyBatisDao
public interface Pfgh_FK_PZCSDao {
	List<Pfgh_FK_PZCS> findAll();
	
	List<Pfgh_FK_DKDDBZ> findDk();
	
	List<Pfgh_FK_GPBZ> findGp();
	
	List<Pfgh_FK_ZCYJBZ> findZc();
	
	Pfgh_FK_GPBZ findGpByBh(String bh);
	
	Pfgh_FK_DKDDBZ findDkByBh(String bh);
	
	Pfgh_FK_ZCYJBZ findLdByBh(String bh);
	
	void deleteAllGpxq();
	
	void insertGpxq(Pfgh_fk_gpxq gpxq);
	
	void deleteAllDdxq();
	
	void insertDdxq(Pfgh_fk_ddxq ddxq);
	
	void deleteAllLdxq();
	
	void insertLdxq(Pfgh_fk_ldxq ldxq);
	
	List<Map<String,Object>> findTaskInfo();
	
	void updatePzcs(@Param("csz")Double csz,@Param("csbh")String csbh);
}
