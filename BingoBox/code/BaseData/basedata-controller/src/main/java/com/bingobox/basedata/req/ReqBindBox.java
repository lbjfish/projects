package com.bingobox.basedata.req;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.bingobox.framework.common.CommonVO;

public class ReqBindBox extends CommonVO {
	@NotNull(message="frandchiseeId不能为空！")
	private Long franchiseeId;
	@NotEmpty(message="盒子id列表不能为空！")
	private List<Long> boxIds;
	
	public Long getFranchiseeId() {
		return franchiseeId;
	}
	public void setFranchiseeId(Long franchiseeId) {
		this.franchiseeId = franchiseeId;
	}
	public List<Long> getBoxIds() {
		return boxIds;
	}
	public void setBoxIds(List<Long> boxIds) {
		this.boxIds = boxIds;
	}
}
