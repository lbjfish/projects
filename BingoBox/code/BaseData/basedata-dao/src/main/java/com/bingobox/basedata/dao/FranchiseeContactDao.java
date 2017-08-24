package com.bingobox.basedata.dao;

import com.aliyun.openservices.shade.com.alibaba.fastjson.JSONObject;
import com.bingobox.basedata.po.FranchiseeContactPO;

/**
 * 
 * @author ZhangNing
 *
 */
public interface FranchiseeContactDao {
	Long add(FranchiseeContactPO franchiseeContactPO);
	Long update(JSONObject param);
}
