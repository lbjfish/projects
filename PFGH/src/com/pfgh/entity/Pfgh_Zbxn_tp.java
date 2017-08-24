package com.pfgh.entity;
/**
 * 
 * 数据库表：pfgh_ty_zbtp 
 * 页面：装备性能
 * 与其它实体类关系： Pfgh_Zbxn_zbxh 根据zbxhnm字段对应zbxhnm 
 * @author shanghd
 *
 */
public class Pfgh_Zbxn_tp {
	private String zbxhnm;
	private String imgurl;
	public String getZbxhnm() {
		return zbxhnm;
	}
	public void setZbxhnm(String zbxhnm) {
		this.zbxhnm = zbxhnm;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public Pfgh_Zbxn_tp() {
		super();
	}
	public Pfgh_Zbxn_tp(String zbxhnm, String imgurl) {
		super();
		this.zbxhnm = zbxhnm;
		this.imgurl = imgurl;
	}
	@Override
	public String toString() {
		return "Pfgh_Zbxn_tp [zbxhnm=" + zbxhnm + ", imgurl=" + imgurl + "]";
	}
}
