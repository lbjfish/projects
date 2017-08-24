package com.pfgh.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDate {

	private static ApplicationContext ctx = null;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		String cfg = "applicationContext.xml";
		ctx = new ClassPathXmlApplicationContext(cfg);
	}

	@Test
	public void test() {
		Date date = (Date) ctx.getBean("date");
		System.out.println(date);
	}

}
