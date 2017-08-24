<%@page pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <ul id="menu">
   <li><a href="index.html" class="index_on"></a></li>
    <!-- 遍历用户有权限的模块，然后动态初始化这些模块图标 -->
   <c:forEach items="${userModules}" var="ma">
   	<c:if test="${ma.module_id==1}">
 			<li><a href="${pageContext.request.contextPath}/role/findRole.form" class="role_off"></a></li>
 		</c:if>
 		<c:if test="${ma.module_id==2}">
 			<li><a href="${pageContext.request.contextPath}/admin/findAdmin.form" class="admin_off"></a></li>
 		</c:if>
 		<c:if test="${ma.module_id==3}">
 			<li><a href="${pageContext.request.contextPath}/cost/findCost.form" class="fee_off"></a></li>
 		</c:if>
 		<c:if test="${ma.module_id==4}">
 			<li><a href="${pageContext.request.contextPath}/account/findAccount.form" class="account_off"></a></li>
 		</c:if>
 		<c:if test="${ma.module_id==5}">
 			<li><a href="${pageContext.request.contextPath}/service/findService.form" class="service_off"></a></li>
 		</c:if>
 		<c:if test="${ma.module_id==6}">
 			<li><a href="#" class="bill_off"></a></li>
 		</c:if>
 		<c:if test="${m.module_id==7}">
 			<li><a href="#" class="report_off"></a></li>
 		</c:if>
 	</c:forEach>
 </ul>