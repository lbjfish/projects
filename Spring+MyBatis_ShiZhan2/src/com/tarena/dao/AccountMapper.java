package com.tarena.dao;

import java.util.List;
import java.util.Map;

import com.tarena.annotation.MyBatisDao;
import com.tarena.entity.Account;
import com.tarena.entity.page.AccountPage;

@MyBatisDao
public interface AccountMapper {
	//分页查询方法
	List<Account> findByPage(AccountPage page);
	//查询总行数
	int findByRow(AccountPage page);
	//暂停一条帐务帐号
	void pause(int id);
	//开始一条帐务帐号
	void start(int id);
	
	void delete(int id);
	
	Account findById(int id);
	/**
	 * 根据身份证查询账务账号
	 */
	Map<String,Object> findByIdcardNo(String idcardNo);
	
	void updateAccount(Account a);
}
