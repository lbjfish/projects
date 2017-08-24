package com.bingobox.user.service;

import java.util.List;

import com.bingobox.user.po.RoleInfo;

public interface RoleService {

	/**
	 * 查询角色列表，一对多关联查询对应菜单列表
	 * 
	 * @author jingzt
	 * @param name
	 *            角色名称（模糊查询）
	 * @return
	 */
	List<RoleInfo> selectRoleList(RoleInfo roleInfo);

	/**
	 * 根据角色Id 查询角色信息和权限信息
	 * 
	 * @param id
	 *            角色ID
	 * @return
	 */
	RoleInfo selectRoleInfo(Integer id);

	/**
	 * 更新角色信息和对应权限列表
	 * 
	 * @param roleInfo
	 *            角色含权限信息
	 */
	void updateRoleInfo(RoleInfo roleInfo);

	/**
	 * 新增角色信息和对应权限信息
	 * 
	 * @param roleInfo
	 *            角色含权限信息
	 */
	void insertRoleInfo(RoleInfo roleInfo);

}
