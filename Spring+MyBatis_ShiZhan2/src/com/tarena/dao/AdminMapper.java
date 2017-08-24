package com.tarena.dao;

import java.util.List;
import java.util.Map;

import com.tarena.annotation.MyBatisDao;
import com.tarena.entity.Admin;
import com.tarena.entity.AdminRole;
import com.tarena.entity.Module;
import com.tarena.entity.Role;
import com.tarena.entity.page.AdminPage;

@MyBatisDao
public interface AdminMapper {
	List<Admin> findByPage(AdminPage page);
	//因为有搜索功能，所以要带参数（AdminPage page）
	int findByRow(AdminPage page);
	
	/**
	 * 修改密码，其中
	 * Map的key存的是参数名，Map的值存的是参数值。
	 * 	key			value
	 * 	ids			List<Integer>
	 * 	password		String
	 */
	void updatePassword(Map<String, Object> param);
	
	List<Role> findAllRole();
	
	void save(Admin a);
	
	void saveAdminRole(AdminRole ar);
	
	Admin findById(int id);
	
	void updateAdmin(Admin a);
	
	/**
	 * 根据角色ID删除中间表数据
	 */
	void deleteAdminRole(int adminId);
	
	/**
	 * 根据账号查询管理员
	 */
	Admin findByCode(String adminCode);
	
	/**
	 * 根据管理员ID查询其对应的模块
	 */
	List<Module> findModuleByAdmin(int id);
}
