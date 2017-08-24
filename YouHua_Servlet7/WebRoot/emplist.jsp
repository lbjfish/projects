<%@page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="abc" prefix="c1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<c:if test="${sessionScope.user == null}"><c1:login u="login.jsp"/></c:if>
<html>
	<%@include file="header.jsp"%>
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
					<div id="navigation" style="font-size:18px;color:white;padding-right:20px;">
						<c:if test="${!empty sessionScope.user }">
							<span style="float:right;">欢迎你 ${sessionScope.user.username}&nbsp;&nbsp;
							<a href="logout.do" style="color:yellow;">退出</a>
							</span>
						</c:if>
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						欢迎!
					</h1>
					<table class="table">
						<tr class="table_header">
							<td>
								ID
							</td>
							<td>
								姓名
							</td>
							<td>
								薪水
							</td>
							<td>
								年龄
							</td>
							<td>
								操作
							</td>
						</tr>
                  <c:forEach var="e" items="${emps}" varStatus="s"> 
					<tr class="row${s.index % 2 + 1}">
						<td>${e.id}</td>
						<td>${e.name}</td>
						<td>${e.salary}</td>
						<td>${e.age}</td>
						<td>
			    		<a href="del.do?id=${e.id}" onclick="return confirm('是否确定删除${e.name}');">删除</a>&nbsp;&nbsp;<a href='update.do?id=${e.id}'>修改</a>
					   </td>
					</tr>		
				   </c:forEach>
					</table>
					<p>
						<input type="button" class="button" value="添加员工" onclick="location='addEmp.jsp'"/>&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="button" class="button" value="退出" onclick="location='logout.do'"/>
					</p>
				</div>
			</div>
			<!-- include指令，可以直接调用footer.jsp等的文件 -->
			<%@include file="footer.jsp"%>
		   </div>
	</body>
</html>
