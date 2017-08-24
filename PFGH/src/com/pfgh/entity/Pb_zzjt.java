package com.pfgh.entity;

import java.util.List;

/**
 * 数据库表： PFGH_PB_ZZJT 
 * 页面：作战能力对比分析
 * 与其它实体类关系：Pb_wfbdcs(外键),Pb_dfbdcs(外键)
 * @author lbj
 *
 */
public class Pb_zzjt {
	private String zbh;
	private String mc;
	private Integer zy;
	
	
	public String getZbh() {
		return zbh;
	}
	public void setZbh(String zbh) {
		this.zbh = zbh;
	}
	public String getMc() {
		return mc;
	}
	public void setMc(String mc) {
		this.mc = mc;
	}
	public Integer getZy() {
		return zy;
	}
	public void setZy(Integer zy) {
		this.zy = zy;
	}
	@Override
	public String toString() {
		return "Pb_zzjt [zbh=" + zbh + ", mc=" + mc + ", zy=" + zy + "]";
	}
}
