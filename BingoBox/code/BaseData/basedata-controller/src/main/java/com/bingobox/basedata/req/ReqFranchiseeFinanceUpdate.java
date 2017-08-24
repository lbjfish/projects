package com.bingobox.basedata.req;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.aliyun.openservices.shade.com.alibaba.fastjson.JSONObject;
import com.bingobox.framework.common.CommonVO;

public class ReqFranchiseeFinanceUpdate extends CommonVO{
	@NotNull
	private Long franchiseeId;
	private String beneficiaryCompanyName;
	private String businessLicenceNumber;
	private String beneficiaryBankName;		
	private String beneficiaryBankAddress;	
	private String beneficiaryBankAccount;		
	private String invoiceCompanyName;			
	private String taxpayerRegistrationNumber;	
	private String companyAddress;				
	private String invoiceBankName;			
	private String invoiceBankAddress;			
	private String invoiceBankAccount;			
	private String invoiceBankPhone;			
	private Integer settlementType;			
	private Integer settlementDate;
	private List<JSONObject> file;
	
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
	public List<JSONObject> getFile() {
		return file;
	}
	public void setFile(List<JSONObject> file) {
		this.file = file;
	}
}
