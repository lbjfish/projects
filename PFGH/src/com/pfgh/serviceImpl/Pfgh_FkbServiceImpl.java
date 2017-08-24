package com.pfgh.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfgh.dao.Pfgh_FkbDao;
import com.pfgh.entity.Pfgh_Fkb;
import com.pfgh.service.Pfgh_FkbService;

@Transactional
@Service
public class Pfgh_FkbServiceImpl implements Pfgh_FkbService{
	@Resource
	private Pfgh_FkbDao pfgh_FkbDao;
	
	@Override
	public List<Pfgh_Fkb> findFkb(String fkb) {
		List<Pfgh_Fkb> fkbs = pfgh_FkbDao.findFkb(fkb);
		return fkbs;
	}

	@Override
	public List<String> findNlzblxToBdmc(String nlzblx) {
		List<String> strs = pfgh_FkbDao.findNlzblxToBdmc(nlzblx);
		return strs;
	}

}
