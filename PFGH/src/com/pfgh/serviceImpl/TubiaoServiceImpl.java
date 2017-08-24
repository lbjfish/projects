package com.pfgh.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfgh.dao.TubiaoDao;
import com.pfgh.entity.Pfgh_pb_dmbljgx;
import com.pfgh.entity.Pfgh_pb_dmbwlxx;
import com.pfgh.service.TubiaoService;

@Transactional
@Service
public class TubiaoServiceImpl implements TubiaoService{
	
	@Resource
	private TubiaoDao tubiaoDao;
	
	@Override
	public List<Pfgh_pb_dmbwlxx> findAll() {
		return tubiaoDao.findAll();
	}

	@Override
	public List<Pfgh_pb_dmbljgx> findAll2() {
		return tubiaoDao.findAll2();
	}
}
