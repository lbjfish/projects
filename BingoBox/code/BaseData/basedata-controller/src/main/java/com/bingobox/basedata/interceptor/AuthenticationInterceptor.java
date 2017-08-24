package com.bingobox.basedata.interceptor;

import com.aliyun.openservices.shade.com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

/**
 * Created by zhangfubin on 2017/8/1.
 */
public class AuthenticationInterceptor extends HandlerInterceptorAdapter {
    private static final Logger logger = LoggerFactory.getLogger(AuthenticationInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        logger.debug("接口请求地址：" + request.getRequestURL() + ",来源IP：" + request.getRemoteAddr());
	/*	String token = request.getParameter("token");
		if (StringUtils.isNotBlank(token) &&  !RedisManager.exists(token)) {
			logger.warn(token + "尝试登录，被驳回，原因：缓存不存在该用户信息。");
			Map<String, Object> map = new ConcurrentHashMap<String, Object>();
			map.put("code", CustomerConstant.LOGIN_UNUSER);
			map.put("message", "重新登录后再试");
			println(response, map);
			return false;
		}*/

        response.addHeader("Access-Control-Allow-Origin","*");
        response.addHeader("Access-Control-Allow-Credentials", "true");
        response.addHeader("Access-Control-Allow-Headers", "*");
        response.addHeader("Access-Control-Allow-Headers", "X-Requested-With, Content-Type");
        response.addHeader("Access-Control-Allow-Methods","OPTIONS,GET,POST");
        response.addHeader("Allow", "OPTIONS,GET,POST");
        return super.preHandle(request, response, handler);
    }

    private static void println(HttpServletResponse response, Map<String, Object> map) throws IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");
        PrintWriter pw = response.getWriter();
        pw.println(JSON.toJSON(map));
        pw.flush();
        pw.close();
    }
}
