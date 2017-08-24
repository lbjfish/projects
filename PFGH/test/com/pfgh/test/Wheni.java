package com.pfgh.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pfgh.dao.Ty_zznlxxDao;
import com.pfgh.entity.Ty_zznlxx;

public class Wheni {
	@Test
	public void testFindShu(){
		String cfg = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
		//empMapper是EmpMapper接口的首字母小写其它照抄，因为没有指定注解比如@Component
		Ty_zznlxxDao mapper = ctx.getBean(Ty_zznlxxDao.class); 
		List<Ty_zznlxx> cla = mapper.findZznlxx("炮兵旅");
		List<Ty_zznlxx> tasks = this.MakeTree(cla, "0");
		System.out.println(tasks);
	}
	
	public List<Ty_zznlxx> MakeTree(List<Ty_zznlxx> nodes, String parentId) {
		List<Ty_zznlxx> tasks = new ArrayList<Ty_zznlxx>();
		if (nodes != null) {
			Iterator<Ty_zznlxx> ite = nodes.iterator();
			while (ite.hasNext()) {
				Ty_zznlxx task = (Ty_zznlxx) ite.next();
				//task为parentId的儿子
				if(task.getSjnlzbbh().equals(parentId)){
					Ty_zznlxx ntask = task;
					//递归儿子
					List<Ty_zznlxx> children = this.MakeTree(nodes, task.getNlzbbh());
					if (children.size() > 0) {
						ntask.setChildren(children);
					}
					tasks.add(ntask);
				}
			}
		}
		return tasks;
	}
	
	@Test
	public void testFindNlzblxToBdmc(){
		String cfg = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
		Ty_zznlxxDao mapper = ctx.getBean(Ty_zznlxxDao.class);
		List<String> str = mapper.findNlzblxToBdmc("炮兵");
		for(String s : str){
			System.out.println(s);
		}
	}
	
}
