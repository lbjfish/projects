package com.pfgh.entity;

public class Pfgh_fk_gpxq {
	private String id;
	private String xh;
	private Double rwbl;
	private Double hlxq;
	private Double hlmyd;
	private Double dyxq;
	private Double dymyd;
	
	public Pfgh_fk_gpxq() {
		super();
	}
	public Pfgh_fk_gpxq(String id, String xh, Double rwbl, Double hlxq,
			Double hlmyd, Double dyxq, Double dymyd) {
		super();
		this.id = id;
		this.xh = xh;
		this.rwbl = rwbl;
		this.hlxq = hlxq;
		this.hlmyd = hlmyd;
		this.dyxq = dyxq;
		this.dymyd = dymyd;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getXh() {
		return xh;
	}
	public void setXh(String xh) {
		this.xh = xh;
	}
	public Double getRwbl() {
		return rwbl;
	}
	public void setRwbl(Double rwbl) {
		this.rwbl = rwbl;
	}
	public Double getHlxq() {
		return hlxq;
	}
	public void setHlxq(Double hlxq) {
		this.hlxq = hlxq;
	}
	public Double getHlmyd() {
		return hlmyd;
	}
	public void setHlmyd(Double hlmyd) {
		this.hlmyd = hlmyd;
	}
	public Double getDyxq() {
		return dyxq;
	}
	public void setDyxq(Double dyxq) {
		this.dyxq = dyxq;
	}
	public Double getDymyd() {
		return dymyd;
	}
	public void setDymyd(Double dymyd) {
		this.dymyd = dymyd;
	}
	
	@Override
	public String toString() {
		return "Pfgh_fk_gpxq [id=" + id + ", xh=" + xh + ", rwbl=" + rwbl
				+ ", hlxq=" + hlxq + ", hlmyd=" + hlmyd + ", dyxq=" + dyxq
				+ ", dymyd=" + dymyd + "]";
	}
}
