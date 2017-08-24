package com.tarena.dao;

import java.util.List;
import java.util.Map;

import com.tarena.annotation.MyBatisDao;
import com.tarena.entity.Module;
import com.tarena.entity.Role;
import com.tarena.entity.RoleModule;
import com.tarena.entity.page.RolePage;

@MyBatisDao
public interface RoleMapper {

	List<Role> findByPage(RolePage page);
	//因为没有搜索，所以不需要添加参数（RolePage page）
	int findByRow();
	
	/**
	 * 查询全部的模块数据
	 */
	List<Module> findAllModules();
	
	void save(Role r);
	
	void saveRoleModule(RoleModule rm);
	
	Map<String,Object> findByName(String name);
	
	Role findById(int id);
}
