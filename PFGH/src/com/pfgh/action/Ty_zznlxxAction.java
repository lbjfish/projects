package com.pfgh.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.pfgh.entity.Ty_zznlxx;
import com.pfgh.service.Ty_zznlxxService;

@Controller
@Scope("prototype")
public class Ty_zznlxxAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1537460860227234007L;
	
	@Resource
	private Ty_zznlxxService zznlxxService;
	
	private List<String> selects;
	private String select;
	private List<Ty_zznlxx> zznlxxs;
	private List<String> strs;
	
	public String findSelect(){
		selects = zznlxxService.findNlzblxToBdmc("炮兵");
		return "index";
	}
	
	public String findZznlxx(){
		System.out.println(select);
		List<Ty_zznlxx> allZzn = zznlxxService.findZznlxx(select);
		zznlxxs = MakeTree(allZzn,"0");
		System.out.println(zznlxxs);
		return "treegrid";
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
	
	public List<String> getSelects() {
		return selects;
	}
	public void setSelects(List<String> selects) {
		this.selects = selects;
	}

	public String getSelect() {
		return select;
	}

	public void setSelect(String select) {
		this.select = select;
	}

	public List<Ty_zznlxx> getZznlxxs() {
		return zznlxxs;
	}

	public void setZznlxxs(List<Ty_zznlxx> zznlxxs) {
		this.zznlxxs = zznlxxs;
	}

	public List<String> getStrs() {
		return strs;
	}

	public void setStrs(List<String> strs) {
		this.strs = strs;
	}
}
