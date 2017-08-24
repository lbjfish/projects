package com.pfgh.entity;

import java.util.List;
/**
 * 
 * 数据库表：PFGH_TY_ZZNLXX  
 * 页面：防空兵作战能力评估
 * 与其它实体类关系： 无 
 * @author shanghd
 *
 */
public class Pfgh_Fkb {
	private String nlzbbh;
	private String nlzbmc;
	private String sjnlzbbh;
	private Double nlzbz;
	private Double nlzbqz;
	private String nlzblx;
	private String ssbdnm;
	private List<Pfgh_Fkb> fkbChild;
	public Pfgh_Fkb() {
		super();
	}
	public Pfgh_Fkb(String nlzbbh, String nlzbmc, String sjnlzbbh,
			Double nlzbz, Double nlzbqz, String nlzblx, String ssbdnm,
			List<Pfgh_Fkb> fkbChild) {
		super();
		this.nlzbbh = nlzbbh;
		this.nlzbmc = nlzbmc;
		this.sjnlzbbh = sjnlzbbh;
		this.nlzbz = nlzbz;
		this.nlzbqz = nlzbqz;
		this.nlzblx = nlzblx;
		this.ssbdnm = ssbdnm;
		this.fkbChild = fkbChild;
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
	public List<Pfgh_Fkb> getFkbChild() {
		return fkbChild;
	}
	public void setFkbChild(List<Pfgh_Fkb> fkbChild) {
		this.fkbChild = fkbChild;
	}
	@Override
	public String toString() {
		return "Pfgh_Fkb [nlzbbh=" + nlzbbh + ", nlzbmc=" + nlzbmc
				+ ", sjnlzbbh=" + sjnlzbbh + ", nlzbz=" + nlzbz + ", nlzbqz="
				+ nlzbqz + ", nlzblx=" + nlzblx + ", ssbdnm=" + ssbdnm
				+ ", fkbChild=" + fkbChild + "]";
	}
}
