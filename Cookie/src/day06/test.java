package day06;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class test extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		Cookie[] cookies = request.getCookies();
		boolean flag=false;
		if(cookies != null){
			for(Cookie c : cookies){
				String name = c.getName();
				String value = c.getValue();
				if("uid".equals(name)){
					out.println("name:"+name);
					out.println("value:"+value);
					flag=true;
				}	
			}if(flag==false){
				  Cookie a = new Cookie("uid","teacher");
				  response.addCookie(a);
			}
		}else{
			Cookie c = new Cookie("uid","teacher");
			response.addCookie(c);
	 }
	}

}
