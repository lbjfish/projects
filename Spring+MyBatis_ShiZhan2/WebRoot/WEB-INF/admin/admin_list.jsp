<%@page pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>达内－NetCTOSS</title>
        <link type="text/css" rel="stylesheet" media="all" href="../styles/global.css" />
        <link type="text/css" rel="stylesheet" media="all" href="../styles/global_color.css" /> 
        <script language="javascript" type="text/javascript" src="../js/jquery-1.11.1.js"></script>
        <script language="javascript" type="text/javascript">
            //显示角色详细信息
            function showDetail(flag, a) {
                var detailDiv = a.parentNode.getElementsByTagName("div")[0];
                if (flag) {
                    detailDiv.style.display = "block";
                }
                else
                    detailDiv.style.display = "none";
            }
            //重置密码
            function resetPwd() {
                alert("请至少选择一条数据！");
                //document.getElementById("operate_result_info").style.display = "block";
            }
            //删除
            function deleteAdmin() {
                var r = window.confirm("确定要删除此管理员吗？");
                document.getElementById("operate_result_info").style.display = "block";
            }
            //全选
            function selectAdmins(inputObj) {
                var inputArray = document.getElementById("datalist").getElementsByTagName("input");
                for (var i = 1; i < inputArray.length; i++) {
                    if (inputArray[i].type == "checkbox") {
                        inputArray[i].checked = inputObj.checked;
                    }
                }
            }
            
               //重置密码
            function resetPwd() {
            //取得选中的checkbox
                var checkObjs = $(":checkbox[name='check_admin']:checked");
            	if(checkObjs.length == 0) {
            		alert("请至少选择一个管理员.");
            		return;
            	}
            	  //取得选中的checkbox对应的id值
            	var ids = new Array();
            	for(var i=0;i<checkObjs.length;i++){
            		var trObj = checkObjs.eq(i).parent().parent();
            		var tdObj = trObj.children().eq(1);
            		ids.push(tdObj.text());
            	}
            	 //重置密码
            	$.post(
            		"resetPassword.form",
            		{"ids":ids.toString()},
            		function(data) {
            			// 提示信息
            			//提示
                		if(data) {
                			$("#operate_msg").text("密码重置成功.");
                		} else {
                			$("#operate_msg").text("密码重置失败.");
                		}
            			$("#operate_result_info").show();
            			// 等待2S，关闭提示信息
            			setTimeout(function(){
            				$("#operate_result_info").hide();
            			}, 2000);
            		}
            	);
            }
        </script>       
    </head>
    <body>
        <!--Logo区域开始-->
        <div id="header">
            <img src="../images/logo.png" alt="logo" class="left"/>
            <a href="#">[退出]</a>            
        </div>
        <!--Logo区域结束-->
        <!--导航区域开始-->
        <div id="navi">                        
            <jsp:include page="/WEB-INF/main/menu.jsp"></jsp:include>
        </div>
        <!--导航区域结束-->
        <!--主要区域开始-->
        <div id="main">
            <form action="" method="">
                <!--查询-->
                <div class="search_add">
                    <div>
                        模块：
                        <select id="selModules" name="moduleId" class="select_search">
                            <option value="">全部</option>
                            <c:forEach items="${modules}" var="m">
                            <option value="${m.module_id}" <c:if test="${adminPage.moduleId==m.module_id}">selected</c:if>>${m.name}</option>
                           </c:forEach>
                        </select>
                    </div>
                    <div>角色：<input type="text" value="${adminPage.roleName}" name="roleName" class="text_search width200" /></div>
                    <div><input type="submit" value="搜索" class="btn_search"/></div>
                    <input type="button" value="密码重置" class="btn_add" onclick="resetPwd();"/>
                    <input type="button" value="增加" class="btn_add" onclick="location.href='addAdmin.form';" />
                </div>
                <!--删除和密码重置的操作提示-->
                <div id="operate_result_info" class="operate_fail">
                    <img src="../images/close.png" onclick="this.parentNode.style.display='none';" />
                    <span id="operate_msg">删除失败！数据并发错误。</span><!--密码重置失败！数据并发错误。-->
                </div> 
                <!--数据区域：用表格展示数据-->     
                <div id="data">            
                    <table id="datalist">
                        <tr>
                            <th class="th_select_all">
                                <input type="checkbox" onclick="selectAdmins(this);" />
                                <span>全选</span>
                            </th>
                            <th>管理员ID</th>
                            <th>姓名</th>
                            <th>登录名</th>
                            <th>电话</th>
                            <th>电子邮件</th>
                            <th>授权日期</th>
                            <th class="width100">拥有角色</th>
                            <th></th>
                        </tr>
                        <c:forEach items="${admins}" var="a">                     
                        <tr>
                            <td><input type="checkbox" name="check_admin" /></td>
                            <td>${a.admin_id}</td>
                            <td>${a.name}</td>
                            <td>${a.admin_code}</td>
                            <td>${a.telephone}</td>
                            <td>${a.email}</td>
                            <td><fmt:formatDate value="${a.enrolldate}" pattern="yyyy-MM-dd"/></td>
                            <td>
                                <a class="summary"  onmouseover="showDetail(true,this);" onmouseout="showDetail(false,this);">
                                	<c:forEach items="${a.roles}" var="r" varStatus="s">
                                		<c:choose>
                                			<c:when test="${s.first}">
                                				${r.name}
                                			</c:when>
                                			<c:when test="${s.index==1}">
                                						...
                                			</c:when>
                                		</c:choose>
                                	</c:forEach>
                                </a>
                                <!--浮动的详细信息-->
                                <div class="detail_info">
                                     <c:forEach items="${a.roles}" var="r" varStatus="s">
                                    	<c:choose>
                                    		<c:when test="${s.last}">
                                    			${r.name}
                                    		</c:when>
                                    		<c:otherwise>
                                    			${r.name}、
                                    		</c:otherwise>
                                    	</c:choose>
                                    </c:forEach>
                                </div>
                            </td>
                            <td class="td_modi">
                                <input type="button" value="修改" class="btn_modify" onclick="location.href='updateAdmin.form?id=${a.admin_id}';" />
                                <input type="button" value="删除" class="btn_delete" onclick="deleteAdmin();" />
                            </td>
                        </tr>
                        </c:forEach>
                    </table>
                </div>
                <!--分页-->
                <div id="pages">
                 <c:choose>
                 	<c:when test="${adminpage.page==1}">
                 		 <a href="#">上一页</a>
                 	</c:when>
                 	<c:otherwise>
                 		 <a href="findAdmin.form?page=${adminPage.page-1}">上一页</a>
                 	</c:otherwise>
                 </c:choose>
        	       
        	        <c:forEach begin="1" end="${adminPage.pageTotol}" var="a">
        	        	<c:choose>
        	        		<c:when test="${adminPage.page==a}">
        	        			<a href="findAdmin.form?page=${a}" class="current_page">${a}</a>
        	        		</c:when>
        	        		<c:otherwise>
        	        			<a href="findAdmin.form?page=${a}">${a}</a>
        	        		</c:otherwise>
        	        	</c:choose>
                 </c:forEach>
                 
                 	<c:choose>
                 		<c:when test="${adminPage.page==pageTotol}">
                 			<a href="#">下一页</a>
                 		</c:when>
                 		<c:otherwise>
                 			<a href="findAdmin.form?page=${adminPage.page+1}">下一页</a>
                 		</c:otherwise>
                 	</c:choose>
                    
                </div>                    
            </form>
        </div>
        <!--主要区域结束-->
        <div id="footer">
            <p>[源自北美的技术，最优秀的师资，最真实的企业环境，最适用的实战项目]</p>
            <p>版权所有(C)加拿大达内IT培训集团公司 </p>
        </div>
    </body>
</html>
