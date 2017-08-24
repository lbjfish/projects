<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
		<title>装备性能</title>
		<meta name="description" content="">
		<meta name="author" content="">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<!-- Basic Styles -->
		<link rel="stylesheet" type="text/css" media="screen" href="css/bootstrap.css">
		<link rel="stylesheet" type="text/css" media="screen" href="css/font-awesome.min.css">
		<!-- SmartAdmin Styles : Please note (smartadmin-production.css) was created using LESS variables -->
		<link rel="stylesheet" type="text/css" media="screen" href="css/smartadmin-production.css">
		<link rel="stylesheet" type="text/css" media="screen" href="css/smartadmin-skins.css">
		<link rel="stylesheet" type="text/css" media="screen" href="css/demo.css">
		<link rel="stylesheet" type="text/css" media="screen" href="css/ani-buttons.css">
		<link rel="stylesheet" type="text/css" media="screen" href="css/blue/global.css">
		<link rel="stylesheet" type="text/css" media="screen" href="css/blue/style.css">
		<!-- FAVICONS 
		<link rel="shortcut icon" href="img/favicon/favicon.ico" type="image/x-icon">
		<link rel="icon" href="img/favicon/favicon.ico" type="image/x-icon">-->
		<script src="js/jquery-1.9.1.min.js"></script>
		<script src="js/bootstrap/bootstrap.min.js"></script>
		<style>
			.am-btn-lg:hover {
				transform: scale(0.8);
			}
			table{
				font-size:16px;
				color: #7af5ff;
			}
			html{margin:0;padding:0;height:100%;overflow-x:hidden!important;background:url(images/blue/bg-blue.png)no-repeat no-repeat;
			background-size: 1010px 100%;

			body{
				background: no-repeat no-repeat;
				background-size: 1010px 100%;;
			}
		</style>

	</head>
		<div class="am-header">
			<div class="am-logo">
				<a href="">
					<img src="images/blue/logo.png" width="70px" height="70px" border="0" class="fa fa-spin ">
					<p>装备性能</p>
				</a>
			</div>
			<div class="am-top-nav" style="margin-top: 0px;float: left; width: 605px;margin-left: 64px;">
				<ul>
					<li class="active button--moema"><a>装备性能</a></li>
				</ul>
				
				<div class="toptime">
					<div id="amtopTime">
					</div>
					<div class="toptime-ico">
					</div>
				</div>
			</div>
		</div>
		<!-- BOOTSTRAP JS -->
		<div class="am-content">
			<div class="row">
				<div class="col-lg-3" style="margin-top: -20px;">
					<div class="border-polygon-450-700 height-3 pull-left"style="height:868px">
						<div class="am-box">
							<div class="am-box-title">
								<i class="fa   fa-sun-o"></i>
								<p>敌我装备</p>
							</div>
						</div>
						<div class="am-box-content ">
								<div class=" o-x p-l-20" style="">
									<div class="tree smart-form " >
									<c:forEach items="${zyList}" var="s" >
										<ul>
											<li>
												<span class="fl">
												<i class="fa fa-lg fa-minus-circle "  >
												</i> 
												</span>
												<i class="fa fa-lg fa-sitemap edit-i fl"></i>
												<div class="clearfix">${s.zymc}</div>
												<c:forEach items="${zbxhList}" var= "m">
												<c:if test="${s.zybh == m.zbxhzy }">
												   <ul>
														<li>
															 <span class="fl"><i class="fa fa-lg fa-minus-circle "></i> </span> 
															  <div class="clearfix" onclick="getMb('${m.zbxhnm}','${m.zbxhmc }')" id="zbval">${m.zbxhmc}</div>
														</li>
												  </ul>
												  </c:if>
												</c:forEach> 
											</li>
									   </ul>
									   </c:forEach>
									</div>
								</div>
						</div>
					</div>
				</div>
			</div>

			<div class="am-content">
				<div class="row">
					<div class="col-lg-9" style="top: -879px;left:450px; width:500px;">
						<div class="border-polygon-1800-900 height-2"style="height:300px">
							<div class="am-box">
								<div class="am-box-title">
									<i class="fa  fa-sitemap"></i>
									<p class="c_7af5ff">图片</p>
								</div>
								<div style=" text-align: center" id="zbtp">
								</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

	<style>
		body{
			background: no-repeat   no-repeat;
			width: 2000px;;
		}
	</style>
							<!--基本信息-->
	<div class="am-content">
		<div class="row">
			<div class="col-lg-9" style="top: -895px;left:469px; width:500px;">
				<div class="border-polygon-1800-900 height-2"style="height:530px">
					<div class="am-box">
						<div class="am-box-title">
							<i class="fa  fa-sitemap"></i>
							<p class="c_7af5ff">性能参数</p>
						</div>
						<div style=" text-align: center">
							<div class="src-bar" style="margin-top:13px; margin-left:-7px; height:459px;">
								<table class="am-table am-table-bordered am-table-striped am-table-hover"  style="width:446px ;text-align: center" >
									<tr id = "zbmc" width="450px">
										
									</tr>
									<tr id="trid">
										
									</tr>
									</table>
								</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

							<!--兵力信息-->

	<script src="build/dist/echarts.js"></script>
	<script src="js/divscroll.js"></script>
	<script src="js/jquery-awesomodals.min.js"></script>
	<script src="js/bootstrap-slider.js"></script>
	<script src="js/ui-choose.js"></script>
	<script src="js/layout.js"></script>
	<script type="text/javascript">
		function getMb(e,f){
			$.ajax({
			url:'<%=basePath%>pfgh_ZbxnAction!*findzbsx',
				type:'post',
				data:{zbxhnm:e},
				dataType:'json',
				async:false,
				success:function(data){
				var obj = data;
				$("#trid").empty();
				$("#zbmc").empty();
				var tr1 = "<td colspan='2'>"+f+"</td>";
				$("#zbmc").append(tr1);
				for(var i =0;i<obj.length;i++){
					if(obj[i].zbsxjldw == null){
						obj[i].zbsxjldw = "";
					}
					if(obj[i].zbsxz == null){
						obj[i].zbsxz = "";
					}
					var tr = "<tr ><td width='180px'>"+obj[i].zbsxmc+"</td><td width='270px'>"+obj[i].zbsxz+obj[i].zbsxjldw+"</td></tr>"; 
					$("#trid").append(tr);
				}
				$(function(){
					jQuery.getScript("js/layout.js");
				});
				
				}
			
			});
			$.ajax({
				url:'<%=basePath%>pfgh_ZbxnAction!*getImg',
				type:'post',
				data:{zbxhnm:e},
				dataType:'json',
				async:false,
				success:function(data){
					var obj1 = data;
					$("#zbtp").empty();
					if(obj1!==null){
						tr2 = "<img src='<%=basePath%>"+obj1.imgurl+ "'  style='width:350px;height:200px;margin:20px 10px 10px 10px' />";
						$("#zbtp").append(tr2);
					}
					$(function(){
						jQuery.getScript("js/layout.js");
					});
				}
			});
		}
	</script>
	<script type="text/javascript">
		$('.tree > ul').attr('role', 'tree').find('ul').attr('role', 'group');
		$('.tree').find('li:has(ul)').addClass('parent_li').attr('role', 'treeitem').find(' > span').parent('li.parent_li').find(' > ul > li').hide();
		$('.tree').find('li:has(ul)').addClass('parent_li').attr('role', 'treeitem').find(' > span').find(' > i').removeClass().addClass('fa fa-lg fa-plus-circle');
		$('.tree').find('li:has(ul)').addClass('parent_li').attr('role', 'treeitem').find(' > span').on('click', function(e) {
			var children = $(this).parent('li.parent_li').find(' > ul > li');
			
			if (children.is(':visible')) {
				 children.hide('fast'); 
				$(this).find(' > i').removeClass().addClass('fa fa-lg fa-plus-circle');
			} else {
				 children.show('fast'); 
				$(this).find(' > i').removeClass().addClass('fa fa-lg fa-minus-circle');
			}
			e.stopPropagation();
		});
		$(function(){
			$('#ascrail2001').show();
			$('#ascrail2005').css('z-index',1000010);
		});
	</script>

	</body>
</html>
