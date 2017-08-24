<%@page pageEncoding="utf-8" 
contentType="text/html;charset=utf-8" %>
<%@page import="java.util.*" %>
<html>
	<head></head>
	<body style="font-size:30px;">
		算术运算<br/>
		1+1=${1+1}<br/>
		${"1" + "1"}
		<hr/>
		关系运算<br/>
		${1 < 0 }
		<%
			request.setAttribute("str","abc");
		 %>
		${requestScope.str == "abc" }
		<br/>
		<hr/>
		逻辑运算<br/>
		${1 > 0 && 2 < 3 }
		<br/>
		<hr/>
		empty运算<br/>
		<%
			List list1 = new ArrayList();
			//list1.add("a");
			request.setAttribute("list1",list1);
			request.setAttribute("str1","");
			request.setAttribute("obj",null);
		 %>
		空的集合:${empty list1}<br/>
		空字符串:${empty  str1}<br/>
		null值:${empty  obj}<br/>
		找不到值:${empty aaa}
		
		
	</body>
</html>