package com.pfgh.pathUtil;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 加载env.properties中的配置项，将静态资源地址和动态资源地址放到application变量中
 * @author WangXuzheng
 *
 */
public class SysconfigInitListener implements SystemStartupListener {
	/**
	 * CONFIG_FILE_PATH 系统变量配置文件路径
	 */
	private static final String CONFIG_FILE_PATH = "/env.properties";
	private static final Log LOG = LogFactory.getLog(SysconfigInitListener.class);
	@Override
	public void onStartup(ServletContextEvent contextEvent) {
		InputStream inputStream = null;
		Properties properties = new Properties();
		try{
			inputStream = SysconfigInitListener.class.getResourceAsStream(CONFIG_FILE_PATH);
			properties.load(inputStream);
			LOG.info("系统配置项:"+properties);
		}catch (Exception e) {
			LOG.error("读取系统配置文件时发生错误：",e);
			throw new RuntimeException("读取系统配置文件时发生错误！！！");
		}finally{
			if(inputStream != null){
				try {
					inputStream.close();
				} catch (IOException e) {
					LOG.error("关闭文件输入流失败：",e);
				}
			}
		}
		Env.init(properties);
		// 静态资源地址&动态资源地址
		ServletContext servletContext = contextEvent.getServletContext();
		servletContext.setAttribute("staticURL", Env.getProperty(Env.KEY_STATIC_URL));
		servletContext.setAttribute("dynamicURL", Env.getProperty(Env.KEY_DYNAMIC_URL));
		servletContext.setAttribute("webServiceURL", Env.getProperty(Env.KEY_WEBSERVICE_URL));
	}
}
