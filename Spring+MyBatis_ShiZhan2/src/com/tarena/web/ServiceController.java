package com.tarena.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tarena.dao.AccountMapper;
import com.tarena.dao.CostMapper;
import com.tarena.dao.ServiceMapper;
import com.tarena.entity.Account;
import com.tarena.entity.Cost;
import com.tarena.entity.Service;
import com.tarena.entity.page.ServicePage;

@Controller
@RequestMapping("/service")
@SessionAttributes("servicePage")
public class ServiceController extends BaseController{
	
	@Resource
	ServiceMapper serviceMapper;
	
	@Resource
	AccountMapper accountMapper;
	
	@Resource
	CostMapper costMapper;
	
	@RequestMapping("/findService.form")
	public String find(ServicePage page,ModelMap model){
		List<Map<String,Object>> list = serviceMapper.findByPage(page);
		model.addAttribute("services", list);
		
		int rows = serviceMapper.findByRow(page);
		page.setRows(rows);
		model.addAttribute("servicePage",page);
		return "service/service_list";
	}
	@ResponseBody
	@RequestMapping("/startService.form")
	public Map<String,Object> updateToStart(int id){
		Map<String,Object> map = new HashMap<String,Object>();
		// 判断是否允许开通此业务账号
		/*
		 * 可以按照如下3种方式取账务账号状态
		 * SQL 1:
		 * 	select a.status from account a
		 * 	inner join service s 
		 * 	on a.account_id=s.account_id
		 * 	where s.service_id=#{id}
		 * SQL 2:
		 * 	select status 
		 *    from account 
		 * 	where account_id in (
		 * 		                  select account_id from service
		 * 								where service_id=#{id}
		 * 	)
		 * SQL 3:
		 * 	select * from service where service_id=#{id}
		 * 	select * from account where account_id=#{id}
		 * */
		Service service = serviceMapper.findById(id);
		Account account = accountMapper.findById(service.getAccount_id());
		if(account.getStatus().equals("0")){
			//开通业务账号
			serviceMapper.start(id);
			map.put("success", true);
			map.put("message", "开通成功");
			return map;  //当加了ResponseBody注解后，就自动重定向了
		}else{	
			map.put("success", false);
			map.put("message", "帐务帐号未开通，无法开通！");
			return map;
		}
		
		// {"success":true,"message":"开通成功."}
		 
	}
//	@RequestMapping("/pauseService.form")
//	public String updateToPause(int id){
//		serviceMapper.pause(id);
//		return "redirect:findService.form";
//	}
	
	@ResponseBody
	@RequestMapping("/pauseService.form")
	public Map<String,Object> updateToPause(int id){
		Map<String,Object> map = new HashMap<String,Object>();
		serviceMapper.pause(id);
		map.put("success", true);
		map.put("message", "暂停成功");	
		return map;		
	}
	
	@RequestMapping("/toAddService.form")
	public String toAdd(ModelMap model){
		//查询出全部的资费并发送给页面，用于创建下拉选。
		//严谨的业务应该是查询出(开通)态的资费数据。
		//当前以代码练习为主，就不过于追求业务完整了。
		List<Cost> list = costMapper.findAllCost();
		model.put("costs", list);
		return "service/service_add";
	}
	
	@RequestMapping("/findIdcardNo.form")
	@ResponseBody
	public Map<String,Object> searchAccount(String idcardNo) {
		//根据身份证查询出账务账号
		return accountMapper.findByIdcardNo(idcardNo);
	}
	
	@RequestMapping("/serviceBak.form")
	public String serviceTocost(int id,ModelMap map){
		//当我们查询少数几个列的时候用List<Map<String,Object>>
		Service service = serviceMapper.findById(id);
		List<Map<String,Object>> list = costMapper.findNameId();

		map.addAttribute("service", service);
		map.addAttribute("co", list);
		return "service/service_modi";
	}
//	@RequestMapping("/serviceback.form")
//	public String serviceTofindService(Integer service_id,Integer cost_id){
//		Map<String,Integer> map = new HashMap<String,Integer>();
//		map.put("service_id", service_id);
//		map.put("cost_id", cost_id);
//		serviceMapper.updateName(map);
//		return "redirect:findService.form";
//	}
	
	@RequestMapping("serviceback.form")
	public String serviceTofindService(Integer service_id,Integer cost_id){
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("service_id", service_id);
		map.put("cost", cost_id);
		serviceMapper.updateName2(map);
		return "redirect:findService.form";
	}
}
