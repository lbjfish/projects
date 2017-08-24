package com.bingobox.basedata.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliyun.openservices.shade.com.alibaba.fastjson.JSONObject;
import com.bingobox.basedata.dao.FileDao;
import com.bingobox.basedata.po.FilePO;
import com.bingobox.basedata.service.FileService;

@Service("fileService")
public class FileServiceImpl implements FileService{
	
	@Autowired
	private FileDao fileDao;
	
	@Override
	public Long add(List<FilePO> fileList) {
		Long result = fileDao.add(fileList);
		return result;
	}

	@Override
	public Integer update(JSONObject param) {
		return fileDao.update(param);
	}
}
