package com.bingobox.basedata.po;

import java.util.Date;

/**
 * 
 * @author ZhangNing
 *
 */
public class FranchiseePO {
	private Long franchiseeId;
	private Long franchiseeCode;
	private String franchiseeName;
	private Long provinceId;
	private Long cityId;
	private Long districtId;
	private Integer isValid; 
	private Long createUserId; 
	private Date createTime; 
	private String lastUpdateUserId; 
	private Date lastUpdateTime; 
	private Long bdUserId; 
	private Integer isDelete;
	private FranchiseeContactPO franchiseeContact;
	private FranchiseeFinancePO franchiseeFinance;
	private Integer boxCount;
	private String provinceName;
	private String cityName;
	private String districtName;
	private String createUserName;
	
	public String getCreateUserName() {
		return createUserName;
	}
	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	
	public Integer getBoxCount() {
		return boxCount;
	}
	public void setBoxCount(Integer boxCount) {
		this.boxCount = boxCount;
	}
	public FranchiseeContactPO getFranchiseeContact() {
		return franchiseeContact;
	}
	public void setFranchiseeContact(FranchiseeContactPO franchiseeContact) {
		this.franchiseeContact = franchiseeContact;
	}
	public FranchiseeFinancePO getFranchiseeFinance() {
		return franchiseeFinance;
	}
	public void setFranchiseeFinance(FranchiseeFinancePO franchiseeFinance) {
		this.franchiseeFinance = franchiseeFinance;
	}
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
	public Integer getIsValid() {
		return isValid;
	}
	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
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
	public String getLastUpdateUserId() {
		return lastUpdateUserId;
	}
	public void setLastUpdateUserId(String lastUpdateUserId) {
		this.lastUpdateUserId = lastUpdateUserId;
	}
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public Long getBdUserId() {
		return bdUserId;
	}
	public void setBdUserId(Long bdUserId) {
		this.bdUserId = bdUserId;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	public Long getFranchiseeCode() {
		return franchiseeCode;
	}
	public void setFranchiseeCode(Long franchiseeCode) {
		this.franchiseeCode = franchiseeCode;
	}
}
