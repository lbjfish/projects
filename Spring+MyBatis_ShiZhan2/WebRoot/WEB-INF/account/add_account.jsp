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
            //校验身份证号
            function check_idcardno() {
            	//重置生日
            	$("#birthdate").val("");
            	
            	//取得身份证号
            	var idcard_no = $("#idcard_no").val();
            	//校验身份证号是否为空
            	if(idcard_no == "") {
            		$("#idcard_no_msg").text("身份证号不能为空.").addClass("error_msg");
            		return;
            	}
            	//校验身份证格式
            	var reg = /^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{4}$/;
            	if(!reg.test(idcard_no)) {
            		$("#idcard_no_msg").text("身份证号格式不对.").addClass("error_msg");
            		return;
            	}
            	//身份证验证通过，给予正确提示，并移除错误样式
            	$("#idcard_no_msg").text("身份证号有效.").removeClass("error_msg");
            	//从身份证中截取出生日
            	//123456 19910203 1234 --> 1991-02-03
            	var year = idcard_no.substring(6,10);
            	var month = idcard_no.substring(10,12);
            	var day = idcard_no.substring(12,14);
            	var birth = year + "-" + month + "-" + day;
            	$("#birthdate").val(birth);
            }
            
            function check_name(){
            	var youname = $("#youname").val();
            	var reg = /^[\u4E00-\u9FA5A-Za-z0-9]{2,20}$/;
            	//检验姓名是否为空
            	if(youname == ""){
            		$("#youname_msg").text("姓名不能为空").addClass("error_msg");
            		return;
            	}else if(youname.length>20){
            		$("#youname_msg").text("20长度以内的汉字、字母和数字的组合").addClass("error_msg");
            		return;
            	}else if(!reg.test(youname)){
            		$("#youname_msg").text("姓名格式不对").addClass("error_msg");
            		return;
            	}
            	$("#youname_msg").text("姓名正确").removeClass("error_msg");
            }
            
            function check_username(){
            	var username = $("#username").val();
            	var reg = /^\w+$/;
            	//检验姓名是否为空
            	if(username == ""){
            		$("#username_msg").text("用户名不能为空").addClass("error_msg");
            		return;
            	}else if(username.length>30){
            		$("#username_msg").text("30长度以内的字母、数字和下划线的组合").addClass("error_msg");
            		return;
            	}else if(!reg.test(username)){
            		$("#username_msg").text("用户名格式不对").addClass("error_msg");
            		return;
            	}
            	$("#username_msg").text("用户名正确").removeClass("error_msg");
            }
            
            function check_phone(){
         	   var phone = $("#phone").val();
            	var reg = /^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\d{8}$|\d{3}-\d{8}|\d{4}-\d{7}$/
            	if(phone == ""){
            		$("#phone_msg").text("电话不能为空").addClass("error_msg");
            		return;
            	}else if(!reg.test(phone)){
            		$("#phone_msg").text("电话格式不对").addClass("error_msg");
            		return;
            	}
            	$("#phone_msg").text("电话正确").removeClass("error_msg");
            }
            
            function check_pwd(){
         	   var pwd = $("#pwd").val();
            	var reg = /^[a-zA-Z]\w{5,17}$/;
            	if(pwd == ""){
            		$("#pwd_msg").text("密码不能为空").addClass("error_msg");
            		return;
            	}else if(!reg.test(pwd)){
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

            //显示选填的信息项
            function showOptionalInfo(imgObj) {
                var div = document.getElementById("optionalInfo");
                if (div.className == "hide") {
                    div.className = "show";
                    imgObj.src = "../images/hide.png";
                }
                else {
                    div.className = "hide";
                    imgObj.src = "../images/show.png";
                }
            }
            
            function recommend_method(){
            	$("#acc_msg").val("");
            	var recommend_no = $("#recommend_no").val();
            
            	if(recommend_no==""){
            		return;
            	}
            	var reg = /^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{4}$/;
            	if(!reg.test(recommend_no)){
            		$("#recommend_msg").text("推荐人身份证格式不对").addClass("error_msg");
            		return;
            	}
           // alert("00");
            	$.ajax({
            		'url':'recommender.form',
            		'type':'post',
            		'data':{'idcardNo':recommend_no},
            		'dataType':'json',
            		'async':true,
            		'success':function(data){
            			if(data==null || data==""){
            				$("#recommend_msg").text("不存在该推荐人身份证号").addClass("error_msg");
            				return;
            		} else{
            			$("#recommend_msg").text("验证成功").removeClass("error_msg");
            			$("#acc_msg").val(data.ACCOUNT_ID);
            			}
            		}
            	});
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
                <li><a href="../account/account_list.html" class="account_on"></a></li>
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
            <!--保存成功或者失败的提示消息-->     
            <div id="save_result_info" class="save_fail">保存失败，该身份证已经开通过账务账号！</div>
            <form action="" method="" class="main_form">
                <!--必填项-->
                <div class="text_info clearfix"><span>姓名：</span></div>
                <div class="input_info">
                    <input type="text" id="youname" onblur="check_name();"/>
                    <span class="required">*</span>
                    <div class="validate_msg_long" id="youname_msg">20长度以内的汉字、字母和数字的组合</div>
                </div>
                <div class="text_info clearfix"><span>身份证：</span></div>
                <div class="input_info">
                    <input type="text" id="idcard_no" onblur="check_idcardno();"/>
                    <span class="required">*</span>
                    <div class="validate_msg_long" id="idcard_no_msg">正确的身份证号码格式</div>
                </div>
                <div class="text_info clearfix"><span>登录账号：</span></div>
                <div class="input_info">
                    <input type="text" id="username" onblur="check_username();" />
                    <span class="required">*</span>
                    <div class="validate_msg_long" id="username_msg">30长度以内的字母、数字和下划线的组合</div>
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
                <div class="text_info clearfix"><span>电话：</span></div>
                <div class="input_info">
                    <input type="text" class="width200" id="phone" onblur="check_phone();"/>
                    <span class="required">*</span>
                    <div class="validate_msg_medium" id="phone_msg">正确的电话号码格式：手机或固话</div>
                </div>                
                <!--可选项-->
                <div class="text_info clearfix"><span>可选项：</span></div>
                <div class="input_info">
                    <img src="../images/show.png" alt="展开" onclick="showOptionalInfo(this);" />
                </div>
                <div id="optionalInfo" class="hide">
                    <div class="text_info clearfix"><span>推荐人身份证号码：</span></div>
                    <div class="input_info">
                        <input type="text" id="recommend_no" onblur="recommend_method();" />
                        <input type="hidden" id="acc_msg" name="recommender_id" />
                        <div class="validate_msg_long" id="recommend_msg"></div>
                    </div>
                    <div class="text_info clearfix"><span>生日：</span></div>
                    <div class="input_info">
                        <input type="text" readonly class="readonly" id="birthdate"/>
                    </div>
                    <div class="text_info clearfix"><span>Email：</span></div>
                    <div class="input_info">
                        <input type="text" class="width350"/>
                        <div class="validate_msg_tiny">50长度以内，合法的 Email 格式</div>
                    </div> 
                    <div class="text_info clearfix"><span>职业：</span></div>
                    <div class="input_info">
                        <select>
                            <option>干部</option>
                            <option>学生</option>
                            <option>技术人员</option>
                            <option>其他</option>
                        </select>                        
                    </div>
                    <div class="text_info clearfix"><span>性别：</span></div>
                    <div class="input_info fee_type">
                        <input type="radio" name="radSex" checked="checked" id="female" />
                        <label for="female">女</label>
                        <input type="radio" name="radSex" id="male" />
                        <label for="male">男</label>
                    </div> 
                    <div class="text_info clearfix"><span>通信地址：</span></div>
                    <div class="input_info">
                        <input type="text" class="width350"/>
                        <div class="validate_msg_tiny">50长度以内</div>
                    </div> 
                    <div class="text_info clearfix"><span>邮编：</span></div>
                    <div class="input_info">
                        <input type="text"/>
                        <div class="validate_msg_long">6位数字</div>
                    </div> 
                    <div class="text_info clearfix"><span>QQ：</span></div>
                    <div class="input_info">
                        <input type="text"/>
                        <div class="validate_msg_long">5到13位数字</div>
                    </div>                
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