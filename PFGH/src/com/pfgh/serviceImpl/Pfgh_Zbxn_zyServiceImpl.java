package com.pfgh.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfgh.dao.Pfgh_Zbxn_zyDao;
import com.pfgh.entity.Pfgh_Zbxn_tp;
import com.pfgh.entity.Pfgh_Zbxn_zbsx;
import com.pfgh.entity.Pfgh_Zbxn_zbxh;
import com.pfgh.entity.Pfgh_Zbxn_zy;
import com.pfgh.service.Pfgh_Zbxn_zyService;
@Transactional
@Service
public class Pfgh_Zbxn_zyServiceImpl implements Pfgh_Zbxn_zyService{
	@Resource
	private Pfgh_Zbxn_zyDao pfgh_zyDao;
	
	@Override
	public List<String> getZy() {
		List<String> str = pfgh_zyDao.getZy();
		return str;
	}

	@Override
	public List<Pfgh_Zbxn_zy> getZyList() {
		List<Pfgh_Zbxn_zy> str = pfgh_zyDao.getZyList();
		return str;
	}

	@Override
	public List<Pfgh_Zbxn_zbxh> findZbxhList() {
		List<Pfgh_Zbxn_zbxh> str = pfgh_zyDao.findZbxhList();
		return str;
	}

	@Override
	public List<Pfgh_Zbxn_zbsx> findZbsxList(String zbsxid) {
		List<Pfgh_Zbxn_zbsx> str = pfgh_zyDao.findZbsxList(zbsxid);
		return str;
	}

	@Override
	public Pfgh_Zbxn_tp getImg(String zbxhnm) {
		Pfgh_Zbxn_tp str = pfgh_zyDao.getImg(zbxhnm);
		return str;
	}

}
