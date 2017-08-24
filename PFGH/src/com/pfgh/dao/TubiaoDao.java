package com.pfgh.dao;

import java.util.List;

import com.pfgh.annotation.MyBatisDao;
import com.pfgh.entity.Pfgh_pb_dmbljgx;
import com.pfgh.entity.Pfgh_pb_dmbwlxx;

@MyBatisDao
public interface TubiaoDao {
	List<Pfgh_pb_dmbwlxx> findAll();
	List<Pfgh_pb_dmbljgx> findAll2();
}
