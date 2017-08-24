<%@page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>regist</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="css/style.css" />
		<script type="text/javascript" src="js/my.js"></script>
		<script type="text/javascript" src="js/prototype-1.6.0.3.js"></script>
		<script type="text/javascript">
			function check_uname(){
			//检查用户名是否为空
				$('uname_msg').innerHTML = '';    //每次做检查之前先清空错误提示
				if($F('uname').strip().length == 0){
					/*
						用户名有没有填写,如果
					    没有填写，则返回false(
					    即不能提交表单)
					*/
					$('uname_msg').innerHTML = '用户名不能为空';
					$('agreeBtn').disabled=true;
					return false;
				}
				var flag = false;
				//step1,获得ajax对象
				var xhr = getXhr();
				var uri = 'check_uname.do?uname='+$F('uname')
				//step2,使用ajax对象发请求
				xhr.open('get',encodeURI(uri),false);
				xhr.onreadystatechange=function(){
					if(xhr.readyState == 4){
						if(xhr.status==200){
							//step4,处理服务器返回的数据
							var txt = xhr.responseText;
							//innerHTML: 读取或者修改节点的
						   //html内容。
						   if(txt == '可以使用'){
								$('uname_msg').innerHTML = '可以使用';
								$('agreeBtn').disabled=false;
								flag = true;
							}else{
								$('uname_msg').innerHTML = '用户名已存在';
								$('agreeBtn').disabled=true;
								flag = false;
							}
						}else{
							$('uname_msg').innerHTML = '检查出错';
						}
					}
				};
				xhr.send(null);
				return flag;
			}
			
			
		</script>
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
						注册
					</h1>
					<form action="regist.do" method="post" onsubmit="return check_uname();">
						<table cellpadding="0" cellspacing="0" border="0" class="form_table">
							<tr>
								<td valign="middle" align="right">
									用户名:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="username" id="uname" onblur="check_uname()"/>
									<span class="tips" id="uname_msg"></span>
									
									 <!-- <span style="color:red;font-weight:bold;font-size:15px">${user_error}</span>
									
									 <span style="color:red;font-weight:bold;font-size:15px">${username_error}</span> -->
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									真实姓名:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="name" />
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									密码:
								</td>
								<td valign="middle" align="left">
									<input type="password" class="inputgri" name="pwd" />
									<span style="color:red;font-weight:bold;font-size:15px">${pwd_error}</span>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									性别:
								</td>
								<td valign="middle" align="left">
									男
									<input type="radio" class="inputgri" name="gender" value="m" checked="checked"/>
									女
									<input type="radio" class="inputgri" name="gender" value="f"/>
								</td>
							</tr>
							
							<tr>
								<td valign="middle" align="right">
									验证码:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="number" />
									<img id="num" border="1" src="CheckCodeServlet" />
									<a href="javascript:;" onclick="document.getElementById('num').src = 'CheckCodeServlet?'+(new Date()).getTime()">看不清,换一张</a>
								
									 &nbsp;&nbsp;&nbsp;&nbsp;<span style="color:red;font-weight:bold;font-size:15px">${number_error}</span>
								</td>
							</tr>
						</table>
						<p>
							<input type="submit" id="agreeBtn" class="button" value="注册 &raquo;"   />
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
