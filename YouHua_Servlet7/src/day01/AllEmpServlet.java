package day01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import use.User;
import userDAO.UserDAO;
import emplo.Employee;
import emploDAO.EmployeeDAO;

public class AllEmpServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//获得请求资源路径
		String url = request.getRequestURI();
		//分析请求资源路径
		System.out.println("url:"+url);
		String action = url.substring(url.lastIndexOf("/")+1,url.lastIndexOf("."));
		System.out.println("action:"+action);
		
		HttpSession session = request.getSession();
		System.out.println(session.getId());
		if(action.equals("list")){
			try {
				List<Employee> emps = EmployeeDAO.findAll();
		      //使用转发，将处理转交给empList.jsp
		     //step.1绑定数据
				request.setAttribute("emps",emps);
				//step2,获得转发器
				RequestDispatcher rd = request.getRequestDispatcher("emplist.jsp");
				//step3,转发
				rd.forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				request.setAttribute("error_msg","系统繁忙，稍后重试");
				request.getRequestDispatcher("error.jsp").forward(request, response);
			}
			//关闭流
			out.close();
		}else if(action.equals("update")){
			int id = Integer.parseInt(request.getParameter("id"));
			try {
			      Employee emp =  EmployeeDAO.findId(id);
			      //使用转发，转发给updateEmp.jsp
			      request.setAttribute("emp",emp);
			      request.getRequestDispatcher("updateEmp.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				request.setAttribute("error_msg","系统繁忙，稍后重试");
				request.getRequestDispatcher("error.jsp").forward(request, response);
			}
			//关闭流
			out.close();
		}else if(action.equals("update2")){
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			Double salary = Double.parseDouble(request.getParameter("salary"));
			int age = Integer.parseInt(request.getParameter("age"));
			System.out.println(id+","+name+","+salary+","+age);
			try {
			   Employee emp = new Employee(id,name,salary,age);
			   EmployeeDAO.update(emp);
				response.sendRedirect("list.do");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//记日记
				e.printStackTrace();
				/**
				 * 看异常是否能够恢复，如果不能恢复（比如，数据库服务停止，网络中断等产生的异常），则提示用户稍后重试。
				 */
				System.out.println("系统繁忙，请稍后再试！");
				request.setAttribute("error_msg","系统繁忙，稍后重试");
				request.getRequestDispatcher("error.jsp").forward(request, response);
			}
			//关闭流
			out.close();
		}else if(action.equals("del")){
			int id = Integer.parseInt(request.getParameter("id"));
			try {
				   EmployeeDAO.delete(id);
					response.sendRedirect("list.do");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					//记日记
					e.printStackTrace();
					/**
					 * 看异常是否能够恢复，如果不能恢复（比如，数据库服务停止，网络中断等产生的异常），则提示用户稍后重试。
					 */
					request.setAttribute("error_msg","系统繁忙，稍后重试");
					request.getRequestDispatcher("error.jsp").forward(request, response);
				}
				//关闭流
				out.close();
		}else if(action.equals("form")){		
			String name = request.getParameter("name");
			
			double salary = Integer.parseInt(request.getParameter("salary"));
			
			int age = Integer.parseInt(request.getParameter("age"));
			try {
				Employee emp = new Employee(name,salary,age);
				EmployeeDAO.insert(emp);
				response.sendRedirect("list.do");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//记日记
				e.printStackTrace();
				/**
				 * 看异常是否能够恢复，如果不能恢复（比如，数据库服务停止，网络中断等产生的异常），则提示用户稍后重试。
				 */
				request.setAttribute("error_msg","系统繁忙，稍后重试");
				request.getRequestDispatcher("error.jsp").forward(request, response);
			}
			//关闭流
			out.close();
		}else if(action.equals("login")){   //判断是否为登录
			
			String username = request.getParameter("username");
			String pwd = request.getParameter("pwd");
			try {
				User user = UserDAO.findByUsername(username);
				if(user!=null&&user.getPwd().equals(pwd)){
					session.setAttribute("user", user);
					//重定向到首页
					response.sendRedirect("list.do");
					//如果进入list.do，20秒不进行任何操作就会自动跳转到login.jsp
					session.setMaxInactiveInterval(20);
				}else{
					//登录失败
					request.setAttribute("error_msg", "用户名或密码错误!");
					/**
					 * 用转发解决变成式问题
					 * 这里不能用重定向，要不 out.print()就不能输出
					 */
					request.getRequestDispatcher("login.jsp").forward(request, response);
					//不能重定向
					//response.sendRedirect("login.jsp");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(action.equals("logout")){
			//session失效(删除session，等于清除了Cookie)
			session.invalidate();
			response.sendRedirect("login.jsp");
		}else if(action.equals("regist")){
			//读取验证码
			 //number1:用户提交的验证码：
			String number1 = request.getParameter("number");
			 //number2:session对象上绑定的验证码：
			String number2 = (String) session.getAttribute("number");
			//读取用户名，密码，姓名，性别信息
			String username = request.getParameter("username");
			String pwd = request.getParameter("pwd");
			String name = request.getParameter("name");
			String gender = request.getParameter("gender");
			//String str = "([a-z])+([0-9])+";
			try {
				//equaleIgnoreCase忽视用户输入的大小写
				if(number1.equalsIgnoreCase(number2)){  
//					if(username==""||pwd==""){
//						request.setAttribute("user_error", "用户名或密码不能为空！");
//						request.getRequestDispatcher("regist.jsp").forward(request, response);
//					   return;
//					}
//					else if(!username.matches(str)){
//						request.setAttribute("username_error", "用户名必须以字母加数字组合！");
//						request.getRequestDispatcher("regist.jsp").forward(request, response);
//					   return;
//					}
					if(pwd==""){
			     		request.setAttribute("pwd_error", "密码不能为空！");
						request.getRequestDispatcher("regist.jsp").forward(request, response);
					   return;
				   }
					User user = new User(username,pwd,name,gender);
					UserDAO.insert(user);
					request.setAttribute("zhuce_msg","注册成功!!!");
					request.getRequestDispatcher("zhuce.jsp").forward(request, response);
					//response.sendRedirect("login.jsp");
				}else{
					//登录失败，跳转到登录页面并提示用户
					request.setAttribute("number_error", "验证码输入有误！");
					request.getRequestDispatcher("regist.jsp").forward(request, response);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//记日记
				e.printStackTrace();
			}
		} else if(action.equals("check_uname")){	
			  try {
//				//模拟一个系统异常
//				if(1 == 1){
//					throw new ServletException("error");
//				}
			   String uname = request.getParameter("uname");
				User user = UserDAO.findByUsername(uname);
				if(user!=null){
					out.print("用户名被占用");
				}else{
					out.print("可以使用");
				}
			
				out.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}else if(action.equals("check_pwd")){	
			  try {
//					//模拟一个系统异常
//					if(1 == 1){
//						throw new ServletException("error");
//					}
				   String pwd = request.getParameter("pwd");
				   if(pwd==""){
						request.setAttribute("pwd_error", "密码不能为空！");
						request.getRequestDispatcher("regist.jsp").forward(request, response);
					   return;
					}
				
					out.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
	}
}
