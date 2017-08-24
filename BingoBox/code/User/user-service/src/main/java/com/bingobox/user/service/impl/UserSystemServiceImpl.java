package com.bingobox.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bingobox.user.dao.UserSystemRefMapper;
import com.bingobox.user.service.UserSystemService;

@Service
public class UserSystemServiceImpl implements UserSystemService {
	@Autowired
	private UserSystemRefMapper userSystemRefMapper;
	
	@Override
	public List<Long> selectSysIdList(Long userId) {
		// TODO Auto-generated method stub
		return userSystemRefMapper.selectSysIdListByUserId(userId);
	}

}
