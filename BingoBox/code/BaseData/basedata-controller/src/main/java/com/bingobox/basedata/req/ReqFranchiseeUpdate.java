package com.bingobox.basedata.req;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import com.bingobox.framework.common.CommonVO;

public class ReqFranchiseeUpdate extends CommonVO {
	
	@NotNull
	private Long franchiseeId;
	@NotBlank(message="加盟商名字不能为空！")
	private String franchiseeName;
	@NotNull(message="省不能为空！")
	private Long provinceId;
	@NotNull(message="市不能为空！")
	private Long cityId;
	@NotNull(message="区不能为空")
	private Long districtId;
	@NotBlank(message="我方负责人名字不能为空！")
	private String createUserName;
	@NotBlank(message="加盟商负责人不能为空！")
	private String contactName;
	@NotBlank(message="加盟商电话不能为空！")
	private String contactPhone;
	@Email(message="不是一个合法的电子邮件！")
	private String contactEmail;
	private String address;
	private Integer isValid;
	
	public Long getFranchiseeId() {
		return franchiseeId;
	}
	public void setFranchiseeId(Long franchiseeId) {
		this.franchiseeId = franchiseeId;
	}
	public String getFranchiseeName() {
		return franchiseeName;
	}
	public void setFranchiseeName(String franchiseeName) {
		this.franchiseeName = franchiseeName;
	}
	public Long getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}
	public Long getCityId() {
		return cityId;
	}
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	public Long getDistrictId() {
		return districtId;
	}
	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}
	public String getCreateUserName() {
		return createUserName;
	}
	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getIsValid() {
		return isValid;
	}
	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}
}
