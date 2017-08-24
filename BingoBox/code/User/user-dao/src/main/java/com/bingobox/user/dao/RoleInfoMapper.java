package com.bingobox.user.dao;

import java.util.List;

import com.bingobox.user.po.RoleInfo;

public interface RoleInfoMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(RoleInfo record);

	RoleInfo selectByPrimaryKey(Integer id);

	int update(RoleInfo record);
	
	List<RoleInfo> selectRoleList(RoleInfo roleInfo);

}