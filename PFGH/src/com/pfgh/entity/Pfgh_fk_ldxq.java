package com.pfgh.entity;

public class Pfgh_fk_ldxq {
	private String id;
	private String xh;
	private Double rwbl;
	private Double ldxq;
	private Double ldmyd;
	
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
	public Double getLdxq() {
		return ldxq;
	}
	public void setLdxq(Double ldxq) {
		this.ldxq = ldxq;
	}
	public Double getLdmyd() {
		return ldmyd;
	}
	public void setLdmyd(Double ldmyd) {
		this.ldmyd = ldmyd;
	}
	
	@Override
	public String toString() {
		return "Pfgh_fk_ldxq [id=" + id + ", xh=" + xh + ", rwbl=" + rwbl
				+ ", ldxq=" + ldxq + ", ldmyd=" + ldmyd + "]";
	}
}
