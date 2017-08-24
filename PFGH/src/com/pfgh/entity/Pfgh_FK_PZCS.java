package com.pfgh.entity;

public class Pfgh_FK_PZCS {
	private String csbh;
	private String csmc;
	private Double csz;
	private String cslg;
	public String getCsbh() {
		return csbh;
	}
	public void setCsbh(String csbh) {
		this.csbh = csbh;
	}
	public String getCsmc() {
		return csmc;
	}
	public void setCsmc(String csmc) {
		this.csmc = csmc;
	}
	public Double getCsz() {
		return csz;
	}
	public void setCsz(Double csz) {
		this.csz = csz;
	}
	public String getCslg() {
		return cslg;
	}
	public void setCslg(String cslg) {
		this.cslg = cslg;
	}
	@Override
	public String toString() {
		return "Pfgh_FK_PZCS [csbh=" + csbh + ", csmc=" + csmc + ", csz=" + csz
				+ ", cslg=" + cslg + "]";
	}
}
