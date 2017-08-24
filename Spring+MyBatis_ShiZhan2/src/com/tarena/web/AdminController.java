package com.tarena.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tarena.dao.AdminMapper;
import com.tarena.dao.RoleMapper;
import com.tarena.entity.Admin;
import com.tarena.entity.AdminRole;
import com.tarena.entity.Module;
import com.tarena.entity.Role;
import com.tarena.entity.page.AdminPage;

@Controller
@RequestMapping("/admin")
@SessionAttributes("adminPage")
public class AdminController extends BaseController{
	
	//默认的密码
	public static final String DEFAULT_PASSWORD = "123456";
	
	@Resource
	AdminMapper adminMapper;
	
	@Resource
	RoleMapper roleMapper;
	
	@RequestMapping("/findAdmin.form")
	public String findByRow(AdminPage page, ModelMap map){
		List<Admin> list = adminMapper.findByPage(page);
		map.addAttribute("admins", list);
		
		int rows = adminMapper.findByRow(page);
		page.setRows(rows);
		map.addAttribute("adminPage", page);
		
		List<Module> mo = roleMapper.findAllModules();
		map.addAttribute("modules", mo);
		return "admin/admin_list";
	}
	
	@RequestMapping("/resetPassword.form")
	@ResponseBody
	public boolean updatePassword(String ids) {
		if (ids == null || ids.length() == 0) {
			return false;
		}
		
		//构造参数
		List<String> idList = buildIdList(ids);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", idList);
		map.put("password", DEFAULT_PASSWORD);
		//重置密码
		adminMapper.updatePassword(map);
		
		return true;
	}

	private List<String> buildIdList(String ids) {
		String[] idArray = ids.split(",");
		List<String> idList = new ArrayList<String>();
		for(String id : idArray) {
			idList.add(id);
		}
		return idList;
	}
	
	@RequestMapping("/addAdmin.form")
	public String add(ModelMap map){
		List<Role> list = adminMapper.findAllRole();
		map.addAttribute("roles", list);
		return "admin/admin_add";
	}
	
	@RequestMapping("/addAdmin2.form")
	public String add2(Admin a){
		adminMapper.save(a);
		Integer adminId = a.getAdmin_id();
		List<Integer> roleIds = a.getRoleIds();
		for(Integer roleId : roleIds){
			AdminRole ar = new AdminRole();
			ar.setAdmin_id(adminId);
			ar.setRole_id(roleId);
			adminMapper.saveAdminRole(ar);	
		}
		return "redirect:findAdmin.form";
	}
	
	@RequestMapping("/updateAdmin.form")
	public String update(int id,ModelMap map){
		Admin a = adminMapper.findById(id);
		map.addAttribute("admins", a);
		
		List<Role> list = adminMapper.findAllRole();
		map.addAttribute("allRole", list);
		return "admin/admin_modi";
	}
	
	@RequestMapping("/updateAdmin2.form")
	public String update2(Admin admin){
		adminMapper.updateAdmin(admin);
		//删除中间表
		adminMapper.deleteAdminRole(admin.getAdmin_id());
		//插入中间表
		Integer adminId = admin.getAdmin_id();
		List<Integer> roleIds = admin.getRoleIds();
		for(Integer roleId : roleIds){
			AdminRole ar = new AdminRole();
			ar.setAdmin_id(adminId);
			ar.setRole_id(roleId);
			adminMapper.saveAdminRole(ar);
		}
		return "redirect:findAdmin.form";
	}
}
