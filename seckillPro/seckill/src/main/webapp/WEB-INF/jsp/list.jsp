<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/tag.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<title>秒杀列表页</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<!-- 引入Bootstrap -->
		<%@include file="common/head.jsp" %>
	</head>
	
	<body>
		<!-- 页面显示部分 -->
		<div class="container">
			<div class="panel panel-default">
				<div class="panel-heading text-center">
					<h2>秒杀列表</h2>
				</div>
				<div class="panel-body">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>名称</th>
								<th>库存</th>
								<th>开始时间</th>
								<th>结束时间</th>
								<th>创建时间</th>
								<th>详情页</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${list}" var="sk">
								<tr>
									<td>${sk.name}</td>
									<td>${sk.number}</td>
									<td>
										<fmt:formatDate value="${sk.startTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
									</td>
									<td>
										<fmt:formatDate value="${sk.endTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
									</td>
									<td>
										<fmt:formatDate value="${sk.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
									</td>
									<td>
										<a class="btn btn-info" href="/seckill/${sk.seckillId}/detail" target="_blank">link</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</body>
<%--	<c:url var="url2" value="/js/jquery-1.9.1.min.js" />
	<script type="text/javascript" src="${url2}"></script>
	<c:url var="url3" value="/js/bootstrap.min.js" />
	<script type="text/javascript" src="${url3}"></script>--%>
	<script src="https://cdn.bootcss.com/jquery/2.0.0/jquery.min.js"></script>
	<script src="https://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</html>