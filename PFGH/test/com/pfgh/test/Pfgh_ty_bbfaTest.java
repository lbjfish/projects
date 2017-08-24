package com.pfgh.test;

import java.util.List;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pfgh.dao.Pfgh_ty_bbfaDao;
import com.pfgh.entity.Pfgh_ty_bbfa;
import com.pfgh.entity.Pfgh_ty_bdzb;
import com.pfgh.entity.Pfgh_ty_bzbs;
import com.pfgh.entity.Pfgh_ty_zbxh;
import com.pfgh.entity.Pfgh_ty_zysdwz;
import com.pfgh.entity.Pfgh_ty_zzbs;
import com.pfgh.entity.Pfgh_ty_zzxd;
import com.pfgh.service.Pfgh_ty_bbfaService;
import com.pfgh.serviceImpl.Pfgh_ty_bbfaServiceImpl;

public class Pfgh_ty_bbfaTest {
private static ApplicationContext ctx = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		String cfg[] = {"com/pfgh/spring/spring-common.xml","com/pfgh/spring/spring-datasource.xml","com/pfgh/spring/spring-transaction.xml"};
		ctx = new ClassPathXmlApplicationContext(cfg);
	}

	//@Test
	public void test() {
		Pfgh_ty_bbfaDao mapper = (Pfgh_ty_bbfaDao) ctx.getBean("pfgh_ty_bbfaDao");
		List<Pfgh_ty_bbfa> list = mapper.findFamc();
		System.out.println(list);
	}
	
	//@Test
	public void test2() {
		Pfgh_ty_bbfaService mapper = (Pfgh_ty_bbfaServiceImpl) ctx.getBean("pfgh_ty_bbfaServiceImpl");
		List<Pfgh_ty_bbfa> list = mapper.findFamc();
		System.out.println(list);
	}
	
	//@Test
	public void test3() {
		Pfgh_ty_bbfaDao mapper = (Pfgh_ty_bbfaDao) ctx.getBean("pfgh_ty_bbfaDao");
		List<Pfgh_ty_zzxd> list = mapper.findAllByFanm("FA00001");
		for(Pfgh_ty_zzxd zz : list){
			System.out.println(zz);
		}
	}
	
	//@Test
	public void test4() {
		Pfgh_ty_bbfaService mapper = (Pfgh_ty_bbfaServiceImpl) ctx.getBean("pfgh_ty_bbfaServiceImpl");
		List<Pfgh_ty_zzxd> list = mapper.findAllByFanm("FA00001");
		System.out.println(list);
	}
	
	//@Test
	public void test5() {
		Pfgh_ty_bbfaDao mapper = (Pfgh_ty_bbfaDao) ctx.getBean("pfgh_ty_bbfaDao");
		List<Pfgh_ty_bzbs> bzs= mapper.findMXByNm("001001");
		for(Pfgh_ty_bzbs bz : bzs){
			System.out.println(bz);
			//System.out.println(bz.getBlqfbz());
			System.out.println("************************************************");
		}
		
		System.out.println();
		System.out.println();
		
		List<Pfgh_ty_zysdwz> bl2 = mapper.findMXByNm2("SD0001");
		for(Pfgh_ty_zysdwz zy : bl2){
			System.out.println(zy);
			System.out.println(zy.getZysds());
			System.out.println("-----------------------------------------------------");
		}
	}
	
	//@Test
	public void test6() {
		Pfgh_ty_bbfaService mapper = (Pfgh_ty_bbfaServiceImpl) ctx.getBean("pfgh_ty_bbfaServiceImpl");
		List<Map<String,Object>> list = mapper.findEntity("001001,001002");
		System.out.println(list);
	}
	
	//@Test
	public void test7() {
		Pfgh_ty_bbfaDao mapper = (Pfgh_ty_bbfaDao) ctx.getBean("pfgh_ty_bbfaDao");
		List<Map<String,Object>> list = mapper.findBdByNm("FA00001");
		System.out.println(list);
	}
	
	//@Test
	public void test8() {
		Pfgh_ty_bbfaDao mapper = (Pfgh_ty_bbfaDao) ctx.getBean("pfgh_ty_bbfaDao");
		List<Pfgh_ty_bdzb> bdzbs = mapper.findBdzbByMc("FA00001");
		System.out.println(bdzbs);
	}
	
	//@Test
	public void test9() {
		Pfgh_ty_bbfaDao mapper = (Pfgh_ty_bbfaDao) ctx.getBean("pfgh_ty_bbfaDao");
		List<Pfgh_ty_zbxh> bdzbs = mapper.findZbxhByXz("LD001");
		System.out.println(bdzbs);
	}
	
	//@Test
	public void test10() {
		Pfgh_ty_bbfaDao mapper = (Pfgh_ty_bbfaDao) ctx.getBean("pfgh_ty_bbfaDao");
		List<Pfgh_ty_zzbs> bdzbs = mapper.findZzbsByJW("FA00001");
		System.out.println(bdzbs);
	}
	
	//@Test
	public void test11() {
		Pfgh_ty_bbfaService mapper = (Pfgh_ty_bbfaServiceImpl) ctx.getBean("pfgh_ty_bbfaServiceImpl");
		Map<String,Object> map = mapper.findLdByNm("FA00001");
		System.out.println(map);
	}
	
	@Test
	public void test12() {
		Pfgh_ty_bbfaDao mapper = (Pfgh_ty_bbfaDao) ctx.getBean("pfgh_ty_bbfaDao");
		List<Pfgh_ty_bdzb> bdzbs = mapper.findBdOneToOne("401110905", "FA00001");
		for(Pfgh_ty_bdzb bdzb : bdzbs){
			System.out.println(bdzb);
			System.out.println("--------------------------");
		}
	}
}
