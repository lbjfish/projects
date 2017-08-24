package com.pfgh.entity;

public class Pfgh_ty_bdbz {
	private String bdnm;
	private String fanm;
	private Double bzzt;
	private String bznm;
	private String bcsjbdnm;
	public String getBdnm() {
		return bdnm;
	}
	public void setBdnm(String bdnm) {
		this.bdnm = bdnm;
	}
	public String getFanm() {
		return fanm;
	}
	public void setFanm(String fanm) {
		this.fanm = fanm;
	}
	public Double getBzzt() {
		return bzzt;
	}
	public void setBzzt(Double bzzt) {
		this.bzzt = bzzt;
	}
	public String getBznm() {
		return bznm;
	}
	public void setBznm(String bznm) {
		this.bznm = bznm;
	}
	public String getBcsjbdnm() {
		return bcsjbdnm;
	}
	public void setBcsjbdnm(String bcsjbdnm) {
		this.bcsjbdnm = bcsjbdnm;
	}
	@Override
	public String toString() {
		return "Pfgh_ty_bdbz [bdnm=" + bdnm + ", fanm=" + fanm + ", bzzt="
				+ bzzt + ", bznm=" + bznm + ", bcsjbdnm=" + bcsjbdnm + "]";
	}
}
