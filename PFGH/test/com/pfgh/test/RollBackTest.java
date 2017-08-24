package com.pfgh.test;


import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pfgh.entity.Ty_zznlxx;
import com.pfgh.service.Ty_zznlxxService;

public class RollBackTest {
	private static ApplicationContext ctx = null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		String cfg[] = {"com/pfgh/spring/spring-common.xml","com/pfgh/spring/spring-datasource.xml","com/pfgh/spring/spring-transaction.xml"};
		ctx = new ClassPathXmlApplicationContext(cfg);
	}
	
	@Test
	public void test() {
		insertA();
	}
	

	public void insertA() {
		Ty_zznlxx ty1 = new Ty_zznlxx("9999999999","我看行5","446",0.8,0.9,"神盾局","");
		Ty_zznlxxService  service = (Ty_zznlxxService) ctx.getBean("ty_zznlxxServiceImpl");
		service.insertPb(ty1);
		System.out.println(11111);
	}
	
	
}
