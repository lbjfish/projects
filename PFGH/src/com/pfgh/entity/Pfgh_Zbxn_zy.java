package com.pfgh.entity;

import java.util.List;
/**
 * 
 * 数据库表：pfgh_ty_zy
 * 页面：装备性能
 * 与其它实体类关系：pfgh_Zbxn_zbxh 根据zybh字段对应zbxhzy
 * @author shanghd
 *
 */
public class Pfgh_Zbxn_zy {
	private String zybh;
	private String zymc;
	private String zyms;
	List<Pfgh_Zbxn_zy> zyList;
	public Pfgh_Zbxn_zy() {
		super();
	}
	public List<Pfgh_Zbxn_zy> getZyList() {
		return zyList;
	}
	public void setZyList(List<Pfgh_Zbxn_zy> zyList) {
		this.zyList = zyList;
	}
	public String getZybh() {
		return zybh;
	}
	public void setZybh(String zybh) {
		this.zybh = zybh;
	}
	public String getZymc() {
		return zymc;
	}
	public void setZymc(String zymc) {
		this.zymc = zymc;
	}
	public String getZyms() {
		return zyms;
	}
	public void setZyms(String zyms) {
		this.zyms = zyms;
	}
	@Override
	public String toString() {
		return "Pfgh_Zbxn_zy [zybh=" + zybh + ", zymc=" + zymc + ", zyms="
				+ zyms + "]";
	}
	public Pfgh_Zbxn_zy(String zybh, String zymc, String zyms) {
		super();
		this.zybh = zybh;
		this.zymc = zymc;
		this.zyms = zyms;
	}
	
}
