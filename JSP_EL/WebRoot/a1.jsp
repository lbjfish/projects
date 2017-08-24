<%@page contentType = "text/html;charset=utf-8" pageEncoding="utf-8" %>
<%@page import="bean.*" %>  
<html>
	<head>
	</head>
	<body style="font-size:30px;">
		<%
		   User user1 = new User();
		   user1.setName("Sally");
		   user1.setAge(22);
		   user1.setInterest(new String[]{"cooking","snooker"});
		   request.setAttribute("user",user1);

		   User user2 = new User();
		   user2.setName("King");
		   user2.setAge(32);
		   session.setAttribute("user",user2);
		 %>
	name: <%
		   User user3 = (User)request.getAttribute("user");
		   out.println(user3.getName());
		  
		  %> 
		  <br/>
		 name:${user.name}<br/>
		 指定从session对象上查找:
		 name:${sessionScope.user.name}
		 <br/>
		 name:${user["name"]}<br/>
		 
		 <%
		 request.setAttribute("propname","age");
		  %>
		  ${user[propname] }<br/>
		  爱好:${user.interest[0]}
	</body>
</html>
