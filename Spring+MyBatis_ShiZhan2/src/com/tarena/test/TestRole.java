package com.tarena.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tarena.dao.RoleMapper;
import com.tarena.entity.Module;
import com.tarena.entity.Role;
import com.tarena.entity.page.RolePage;

public class TestRole {
	@Test
	public void testRoleDao(){
		String cfg = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
		RoleMapper mapper = ctx.getBean("roleMapper",RoleMapper.class);
		RolePage page = new RolePage();
		List<Role> list = mapper.findByPage(page);
		for(Role r : list){
			System.out.println(r.getRole_id()+" "+r.getName());
			List<Module> list2 = r.getModules();
			for(Module m : list2){
				System.out.println(m.getModule_id()+" "+m.getName());
			}
			System.out.println("------------");
		}
	}
}
