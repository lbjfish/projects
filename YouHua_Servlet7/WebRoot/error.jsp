<%@page pageEncoding="utf-8" 
contentType="text/html;charset=utf-8" %>
<html>
	<head></head>
	<body style="font-size:30px;color:red;">
		<%
			String msg = (String)request.getAttribute("error_msg");
		 %>
		 <%=msg%>
		 <br/><br/>
		 <a href="login.jsp">返回登录界面</a>
	</body>
</html>