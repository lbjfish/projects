package com.tarena.test;

import java.sql.Timestamp;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tarena.dao.AdminMapper;
import com.tarena.entity.Admin;
import com.tarena.entity.Module;
import com.tarena.entity.Role;
import com.tarena.entity.page.AdminPage;

public class TestAdmin {
	//@Test
	public void testFindAdminPage(){
		String cfg = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
		AdminMapper mapper = ctx.getBean("adminMapper",AdminMapper.class);
		AdminPage page = new AdminPage();
		List<Admin> list = mapper.findByPage(page);
		for(Admin a : list){
			System.out.println(
					a.getAdmin_id()+" "+
					a.getName()+" "+
					a.getAdmin_code());
			List<Role> list2 = a.getRoles();
			for(Role r : list2){
				System.out.println(
						r.getRole_id()+" "+
						r.getName());				
			}
			System.out.println("----------------------------");
		}
	}

	//@Test
	public void testaddAdmin(){
		String cfg = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
		AdminMapper mapper = ctx.getBean("adminMapper",AdminMapper.class);
		Admin a = new Admin();
		a.setAdmin_code("sdas");
		a.setPassword("2323");
		a.setEnrolldate(new Timestamp(System.currentTimeMillis()));
		a.setName("sdas");
		a.setTelephone("1131");
		a.setEmail("sdas");
		a.setEmail("sadsa");
		mapper.save(a);
	}
	
	@Test
	public void testModuleByAdmin(){
		String cfg = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
		AdminMapper mapper = ctx.getBean("adminMapper",AdminMapper.class);
		List<Module> list = mapper.findModuleByAdmin(5000);
		for(Module m : list){
			System.out.println(m.getModule_id()+" "+m.getName());
		}
	}
}
