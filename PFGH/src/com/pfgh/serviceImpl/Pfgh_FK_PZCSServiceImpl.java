package com.pfgh.serviceImpl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfgh.dao.Pfgh_FK_PZCSDao;
import com.pfgh.entity.Pfgh_FK_DKDDBZ;
import com.pfgh.entity.Pfgh_FK_GPBZ;
import com.pfgh.entity.Pfgh_FK_PZCS;
import com.pfgh.entity.Pfgh_FK_ZCYJBZ;
import com.pfgh.entity.Pfgh_fk_ddxq;
import com.pfgh.entity.Pfgh_fk_gpxq;
import com.pfgh.entity.Pfgh_fk_ldxq;
import com.pfgh.service.Pfgh_FK_PZCSService;

@Transactional
@Service
public class Pfgh_FK_PZCSServiceImpl implements Pfgh_FK_PZCSService{
	@Resource
	private Pfgh_FK_PZCSDao pzcsDao;
	
	public List<Pfgh_FK_PZCS> findAll(){
		return pzcsDao.findAll();
	}

	@Override
	public List<Pfgh_FK_DKDDBZ> findDk() {
		return pzcsDao.findDk();
	}

	@Override
	public List<Pfgh_FK_GPBZ> findGp() {
		return pzcsDao.findGp();
	}

	@Override
	public List<Pfgh_FK_ZCYJBZ> findZc() {
		return pzcsDao.findZc();
	}

	@Override
	public Pfgh_FK_GPBZ findGpByBh(String bh) {
		return pzcsDao.findGpByBh(bh);
	}

	@Override
	public Pfgh_FK_DKDDBZ findDkByBh(String bh) {
		// TODO Auto-generated method stub
		return pzcsDao.findDkByBh(bh);
	}

	@Override
	public Pfgh_FK_ZCYJBZ findLdByBh(String bh) {
		return pzcsDao.findLdByBh(bh);
	}

	@Override
	public void deleteAllGpxq() {
		pzcsDao.deleteAllGpxq();
	}
	
	@Override
	public void insertGpxq(Pfgh_fk_gpxq gpxq) {
		pzcsDao.insertGpxq(gpxq);
	}

	@Override
	public void deleteAllDdxq() {
		pzcsDao.deleteAllDdxq();
	}

	@Override
	public void insertDdxq(Pfgh_fk_ddxq ddxq) {
		pzcsDao.insertDdxq(ddxq);
	}

	@Override
	public void deleteAllLdxq() {
		pzcsDao.deleteAllLdxq();
	}

	@Override
	public void insertLdxq(Pfgh_fk_ldxq ldxq) {
		pzcsDao.insertLdxq(ldxq);
	}

	@Override
	public List<Map<String, Object>> findTaskinfo() {
		return pzcsDao.findTaskInfo();
	}

	@Override
	public void updatePzcs(Double csz, String csbh) {
		pzcsDao.updatePzcs(csz, csbh);
	}
}
