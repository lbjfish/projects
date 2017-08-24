package com.tarena.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.tarena.entity.Admin;

/**
 *	��¼��������������ڼ���û��Ƿ��Ѿ���¼��
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

	//��Controllerҵ�񷽷�ִ��ǰ����
	public boolean preHandle(
			HttpServletRequest request, 
			HttpServletResponse response,
			Object arg2) throws Exception {
		//��session�ж�ȡ��¼��Ϣ
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		System.out.println(request.getSession().getAttribute("admin")+" 2222");
		//�ж��Ƿ��¼��
		if(admin == null) {
			//û�е�¼�����������ض��򵽵�¼ҳ
			response.sendRedirect(request.getContextPath()+ "/login/toLogin.form");
			return false;
		} else {
			//�Ѿ���¼
			return true;
		}
	}

}
