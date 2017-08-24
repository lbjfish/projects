package com.tarena.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.tarena.dao.CostMapper;
import com.tarena.entity.ChiCost;
import com.tarena.entity.Datagrid;

@Controller
public class FindCostAction extends ActionSupport {
	@Resource
	private CostMapper costDao;
	
	private List<ChiCost> costs;
	private Datagrid datagrid = new Datagrid();
	
	public String findAll(){
		costs = costDao.findAllCost();
		return "success";
	}
	
	public String getAjax(){
		costs = costDao.findAllCost();
		return SUCCESS;
	}

	public CostMapper getCostDao() {
		return costDao;
	}

	public void setCostDao(CostMapper costDao) {
		this.costDao = costDao;
	}

	public List<ChiCost> getCosts() {
		return costs;
	}

	public void setCosts(List<ChiCost> costs) {
		this.costs = costs;
	}

	public Datagrid getDatagrid() {
		return datagrid;
	}

	public void setDatagrid(Datagrid datagrid) {
		this.datagrid = datagrid;
	}

}
