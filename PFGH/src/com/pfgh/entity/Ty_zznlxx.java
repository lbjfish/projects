package com.pfgh.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据库表： PFGH_TY_ZZNLXX 
 * 页面：炮兵作战能力评估
 * 与其它实体类关系：无
 * @author lbj
 *
 */
public class Ty_zznlxx {
	private String nlzbbh;
	private String nlzbmc;
	private String sjnlzbbh;
	private Double nlzbz;
	private Double nlzbqz;
	private String nlzblx;
	private String ssbdnm;
	
	private List<Ty_zznlxx> children=new ArrayList<Ty_zznlxx>();
	
	public Ty_zznlxx() {
		super();
	}
	public Ty_zznlxx(String nlzbbh, String nlzbmc, String sjnlzbbh,
			Double nlzbz, Double nlzbqz, String nlzblx, String ssbdnm) {
		super();
		this.nlzbbh = nlzbbh;
		this.nlzbmc = nlzbmc;
		this.sjnlzbbh = sjnlzbbh;
		this.nlzbz = nlzbz;
		this.nlzbqz = nlzbqz;
		this.nlzblx = nlzblx;
		this.ssbdnm = ssbdnm;
	}
	
	public String getNlzbbh() {
		return nlzbbh;
	}
	public void setNlzbbh(String nlzbbh) {
		this.nlzbbh = nlzbbh;
	}
	public String getNlzbmc() {
		return nlzbmc;
	}
	public void setNlzbmc(String nlzbmc) {
		this.nlzbmc = nlzbmc;
	}
	public String getSjnlzbbh() {
		return sjnlzbbh;
	}
	public void setSjnlzbbh(String sjnlzbbh) {
		this.sjnlzbbh = sjnlzbbh;
	}
	public Double getNlzbz() {
		return nlzbz;
	}
	public void setNlzbz(Double nlzbz) {
		this.nlzbz = nlzbz;
	}
	public Double getNlzbqz() {
		return nlzbqz;
	}
	public void setNlzbqz(Double nlzbqz) {
		this.nlzbqz = nlzbqz;
	}
	public String getNlzblx() {
		return nlzblx;
	}
	public void setNlzblx(String nlzblx) {
		this.nlzblx = nlzblx;
	}
	public String getSsbdnm() {
		return ssbdnm;
	}
	public void setSsbdnm(String ssbdnm) {
		this.ssbdnm = ssbdnm;
	}
	public List<Ty_zznlxx> getChildren() {
		return children;
	}
	public void setChildren(List<Ty_zznlxx> children) {
		this.children = children;
	}
	@Override
	public String toString() {
		return "Ty_zznlxx [nlzbbh=" + nlzbbh + ", nlzbmc=" + nlzbmc
				+ ", sjnlzbbh=" + sjnlzbbh + ", nlzbz=" + nlzbz + ", nlzbqz="
				+ nlzbqz + ", nlzblx=" + nlzblx + ", ssbdnm=" + ssbdnm
				+ ", children=" + children + "]";
	}
	
	
}
