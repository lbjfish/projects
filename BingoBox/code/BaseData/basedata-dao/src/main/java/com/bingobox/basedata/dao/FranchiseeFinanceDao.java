package com.bingobox.basedata.dao;

import com.aliyun.openservices.shade.com.alibaba.fastjson.JSONObject;
import com.bingobox.basedata.po.FranchiseeFinancePO;

/**
 * 
 * @author ZhangNing
 *
 */
public interface FranchiseeFinanceDao {
	Long add(FranchiseeFinancePO franchiseeFinancePO);
	FranchiseeFinancePO detail(Long franchiseeId);
	Long update(JSONObject param);
}
