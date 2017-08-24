package com.tarena.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tarena.dao.AccountMapper;
import com.tarena.dao.ServiceMapper;
import com.tarena.entity.Account;
import com.tarena.entity.page.AccountPage;

@Controller
@RequestMapping("/account")
@SessionAttributes("accountPage")
public class AccountController extends BaseController{
	
	@Resource
	private AccountMapper accountMapper;
	@Resource
	private ServiceMapper serviceMapper;
	
	@RequestMapping("/findAccount.form")
	public String find(AccountPage page, Model model) {
		//查询出当前页的数据
		List<Account> list = accountMapper.findByPage(page);
		model.addAttribute("accounts", list);
		//查询出总行数，计算出总页数，传递给页面
		int rows = accountMapper.findByRow(page);
		page.setRows(rows);
		model.addAttribute("accountPage", page);
		return "account/account_list";
	}
	
	/**
	 * 该方法命名最好不要直接写pause，应该以update开头，
	 * 目的是将来要使用Spring统一管理Controller中方法
	 * 的事务，前提是这些方法需要有一定的规律，能够从
	 * 规律中识别其是增删改查中的任何一个方法。
	 */
	@RequestMapping("/pauseAccount.form")
	public String updateToPause(int id) {
		//暂停账务账号
		accountMapper.pause(id);
		//暂停对应的业务账号
		/*
		 * 有2种方式
		 * SQL 1:
		 * 	update service 
		 *    set status='1',pause_date=sysdate
		 * 	where account_id=#{id}
		 * SQL 2:
		 * 	根据账务账号，查询对应的业务账号
		 * 	select * from service where account_id=#{id}
		 * 	遍历业务账号ID，依次执行暂停业务账号方法。
		 * */
		serviceMapper.pauseByAccount(id);
		return "redirect:findAccount.form";
	}
	@RequestMapping("/startAccount.form")
	public String updateToStart(int id){
		//开通帐务帐号
		accountMapper.start(id);
		return "redirect:findAccount.form";
	}
	@RequestMapping("/deleteAccount.form")
	public String updateToDelete(int id){
		//删除帐务帐号
		accountMapper.delete(id);
		return "redirect:findAccount.form";
	}
	
	@RequestMapping("zhuCeAccount.form")
	public String addAccount(){
		//转发到帐务帐号注册页面
		return "account/add_account";
	}
	
	@RequestMapping("recommender.form")
	@ResponseBody
	public Map<String,Object> recommendercard(String idcardNo){
		return accountMapper.findByIdcardNo(idcardNo);
	}
	
	@RequestMapping("toUpdateAccount.form")
	public String toUpdate(int id,Model model){
		//查询的帐务帐号
		Account acc = accountMapper.findById(id);
		model.addAttribute("account", acc);
		if(acc.getRecommender_id()!=null){
			Account rec = accountMapper.findById(acc.getRecommender_id());
			acc.setRecommender_idcard_no(rec.getIdcard_no());
		}
		return "account/update_account";
	}
	
	@RequestMapping("updateAcc.form")
	public String update(Account account){
		accountMapper.updateAccount(account);
		return "redirect:findAccount.form";
	}

}

