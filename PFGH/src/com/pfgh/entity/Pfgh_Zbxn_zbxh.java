package com.pfgh.entity;

import java.util.List;
/**
 * 
 * 数据库表：pfgh_ty_zbxh 
 * 页面：装备性能
 * 与其它实体类关系：pfgh_Zbxn_zy 根据zybh字段对应zbxhzy  Pfgh_Zbxn_zbsx 根据zbxhnm字段对应zbxhnm Pfgh_Zbxn_tp 根据zbxhnm字段对应zbxhnm
 * @author shanghd
 *
 */
public class Pfgh_Zbxn_zbxh {
	private String zbxhnm;
	private String zbxhmc;
	private String zbxhms;
	private String zbxhzy;
	private String zblx;
	private String zbxh;
	private List<Pfgh_Zbxn_zbxh> zbxhList;
	public Pfgh_Zbxn_zbxh() {
		super();
	}
	public Pfgh_Zbxn_zbxh(String zbxhnm, String zbxhmc, String zbxhms,
			String zbxhzy, String zblx, String zbxh,
			List<Pfgh_Zbxn_zbxh> zbxhList) {
		super();
		this.zbxhnm = zbxhnm;
		this.zbxhmc = zbxhmc;
		this.zbxhms = zbxhms;
		this.zbxhzy = zbxhzy;
		this.zblx = zblx;
		this.zbxh = zbxh;
		this.zbxhList = zbxhList;
	}
	@Override
	public String toString() {
		return "Pfgh_Zbxn_zbxh [zbxhnm=" + zbxhnm + ", zbxhmc=" + zbxhmc
				+ ", zbxhms=" + zbxhms + ", zbxhzy=" + zbxhzy + ", zblx="
				+ zblx + ", zbxh=" + zbxh + ", zbxhList=" + zbxhList + "]";
	}
	public List<Pfgh_Zbxn_zbxh> getZbxhList() {
		return zbxhList;
	}
	public void setZbxhList(List<Pfgh_Zbxn_zbxh> zbxhList) {
		this.zbxhList = zbxhList;
	}
	public String getZbxhnm() {
		return zbxhnm;
	}
	public void setZbxhnm(String zbxhnm) {
		this.zbxhnm = zbxhnm;
	}
	public String getZbxhmc() {
		return zbxhmc;
	}
	public void setZbxhmc(String zbxhmc) {
		this.zbxhmc = zbxhmc;
	}
	public String getZbxhms() {
		return zbxhms;
	}
	public void setZbxhms(String zbxhms) {
		this.zbxhms = zbxhms;
	}
	public String getZbxhzy() {
		return zbxhzy;
	}
	public void setZbxhzy(String zbxhzy) {
		this.zbxhzy = zbxhzy;
	}
	public String getZblx() {
		return zblx;
	}
	public void setZblx(String zblx) {
		this.zblx = zblx;
	}
	public String getZbxh() {
		return zbxh;
	}
	public void setZbxh(String zbxh) {
		this.zbxh = zbxh;
	}
}
