<%-- ${param.name}
	   等价于 request.getParameter("name");
  	  ${paramValues.city}
  	   等价于 request.getParameterValues("city"); 
--%>

<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8" %>
<html>
	<head></head>
	<body style="font-size:30px;">
		name:${param.name}<br/>
		city:${paramValues.city[0]}
	</body>
</html>