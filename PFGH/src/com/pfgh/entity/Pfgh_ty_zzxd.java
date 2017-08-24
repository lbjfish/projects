package com.pfgh.entity;

import java.util.Date;

public class Pfgh_ty_zzxd {
	private String xdnm;
	private String xdmc;
	private String xdms;
	private String xdksjd;
	private String xdjsjd;
	private Date xdkssj;
	private Date xdjssj;
	private int bzzt;
	private String fpbzbh;
	
	//多对一
	private Pfgh_ty_blqfbz blqfbz;
	
	//多对一
	private Pfgh_ty_bbfa bbfa;
	
	public String getXdnm() {
		return xdnm;
	}
	public void setXdnm(String xdnm) {
		this.xdnm = xdnm;
	}
	public String getXdmc() {
		return xdmc;
	}
	public void setXdmc(String xdmc) {
		this.xdmc = xdmc;
	}
	public String getXdms() {
		return xdms;
	}
	public void setXdms(String xdms) {
		this.xdms = xdms;
	}
	public String getXdksjd() {
		return xdksjd;
	}
	public void setXdksjd(String xdksjd) {
		this.xdksjd = xdksjd;
	}
	public String getXdjsjd() {
		return xdjsjd;
	}
	public void setXdjsjd(String xdjsjd) {
		this.xdjsjd = xdjsjd;
	}
	public Date getXdkssj() {
		return xdkssj;
	}
	public void setXdkssj(Date xdkssj) {
		this.xdkssj = xdkssj;
	}
	public Date getXdjssj() {
		return xdjssj;
	}
	public void setXdjssj(Date xdjssj) {
		this.xdjssj = xdjssj;
	}
	public int getBzzt() {
		return bzzt;
	}
	public void setBzzt(int bzzt) {
		this.bzzt = bzzt;
	}
	public String getFpbzbh() {
		return fpbzbh;
	}
	public void setFpbzbh(String fpbzbh) {
		this.fpbzbh = fpbzbh;
	}
	public Pfgh_ty_blqfbz getBlqfbz() {
		return blqfbz;
	}
	public void setBlqfbz(Pfgh_ty_blqfbz blqfbz) {
		this.blqfbz = blqfbz;
	}
	public Pfgh_ty_bbfa getBbfa() {
		return bbfa;
	}
	public void setBbfa(Pfgh_ty_bbfa bbfa) {
		this.bbfa = bbfa;
	}
	@Override
	public String toString() {
		return "Pfgh_ty_zzxd [xdnm=" + xdnm + ", xdmc=" + xdmc + ", xdms="
				+ xdms + ", xdksjd=" + xdksjd + ", xdjsjd=" + xdjsjd
				+ ", xdkssj=" + xdkssj + ", xdjssj=" + xdjssj + ", bzzt="
				+ bzzt + ", fpbzbh=" + fpbzbh + ", blqfbz=" + blqfbz
				+ ", bbfa=" + bbfa + "]";
	}
	
}
