package com.tarena.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.tarena.entity.Admin;

/**
 *	登录检查拦截器，用于检查用户是否已经登录。
 */
public class CheckLoginInterceptor 
	implements HandlerInterceptor {

	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {

	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {

	}

	//在Controller业务方法执行前调用
	public boolean preHandle(
			HttpServletRequest request, 
			HttpServletResponse response,
			Object arg2) throws Exception {
		//从session中读取登录信息
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		System.out.println(request.getSession().getAttribute("admin")+" 2222");
		//判断是否登录过
		if(admin == null) {
			//没有登录过，将请求重定向到登录页
			response.sendRedirect(request.getContextPath()+ "/login/toLogin.form");
			return false;
		} else {
			//已经登录
			return true;
		}
	}

}
