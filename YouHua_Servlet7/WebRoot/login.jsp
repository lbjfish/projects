<%@page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@page import="java.text.SimpleDateFormat,java.util.Date" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<title>login</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css"
			href="css/style.css" />
	</head>

	<body>
		<div id="wrap">
			<div id="top_content">
					<div id="header">
						<div id="rightheader">
							<p>
								<%@include file="date.jsp"%>
								<br />
							</p>
						</div>
						<div id="topheader">
							<h1 id="title">
								<a href="list.do">主页</a>
							</h1>
						</div>
						<div id="navigation">
						</div>
					</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						登录控制台
					</h1>
					<form action="login.do" method="post">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table">
							<tr>
								<td valign="middle" align="right">
									用户名:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="username" />
					            <span style="color:red;font-weight:bold;font-size:15px">${error_msg}</span><br/>
								</td>
							</tr>
							
							<tr>
								<td valign="middle" align="right">
									密码:
								</td>
								<td valign="middle" align="left">
									<input type="password" class="inputgri" name="pwd" />
								</td>
							</tr>
						</table>
						<p>
							<input type="submit" class="button" value="登录" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="button" class="button" value="注册" onclick="location='regist.jsp'"/>
						</p>
					</form>
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">
					电子邮箱：lbjfish@qq.com
				</div>
			</div>
		</div>
	</body>
</html>
