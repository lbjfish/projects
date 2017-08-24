package com.tarena.daoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.tarena.dao.CostDao;
import com.tarena.entity.Cost;
@Repository
public class CostDaoImpl extends HibernateDaoSupport implements CostDao{
	@Resource
	public void setSF(SessionFactory sf){
		super.setSessionFactory(sf);
	}
	public List<Cost> findAll() {
		// TODO Auto-generated method stub
		List<Cost> list = getHibernateTemplate().find("from Cost");
		return list;
	}

}
