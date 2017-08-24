package com.bingobox.user.service;

import com.bingobox.user.dto.UserLoginDTO;
import com.bingobox.user.po.UserInfo;


public interface UserService {

	int deleteByPrimaryKey(Long id);

	int insert(UserInfo record);

	UserInfo selectByPrimaryKey(Long id);

	int update(UserInfo record);

	UserInfo selectByLoginName(String mobile);

	UserLoginDTO selectLoginInfo(UserInfo info) throws Exception;
}
