package com.pfgh.entity;

public class Pfgh_ty_bdzb {
	private String zbbh;
	private String zbmc;
	private String zblx;
	private Integer bzzt;
	private String zbxhnm;
	private String bzbdnm;
	private String bcbdnm;
	private String bznm;
	
	/*
	 * 一对一
	 */
	private Pfgh_ty_bdjzbc bdjdbc;
	/*
	 * 一对一
	 */
	private Pfgh_ty_zzbs zzbs;
	
	public String getZbbh() {
		return zbbh;
	}
	public void setZbbh(String zbbh) {
		this.zbbh = zbbh;
	}
	public String getZbmc() {
		return zbmc;
	}
	public void setZbmc(String zbmc) {
		this.zbmc = zbmc;
	}
	public String getZblx() {
		return zblx;
	}
	public void setZblx(String zblx) {
		this.zblx = zblx;
	}
	public Integer getBzzt() {
		return bzzt;
	}
	public void setBzzt(Integer bzzt) {
		this.bzzt = bzzt;
	}
	public String getZbxhnm() {
		return zbxhnm;
	}
	public void setZbxhnm(String zbxhnm) {
		this.zbxhnm = zbxhnm;
	}
	public String getBzbdnm() {
		return bzbdnm;
	}
	public void setBzbdnm(String bzbdnm) {
		this.bzbdnm = bzbdnm;
	}
	public String getBcbdnm() {
		return bcbdnm;
	}
	public void setBcbdnm(String bcbdnm) {
		this.bcbdnm = bcbdnm;
	}
	public String getBznm() {
		return bznm;
	}
	public void setBznm(String bznm) {
		this.bznm = bznm;
	}
	public Pfgh_ty_bdjzbc getBdjdbc() {
		return bdjdbc;
	}
	public void setBdjdbc(Pfgh_ty_bdjzbc bdjdbc) {
		this.bdjdbc = bdjdbc;
	}
	public Pfgh_ty_zzbs getZzbs() {
		return zzbs;
	}
	public void setZzbs(Pfgh_ty_zzbs zzbs) {
		this.zzbs = zzbs;
	}
	@Override
	public String toString() {
		return "Pfgh_ty_bdzb [zbbh=" + zbbh + ", zbmc=" + zbmc + ", zblx="
				+ zblx + ", bzzt=" + bzzt + ", zbxhnm=" + zbxhnm + ", bzbdnm="
				+ bzbdnm + ", bcbdnm=" + bcbdnm + ", bznm=" + bznm
				+ ", bdjdbc=" + bdjdbc + ", zzbs=" + zzbs + "]";
	}
	
}
