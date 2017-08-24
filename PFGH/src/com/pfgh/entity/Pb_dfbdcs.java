package com.pfgh.entity;

/**
 * 数据库表： PFGH_PB_DFBDCS 
 * 页面：作战能力对比分析
 * 与其它实体类关系：Pb_zzjt(主键)
 * @author lbj
 *
 */
public class Pb_dfbdcs {
	private String bh;
	private String mc;
	private Double sl;
	private Double bcbl;
	private Double pbcd;
	private Double jqxs;
	private Double qlhs;
	private Double khhs;
	private Double zjhs;
	private String jtbh;
	
	public String getBh() {
		return bh;
	}
	public void setBh(String bh) {
		this.bh = bh;
	}
	public String getMc() {
		return mc;
	}
	public void setMc(String mc) {
		this.mc = mc;
	}
	public Double getSl() {
		return sl;
	}
	public void setSl(Double sl) {
		this.sl = sl;
	}
	public Double getBcbl() {
		return bcbl;
	}
	public void setBcbl(Double bcbl) {
		this.bcbl = bcbl;
	}
	public Double getPbcd() {
		return pbcd;
	}
	public void setPbcd(Double pbcd) {
		this.pbcd = pbcd;
	}
	public Double getJqxs() {
		return jqxs;
	}
	public void setJqxs(Double jqxs) {
		this.jqxs = jqxs;
	}
	public Double getQlhs() {
		return qlhs;
	}
	public void setQlhs(Double qlhs) {
		this.qlhs = qlhs;
	}
	public Double getKhhs() {
		return khhs;
	}
	public void setKhhs(Double khhs) {
		this.khhs = khhs;
	}
	public Double getZjhs() {
		return zjhs;
	}
	public void setZjhs(Double zjhs) {
		this.zjhs = zjhs;
	}
	public String getJtbh() {
		return jtbh;
	}
	public void setJtbh(String jtbh) {
		this.jtbh = jtbh;
	}
	
	@Override
	public String toString() {
		return "Pb_dfbdcs [bh=" + bh + ", mc=" + mc + ", sl=" + sl + ", bcbl="
				+ bcbl + ", pbcd=" + pbcd + ", jqxs=" + jqxs + ", qlhs=" + qlhs
				+ ", khhs=" + khhs + ", zjhs=" + zjhs + ", jtbh=" + jtbh + "]";
	}
}
