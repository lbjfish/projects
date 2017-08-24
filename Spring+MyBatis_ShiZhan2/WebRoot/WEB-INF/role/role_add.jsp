<%@page pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>达内－NetCTOSS</title>
        <link type="text/css" rel="stylesheet" media="all" href="../styles/global.css" />
        <script language="javascript" type="text/javascript" src="../js/jquery-1.11.1.js"></script>
        <link type="text/css" rel="stylesheet" media="all" href="../styles/global_color.css" />
        <script language="javascript" type="text/javascript">
             
            function check_rolename(){
            	var rolename = $("#rolename").val();
            	if(rolename==""){
            		$("#name_msg").text("角色名不能为空").addClass("error_msg");
            		return false;
            	}            	
            	var reg = /^[\u4E00-\u9FA5A-Za-z0-9]+$/;
            	if(!reg.test(rolename)){
            		$("#name_msg").text("角色名格式不对").addClass("error_msg");
            		return false;
            	}
            	var bol = false;
					$.ajax({
						'url':'checkName.form',
						'type':'post',
						'data':{'name':rolename},
						'dataType':'json',
						'async':false,
						'success':function(data){					
							if(data.msg=="n"){
								$("#name_msg").text("该角色名已被注册").addClass("error_msg");
								bol=false;
								
							} else {
								$("#name_msg").text("注册成功").removeClass("error_msg");
								//return true;
								bol=true;
							}
						}
					});       
					return bol;
            }
            
            function check_checkbox(){        		
            	var checkObjs = $(":checkbox[name='moduleIds']:checked");
            	if(checkObjs.length==0){
            		$("#box_msg").text("至少选择一个权限").addClass("error_msg");
            		return false;
            	}else{
            		$("#box_msg").text("").removeClass("error_msg");  
            		return true;
            	}
            }
          function add(){
          	if(check_rolename()==true && check_checkbox()==true){
          		document.getElementById("check_msg").disabled=false;
          		document.forms[0].submit(); 
          	 }
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
            <ul id="menu">
                <li><a href="../index.html" class="index_off"></a></li>
                <li><a href="../role/role_list.html" class="role_on"></a></li>
                <li><a href="../admin/admin_list.html" class="admin_off"></a></li>
                <li><a href="../fee/fee_list.html" class="fee_off"></a></li>
                <li><a href="../account/account_list.html" class="account_off"></a></li>
                <li><a href="../service/service_list.html" class="service_off"></a></li>
                <li><a href="../bill/bill_list.html" class="bill_off"></a></li>
                <li><a href="../report/report_list.html" class="report_off"></a></li>
                <li><a href="../user/user_info.html" class="information_off"></a></li>
                <li><a href="../user/user_modi_pwd.html" class="password_off"></a></li>
            </ul>
        </div>
        <!--导航区域结束-->
        <!--主要区域开始-->
        <div id="main">            
            <!--保存操作后的提示信息：成功或者失败-->
            <div id="save_result_info" class="save_success">保存成功！</div><!--保存失败，角色名称重复！-->
            <form action="addModule2.form" method="post" class="main_form">
                <div class="text_info clearfix"><span>角色名称：</span></div>
                <div class="input_info">
                    <input type="text" class="width200"  name="name" id="rolename" onblur="check_rolename();"/>
                    <span class="required">*</span>
                    <div class="validate_msg_medium" id="name_msg"></div>
                </div>                    
                <div class="text_info clearfix"><span>设置权限：</span></div>
                <div class="input_info_high">
                    <div class="input_info_scroll">
                        <ul>
                        <c:forEach items="${modules}" var="m">
                            <li><input type="checkbox" value="${m.module_id}" name="moduleIds" onclick="check_checkbox();"/>${m.name}</li>
                        </c:forEach>
                        </ul>
                    </div>
                    <span class="required">*</span>
                    <div class="validate_msg_tiny" id="box_msg"></div>
                </div>
                <div class="button_info clearfix">
                    <input type="button" value="保存" class="btn_save" id="check_msg" onclick="add();" />
                    <input type="button" value="取消" class="btn_save" onclick="history.back()"/>
                </div>
            </form>
        </div>
        <!--主要区域结束-->
        <div id="footer">
            <span>[源自北美的技术，最优秀的师资，最真实的企业环境，最适用的实战项目]</span>
            <br />
            <span>版权所有(C)加拿大达内IT培训集团公司 </span>
        </div>
    </body>
</html>
