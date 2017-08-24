package com.tarena.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tarena.dao.RoleMapper;
import com.tarena.entity.Module;
import com.tarena.entity.Role;
import com.tarena.entity.RoleModule;
import com.tarena.entity.page.RolePage;

@Controller
@RequestMapping("/role")
@SessionAttributes("rolePage")
public class RoleController extends BaseController{
	
	@Resource
	private RoleMapper roleMapper;
	
	@RequestMapping("/findRole.form")
	public String testFindPage(RolePage page,ModelMap map){
		List<Role> list = roleMapper.findByPage(page);
		map.addAttribute("roles", list);
		
		int rows = roleMapper.findByRow();
		page.setRows(rows);
		map.addAttribute("rolePage", page);
		return "role/role_list";
	}
	
	@RequestMapping("/addModule.form")
	public String addRoles(ModelMap map){
		List<Module> list = roleMapper.findAllModules();
		map.addAttribute("modules", list);
		return "role/role_add";
	}
	
	@RequestMapping("/addModule2.form")
	public String addRoles2(Role r){
		roleMapper.save(r);
		Integer roleId = r.getRole_id();
		List<Integer> list = r.getModuleIds();
		for(Integer moduleId : list){
			RoleModule rm = new RoleModule();
			rm.setRole_id(roleId);
			rm.setModule_id(moduleId);
			roleMapper.saveRoleModule(rm);
		}
		return "redirect:findRole.form";
	}
	
	@ResponseBody
	@RequestMapping("/checkName.form")
	public Map<String,Object> searchName(String name){
		System.out.println("name="+name);
		Map<String,Object> map = new HashMap<String,Object>();
		if(roleMapper.findByName(name) == null){
			map.put("msg", "y");
		}else{
			map.put("msg", "n");
		}
		return map;
	}
	
	@RequestMapping("/updateRole.form")
	public String replaceRole(int id,ModelMap map){
		Role role = roleMapper.findById(id);
		map.addAttribute("roles", role);
		
		List<Module> list = roleMapper.findAllModules();
		map.addAttribute("allmodule", list);
		return "role/role_modi";
	}
}
