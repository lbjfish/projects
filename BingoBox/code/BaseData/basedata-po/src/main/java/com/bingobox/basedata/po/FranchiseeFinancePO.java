package com.bingobox.basedata.po;

import java.util.Date;
import java.util.List;

public class FranchiseeFinancePO {
	private Long franchiseeFinanceId;    
	private Long franchiseeId;   
	private String beneficiaryCompanyName;  
	private String businessLicenceNumber; 
	private Integer beneficiaryBankId;  
	private Integer beneficiaryBankProviceId; 
	private String beneficiaryBankProvice; 
	private Integer beneficiaryBankCityId; 
	private String beneficiaryBankCity; 
	private String beneficiaryBankAccount;  
	private String invoiceCompanyName;
	private String taxpayerRegistrationNumber;
	private String companyAddress;  
	private Integer invoiceBankId;  
	private Integer invoiceBankProvinceId; 
	private String invoiceBankProvince; 
	private Integer invoiceBankCityId;
	private String invoiceBankCity;
	private String invoiceBankAccount;
	private String invoiceBankPhone;
	private Long createUserId;   
	private Date createTime;  
	private Long  lastUpdateUserId; 
	private Date lastUpdateTime;
	private Integer isDelete;
	private String beneficiaryBankName;
	private String beneficiaryBankAddress;
	private String invoiceBankName;
	private String invoiceBankAddress;
	private Integer settlementType;
	private Integer settlementDate;
	private List<FilePO> file;
	
	public List<FilePO> getFile() {
		return file;
	}
	public void setFile(List<FilePO> file) {
		this.file = file;
	}
	public Integer getSettlementType() {
		return settlementType;
	}
	public void setSettlementType(Integer settlementType) {
		this.settlementType = settlementType;
	}
	public Integer getSettlementDate() {
		return settlementDate;
	}
	public void setSettlementDate(Integer settlementDate) {
		this.settlementDate = settlementDate;
	}
	
	public String getBeneficiaryBankName() {
		return beneficiaryBankName;
	}
	public void setBeneficiaryBankName(String beneficiaryBankName) {
		this.beneficiaryBankName = beneficiaryBankName;
	}
	public String getBeneficiaryBankAddress() {
		return beneficiaryBankAddress;
	}
	public void setBeneficiaryBankAddress(String beneficiaryBankAddress) {
		this.beneficiaryBankAddress = beneficiaryBankAddress;
	}
	public String getInvoiceBankName() {
		return invoiceBankName;
	}
	public void setInvoiceBankName(String invoiceBankName) {
		this.invoiceBankName = invoiceBankName;
	}
	public String getInvoiceBankAddress() {
		return invoiceBankAddress;
	}
	public void setInvoiceBankAddress(String invoiceBankAddress) {
		this.invoiceBankAddress = invoiceBankAddress;
	}
	public Long getFranchiseeFinanceId() {
		return franchiseeFinanceId;
	}
	public void setFranchiseeFinanceId(Long franchiseeFinanceId) {
		this.franchiseeFinanceId = franchiseeFinanceId;
	}
	public Long getFranchiseeId() {
		return franchiseeId;
	}
	public void setFranchiseeId(Long franchiseeId) {
		this.franchiseeId = franchiseeId;
	}
	public String getBeneficiaryCompanyName() {
		return beneficiaryCompanyName;
	}
	public void setBeneficiaryCompanyName(String beneficiaryCompanyName) {
		this.beneficiaryCompanyName = beneficiaryCompanyName;
	}
	public String getBusinessLicenceNumber() {
		return businessLicenceNumber;
	}
	public void setBusinessLicenceNumber(String businessLicenceNumber) {
		this.businessLicenceNumber = businessLicenceNumber;
	}
	public Integer getBeneficiaryBankId() {
		return beneficiaryBankId;
	}
	public void setBeneficiaryBankId(Integer beneficiaryBankId) {
		this.beneficiaryBankId = beneficiaryBankId;
	}
	public Integer getBeneficiaryBankProviceId() {
		return beneficiaryBankProviceId;
	}
	public void setBeneficiaryBankProviceId(Integer beneficiaryBankProviceId) {
		this.beneficiaryBankProviceId = beneficiaryBankProviceId;
	}
	public String getBeneficiaryBankProvice() {
		return beneficiaryBankProvice;
	}
	public void setBeneficiaryBankProvice(String beneficiaryBankProvice) {
		this.beneficiaryBankProvice = beneficiaryBankProvice;
	}
	public Integer getBeneficiaryBankCityId() {
		return beneficiaryBankCityId;
	}
	public void setBeneficiaryBankCityId(Integer beneficiaryBankCityId) {
		this.beneficiaryBankCityId = beneficiaryBankCityId;
	}
	public String getBeneficiaryBankCity() {
		return beneficiaryBankCity;
	}
	public void setBeneficiaryBankCity(String beneficiaryBankCity) {
		this.beneficiaryBankCity = beneficiaryBankCity;
	}
	public String getBeneficiaryBankAccount() {
		return beneficiaryBankAccount;
	}
	public void setBeneficiaryBankAccount(String beneficiaryBankAccount) {
		this.beneficiaryBankAccount = beneficiaryBankAccount;
	}
	public String getInvoiceCompanyName() {
		return invoiceCompanyName;
	}
	public void setInvoiceCompanyName(String invoiceCompanyName) {
		this.invoiceCompanyName = invoiceCompanyName;
	}
	public String getTaxpayerRegistrationNumber() {
		return taxpayerRegistrationNumber;
	}
	public void setTaxpayerRegistrationNumber(String taxpayerRegistrationNumber) {
		this.taxpayerRegistrationNumber = taxpayerRegistrationNumber;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public Integer getInvoiceBankId() {
		return invoiceBankId;
	}
	public void setInvoiceBankId(Integer invoiceBankId) {
		this.invoiceBankId = invoiceBankId;
	}
	public Integer getInvoiceBankProvinceId() {
		return invoiceBankProvinceId;
	}
	public void setInvoiceBankProvinceId(Integer invoiceBankProvinceId) {
		this.invoiceBankProvinceId = invoiceBankProvinceId;
	}
	public String getInvoiceBankProvince() {
		return invoiceBankProvince;
	}
	public void setInvoiceBankProvince(String invoiceBankProvince) {
		this.invoiceBankProvince = invoiceBankProvince;
	}
	public Integer getInvoiceBankCityId() {
		return invoiceBankCityId;
	}
	public void setInvoiceBankCityId(Integer invoiceBankCityId) {
		this.invoiceBankCityId = invoiceBankCityId;
	}
	public String getInvoiceBankCity() {
		return invoiceBankCity;
	}
	public void setInvoiceBankCity(String invoiceBankCity) {
		this.invoiceBankCity = invoiceBankCity;
	}
	public String getInvoiceBankAccount() {
		return invoiceBankAccount;
	}
	public void setInvoiceBankAccount(String invoiceBankAccount) {
		this.invoiceBankAccount = invoiceBankAccount;
	}
	public String getInvoiceBankPhone() {
		return invoiceBankPhone;
	}
	public void setInvoiceBankPhone(String invoiceBankPhone) {
		this.invoiceBankPhone = invoiceBankPhone;
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
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public Long getLastUpdateUserId() {
		return lastUpdateUserId;
	}
	public void setLastUpdateUserId(Long lastUpdateUserId) {
		this.lastUpdateUserId = lastUpdateUserId;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
}
