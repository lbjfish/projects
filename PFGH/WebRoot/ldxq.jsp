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
		<title>侦察预警单元需求量</title>
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
					<li class="active button--moema"><a href="fkzzfxAction!*index0" >任务信息</a></li>
					<li class="active button--moema"><a href="fkzzfxAction!*index2" >导弹需求</a></li>
					<li class="active button--moema"><a href="fkzzfxAction!*index" >高炮需求</a></li>
					<li class="active button--moema"><a href="fkzzfxAction!*index3" style="color:#dadc37;">雷达需求</a></li>
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
				<div class="col-lg-4">
					<div class="border-square height-2">
						<div class="am-box">
							<div class="am-box-title">
								<i class="fa  fa-sitemap"></i>
								<p>侦察预警任务信息</p>
								
							</div>
							<div class="am-box-content p-t-20">
								<table class="am-table am-table-bordered am-table-striped  ">
									<tbody>
										<tr>
											<td class="t-center bc_blue_10" width="162">
												侦察预警区域面积 
											</td>
											<td style="height:60px !important">
												<div class="circle-input m-t-10 m-b-10 bc_blue_20">
													<input type="text" value="" class="t-center" disabled id="zcyjqymj">
												</div>
											</td>
											<td width="100" class="t-center" style="height:60px !important; ">
												平方公里
											</td>
										</tr>
									</tbody>
								</table>
								<div class="row m-t-20">
									<div class="col-lg-6">
										<table class="am-table am-table-bordered">
											<tbody>
												<tr>
													<td class="t-center bc_blue_10 " width="162" style="height:61px !important">
														加强侦察方向个数 
													</td>
												</tr>
												<tr>
													<td style="height:60px !important">
														<div class="circle-input m-t-10 m-b-10 bc_blue_20">
															<input type="text" value="2" class="t-center" disabled id="jqzcfxgs">
														</div>
													</td>
												</tr>
											</tbody>
										</table>
									</div>
									<div class="col-lg-6">
										<table class="am-table am-table-bordered">
											<tbody>
												<tr>
													<td class="t-center bc_blue_10" width="162" style="height:61px !important">
														允许战损率 
													</td>
												</tr>
												<tr>
													<td style="height:60px !important">
														<div class="circle-input m-t-10 m-b-10">
															<input type="text" value="0.1" class="t-center" id="yxzsl">
														</div>
													</td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
								<div class="row m-t-20">
									<div class="col-lg-6">
										<table class="am-table am-table-bordered ">
											<tbody>
												<tr>
													<td class="t-center bc_blue_10" width="162" style="height:61px !important">
														要求发现目标概率 
													</td>
												</tr>
												<tr>
													<td style="height:60px !important">
														<div class="circle-input m-t-10 m-b-10">
															<input type="text" value="0.75" class="t-center" id="yqfxmbgl">
														</div>
													</td>
												</tr>
											</tbody>
										</table>
									</div>
									<div class="col-lg-6">
										<table class="am-table am-table-bordered">
											<tbody>
												<tr>
													<td class="t-center bc_blue_10" width="162" style="height:61px !important">
														预备役比例 
													</td>
												</tr>
												<tr>
													<td style="height:60px !important">
														<div class="circle-input m-t-10 m-b-10">
															<input type="text" value="0.15" class="t-center" id="ybybl">
														</div>
													</td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="border-square height-2">
						<div class="am-box">
							<div class="am-box-title">
								<i class="fa  fa-sitemap"></i>
								<p>标准雷达信息</p>
								
							</div>
							<div class="am-box-content p-t-20">
								<div class="row">
									<div class="col-lg-6">
										<table class="am-table am-table-bordered">
											<tbody>
												<tr>
													<td class="t-center bc_blue_10 " width="162">
														标准侦察预警雷达
													</td>
												</tr>
												<tr>
													<td style="height:60px !important">
														<div class="circle-input m-t-10 m-b-10 bc_blue_20">
															<input type="text" value="LLQ04D" class="t-center" disabled id="bzzcyjld">
														</div>
													</td>
												</tr>
											</tbody>
										</table>
									</div>
									<div class="col-lg-6">
										<table class="am-table am-table-bordered">
											<tbody>
												<tr>
													<td class="t-center bc_blue_10 " width="162">
														发现目标概率 
													</td>
												</tr>
												<tr>
													<td style="height:60px !important">
														<div class="circle-input m-t-10 m-b-10 bc_blue_20">
															<input type="text" value="0.5" class="t-center" disabled id="fxmbgl">
														</div>
													</td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
								<div class="row m-t-20">
									<div class="col-lg-6">
										<table class="am-table am-table-bordered">
											<tbody>
												<tr>
													<td colspan="2" class="t-center bc_blue_10 " width="162">
														搜索区域面积 
													</td>
												</tr>
												<tr>
													<td style="height:60px !important">
														<div class="circle-input m-t-10 m-b-10 bc_blue_20">
															<input type="text" value="" class="t-center" disabled id="ssqymj">
														</div>
													</td>
													<td width="100" class="t-center" style="height:60px !important; ">
														平方公里
													</td>
												</tr>
											</tbody>
										</table>
									</div>
									<div class="col-lg-6">
										<table class="am-table am-table-bordered">
											<tbody>
												<tr>
													<td class="t-center bc_blue_10 " width="162">
														装备可靠性 
													</td>
												</tr>
												<tr>
													<td style="height:60px !important">
														<div class="circle-input m-t-10 m-b-10">
															<input type="text" value="" class="t-center" id="zbkkx">
														</div>
													</td>
													
												</tr>
											</tbody>
										</table>
									</div>
								</div>
								<div class="row m-t-20">
									<div class="col-lg-6">
										<table class="am-table am-table-bordered">
											<tbody>
												<tr>
													<td colspan="2" class="t-center bc_blue_10 " width="162">
														配置间隔 
													</td>
												</tr>
												<tr>
													<td style="height:60px !important">
														<div class="circle-input m-t-10 m-b-10">
															<input type="text" value="" class="t-center" id="pzjg">
														</div>
													</td>
													<td width="100" class="t-center" style="height:60px !important; ">
														公里
													</td>
												</tr>
											</tbody>
										</table>
									</div>
									<div class="col-lg-6">
										<table class="am-table am-table-bordered">
											<tbody>
												<tr>
													<td colspan="2" class="t-center bc_blue_10 " width="162">
														有效探测半径 
													</td>
												</tr>
												<tr>
													<td style="height:60px !important">
														<div class="circle-input m-t-10 m-b-10">
															<input type="text" value="" class="t-center" id="yxtcmj">
														</div>
													</td>
													<td width="100" class="t-center" style="height:60px !important; " >
														公里
													</td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="border-square height-2">
						<div class="am-box">
							<div class="am-box-title">
								<i class="fa  fa-sitemap"></i>
								<p>标准雷达需求量</p>
								<div class="am-btn-small pull-right " id="ldjs">计算</div>
							</div>
							<div class="am-box-content p-t-20">
								<div class="row">
									<div class="col-lg-6">
										<table class="am-table am-table-bordered">
											<tbody>
												<tr>
													<td class="t-center bc_blue_10 " width="162">
														基本需求量 
													</td>
													<td style="height:76px !important">
														<div class="circle-input m-t-10 m-b-10 bc_blue_20">
															<input type="text" value="" class="t-center" disabled id="zcjbxql">
														</div>
													</td>
												</tr>
											</tbody>
										</table>
										<table class="am-table am-table-bordered m-t-20">
											<tbody>
												<tr>
													<td class="t-center bc_blue_10 " width="162">
														需求加强量 
													</td>
													<td style="height:75px !important">
														<div class="circle-input m-t-10 m-b-10 bc_blue_20">
															<input type="text" value="" class="t-center" disabled id="zcxqjql">
														</div>
													</td>
												</tr>
											</tbody>
										</table>
										<table class="am-table am-table-bordered m-t-20">
											<tbody>
												<tr>
													<td class="t-center bc_blue_10 " width="162">
														冗余量 
													</td>
													<td style="height:76px !important">
														<div class="circle-input m-t-10 m-b-10 bc_blue_20">
															<input type="text" value="" class="t-center" disabled id="zcryl">
														</div>
													</td>
												</tr>
											</tbody>
										</table>
										<table class="am-table am-table-bordered m-t-20">
											<tbody>
												<tr>
													<td class="t-center bc_blue_10 " width="162">
														实际需求量 
													</td>
													<td style="height:75px !important">
														<div class="circle-input m-t-10 m-b-10 bc_blue_20">
															<input type="text" value="" class="t-center" disabled id="zcsjxql">
														</div>
													</td>
												</tr>
											</tbody>
										</table>
									</div>
									<div class="col-lg-6">
										<div class="tab-box" style="width:272px;">
											<div class="tab-box-content" style="height:366px;">
												<div id="circleDom7"  style="width:100%; height:366px;"></div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				
			</div>
			<div class="row">
				<div class="col-lg-12">
					<div class=" border-polygon-lg height-2">
						<div class="am-box">
							<div class="am-box-title">
								<i class="fa fa-crosshairs"></i>
								<p>需求还原计算</p>
								<div class="am-btn-small pull-right m-t-5" id="bc">保存</div>
								<div class="am-btn-small pull-right m-r-20 m-t-5" id="js2">计算</div>
								<div class="am-btn-small pull-right m-r-20 m-t-5" data-modal="#tips-value-3" data-modal-init>加载</div>
							</div>
							<div class="am-box-content ">
								<table class="am-table am-table-bordered am-table-striped am-table-hover ">
									<thead>
										<tr>
											<th width="3%" class="t-center">序号</th>
											<th width="10%" class="t-center">侦察预警单元型号</th>
											<th width="10%" class="t-center">侦察预警空域</th>
											<th width="10%" class="t-center">标准化效能</th>
											<th width="10%" class="t-center">配备数量</th>
											<th width="10%" class="t-center">任务比例</th>
											<th width="10%" class="t-center">需求量</th>
											<th width="10%" class="t-center">资源满意度</th>
										</tr>
									</thead>
								</table>
								<div class="src-bar" tabindex="5000" style="overflow: hidden; outline: none;">
									<table id="zcTab" class="am-table am-table-bordered am-table-striped t-center">
										<tbody id="tbody">
											
											
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			
		</div>
		<!-- 弹框 -->

		<div class="dialog-2 " id="tips-value-3">
			<div class="dialog-content-2">
				<div class="dialog-header">
					<div class="dialog-header-left">
						<i class="fa fa-fire c_7af5ff"></i><span>侦察预警单元 </span> 
					</div>
					<div class="pull-right">
						<div class="dialog-close button--moema" data-modal-close>
						</div>
					</div>
				</div>
				<div style="clear:both"></div>
				<div class="dialog-body ">
					<div class="m-t-20 pull-left amCheckAllBox" style="width:100%;">
						<table class="am-table am-table-bordered am-table-striped am-table-hover"  style="width:100%; height:40px;">
							<thead>
								<tr>
									<th class="smart-form t-center" width="3%">
										<label class="checkbox"  >
											<input type="checkbox" name="checkbox-inline" id="amCheckAll" class="amCheckAll">
											<i></i>
										</label>
									</th>
									<th class="t-center" width="6%">序号</th>
									<th class="t-center" width="20%">侦察预警单元型号</th>
									<th class="t-center" width="20%">侦察预警空域</th>
									<th class="t-center" width="20%">标准效能值</th>
									<th class="t-center" width="20%">配备数量</th>
								</tr>
							</thead>
						</table>
						<div class="src-bar" style="width:100%;max-height:288px;padding:0;margin:0;">
							<table class="am-table am-table-bordered am-table-striped t-center" style="padding:0;margin:0;">
								<tbody>
									<c:forEach items="${pzcss4}" var="p" varStatus="c">
									<tr>
										<td width="3%" class="smart-form">
											<label class="checkbox">
												<input type="checkbox" name="checkbox-inline">
												<i></i>
											</label>
											<input type="hidden" value="${p.zcyjbh}"/>
										</td>
										<td width="6%">${c.index+1}</td>
										<td width="20%">${p.zcyjmc}</td>
										<td width="20%">${p.zcyjky}</td>
										<td width="20%">${p.bzhxs}</td>
										<td width="20%">${p.kcl}</td>
									</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
				<div class="dialog-footer ">
					<div class="dialog-btn pull-right button--moema m-l-20" data-modal-close>
						取消
					</div>
					<div class="dialog-btn pull-right button--moema " data-modal-close id="qd">
						确定
					</div>
				</div>
			</div>
		</div>
		<div class="dialog-overlay"></div>
		<!-- 弹框结束-->
		<script src="build/dist/echarts.js"></script>
		<script src="js/divscroll.js"></script>
		<script src="js/jquery-awesomodals.min.js"></script>
		<script src="js/bootstrap-slider.js"></script>
		<script src="js/ui-choose.js"></script>
		<script src="js/layout.js"></script>
		<script type="text/javascript">
			function circleDom7(zcjbxql,zcxqjql,zcryl){
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
									x : 'left',
									data:['基本需求量','需求加强量','冗余量'],
									textStyle: {color: '#fff'}
								},
								restore : {show: true},
								saveAsImage : {show: true},
								calculable:false,
								series : [
									{
										type:'pie',
										radius : '70%',
										itemStyle : {
											 normal : {
												label : {
													show : false
												},
												labelLine : {
													show : false
												}
											}
										},
										center: ['50%', '45%'],
										data:[
			                                    {value:zcjbxql, name:'基本需求量'},
			                                    {value:zcxqjql, name:'需求加强量'},
			                                    {value:zcryl, name:'冗余量'},
			                                ]
									}
								]
							};
							// 为echarts对象加载数据
							myChart.setOption(option);
						}
				);
			}
			
			/** 计算出的值背景颜色改变 **/
			(function(){
				var trs=$("#zcTab tbody tr");
				$.each(trs,function(i,n){
					$(n).find('td:last').attr('class','bc_blue_10');
					$(n).find('td:last').prev().attr('class','bc_blue_10');
				})
			})();
			
			$(function(){
				$.ajax({
					'url' : 'fkzzfxAction!*dataLee',
					'type' : 'post',
					'dataType' : 'json',
					'async' : true,
					'success' : function(data) {
						$("#zcyjqymj").val(data[20].csz);
						$("#jqzcfxgs").val(data[24].csz);
						$("#yxzsl").val(data[27].csz);
						$("#yqfxmbgl").val(data[25].csz);
						$("#ybybl").val(data[29].csz);
						$("#bzzcyjld").val(data[3].cslg);
						$("#fxmbgl").val(data[26].csz);
						$("#ssqymj").val(data[21].csz);
						$("#zbkkx").val(data[28].csz);
						$("#pzjg").val(data[22].csz);
						$("#yxtcmj").val(data[23].csz);
					}
				});
				
				$("#qd").on("click",function(){
					$("#tbody").empty();
					var checkLen = $(".smart-form").length;
					var ldbh = new Array();
					for(var i=1;i<checkLen;i++){
						if($(".smart-form").eq(i).find("input[type=checkbox]")[0].checked){
							ldbh.push($(".smart-form").eq(i).find("input[type=hidden]").val());
						}
					}
					
					for(var i=0;i<ldbh.length;i++){
						$.ajax({
							'url' : 'fkzzfxAction!*findLdBh?bh='+ldbh[i],
							'type' : 'post',
							'dataType' : 'json',
							'async' : false,
							'success' : function(data) {
								var tr = '<tr>'+
											'<td width="3%">'+(i+1)+'</td>'+
											'<td width="10%">'+data.zcyjmc+'</td>'+
											'<td width="10%">'+data.zcyjky+'</td>'+
											'<td width="10%">'+data.bzhxs+'</td>'+
											'<td width="10%">'+data.kcl+'</td>'+
											'<td width="10%" class="showTips table-Show-slider">'+
												'<div class="progress">'+
													'<div id="jdt_'+i+'" class="progress-bar " aria-valuetransitiongoal="100" aria-valuenow="80">80</div>'+
												'</div>'+
												'<div class="slider-box tips" style="display:none;">'+
													'<input type="text" class="slider-num-2 slider-success" value=""'+ 
																'data-slider-min="1"'+ 
																'data-slider-max="100"'+  
																'data-slider-value="20"'+ 
																'data-slider-selection = "before"'+
																'data-slider-handle="squar">'+
												'</div>'+
											'</td>'+
											'<td width="10%" class="bc_blue_10"></td>'+
											'<td width="10%" class="bc_blue_10"></td>'+
											'<input type="hidden" value="'+data.bzhxs+'" class="bi"/>'+
										'</tr>';
									$("#tbody").append(tr);
									
							}
						});
					}
					
				 	$('.slider-num-2').slider({onChange:function(value){
						var selector = $(this).parents('.showTips').find(".progress-bar");
						$(selector).css('width',value[0]+'%');
						$(selector).text(value[0]/100);
						if( value[0] <=20){
							$(selector).attr('class','');
							$(selector).addClass('progress-bar').addClass('bg-color-blue');
						}else if( value[0] >=30 && value[0] <=40){
							$(selector).attr('class','');
							$(selector).addClass('progress-bar').addClass('bg-color-green');
						}else if( value[0] >=50 && value[0] <=60){
							$(selector).attr('class','');
							$(selector).addClass('progress-bar').addClass('bg-color-orange');
						}else if( value[0] >=70 && value[0] <=80){
							$(selector).attr('class','');
							$(selector).addClass('progress-bar').addClass('bg-color-redLight');
						}
						else if( value[0] >=90){
							$(selector).attr('class','');
							$(selector).addClass('progress-bar').addClass('bg-color-red');
						}
					}});
					
					$('.tips,.table-Show-slider').on('click',function(e){
						$('.tips').hide();
						$(this).find('.tips').show();
						e.stopPropagation();
					}); 
				});
				
				
				$("#ldjs").on("click",function(){
					//基本需求量
					var a0 = $("#zcyjqymj").val();
					var r = $("#yxtcmj").val();
					var a1 = $("#ssqymj").val();
					var l = $("#pzjg").val();
					$.ajax({
						url:'${webServiceURL}/fkhldy/zcyjdy/jbxq/'+a0+'/'+r+'/'+a1+'/'+l,
						type:'get',
						dataType:'json',
						async:false,
						success:function(data){
							$("#zcjbxql").val(data);
							zcjbxql = Number($("#zcjbxql").val());
						}
					});
					
					//需求加强量
					var n = $("#jqzcfxgs").val();
					var n11 = zcjbxql;
					var r2 = $("#yqfxmbgl").val();
					var p = $("#fxmbgl").val();
					$.ajax({
						url:'${webServiceURL}/fkhldy/zcyjdy/xqjql/'+n11+'/'+n+'/'+r2+'/'+p,
						type:'get',
						dataType:'json',
						async:false,
						success:function(data){
							$("#zcxqjql").val(data);
							zcxqjql = Number($("#zcxqjql").val());
							n1 = zcxqjql+zcjbxql;
						}
					});
					
					//冗余量
					var k1 = $("#yxzsl").val();
					var k2 = $("#zbkkx").val();
					var k3 = $("#ybybl").val();
					$.ajax({
						url:'${webServiceURL}/fkhldy/zcyjdy/ryl/'+n1+'/'+k1+'/'+k2+'/'+k3,
						type:'get',
						dataType:'json',
						async:false,
						success:function(data){
							$("#zcryl").val(data.toFixed(3));
							zcryl = Number($("#zcryl").val());
						}
					});
					$("#zcsjxql").val(n1+zcryl);
					circleDom7(zcjbxql,zcxqjql,zcryl);
				});
				
				$("#js2").on("click",function(){
					var length = $("#tbody").find("tr").length;
					var n0 = $("#zcsjxql").val();
					var blCount = 0;
					for(var i=0;i<length;i++){
						var ci = Number($("#jdt_"+i).text());
						blCount = blCount + ci;
					}
					if(blCount.toFixed(1) == 1.0){
						for(var i=0;i<length;i++){
							var ci = Number($("#jdt_"+i).text());
							var bi = $(".bi").eq(i).val();
							$.ajax({
								url:'${webServiceURL}/fkhldy/zcyjdy/hyjs/'+n0+'/'+ci+'/'+bi,
								type:'get',
								dataType:'json',
								async:false,
								success:function(data){
									$("#tbody").find("tr").eq(i).find("td").eq(6).text(Math.ceil(data));
								}
							}); 
							
							var xql3 = Number($("#tbody").find("tr").eq(i).find("td").eq(6).html());
							var kcl3 = Number($("#tbody").find("tr").eq(i).find("td").eq(4).html());
							if(xql3<kcl3){
								$("#tbody").find("tr").eq(i).find("td").eq(7).text("100%");
							}else{
								var db3 = kcl3/xql3;
								$("#tbody").find("tr").eq(i).find("td").eq(7).text(Math.floor(db3*100)+"%");
							}
						}
					}else{
						alert("任务比例总和必须为1！！！");
					}
				});
				
				$("#bc").on("click",function(){
					var length = $("#tbody").find("tr").length;
					var ldsz = new Array();
					for(var i=0;i<length;i++){
						var ldbc = {};
						ldbc.id = $("#tbody").find("tr").eq(i).find("td").eq(0).html();
						ldbc.xh = $("#tbody").find("tr").eq(i).find("td").eq(1).html();
						ldbc.rwbl = Number($("#jdt_"+i).text());
						ldbc.ldxq = Number($("#tbody").find("tr").eq(i).find("td").eq(6).html());
						ldbc.ldmyd = Number($("#tbody").find("tr").eq(i).find("td").eq(7).html().split("%")[0])/100;
						ldsz.push(ldbc);
					}
					var ldz = JSON.stringify(ldsz);
					console.log(ldz);
					$.ajax({
						url:'fkzzfxAction!*insertLd?ldz='+ldz,
						type:'get',
						success : function(data){
							alert("保存成功!");
						},
						error : function(data){
							alert("保存异常!");
						}
					}); 
				});
				
			});
		</script>
	</body>
</html>
