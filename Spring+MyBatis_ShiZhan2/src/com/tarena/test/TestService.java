package com.tarena.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tarena.dao.ServiceMapper;
import com.tarena.entity.Cost;
import com.tarena.entity.Service;
import com.tarena.entity.page.ServicePage;

public class TestService {
	//@Test
	public void testFindByPage(){
		String cfg = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
		ServiceMapper mapper = ctx.getBean("serviceMapper",ServiceMapper.class);
		ServicePage page = new ServicePage();
		List<Map<String,Object>> list = mapper.findByPage(page);
		for(Map<String,Object> map : list){
			System.out.println(
					map.get("SERVICE_ID") + " " + 
					map.get("UNIX_HOST") + " " +
					map.get("OS_USERNAME") + " " +
					map.get("IDCARD_NO") + " " +
					map.get("REAL_NAME") + " " +
					map.get("NAME") + " " +
					map.get("DESCR"));
		}
	}
	//@Test
	public void testFindByRow(){
		String cfg = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
		ServiceMapper mapper = ctx.getBean("serviceMapper",ServiceMapper.class);
		ServicePage page = new ServicePage();
		int a = mapper.findByRow(page);
		System.out.println(a);
	}
	
	//@Test
	public void testPause(){
		String cfg = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
		ServiceMapper mapper = ctx.getBean("serviceMapper",ServiceMapper.class);
		mapper.pause(2001);
	}
	
	//@Test
	public void testfindAll(){
		String cfg = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
		ServiceMapper mapper = ctx.getBean("serviceMapper",ServiceMapper.class);
		List<Map<String,Object>> list = mapper.findAll();
		for(Map<String,Object> map : list){
			System.out.println(map);
		}
	}

	@Test
	public void testupdateName(){
		String cfg = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
		ServiceMapper mapper = ctx.getBean("serviceMapper",ServiceMapper.class);
		Map<String,Integer> map = new HashMap<String,Integer>();
		Service c = mapper.findById(2001);
		c.setCost_id(2);
		mapper.updateName2(map);
		System.out.println(c);
	}
}
