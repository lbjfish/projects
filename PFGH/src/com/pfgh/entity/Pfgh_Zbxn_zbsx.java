package com.pfgh.entity;

import java.util.List;
/**
 * 
 * 数据库表：pfgh_ty_zbsx 
 * 页面：装备性能
 * 与其它实体类关系： Pfgh_Zbxn_zbxh 根据zbxhnm字段对应zbxhnm 
 * @author shanghd
 *
 */
public class Pfgh_Zbxn_zbsx {
@Override
	public String toString() {
		return "Pfgh_Zbxn_zbsx [zbsxid=" + zbsxid + ", zbsxmc=" + zbsxmc
				+ ", zbsxz=" + zbsxz + ", zbsxjldw=" + zbsxjldw + ", zbxhnm="
				+ zbxhnm +  "]";
	}
private String zbsxid;
private String zbsxmc;
private String zbsxz;
private String zbsxjldw;
private String zbxhnm;
public Pfgh_Zbxn_zbsx() {
	super();
}
public Pfgh_Zbxn_zbsx(String zbsxid, String zbsxmc, String zbsxz,
		String zbsxjldw, String zbxhnm) {
	super();
	this.zbsxid = zbsxid;
	this.zbsxmc = zbsxmc;
	this.zbsxz = zbsxz;
	this.zbsxjldw = zbsxjldw;
	this.zbxhnm = zbxhnm;
	
}

public String getZbsxid() {
	return zbsxid;
}
public void setZbsxid(String zbsxid) {
	this.zbsxid = zbsxid;
}
public String getZbsxmc() {
	return zbsxmc;
}
public void setZbsxmc(String zbsxmc) {
	this.zbsxmc = zbsxmc;
}
public String getZbsxz() {
	return zbsxz;
}
public void setZbsxz(String zbsxz) {
	this.zbsxz = zbsxz;
}
public String getZbsxjldw() {
	return zbsxjldw;
}
public void setZbsxjldw(String zbsxjldw) {
	this.zbsxjldw = zbsxjldw;
}
public String getZbxhnm() {
	return zbxhnm;
}
public void setZbxhnm(String zbxhnm) {
	this.zbxhnm = zbxhnm;
}

}
