package com.tarena.dao;

import com.tarena.annotation.MyBatisDao;
import com.tarena.entity.Classes;

@MyBatisDao
public interface ClassesMapper {
	Classes findClaId(int tid);
	
	Classes findClaId2(int cid2);
}
