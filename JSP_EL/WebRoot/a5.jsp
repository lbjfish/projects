<%@page pageEncoding="utf-8" 
contentType="text/html;charset=utf-8" %>
<%@page import="bean.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c" %>
<html>
	<head></head>
	<body style="font-size:30px;">
		<%
			Employee e1 = new Employee();
			e1.setGender("a");
			e1.setName("张三");
			request.setAttribute("e",e1);
		 %>
		 性别:<c:choose>
		 	<c:when test="${e.gender == 'm'}">男</c:when>
		 	<c:when test="${e.gender =='f'}">女</c:when>
		 	<c:otherwise>未知</c:otherwise>
		 </c:choose>
	</body>
</html>