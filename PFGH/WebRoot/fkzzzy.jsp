<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
		<title>防空作战资源</title>
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
		
	</head>
	<body>
		<div class="am-header">
			<div class="am-logo">
				<a href="集成首页.html">
					<img src="images/blue/logo.png" width="70" height="70" border="0" class="fa fa-spin ">
					<p style="font-size:20px;">防空作战资源需求分析</p>
				</a>
			</div>
			<div class="am-top-nav">
				<ul>
					<li class="active button--moema"><a href="fkzzzy.jsp" style="color:#dadc37;">任务信息</a></li>
					<li class="active button--moema"><a href="fkzzfxAction!*index2">导弹需求</a></li>
					<li class="active button--moema"><a href="fkzzfxAction!*index">高炮需求</a></li>
					<li class="active button--moema"><a href="fkzzfxAction!*index3">雷达需求</a></li>
				</ul>
				
				<div class="toptime">
					<div id="amtopTime">
					</div>
					<div class="toptime-ico">
					</div>
				</div>
			</div>
		</div>
		<div class="am-content">
			<div class="row">
				<div class="col-lg-12">
					<div class=" border-polygon-lg height-2">
						<div class="am-box">
							<div class="am-box-title">
								<i class="fa fa-crosshairs"></i>
								<p>空袭兵器</p>
								<div class="am-btn-small pull-right " id="js">计算</div>
							</div>
							<div class="am-box-content ">
								<table class="am-table am-table-bordered am-table-striped am-table-hover ">
									<thead>
										<tr>
											<th width="3%" >序号</th>
											<th width="10%" >空袭兵器</th>
											<th width="10%">标准效能值</th>
											<th width="10%">数量</th>
											<th width="10%">折算成标准空袭兵器</th>
										</tr>
									</thead>
								</table>
								<div class="src-bar" tabindex="5000" style="overflow: hidden; outline: none;">
									<table class="am-table am-table-bordered am-table-striped">
										<tbody id="tbody">
											<c:forEach items="${taskinfos}" var="t" varStatus="c">
												<tr>
													<td width="3%">${c.index+1}</td>
													<td width="10%">${t.KXBQMC}</td>
													<td width="10%">${t.BZXNZS}</td>
													<td width="10%">${t.SL}</td>
													<td width="10%"></td>
												</tr>
											</c:forEach>
											<tr>
												<td width="3%">合计</td>
												<td width="10%"></td>
												<td width="10%"></td>
												<td width="10%"></td>
												<td class="bc_blue_20" width="10%"></td>
											</tr>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-4">
					<div class="border-square height-2">
						<div class="am-box">
							<div class="am-box-title">
								<i class="fa  fa-sitemap"></i>
								<p>标准空袭兵器</p>
								<div class="am-title-notice pull-right">
								<i class="fa fa-flag"></i>F-16战斗机
								</div>
							</div>
							<div class="am-box-content p-t-20">
								<div class="row">
									<div class="col-lg-12 t-center">
										<img src="images/F-16_1.jpg" alt="" style="height:353px;">
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-8">
					<div class="border-polygon-lg height-2">
						<div class="am-box">
							<div class="am-box-title">
								<i class="fa  fa-sitemap"></i>
								<p>任务信息</p>
								<div class="am-btn-small pull-right " id="bc">保存</div>
							</div>
							<div class="am-box-content p-t-20">
								
								<div class="row">
									<div class="col-lg-6">
										<div class="">
											<table class="am-table am-table-bordered">
												<tbody>
													<tr>
														<td class="t-center bc_blue_10 " width="162">
															抗击率 
														</td>
														<td class="showTips table-Show-slider" style="height:172px !important">
															<div class="progress">
																<div id="bar1" class="progress-bar " aria-valuetransitiongoal="100" aria-valuenow="60">60</div>
															</div>
															<div class="slider-box tips" style="display:none;">
																<input type="text" class="slider-num-4 slider-success" value="" 
															data-slider-min="1" 
															data-slider-max="100"  
															data-slider-value="60" 
															data-slider-selection = "before"
															data-slider-handle="squar">
															</div>
														</td>
													</tr>
												</tbody>
											</table>
										</div>
										<div class=" m-t-20">
											<table class="am-table am-table-bordered">
												<tbody>
													<tr>
														<td class="t-center bc_blue_10 " width="162">
															侦察区域面积 
														</td>
														<td style="height:172px !important">
															<div class="circle-input m-t-10 m-b-10 ">
																<input id="bar2" type="text" value="80000" class="t-center" >
															</div>
														</td>
														<td width="100" class="t-center">
															平方公里
														</td>
													</tr>
												</tbody>
											</table>
										</div>
									</div>
									<div class="col-lg-6">
										<div class=" tab-box-2 m-b-10" style="width:100%;height:auto; ">
											<div class="tab-box-title-2">
												<a class="active " style="margin-right:10px">任务分配</a>
											</div>
											<div class="tab-box-content-2 p-t-10" style="height:auto;color:#FFFFFF;">
												<div class="m-b-10">
													<table class="am-table am-table-bordered">
														<tbody>
															<tr style="height:146px;">
																<td class="t-center bc_blue_10" width="137">
																	地空导弹
																</td>
																<td width="" class="showTips table-Show-slider">
																	<div class="progress">
																		<div id="bar3" class="progress-bar " aria-valuetransitiongoal="100" aria-valuenow="80">80</div>
																	</div>
																	<div class="slider-box tips" style="display:none;">
																		<input type="text" class="slider-num-3 slider-success" value="" 
																	data-slider-min="1" 
																	data-slider-max="100"  
																	data-slider-value="80" 
																	data-slider-selection = "before"
																	data-slider-handle="squar">
																	</div>
																</td>
															</tr>
															
														</tbody>
													</table>
												</div>
												<div class="m-b-10">
													<table class="am-table am-table-bordered">
														<tbody>
															<tr style="height:146px;">
																<td class="t-center bc_blue_10" width="137">
																	高炮
																</td>
																<td width="" >
																	<div class="progress">
																		<div class="progress-bar bg-color-green " aria-valuetransitiongoal="100" aria-valuenow="20" style="width:20%"
																		id="highPao"
																		></div>
																	</div>
																	
																</td>
															</tr>
															
														</tbody>
													</table>
												</div>
												<!-- end -->
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
	
			</div>
			
			
		</div>

		<script src="build/dist/echarts.js"></script>
		<script src="js/divscroll.js"></script>
		<script src="js/jquery-awesomodals.min.js"></script>
		<script src="js/bootstrap-slider.js"></script>
		<script src="js/ui-choose.js"></script>
		<script src="js/layout.js"></script>
		<script type="text/javascript">
			function circleDom7(){
				require.config({
					paths: {
						echarts: 'build/dist'
					}
				});
				// 使用
				require(
						[
							'echarts',
							'echarts/chart/pie' // 使用柱状图就加载bar模块，按需加载在resource中
						],
						function (ec) {
							// 基于准备好的dom，初始化echarts图表
							var myChart = ec.init(document.getElementById('circleDom7'));
							option = {
								title : {
									text: '',
									subtext: '',
									x:'center'
								},
								tooltip : {
									trigger: 'item',
									formatter: "{a} <br/>{b} : {c} ({d}%)"
								},
								legend: {
									orient : 'vertical',
									x : '',
									data:[]
								},
										restore : {show: true},
										saveAsImage : {show: true},
								calculable:false,
								series : [
									{
										type:'pie',
										radius : '70%',
										center: ['50%', '45%'],
										data:[
											{value:10, name:'基本需求量'},
											{value:3, name:'需求加强量'},
											{value:5, name:'冗余量'}
										]
									}
								]
							};
							// 为echarts对象加载数据
							myChart.setOption(option);
						}
				);
			}
			circleDom7();
			function circleDom(tabName,idName,valueDate){
				require.config({
					paths: {
						echarts: 'build/dist'
					}
				});
				// 使用
				require(
					[
						'echarts',
						'echarts/chart/pie' // 使用柱状图就加载bar模块，按需加载在resource中
					],
					function (ec) {
						// 基于准备好的dom，初始化echarts图表
						var myChart = ec.init(document.getElementById(idName)); 
						
						var labelTop = {
							normal : {
								label : {
									show : true,
									position : 'center',
									formatter : '{b}',
									textStyle: {
										baseline : 'bottom'
									}
								},
								labelLine : {
									show : false
								}
							}
						};
						var labelFromatter = {
							normal : {
								label : {
									formatter : function (params){
										return (100 - params.value).toFixed(2)+ '%'
									},
									textStyle: {
										baseline : 'middle',
										fontSize:20,
										fontFamily:'黑体',
									},
								},
								color:'rgba(122,245,255,.8)'
							}
						}
						var labelBottom = {
							normal : {
								color: 'rgba(255,255,255,.4)',
								label : {
									show : true,
									position : 'center'
								},
								labelLine : {
									show : false
								}
							},
							emphasis: {
								color: 'rgba(0,0,0,0)'
							}
						};
						var radius = [54, 46];
						option = {
							legend: {
								show : false,
								x : 'center',
								y : '80%',
								data:[
									tabName
								],
								textStyle:{
									color: '#eee',
									fontSize:25,
									fontFamily:'黑体',
									padding:5
									//fontWeight:100
								},
								itemGap:80
							},
							title : false,
							toolbox: false,
							series : [
								{
									type : 'pie',
									center : ['50%', '50%'],
									radius : radius,
									x: '0%', // for funnel
									itemStyle : labelFromatter,
									data : [
										{name:'其他', value:(100-valueDate), itemStyle : labelBottom},
										{name:'', value:valueDate,itemStyle : labelTop}
									]
								}
							]
						};
											
						// 为echarts对象加载数据 
						myChart.setOption(option); 
					}
				);
			}
			circleDom('计划时间内实际夺占地区比例','circleDom_2_1',60); //第2方案
			
			$(function(){
				$("#js").on("click",function(){
					var len = $("#tbody").find("tr").length-1;
					var td4Count = 0;
					for(var i=0;i<len;i++){
						var td2 = $("#tbody").find("tr").eq(i).find("td").eq(2).html();
						var td3 = $("#tbody").find("tr").eq(i).find("td").eq(3).html();
						var td4 = Number((td2*td3).toFixed(3));
						td4Count = td4Count + td4;
						$("#tbody").find("tr").eq(i).find("td").eq(4).html(td4);
					}
					$("#tbody").find("tr").last().find("td").eq(4).html(td4Count);
				});
				
				$("#bc").on("click",function(){
					var kxgm = Number($("#tbody").find("tr").last().find("td").eq(4).html());
					var kjv = Number($("#bar1").html());
					var zcqymj = Number($("#bar2").val());
					var dk = Number($("#bar3").html());
					var gp = Number($("#highPao").html());
					var pzcsJson = [{"csbh":"5","csz":kxgm},{"csbh":"6","csz":kjv},{"csbh":"21","csz":zcqymj},{"csbh":"8","csz":dk},{"csbh":"7","csz":gp}];
					console.log(pzcsJson.length);
					for(var i=0;i<pzcsJson.length;i++){
						$.ajax({
							url:'fkzzfxAction!*updatePzcs',
							type:'post',
							dataType:'json',
							data : {"csz":pzcsJson[i].csz,"csbh":pzcsJson[i].csbh},
							async:true
						});
					}
					alert("保存成功！");
				});
			});
		</script>
	</body>
</html>

