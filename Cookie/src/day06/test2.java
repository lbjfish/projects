package day06;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Cookie工具
 */
public class test2 {
	//cookie路径
	private static String path = "/day06";
	//缺省生存时间
	private static int age = 60 * 60;
	/**
	 * 添加cookie
	 */
	public static void addCookie(String name,String value,HttpServletResponse response,int age) throws UnsupportedEncodingException{
		Cookie c = new Cookie(name,URLEncoder.encode(value,"utf-8"));
		c.setMaxAge(age);
		c.setPath(path);
		response.addCookie(c);
	}
	
	/**
	 * 添加cookie(使用缺省生存时间)
	 */
	public static void addCookie(String name,String value,HttpServletResponse response) throws UnsupportedEncodingException{
		addCookie(name,value,response,age);
	}
	
	/**
	 * 依据cookie的名称查找cookie,找到了，
	 * 返回cookie的值，找不到，返回null。
	 */
	public static String findCookie(String name,HttpServletRequest request) throws UnsupportedEncodingException{
		Cookie[] cookies = request.getCookies();
		if(cookies != null){
			for(int i=0;i< cookies.length;i ++){
				Cookie c =  cookies[i];
				if(c.getName().equals(name)){
					String value = 
						URLDecoder.decode(c.getValue(),"utf-8");
					return value;
				}
			}
		}
		return null;
	}
	
	/**
	 * 删除指定名称的cookie
	 */
	public static void deleteCookie(String name,HttpServletResponse response){
		Cookie c = new Cookie(name,"");
		c.setMaxAge(0);
		c.setPath(path);
		response.addCookie(c);
	}
}
