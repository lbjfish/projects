package com.pfgh.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.pfgh.dao.Pfgh_FkbDao;
import com.pfgh.entity.Pfgh_Fkb;
import com.pfgh.service.Pfgh_FkbService;

@Controller
@Scope("prototype")
public class Pfgh_FkbAction extends ActionSupport{
	private static final long serialVersionUID = 1537460860227234007L;
	
	@Resource
	private Pfgh_FkbService fkbService;
	private List<Pfgh_Fkb> allFkb;
	private List<String> selects;
	private String select;
	public String getSelect() {
		return select;
	}
	public void setSelect(String select) {
		this.select = select;
	}
	public List<String> getSelects() {
		return selects;
	}
	public void setSelects(List<String> selects) {
		this.selects = selects;
	}
	/**
	 * 获取防空兵
	 */
	public String findSelect(){
		selects = fkbService.findNlzblxToBdmc("防空兵");
		return "index";
	}
	/**
	 * 获取防空兵的数据
	 */
	public String findFkb(){
		System.out.println(select);
		allFkb = fkbService.findFkb(select);
		allFkb = MakeTreeFkb(allFkb,"0");
		System.out.println(allFkb);
		return "fkbtreegrid";
	}
	

	public List<Pfgh_Fkb> getAllFkb() {
		return allFkb;
	}

	public void setAllFkb(List<Pfgh_Fkb> allFkb) {
		this.allFkb = allFkb;
	}

	/**
	 * 处理防空兵后台数据 递归方式处理
	 */
	public List<Pfgh_Fkb> MakeTreeFkb(List<Pfgh_Fkb> nodes,String parentId){
		
		List<Pfgh_Fkb> pfghFkbList = new ArrayList<Pfgh_Fkb>();
		if(nodes!=null){
			Iterator<Pfgh_Fkb> ite =  nodes.iterator();
			while(ite.hasNext()){
				Pfgh_Fkb task = (Pfgh_Fkb) ite.next();
				if(task.getSjnlzbbh().equals(parentId)){
					Pfgh_Fkb ntask = task;
					List<Pfgh_Fkb> children = this.MakeTreeFkb(nodes, task.getNlzbbh());
					if(children.size() > 0){
						ntask.setFkbChild(children);
					}
					pfghFkbList.add(ntask);
				}
			}
			
			
			
		}
		return pfghFkbList;
	}
	
}
