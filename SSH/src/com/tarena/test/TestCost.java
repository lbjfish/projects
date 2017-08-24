package com.tarena.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tarena.dao.CostDao;
import com.tarena.daoImpl.CostDaoImpl;
import com.tarena.entity.Cast;
import com.tarena.entity.Cost;
import com.tarena.entity.Service;
import com.tarena.util.HibernateUtil;

public class TestCost {
	//@Test
	public void findAll(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		CostDao dao = ctx.getBean("costDaoImpl",CostDaoImpl.class);
		List<Cost> list = dao.findAll();
		for(Cost c : list){
			System.out.println(c.getCost_id()+","+c.getName()+","+c.getUnit_cost());
		}
	}
	
	//@Test
	public void test1(){
		Session session = HibernateUtil.getSession();
		SQLQuery query = session.createSQLQuery("select new Service(s.login_passwd,s.status) from Service");
		List<Service> list = query.list();
		for(Service s :list){
			System.out.println(s);
		}
	}
	
	//@Test
	public void test2(){
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery("from Service s left join s.cost c");
		List<Object[]> list = query.list();
		for(Object[] s : list){
	
			for(Object o : s){
				System.out.println(o);
			}
		}
	}
	
	@Test
	public void test3(){
		String sql = "select c.name,c.base_cost,s.os_username,s.login_passwd from cost_lee c,service_lee s where c.cost_id = s.cost_id";
		Session session = HibernateUtil.getSession();
		Query query = session.createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		List list = query.list();
		for(int i=0;i<list.size();i++){
			List<Cast> list1 = new ArrayList<Cast>();
			Cast ca = new Cast();
			Map map = (Map)list.get(i);
			System.out.println(map);
//			
//			System.out.println(map.get("BASE_COST"));
//			System.out.println(map.get("NAME"));
			ca.setName(map.get("BASE_COST").toString());
			System.out.println(ca.getName());
			//ca.setBase_cost((Double)map.get("NAME").toString());
		}
	}
	
	//@Test
	public void test4(){
		String sql = "select c.name,c.base_cost,s.os_username,s.login_passwd from cost_lee c,service_lee s where c.cost_id = s.cost_id";
		Session session = HibernateUtil.getSession();
		SQLQuery query = (SQLQuery) session.createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
//		query.addScalar("name",Hibernate.STRING);
//		query.addScalar("base_cost",Hibernate.INTEGER);
		List list = query.list();
		Map map = (Map) list.get(3); 
		  
		  System.out.println(map.get("NAME"));
		  System.out.println(map.get("BASE_COST"));
	}
	
	//@Test
	public void test5(){
		String sql = "select c.name,c.base_cost,s.os_username,s.login_passwd from cost_lee c,service_lee s where c.cost_id = s.cost_id";
		Session session = HibernateUtil.getSession();
		SQLQuery query = (SQLQuery) session.createSQLQuery(sql).setResultTransformer(Transformers.aliasToBean(Cast.class));
		query.addScalar("name",Hibernate.STRING);
		query.addScalar("base_cost",Hibernate.INTEGER);
		query.addScalar("os_username",Hibernate.STRING);
		query.addScalar("login_passwd",Hibernate.STRING);
		List list = query.list();
		  Cast sqb=(Cast)list.get(1);
		  
		  System.out.println(sqb.getBase_cost());
		  System.out.println(sqb.getName());
	}
	
	//@Test
	public void test6(){
		String sql = "select c.name,c.base_cost,s.os_username,s.login_passwd from cost_lee c,service_lee s where c.cost_id = s.cost_id";
		Session session = HibernateUtil.getSession();
		Query query = session.createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		List list = query.list();
		for(int i=0;i<list.size();i++){
			List<Cast> list1 = new ArrayList<Cast>();
			Cast ca = new Cast();
			Map map = (Map)list.get(i);
			System.out.println(map);
			Set<Entry<String,Integer>>set = map.entrySet();
			for(Entry<String,Integer> entry : set){
				String a = entry.getKey();
				System.out.println(entry.getKey()+","+entry.getValue());
			}
			map.get("BASE_COST");
			map.get("NAME");
			
		}
	}
	
}
