package com.bingobox.basedata.dao;

import java.util.List;

import com.aliyun.openservices.shade.com.alibaba.fastjson.JSONObject;
import com.bingobox.basedata.po.FilePO;

public interface FileDao {
	Long add(List<FilePO> fileList);

	Integer update(JSONObject param);
}
