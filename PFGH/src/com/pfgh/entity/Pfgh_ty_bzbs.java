package com.pfgh.entity;

public class Pfgh_ty_bzbs {
	private String bznm;
	private String xh;
	private String jdnm;
	private String xdnm;
	private String jbc;
	private String jbl;
	private Double jd;
	private Double wd;
	private Double gd;
	private String fanm;
	
	//多对一
	private Pfgh_ty_blqfbz blqfbz;
	
	public String getBznm() {
		return bznm;
	}
	public void setBznm(String bznm) {
		this.bznm = bznm;
	}
	public String getXh() {
		return xh;
	}
	public void setXh(String xh) {
		this.xh = xh;
	}
	public String getJdnm() {
		return jdnm;
	}
	public void setJdnm(String jdnm) {
		this.jdnm = jdnm;
	}
	public String getXdnm() {
		return xdnm;
	}
	public void setXdnm(String xdnm) {
		this.xdnm = xdnm;
	}
	public String getJbc() {
		return jbc;
	}
	public void setJbc(String jbc) {
		this.jbc = jbc;
	}
	public String getJbl() {
		return jbl;
	}
	public void setJbl(String jbl) {
		this.jbl = jbl;
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
	public String getFanm() {
		return fanm;
	}
	public void setFanm(String fanm) {
		this.fanm = fanm;
	}
	public Pfgh_ty_blqfbz getBlqfbz() {
		return blqfbz;
	}
	public void setBlqfbz(Pfgh_ty_blqfbz blqfbz) {
		this.blqfbz = blqfbz;
	}
	@Override
	public String toString() {
		return "Pfgh_ty_bzbs [bznm=" + bznm + ", xh=" + xh + ", jdnm=" + jdnm
				+ ", xdnm=" + xdnm + ", jbc=" + jbc + ", jbl=" + jbl + ", jd="
				+ jd + ", wd=" + wd + ", gd=" + gd + ", fanm=" + fanm
				+ ", blqfbz=" + blqfbz + "]";
	}
}
