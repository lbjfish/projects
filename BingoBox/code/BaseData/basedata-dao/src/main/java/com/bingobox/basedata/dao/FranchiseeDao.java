package com.bingobox.basedata.dao;



import java.util.List;

import com.aliyun.openservices.shade.com.alibaba.fastjson.JSONObject;
import com.bingobox.basedata.po.FranchiseePO;

/**
 * 
 * @author ZhangNing 2017年7月20日
 *
 */
public interface FranchiseeDao {
	FranchiseePO getFranchisee(Long franchiseeId);
	FranchiseePO detail(Long franchiseeId);
	List<FranchiseePO> getList(FranchiseePO franchiseePO);
	Long add(FranchiseePO franchiseePO);
	Long update(JSONObject param);
	FranchiseePO boxList(JSONObject param);
}
