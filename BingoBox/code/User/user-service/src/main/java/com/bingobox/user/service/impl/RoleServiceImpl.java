package com.bingobox.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bingobox.user.po.RoleInfo;
import com.bingobox.user.service.RoleService;
import com.bingobox.user.dao.RoleInfoMapper;
import com.bingobox.user.dao.RoleMenuMapper;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleInfoMapper RoleInfoMapper;
	@Autowired
	private RoleMenuMapper roleMenuMapper;

	@Override
	public List<RoleInfo> selectRoleList(RoleInfo roleInfo) {
		return RoleInfoMapper.selectRoleList(roleInfo);
	}

	@Override
	public RoleInfo selectRoleInfo(Integer id) {
		return RoleInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateRoleInfo(RoleInfo roleInfo) {
		// 1.更新角色信息表
		RoleInfoMapper.update(roleInfo);
		// 2.删除原角色权限关系表
		roleMenuMapper.deleteByRoleId(roleInfo.getId());
		// 3.新增角色权限关系
		roleMenuMapper.batchInsert(roleInfo.getRoleMenuList());
	}

	@Override
	public void insertRoleInfo(RoleInfo roleInfo) {
		// 1.新增角色信息表
		RoleInfoMapper.insert(roleInfo);
		// 2.新增角色权限关系
		roleMenuMapper.batchInsert(roleInfo.getRoleMenuList());

	}

}
