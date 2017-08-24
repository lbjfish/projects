package com.bingobox.basedata.service;

import java.util.List;

import com.aliyun.openservices.shade.com.alibaba.fastjson.JSONObject;
import com.bingobox.basedata.po.FilePO;

/**
 * 
 * @author ZhangNing
 *
 */
public interface FileService {
	Long add(List<FilePO> param);
	Integer update(JSONObject param);
}

