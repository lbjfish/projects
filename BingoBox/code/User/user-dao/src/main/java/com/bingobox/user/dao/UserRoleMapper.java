package com.bingobox.user.dao;

import java.util.List;

import com.bingobox.user.po.RoleInfo;
import com.bingobox.user.po.UserRole;

public interface UserRoleMapper {

	void batchInsert(List<UserRole> userRoleList);

	void deleteByUserId(Long userId);
	
	List<RoleInfo> selectRoleListByUserId(Long userId);
}