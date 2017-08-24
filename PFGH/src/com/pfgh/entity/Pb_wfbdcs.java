package com.pfgh.entity;

/**
 * 数据库表： PFGH_PB_WFBDCS
 * 页面：作战能力对比分析
 * 与其它实体类关系：Pb_zzjt(主键)
 * @author lbj
 *
 */
public class Pb_wfbdcs {
	private String wbh;
	private String wmc;
	private Double sl;
	private Double pbcd;
	private Double hsxs;
	private String jtbh;
	private Integer sfzs;
	
	public String getWbh() {
		return wbh;
	}
	public void setWbh(String wbh) {
		this.wbh = wbh;
	}
	
	public String getWmc() {
		return wmc;
	}
	public void setWmc(String wmc) {
		this.wmc = wmc;
	}
	public Double getSl() {
		return sl;
	}
	public void setSl(Double sl) {
		this.sl = sl;
	}
	public Double getPbcd() {
		return pbcd;
	}
	public void setPbcd(Double pbcd) {
		this.pbcd = pbcd;
	}
	public Double getHsxs() {
		return hsxs;
	}
	public void setHsxs(Double hsxs) {
		this.hsxs = hsxs;
	}
	public String getJtbh() {
		return jtbh;
	}
	public void setJtbh(String jtbh) {
		this.jtbh = jtbh;
	}
	public Integer getSfzs() {
		return sfzs;
	}
	public void setSfzs(Integer sfzs) {
		this.sfzs = sfzs;
	}
	@Override
	public String toString() {
		return "Pb_wfbdcs [wbh=" + wbh + ", wmc=" + wmc + ", sl=" + sl
				+ ", pbcd=" + pbcd + ", hsxs=" + hsxs + ", jtbh=" + jtbh
				+ ", sfzs=" + sfzs + "]";
	}
	
}
