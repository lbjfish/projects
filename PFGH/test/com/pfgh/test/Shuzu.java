package com.pfgh.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pfgh.dao.Ty_zznlxxDao;
import com.pfgh.entity.Ty_zznlxx;

public class Shuzu {
	@Test
	public void testFindStudents(){
		List<Ty_zznlxx> list = this.MakeTree("3");
		System.out.println(list);
	}
	
	public List<Ty_zznlxx> MakeTree(String parentId) {
		String cfg = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
		//empMapper是EmpMapper接口的首字母小写其它照抄，因为没有指定注解比如@Component
		Ty_zznlxxDao mapper = ctx.getBean(Ty_zznlxxDao.class);
		List<Ty_zznlxx> cla = mapper.findZznlxx2("炮兵旅",parentId);
		List<Ty_zznlxx> tasks = new ArrayList<Ty_zznlxx>();
		if (cla != null) {
			for(Ty_zznlxx ty : cla){
				if(ty.getSjnlzbbh().equals(parentId)){
					//Ty_zznlxx ntask = ty;
					//递归儿子
					List<Ty_zznlxx> children = this.MakeTree(ty.getNlzbbh());
					if (children.size() > 0) {
						ty.setChildren(children);
					}
					tasks.add(ty);
				}
			}
		}
		return tasks;
	}
}
