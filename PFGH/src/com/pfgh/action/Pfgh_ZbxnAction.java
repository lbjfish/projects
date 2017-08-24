package com.pfgh.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.pfgh.entity.Pfgh_Zbxn_tp;
import com.pfgh.entity.Pfgh_Zbxn_zbsx;
import com.pfgh.entity.Pfgh_Zbxn_zbxh;
import com.pfgh.entity.Pfgh_Zbxn_zy;
import com.pfgh.service.Pfgh_Zbxn_zyService;

@Controller
@Scope("prototype")
public class Pfgh_ZbxnAction extends ActionSupport{
	private static final long serialVersionUID = 1537460860227234007L;
	
	@Resource
	private Pfgh_Zbxn_zyService zyService;
	private List<String> allZy = new ArrayList<String>();
	private List<Pfgh_Zbxn_zy> zyList;
	private List<Pfgh_Zbxn_zbxh> zbxhList;
	private List<Pfgh_Zbxn_zbxh> zbxList ;
	private List<Pfgh_Zbxn_zbsx> zbsxList;
	private String zbxhnm;
	private Pfgh_Zbxn_tp zbtp;

	public Pfgh_Zbxn_tp getZbtp() {
		return zbtp;
	}

	public void setZbtp(Pfgh_Zbxn_tp zbtp) {
		this.zbtp = zbtp;
	}

	public String getZbxhnm() {
		return zbxhnm;
	}

	public void setZbxhnm(String zbxhnm) {
		this.zbxhnm = zbxhnm;
	}

	public List<Pfgh_Zbxn_zbsx> getZbsxList() {
		return zbsxList;
	}

	public void setZbsxList(List<Pfgh_Zbxn_zbsx> zbsxList) {
		this.zbsxList = zbsxList;
	}

	public List<Pfgh_Zbxn_zbxh> getZbxList() {
		return zbxList;
	}

	public void setZbxList(List<Pfgh_Zbxn_zbxh> zbxList) {
		this.zbxList = zbxList;
	}

	private String zbxhzy;
	private Pfgh_Zbxn_zbxh zbxh;
	public Pfgh_Zbxn_zbxh getZbxh() {
		return zbxh;
	}

	public void setZbxh(Pfgh_Zbxn_zbxh zbxh) {
		this.zbxh = zbxh;
	}

	public String getZbxhzy() {
		return zbxhzy;
	}

	public void setZbxhzy(String zbxhzy) {
		this.zbxhzy = zbxhzy;
	}

	public List<Pfgh_Zbxn_zbxh> getZbxhList() {
		return zbxhList;
	}

	public void setZbxhList(List<Pfgh_Zbxn_zbxh> zbxhList) {
		this.zbxhList = zbxhList;
	}

	public List<Pfgh_Zbxn_zy> getZyList() {
		return zyList;
	}

	public void setZyList(List<Pfgh_Zbxn_zy> zyList) {
		this.zyList = zyList;
	}


	public List<String> getAllZy() {
		return allZy;
	}

	public void setAllZy(List<String> allZy) {
		this.allZy = allZy;
	}
	
	public String findZbxn(){
		
		zyList = zyService.getZyList();
		zbxhList = zyService.findZbxhList();
		System.out.println(zyList);
		System.out.println(zbxhList);
		return "index";
	}
	public String findzbsx(){
		System.out.println(zbxhnm);
		zbsxList = zyService.findZbsxList(zbxhnm);
		System.out.println(zbsxList);
		return "zbsx";
	}
	/**
	 * 获取图片路径
	 */
	public String getImg(){
		System.out.println(zbxhnm);
		zbtp = zyService.getImg(zbxhnm);
		System.out.println(zbtp);
		return "zbimg";
	}

	public Pfgh_Zbxn_zyService getZyService() {
		return zyService;
	}

	public void setZyService(Pfgh_Zbxn_zyService zyService) {
		this.zyService = zyService;
	}
}
