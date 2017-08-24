package com.pfgh.serviceImpl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfgh.dao.Pb_zzjtDao;
import com.pfgh.entity.Pfgh_pb_hjjhs;
import com.pfgh.entity.Pfgh_pb_hkbhs;
import com.pfgh.entity.Pfgh_pb_pbyzhs;
import com.pfgh.entity.base.BasePb_zzjt;
import com.pfgh.service.Pb_zzjtService;

@Transactional
@Service
public class Pb_zzjtServiceImpl implements Pb_zzjtService {
	@Resource
	private Pb_zzjtDao zzjtDao;
	
	@Override
	public BasePb_zzjt findWfbl(int zy) {
		BasePb_zzjt zzjt = zzjtDao.findWfbl(zy);
		return zzjt;
	}

	@Override
	public BasePb_zzjt findDfbl(int zy) {
		BasePb_zzjt zzjt = zzjtDao.findDfbl(zy);
		return zzjt;
	}

	@Override
	public List<Map<String, Object>> findByBh(String bdbh) {
		return zzjtDao.findByBh(bdbh);
	}

	@Override
	public List<String> findByBh2(String bdbh) {
		return zzjtDao.findByBh2(bdbh);
	}

	@Override
	public List<Pfgh_pb_pbyzhs> findZhs() {
		return zzjtDao.findZhs();
	}

	@Override
	public List<Pfgh_pb_hjjhs> findJhs() {
		return zzjtDao.findJhs();
	}

	@Override
	public List<Pfgh_pb_hkbhs> findBhs() {
		return zzjtDao.findBhs();
	}
	
}
