package com.bingobox.user.dao;

import java.util.List;

import com.bingobox.user.po.RoleMenu;

public interface RoleMenuMapper {

	void batchInsert(List<RoleMenu> roleList);

	void deleteByRoleId(Integer roleId);
	
	List<RoleMenu> selectByRoleId(Integer roleId);
	
}