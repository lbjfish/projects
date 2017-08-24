package com.pfgh.dao;

import java.util.List;

import com.pfgh.annotation.MyBatisDao;
import com.pfgh.entity.Ty_zznlxx;

@MyBatisDao
public interface Ty_zznlxxDao {
	
	List<Ty_zznlxx> findZznlxx(String pbl);
	
	List<String> findNlzblxToBdmc(String nlzblx);
}
