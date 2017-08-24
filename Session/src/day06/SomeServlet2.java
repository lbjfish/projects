package day06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SomeServlet2 extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//获得session对象
		HttpSession session = request.getSession(true);//不写true就默认为true
		out.println(session.getId());
		
		Integer count = (Integer) session.getAttribute("counts");
		if(count == null){
			//这是第一次访问
			count=1;
		}else{
			//不是第一次访问，在原有基础上加1
			count++;
		}
		session.setAttribute("counts", count);
		out.println("这是第"+count+"次访问");
		out.close();
	}

}
