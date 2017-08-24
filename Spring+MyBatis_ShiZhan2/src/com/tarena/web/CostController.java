package com.tarena.web;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tarena.dao.CostMapper;
import com.tarena.entity.Cost;
import com.tarena.entity.page.CostPage;

@Controller
@RequestMapping("/cost")
//将指定名称的对象用session来管理及传值
@SessionAttributes("costPage")
public class CostController extends BaseController implements Serializable{
	@Resource
	CostMapper costMapper;
	
	@RequestMapping("/findCost.form")
	public String findByPageCost(CostPage pa,HttpServletRequest req) {
		List<Cost> costs = costMapper.findByPage(pa);
		req.setAttribute("costs", costs);
		
		//查询总行数，计算出总页数，传递给页面
		int rows = costMapper.findByRow();
		pa.setRows(rows);
		//将page对象传递给页面，
		//页面使用它的totalPage属性创建页码
		//由于在@SessionAttributes注解上声明了CostPage，
		//所以该对象会存入session，传递给页面
		req.setAttribute("costPage", pa);
		
		//throw new PersistenceException("您的页面异常"); 自己new的一个异常
		return "cost/cost_list";
	}
	
	@RequestMapping("/addCost.form")
	public String addAllCost(){
		return "cost/add_cost";
	}
	
	/**
	 * 表单中的数据传递给Controller中的业务方法，
	 * 传值的工作由Spring自动完成。
	 * 实际上Spring是不知道你要把数据传给哪个参数的，
	 * 它只是遍历方法的参数，判断表单中是否存在于当前
	 * 参数匹配的值，若存在则赋值。
	 * 因此，如果有多个参数都可以与表单中数据匹配，那么
	 * 这多个参数都会被赋值。
	 */
	@RequestMapping("/addCost2.form")
	public String add(Cost cost) {
		//业务要求，新增时默认状态为1，创建时间为当前时间
		cost.setStatus("1"); //状态
		cost.setCreatime(new Timestamp(System.currentTimeMillis()));  //创建时间
		//保存表单传入的数据
		costMapper.addCost(cost);
		//重定向到查询功能
		return "redirect:findCost.form";
		
	}
	/**
	 * update里面的SQL语句是FindById
	 */
	@RequestMapping("/update.form")
	public String findId(Integer id,HttpServletRequest req){
		Cost cost = costMapper.findById(id);
		req.setAttribute("cost", cost);
		return "cost/update_cost";
	}
	
	@RequestMapping("/update2.form")
	public String update(Cost c){
		costMapper.updateCost(c);
		return "redirect:findCost.form";
	}
	
	@RequestMapping("delete.form")
	public String deleteCost(Integer id){
		costMapper.deleteCost(id);
		return "redirect:findCost.form";
	}
	
	@ExceptionHandler
	public String execute(HttpServletRequest request,Exception error){
		request.setAttribute("error", error);
		return "cost/error";
	}
}
