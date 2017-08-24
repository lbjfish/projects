package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Employee;

public class ListUsers extends HttpServlet {

	
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Employee> employees = new ArrayList<Employee>();
		for(int i = 1;i <= 8;i ++){
			Employee e = new Employee();
			e.setName("emp00" + i);
			e.setGender("m");
			employees.add(e);
		}
		request.setAttribute("employees", employees);
		request.getRequestDispatcher("a6.jsp").forward(request, response);
		
	}

}
