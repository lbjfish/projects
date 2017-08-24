package com.tarena.test;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tarena.dao.CostMapper;
import com.tarena.entity.Cost;
import com.tarena.entity.page.CostPage;

public class TestCost {
	//@Test
	public void testFindAllCost(){
		String cfg = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
		//empMapper是EmpMapper接口的首字母小写其它照抄，因为没有指定注解比如@Component
		CostMapper mapper = ctx.getBean("costMapper",CostMapper.class); 
		List<Cost> list = mapper.findAllCost();
		for(Cost cost : list){
			System.out.println(cost);
		}
	}
	
	//@Test
	public void testAddCost(){
		String cfg = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
		CostMapper mapper = ctx.getBean("costMapper",CostMapper.class); 
		Cost c = new Cost();
		c.setName("aaa");
		c.setBase_duration(20);
		c.setBase_cost(5.00);
		c.setUnit_cost(0.2);
		c.setStatus("0");
		c.setCreatime(new Timestamp(System.currentTimeMillis()));
		mapper.addCost(c);
		System.out.println(c);
	}
	
	//@Test
	public void testFindById(){
		String cfg = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
		CostMapper mapper = ctx.getBean("costMapper",CostMapper.class);
		Cost c = mapper.findById(113);
		System.out.println(c);
	}
	
	//@Test
	public void testUpdate(){
		String cfg = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
		CostMapper mapper = ctx.getBean("costMapper",CostMapper.class);
		Cost c = mapper.findById(113);
		c.setName("ccc");
		mapper.updateCost(c);
		System.out.println(c);
	}
	
	//@Test
	public void testdelete(){
		String cfg = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
		CostMapper mapper = ctx.getBean("costMapper",CostMapper.class);
		mapper.deleteCost(113);
		System.out.println("已删");
	}
	
	//@Test
	public void testFindByPage(){
		String cfg = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
		CostMapper mapper = ctx.getBean("costMapper",CostMapper.class);
		CostPage cp = new CostPage();
		cp.setPage(1);  //显示想跳到第几行
		List<Cost> list = mapper.findByPage(cp);
		for(Cost co : list){
			System.out.println(co);
		}
	}
	
	//@Test
	public void testFindByRow(){
		String cfg = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
		CostMapper mapper = ctx.getBean("costMapper",CostMapper.class);
		int a = mapper.findByRow();
		System.out.println(a);
	}
	
	//@Test
	public void testfindNameId(){
		String cfg = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
		CostMapper mapper = ctx.getBean("costMapper",CostMapper.class);
		List<Map<String,Object>> list = mapper.findNameId();
		for(Map<String,Object> map : list){
			System.out.println(map);
		}	
	}
	
}
