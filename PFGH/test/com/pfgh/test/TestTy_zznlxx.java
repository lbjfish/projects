package com.pfgh.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pfgh.dao.Ty_zznlxxDao;
import com.pfgh.entity.Ty_zznlxx;

public class TestTy_zznlxx {
	@Test
	public void testFindStudents(){
		String cfg = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
		//empMapper是EmpMapper接口的首字母小写其它照抄，因为没有指定注解比如@Component
		Ty_zznlxxDao mapper = ctx.getBean(Ty_zznlxxDao.class); 
		List<String> strs = mapper.findnlzbmc("PB001");
		System.out.println(strs);
		for(String s : strs){
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("bdmc", "炮兵旅");
			map.put("nlzbmc", s);
			List<Ty_zznlxx> cla = mapper.findZznlxx3(map);
			for(Ty_zznlxx ty : cla){
				System.out.println(ty);
			}
			System.out.println("----------------------------------------");
		}
	}
}