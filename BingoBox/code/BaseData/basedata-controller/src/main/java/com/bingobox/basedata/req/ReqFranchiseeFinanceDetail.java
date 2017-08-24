package com.bingobox.basedata.req;

import javax.validation.constraints.NotNull;

import com.bingobox.framework.common.CommonVO;

public class ReqFranchiseeFinanceDetail extends CommonVO {
	@NotNull(message="franchiseeId不能为空！")
	private Long franchiseeId;

	public Long getFranchiseeId() {
		return franchiseeId;
	}

	public void setFranchiseeID(Long franchiseeId) {
		this.franchiseeId = franchiseeId;
	}
}
