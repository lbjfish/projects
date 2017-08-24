package com.bingobox.basedata.service;


import java.util.List;

import com.aliyun.openservices.shade.com.alibaba.fastjson.JSONObject;
import com.bingobox.basedata.po.CityPO;
import com.bingobox.basedata.po.FranchiseePO;
import com.bingobox.framework.common.CommonPage;
import com.bingobox.framework.common.CommonResult;
import com.bingobox.basedata.po.FranchiseeFinancePO;


/**
 * 
 * @author ZhangNing
 *
 */
public interface FranchiseeService {
	FranchiseePO getFranchisee(Long franchiseeId) throws Exception;
	CommonResult<FranchiseeFinancePO> franchiseeFinanceDetail(Long franchiseeId);
	CommonResult<FranchiseePO> detail(Long franchiseeId);
	CommonResult<CommonPage<FranchiseePO>> list(Long franchiseeCode, String franchiseeName, Integer isValid, Integer pageNum, Integer pageSize);
	CommonResult<JSONObject> add(JSONObject param) throws Exception;
	CommonResult<JSONObject> franchiseeFinanceAdd(JSONObject param);
	CommonResult<JSONObject> update(JSONObject param);
	CommonResult<JSONObject> boxList(Long franchiseeId);
	CommonResult<Void> bindBox(JSONObject param);
	CommonResult<List<CityPO>> cityList(Long parentRegionInfoId);
	CommonResult<JSONObject> franchiseeFinanceUpdate(JSONObject param);
}

