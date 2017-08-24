package com.tarena.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tarena.dao.AccountMapper;
import com.tarena.entity.Account;
import com.tarena.entity.page.AccountPage;

public class TestAccount {
	//@Test
	public void testFindByPage() {
		String cfg = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
		AccountMapper dao = ctx.getBean(AccountMapper.class);
		AccountPage page = new AccountPage();
		page.setPage(3);
		List<Account> list = dao.findByPage(page);
		for(Account a : list) {
			System.out.println(a);
		}
	}
	
	//@Test
	public void testPause() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountMapper dao = ctx.getBean(AccountMapper.class);
	   dao.pause(1018);
	}
}
