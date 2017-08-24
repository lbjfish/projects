package com.bingobox.basedata.req;

import com.bingobox.framework.common.CommonVO;

public class ReqFranchiseeList extends CommonVO{
	private Long franchiseeCode;
	private String franchiseeName;
	private Integer isValid;
	public Long getFranchiseeCode() {
		return franchiseeCode;
	}
	public void setFranchiseeCode(Long franchiseeCode) {
		this.franchiseeCode = franchiseeCode;
	}
	public String getFranchiseeName() {
		return franchiseeName;
	}
	public void setFranchiseeName(String franchiseeName) {
		this.franchiseeName = franchiseeName;
	}
	public Integer getIsValid() {
		return isValid;
	}
	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}
}
