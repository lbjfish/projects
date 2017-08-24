package com.pfgh.test;

import java.util.List;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pfgh.dao.Pb_zzjtDao;
import com.pfgh.entity.Pb_dfbdcs;
import com.pfgh.entity.Pb_wfbdcs;
import com.pfgh.entity.base.BasePb_zzjt;
import com.pfgh.serviceImpl.Pb_zzjtServiceImpl;

public class Pb_zzjtTest {

	private static ApplicationContext ctx = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		String cfg[] = {"com/pfgh/spring/spring-common.xml","com/pfgh/spring/spring-datasource.xml","com/pfgh/spring/spring-transaction.xml"};
		ctx = new ClassPathXmlApplicationContext(cfg);
	}

	//@Test
	public void test() {
		Pb_zzjtDao mapper = (Pb_zzjtServiceImpl) ctx.getBean("pb_zzjtServiceImpl");
		BasePb_zzjt zzjt = mapper.findWfbl(0);
		System.out.println(zzjt);
		for(Pb_wfbdcs wf : zzjt.getWfbdcs()){
			System.out.println(wf);
		}
		
		
	}
	
	//@Test
	public void test2() {
		Pb_zzjtDao mapper = (Pb_zzjtServiceImpl) ctx.getBean("pb_zzjtServiceImpl");
		BasePb_zzjt zzjt = mapper.findDfbl(1);
		System.out.println(zzjt);
		for(Pb_dfbdcs wf : zzjt.getDfbdcs()){
			System.out.println(wf);
		}
		
	}

	//@Test
	public void test3(){
		Pb_zzjtDao mapper = (Pb_zzjtDao) ctx.getBean("pb_zzjtDao");
		List<Map<String,Object>> list = mapper.findByBh("01");
		for(Map<String,Object> map : list){
			System.out.println(map);
		}
	}
	
	@Test
	public void test4(){
		Pb_zzjtDao mapper = (Pb_zzjtDao) ctx.getBean("pb_zzjtDao");
		List<String> list = mapper.findByBh2("08");
		for(String map : list){
			System.out.println(map);
		}
	}
}
