package com.bingobox.user.dao;

import com.bingobox.user.po.UserInfo;

public interface UserInfoMapper {
	int deleteByPrimaryKey(Long id);

	int insert(UserInfo record);

	UserInfo selectByPrimaryKey(Long id);

	int update(UserInfo record);

	UserInfo selectByLoginName(String mobile);
}