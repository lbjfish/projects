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
           	function check_login(){
           		var reg = /^[a-z0-9]{1,30}$/;
           		
           		var admin_code = $("#admin_code").val();
           		var password = $("#password").val();
           	

           		if(!reg.test(admin_code)){
           			$("#login_msg").text("用户名格式不对");
           			return;
           		}
           		if(!reg.test(password)){
           			$("#pwd_msg").text("密码格式不对");
           			return;
           		}
           		
           	
           		//校验账号密码是否正确
				//使用serialize()方法序列化表单数据
           		$.ajax({
           			'url':'checkLogin.form',
           			'type':'post',
           			'data':$('#login_form').serialize(),
           			'dataType':'json',
           			'async':true,
           			'success':function(data){
           				if(data==1){
           					$("#login_msg").text("用户名不存在");
           				} else if(data==2){
           					$("#pwd_msg").text("密码错误");
           				} else{
           					location.href="toIndex.form";
           				}
           			}
           		});
           	}	
           	
           	function reset_msg(id,msg){
           			$("#"+id).text(msg)
           		}
           		
           	
        </script> 
    </head>
    <body class="index">
        <div class="login_box">
        	 <form action="checkLogin.form" method="post" id="login_form">
            <table>
                <tr>
                    <td class="login_info">账号：</td>
                    <td colspan="2"><input name="adminCode" id="admin_code" type="text" class="width150" onfocus="reset_msg('login_msg','输入30个字符')"/></td>
                    <td class="login_error_info"><span class="required" id="login_msg">30长度的字母、数字和下划线</span></td>
                </tr>
                <tr>
                    <td class="login_info">密码：</td>
                    <td colspan="2"><input name="password" id="password" type="password" class="width150" onfocus="reset_msg('pwd_msg','输入30个字符')"/></td>
                    <td><span class="required" id="pwd_msg">30长度的字母、数字和下划线</span></td>
                </tr>
                <tr>
                    <td class="login_info">验证码：</td>
                    <td class="width70"><input name="" type="text" class="width70" /></td>
                    <td><img src="" alt="验证码" title="点击更换"   /></td>  
                    <td><span class="required" id="code_msg"></span></td>              
                </tr>            
                <tr>
                    <td></td>
                    <td class="login_button" colspan="2">
                        <a href="javascript:check_login();"><img src="../images/login_btn.png" /></a>
                    </td>    
                    <td><span class="required"></span></td>                
                </tr>
            </table>
            </form>
        </div>
    </body>
</html>