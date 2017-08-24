package day06;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddCookieDemo extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
	   Cookie c1 = new Cookie("Sally","teacher");
	   //c1.setMaxAge(100);
	   response.addCookie(c1);
	   
	   Cookie c2 = new Cookie("city",URLEncoder.encode("北京","utf-8"));
	   response.addCookie(c2);
	   
//	   Cookie c3 = new Cookie("uid","abb");
//	   //c3.setMaxAge(0);
//	   response.addCookie(c3);
	   out.println("发送cookie给浏览器");
	   out.close();
	}

}
