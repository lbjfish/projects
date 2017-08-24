package com.pfgh.entity;

public class Pfgh_ty_zysdwz {
	private String sdnm;
	private String xh;
	private Double jd;
	private Double wd;
	private Double gd;
	
	//多对一
	private Pfgh_ty_zysd zysds;
	
	public String getSdnm() {
		return sdnm;
	}
	public void setSdnm(String sdnm) {
		this.sdnm = sdnm;
	}
	public String getXh() {
		return xh;
	}
	public void setXh(String xh) {
		this.xh = xh;
	}
	public Double getJd() {
		return jd;
	}
	public void setJd(Double jd) {
		this.jd = jd;
	}
	public Double getWd() {
		return wd;
	}
	public void setWd(Double wd) {
		this.wd = wd;
	}
	public Double getGd() {
		return gd;
	}
	public void setGd(Double gd) {
		this.gd = gd;
	}
	public Pfgh_ty_zysd getZysds() {
		return zysds;
	}
	public void setZysds(Pfgh_ty_zysd zysds) {
		this.zysds = zysds;
	}
	@Override
	public String toString() {
		return "Pfgh_ty_zysdwz [sdnm=" + sdnm + ", xh=" + xh + ", jd=" + jd
				+ ", wd=" + wd + ", gd=" + gd + ", zysds=" + zysds + "]";
	}
	
}
