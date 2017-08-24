package com.pfgh.serviceImpl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfgh.dao.Ty_zznlxxDao;
import com.pfgh.entity.Ty_zznlxx;
import com.pfgh.service.Ty_zznlxxService;

@Transactional
@Service
public class Ty_zznlxxServiceImpl implements Ty_zznlxxService{
	@Resource
	Ty_zznlxxDao zznlxxDao;
	
	@Override
	public List<String> findNlzblxToBdmc(String nlzblx) {
		List<String> strs = zznlxxDao.findNlzblxToBdmc(nlzblx);
		return strs;
	}
	
	@Override
	public List<Ty_zznlxx> findZznlxx(String pbl) {
		List<Ty_zznlxx> zznlxxs = zznlxxDao.findZznlxx(pbl);
		return zznlxxs;
	}
}
