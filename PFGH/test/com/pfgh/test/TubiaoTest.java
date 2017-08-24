package com.pfgh.test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pfgh.dao.TubiaoDao;
import com.pfgh.entity.Pfgh_pb_dmbljgx;
import com.pfgh.entity.Pfgh_pb_dmbwlxx;

public class TubiaoTest {
	private static ApplicationContext ctx = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		String cfg[] = {"com/pfgh/spring/spring-common.xml","com/pfgh/spring/spring-datasource.xml","com/pfgh/spring/spring-transaction.xml"};
		ctx = new ClassPathXmlApplicationContext(cfg);
	}

	//@Test
	public void test() {
		TubiaoDao mapper = (TubiaoDao) ctx.getBean("tubiaoDao");
		List<Pfgh_pb_dmbwlxx> list = mapper.findAll();
		System.out.println(list.size());
	}
	
	@Test
	public void test2() {
		List<Map<String,Object>> listmap = new ArrayList<Map<String,Object>>();
		TubiaoDao mapper = (TubiaoDao) ctx.getBean("tubiaoDao");
		List<Pfgh_pb_dmbljgx> list = mapper.findAll2();
		List<Pfgh_pb_dmbwlxx> list2 = mapper.findAll();
		for(int i=0;i<list.size();i++){
			Map<String,Object> map = new LinkedHashMap<String,Object>();
			for(int j=0;j<list2.size();j++){
				if(list.get(i).getQdbh().equals(list2.get(j).getMbbh())){
					map.put("mc1", list2.get(j).getMbmc());
					continue;
				}
			}
			for(int k=0;k<list2.size();k++){
				if(list.get(i).getZdbh().equals(list2.get(k).getMbbh())){
					map.put("mc2", list2.get(k).getMbmc());
					continue;
				}
			}
			listmap.add(map);
		}
		System.out.println(listmap);
	}
}
