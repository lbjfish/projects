package com.bingobox.basedata.po;

import java.util.Date;

/**
 * 
 * @author ZhangNing
 *
 */
public class FranchiseeBoxMappingPO {
	private Long franchiseeBoxMappingId;
	private Long franchiseeId;
	private Long boxId;
	private Long createUserId;
	private Date createTime;  
	public Long getFranchiseeBoxMappingId() {
		return franchiseeBoxMappingId;
	}
	public void setFranchiseeBoxMappingId(Long franchiseeBoxMappingId) {
		this.franchiseeBoxMappingId = franchiseeBoxMappingId;
	}
	public Long getFranchiseeId() {
		return franchiseeId;
	}
	public void setFranchiseeId(Long franchiseeId) {
		this.franchiseeId = franchiseeId;
	}
	public Long getBoxId() {
		return boxId;
	}
	public void setBoxId(Long boxId) {
		this.boxId = boxId;
	}
	public Long getCreateUserId() {
		return createUserId;
	}
	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
