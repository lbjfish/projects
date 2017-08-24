<%@page pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>达内－NetCTOSS</title>
        <link type="text/css" rel="stylesheet" media="all" href="../styles/global.css" />
        <link type="text/css" rel="stylesheet" media="all" href="../styles/global_color.css" />
        <script language="javascript" type="text/javascript" src="../js/jquery-1.11.1.js"></script> 
        <script language="javascript" type="text/javascript">
            //保存成功的提示信息
            function showResult() {
                showResultDiv(true);
                window.setTimeout("showResultDiv(false);", 3000);
            }
            function showResultDiv(flag) {
                var divResult = document.getElementById("save_result_info");
                if (flag)
                    divResult.style.display = "block";
                else
                    divResult.style.display = "none";
            }

     
            function search_account(){
            	$("#account_id").val("");
            	$("#login_user_msg").val("");
            	var idcard_no = $("#idcard_no").val();
            	if(idcard_no==null||idcard_no==""){
            		$("#idcard_no_msg").text("身份证不能为空").addClass("error_msg");
            		return;
            	}
            	var reg = /^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{4}$/;
            	if(!reg.test(idcard_no)){
            		$("#idcard_no_msg").text("身份证格式不对").addClass("error_msg");
            		return;
            	}
            	
            	$.ajax({
            		'url':'findIdcardNo.form',
            		'type':'post',
            		'data':{'idcardNo':idcard_no},
            		'dataType':'json',
            		'async':true,
            		'success':function(data){
            			if(data==''){
            				$("#idcard_no_msg").text("该身份证不存在帐务帐号").addClass("error_msg");
            				return;
            		} else{
            			$("#idcard_no_msg").text("验证成功").removeClass("error_msg");
            			$("#account_id").val(data.ACCOUNT_ID);
            			$("#login_user_msg").val(data.LOGIN_NAME);
            			}
            		}
            	});
            }
            
            function check_pwd(){
            	var pwd = $("#pwd").val();
            	if(pwd==null||pwd==""){
            		$("#pwd_msg").text("密码不能为空").addClass("error_msg");
            		return;
            	}
            	var reg = /^[a-zA-Z]\w{5,17}$/;
            	if(!reg.test(pwd)){
            		$("#pwd_msg").text("密码格式不对").addClass("error_msg");
            		return;
            	}
            	$("#pwd_msg").text("密码正确").removeClass("error_msg");
            	return pwd;
             }
             
             function check_pwd2(){
         	   var pwd2 = $("#pwd2").val();
            	var pwds = check_pwd();
            	if(pwd2!=pwds){
            		$("#pwd_msg2").text("密码不一至").addClass("error_msg");
            		return;
            	}
            	$("#pwd_msg2").text("密码一致").removeClass("error_msg");
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
                <li><a href="../role/role_list.html" class="role_off"></a></li>
                <li><a href="../admin/admin_list.html" class="admin_off"></a></li>
                <li><a href="../fee/fee_list.html" class="fee_off"></a></li>
                <li><a href="../account/account_list.html" class="account_off"></a></li>
                <li><a href="../service/findService.form" class="service_on"></a></li>
                <li><a href="../bill/bill_list.html" class="bill_off"></a></li>
                <li><a href="../report/report_list.html" class="report_off"></a></li>
                <li><a href="../user/user_info.html" class="information_off"></a></li>
                <li><a href="../user/user_modi_pwd.html" class="password_off"></a></li>
            </ul>
        </div>
        <!--导航区域结束-->
        <!--主要区域开始-->
        <div id="main">
            <!--保存操作的提示信息-->
            <div id="save_result_info" class="save_fail">保存失败！192.168.0.23服务器上已经开通过 OS 账号 “mary”。</div>
            <form action="" method="" class="main_form">
                <!--内容项-->
                <div class="text_info clearfix"><span>身份证：</span></div>
                <div class="input_info">
                    <input type="text" id="idcard_no" class="width180" />
                    <input type="hidden" id="account_id" name="account_id" />
                    <input type="button" class="btn_search_large" value="查询帐务帐号" onclick="search_account();" />
                    <span class="required">*</span>
                    <div class="validate_msg_short" id="idcard_no_msg"></div>
                </div>
                <div class="text_info clearfix"><span>账务账号：</span></div>
                <div class="input_info">
                    <input type="text" id="login_user_msg" readonly="readonly" class="readonly"/>
                    <span class="required">*</span>
                    <div class="validate_msg_long" ></div>
                </div>
                <div class="text_info clearfix"><span>资费类型：</span></div>
                <div class="input_info">
                    <select name="cost_id">
                    	<c:forEach items="${costs}" var="c">
                     	<option value="${c.cost_id}" <c:if test="${c.cost_id==service.cost_id}"></c:if>>${c.name}</option>
                    	</c:forEach>
                    </select>                        
                </div> 
                <div class="text_info clearfix"><span>服务器 IP：</span></div>
                <div class="input_info">
                    <input type="text" value="192.168.0.23"  />
                    <span class="required">*</span>
                    <div class="validate_msg_long">15 长度，符合IP的地址规范</div>
                </div>                   
                <div class="text_info clearfix"><span>登录 OS 账号：</span></div>
                <div class="input_info">
                    <input type="text"   />
                    <span class="required">*</span>
                    <div class="validate_msg_long">8长度以内的字母、数字和下划线的组合</div>
                </div>
                <div class="text_info clearfix"><span>密码：</span></div>
                <div class="input_info">
                    <input type="password" id="pwd" onblur="check_pwd();"/>
                    <span class="required">*</span>
                    <div class="validate_msg_long" id="pwd_msg">30长度以内的字母、数字和下划线的组合</div>
                </div>
                <div class="text_info clearfix"><span>重复密码：</span></div>
                <div class="input_info">
                    <input type="password" id="pwd2" onblur="check_pwd2();" />
                    <span class="required">*</span>
                    <div class="validate_msg_long" id="pwd_msg2">两次密码必须相同</div>
                </div>     
                <!--操作按钮-->
                <div class="button_info clearfix">
                    <input type="button" value="保存" class="btn_save" onclick="showResult();" />
                    <input type="button" value="取消" class="btn_save" />
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
