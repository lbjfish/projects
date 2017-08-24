package com.bingobox.basedata.interceptor;

import com.aliyun.openservices.shade.com.alibaba.fastjson.JSONObject;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.HashMap;
import java.util.Map;


@Component
public class HandlerProcessor implements HandlerInterceptor {
	
	private final static ThreadLocal<HashMap<String,JSONObject>> localSession = new ThreadLocal<HashMap<String,JSONObject>>();  
	  
	public static Map<String,JSONObject> currentSession(HttpServletRequest request) {  
		Thread.currentThread().getId();
	    Map<String,JSONObject> session = localSession.get();  
	    if (session == null) {  
	        localSession.set(new HashMap<String,JSONObject>());  
	    }  
	    return localSession.get();  
	}  
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		return true;
	}


	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}
}
