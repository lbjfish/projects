package com.tarena.web;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tarena.dao.AdminMapper;
import com.tarena.entity.Admin;
import com.tarena.entity.Module;


/**
 *	登录功能
 */
@Controller
@RequestMapping("/login")
public class LoginController extends BaseController {
	
	// 登录校验结果
	private static final int SUCCESS = 0;
	private static final int ADMIN_CODE_ERROR = 1;
	private static final int PASSWORD_ERROR = 2;
	//private static final int IMAGE_CODE_ERROR = 3;
	
	@Resource
	private AdminMapper adminMapper;
	
	/**
	 * 打开登录页面
	 */
	@RequestMapping("/toLogin.form")
	public String toLogin() {
		return "main/login";
	}
	
	@RequestMapping("/toIndex.form")
	public String toIndex(){
		return "main/index";
	}
	
	@RequestMapping("/checkLogin.form")
	@ResponseBody
	public int checkLogin(String adminCode,String password,HttpSession session,HttpServletRequest request) {
	
		//根据账号查询管理员
		Admin admin = adminMapper.findByCode(adminCode);
		System.out.println("adminCode="+adminCode);
		System.out.println("password="+password);
		//判断管理员是否存在
		if(admin == null) {
			//管理员不存在
			return ADMIN_CODE_ERROR;
		} else if (!admin.getPassword().equals(password)) {			
			//密码不正确
			return PASSWORD_ERROR;
		} else {
			//账号密码都正确，校验成功
			//将登录信息存入session
			session.setAttribute("admin", admin);
			System.out.println(request.getSession().getAttribute("admin")+" bbbb");
			//查询当前用户可以访问的模块，放入session
			List<Module> modules = adminMapper.findModuleByAdmin(admin.getAdmin_id());
			
			session.setAttribute("userModules", modules);
			//账号密码都正确，校验成功
			return SUCCESS;
		}		
	}
	
	
	
	
}
