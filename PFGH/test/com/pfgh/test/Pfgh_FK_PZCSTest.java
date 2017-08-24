package com.pfgh.test;

import java.util.List;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pfgh.dao.Pfgh_FK_PZCSDao;
import com.pfgh.entity.Pfgh_FK_GPBZ;
import com.pfgh.entity.Pfgh_FK_PZCS;
import com.pfgh.entity.Pfgh_fk_gpxq;
import com.pfgh.service.Pfgh_FK_PZCSService;
import com.pfgh.serviceImpl.Pfgh_FK_PZCSServiceImpl;

public class Pfgh_FK_PZCSTest {
	private static ApplicationContext ctx = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		String cfg[] = {"com/pfgh/spring/spring-common.xml","com/pfgh/spring/spring-datasource.xml","com/pfgh/spring/spring-transaction.xml"};
		ctx = new ClassPathXmlApplicationContext(cfg);
	}
	
	//@Test
	public void findAll() {
		Pfgh_FK_PZCSService service = (Pfgh_FK_PZCSServiceImpl) ctx.getBean("pfgh_FK_PZCSServiceImpl");
		List<Pfgh_FK_PZCS> list = service.findAll();
		System.out.println(list);
	}
	
	//@Test
	public void find2() {
		Pfgh_FK_PZCSService service = (Pfgh_FK_PZCSServiceImpl) ctx.getBean("pfgh_FK_PZCSServiceImpl");
		Pfgh_FK_GPBZ list = service.findGpByBh("1");
		System.out.println(list);
	}
	
	//@Test
	public void find3() {
		Pfgh_FK_PZCSDao dao = ctx.getBean(Pfgh_FK_PZCSDao.class);
		Pfgh_FK_GPBZ list = dao.findGpByBh("1");
		System.out.println(list);
	}
	
	//@Test
	public void find4() {
		Pfgh_FK_PZCSDao dao = ctx.getBean(Pfgh_FK_PZCSDao.class);
		Pfgh_fk_gpxq gp = new Pfgh_fk_gpxq();
		gp.setId("1");
		gp.setXh("双-35高炮排");
		gp.setRwbl(0.2);
		gp.setHlxq(7.0);
		gp.setHlmyd(1.0);
		gp.setDyxq(2301.0);
		gp.setDymyd(0.86);
		System.out.println(gp);
		dao.insertGpxq(gp);
	}
	
	//@Test
	public void find5() {
		Pfgh_FK_PZCSDao dao = ctx.getBean(Pfgh_FK_PZCSDao.class);
		Pfgh_fk_gpxq gp = new Pfgh_fk_gpxq();
		gp.setId("888");
		gp.setXh("reretr");
		dao.deleteAllGpxq();
	}  
	
	@Test
	public void find6() {
		Pfgh_FK_PZCSDao dao = ctx.getBean(Pfgh_FK_PZCSDao.class);
		List<Map<String,Object>> list = dao.findTaskInfo();
		System.out.println(list);
	}  
}
