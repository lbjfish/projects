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
		<title>高炮火力单元计算</title>
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
					<li class="active button--moema"><a href="fkzzfxAction!*index" style="color:#dadc37;">高炮需求</a></li>
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
				<div class="col-lg-4">
					<div class="border-square height-2" >
						<div class="am-box">
							<div class="am-box-title">
								<i class="fa  fa-sitemap"></i>
								<p>高炮任务信息</p>
								
							</div>
							<div class="am-box-content p-t-20">
								<div class="row ">
									<div class="col-lg-6">
										<table class="am-table am-table-bordered" >
											<tbody>
												<tr>
													<td class="t-center bc_blue_10 " width="162" style="height:61px !important">
														高炮任务量 
													</td>
												</tr>
												<tr>
													<td style="height:111px !important">
														<div class="circle-input m-t-10 m-b-10 bc_blue_20">
															<input type="text" value="" class="t-center" disabled id="gprwl">
														</div>
													</td>
												</tr>
											</tbody>
										</table>
									</div>
									<div class="col-lg-6 ">
										<table class="am-table am-table-bordered">
											<tbody>
												<tr>
													<td class="t-center bc_blue_10" width="162" style="height:61px !important">
														毁伤指标 
													</td>
												</tr>
												<tr>
													<td style="height:111px !important">
														<div class="circle-input m-t-10 m-b-10">
															<input type="text" value="" class="t-center" id="hszb">
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
														允许战损率 
													</td>
												</tr>
												<tr>
													<td style="height:111px !important">
														<div class="circle-input m-t-10 m-b-10">
															<input type="text" value="0.1" class="t-center" id="yxzsl">
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
													<td style="height:111px !important">
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
								<p>标准火力单元信息</p>
								
							</div>
							<div class="am-box-content p-t-20">
								<div class="row ">
									<div class="col-lg-6">
										<table class="am-table am-table-bordered">
											<tbody>
												<tr>
													<td class="t-center bc_blue_10 " width="162" style="height:61px !important">
														标准高炮火力单元 
													</td>
												</tr>
												<tr>
													<td style="height:111px !important">
														<div class="circle-input m-t-10 m-b-10 bc_blue_20" style="width:200px;">
															<input type="text" value="双35高炮排" class="t-center" style="width:200px;" disabled id="bzgphldy">
														</div>
													</td>
												</tr>
											</tbody>
										</table>
									</div>
									<div class="col-lg-6 ">
										<table class="am-table am-table-bordered">
											<tbody>
												<tr>
													<td class="t-center bc_blue_10" width="162" style="height:61px !important">
														装备可靠性 
													</td>
												</tr>
												<tr>
													<td style="height:111px !important">
														<div class="circle-input m-t-10 m-b-10">
															<input type="text" value="0.9" class="t-center" id="zbkkx">
														</div>
													</td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
								<div class="row p-t-20">
									<div class="col-lg-12">
										<table class="am-table am-table-bordered">
											<tbody>
												<tr>
													<td class="t-center bc_blue_10 " width="267" style="height:172px !important;font-size:20px;">
														毁伤概率 
													</td>
													<td>
														<div id="circleDom_2_1" style="width:200px;height:120px;margin:0 auto;">
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
								<p>标准高炮需求量</p>
								<div class="am-btn-small pull-right" id="js">计算</div>
							</div>
							<div class="am-box-content p-t-20">
								<div class="row ">
									<div class="col-lg-6">
										<table class="am-table am-table-bordered">
											<tbody>
												<tr>
													<td class="t-center bc_blue_10 " width="162" style="height:61px !important">
														理论需求量 
													</td>
												</tr>
												<tr>
													<td style="height:111px !important">
														<div class="circle-input m-t-10 m-b-10 bc_blue_20">
															<input type="text" value="" class="t-center" disabled id="fkllxql">
															<input type="hidden" value="" id="kxgm">
															<input type="hidden" value=""  id="ztkjl"/>
															<input type="hidden" value=""  id="rwbl"/>
															<input type="hidden" value=""  id="xzxs"/>
														</div>
													</td>
												</tr>
											</tbody>
										</table>
									</div>
									<div class="col-lg-6 ">
										<table class="am-table am-table-bordered">
											<tbody>
												<tr>
													<td class="t-center bc_blue_10" width="162" style="height:61px !important">
														冗余量 
													</td>
												</tr>
												<tr>
													<td style="height:111px !important">
														<div class="circle-input m-t-10 m-b-10 bc_blue_20">
															<input type="text" value="" class="t-center" disabled id="fkryl">
														</div>
													</td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
								<div class="row p-t-20">
									<div class="col-lg-12">
										<table class="am-table am-table-bordered">
											<tbody>
												<tr>
													<td class="t-center bc_blue_10 " width="267" style="height:172px !important;font-size:20px;">
														实际需求量 
													</td>
													<td  class="bar-css">
														<div style="height:125px;" class="bar-box bg-color-green t-center">
															<div class="bar-box-p" style="font-size:20px;" id="fksjxql"></div>
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
											<th width="3%" rowspan="2" class="t-center">序号</th>
											<th width="10%" rowspan="2" class="t-center">高炮型号</th>
											<th width="%" colspan="5" class="t-center">高炮火力单元</th>
											<th width="%" colspan="6" class="t-center">高炮弹药</th>
										</tr>
										<tr>
											<th class="t-center" width="8%">作战效能标准值</th>
											<th class="t-center" width="8%">任务比例</th>
											<th class="t-center" width="8%">配备数量</th>
											<th class="t-center" width="8%">需求数量</th>
											<th class="t-center" width="8%">资源满意度</th>
											<th class="t-center" width="8%">直接损耗率</th>
											<th class="t-center" width="8%">自然损耗率</th>
											<th class="t-center" width="8%">冗余率</th>
											<th class="t-center" width="8%">库存数量</th>
											<th class="t-center" width="8%">需求数量</th>
											<th class="t-center" width="8%">资源满意度</th>
										</tr>
									</thead>
								</table>
								<div class="src-bar" tabindex="5000" style="overflow: hidden; outline: none;height: 288px;">
									<table id="zcTab" class="am-table am-table-bordered am-table-striped t-center">
										<tbody id="tbody">
											
										</tbody>
									</table>
								</div>
							</div>
							<div style="float:left; position:absolute; left:270px; top:71px; height:368px; border-left:3px solid rgba(0,88,128,1);"></div>
							<div style="float:left; position:absolute; left:995px; top:71px; height:368px; border-left:3px solid rgba(0,88,128,1);"></div>
						</div>
					</div>
				</div>
			</div>
			
		</div>
		<!-- 弹框 -->

		<div class="dialog-3" id="tips-value-3">
			<div class="dialog-content-2">
				<div class="dialog-header">
					<div class="dialog-header-left">
						<i class="fa fa-fire c_7af5ff"></i><span>高炮</span> 
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
									<th class="t-center" width="13%">高炮型号</th>
									<th class="t-center" width="13%">作战效能标准值</th>
									<th class="t-center" width="13%">单次点射毁伤概率</th>
									<th class="t-center" width="13%">毁伤修正系数</th>
									<th class="t-center" width="13%">火力配备数量</th>
									<th class="t-center" width="13%">单次点射耗弹量</th>
									<th class="t-center" width="13%">弹药库存量</th>
								</tr>
							</thead>
						</table>
						<div class="src-bar" style="width:100%;max-height:288px;padding:0;margin:0;">
							<table class="am-table am-table-bordered am-table-striped t-center" style="padding:0;margin:0;">
								<tbody>
									<c:forEach items="${pzcss2}" var="p" varStatus="c">
									<tr>
										<td width="3%" class="smart-form">
											<label class="checkbox">
												<input type="checkbox" name="checkbox-inline">
												<i></i>
											</label>
											<input type="hidden" value="${p.gpbh}"/>
										</td>
										<td width="6%">${c.index+1}</td>
										<td width="13%">${p.gpmc}</td>
										<td width="13%">${p.bzxnzs}</td>
										<td width="13%">${p.dchsgl}</td>
										<td width="13%">${p.xzxs}</td>
										<td width="13%">${p.wqkc}</td>
										<td width="13%">${p.dchdl}</td>
										<td width="13%">${p.dykc}</td>
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

			/** 计算出的值背景颜色改变 **/
			(function(){
				var trs=$("#zcTab tbody tr");
				$.each(trs,function(i,n){
					$(n).find('td:eq(5)').attr('class','bc_blue_10');
					$(n).find('td:eq(6)').attr('class','bc_blue_10');
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
						$("#gprwl").val((Number(data[4].csz)*Number(data[6].csz)).toFixed(2));
						$("#hszb").val(data[8].csz);
						$("#yxzsl").val(data[11].csz);
						$("#ybybl").val(data[13].csz);
						$("#bzgphldy").val(data[1].cslg);
						$("#zbkkx").val(data[12].csz);
						circleDom('','circleDom_2_1',(data[9].csz)*100); //第2方案
						
						$("#kxgm").val(data[4].csz);
						$("#ztkjl").val(data[5].csz);
						$("#rwbl").val(data[6].csz);
						$("#xzxs").val(data[10].csz);
					}
				});
				
				$("#js").on("click",function(){
					var v1 = 0;
					var v2 = 0;
					//理论需求量
					var kxgm = $("#kxgm").val();
					var kjzb = Number($("#ztkjl").val())*Number($("#rwbl").val());
					var hszb = $("#hszb").val();
					var xzxs = $("#xzxs").val();
					var dcdshsgl = Number("${pzcss2[0].dchsgl}");
					$.ajax({
						url:'${webServiceURL}/fkhldy/fkhl/llxq/'+kxgm+'/'+kjzb+'/'+hszb+'/'+xzxs+'/'+dcdshsgl,
						type:'get',
						dataType:'json',
						async:false,
						success:function(data){
							$("#fkllxql").val(Math.round(Number(data)*10)/10);
							v1 = Number($("#fkllxql").val());
						}
					});
					//冗余量
					var yxzsl = $("#yxzsl").val();
					var zbkkx = $("#zbkkx").val();
					var ybybl = $("#ybybl").val();
					$.ajax({
						 url:'${webServiceURL}/fkhldy/fkhl/ryl/'+$("#fkllxql").val()+'/'+yxzsl+'/'+zbkkx+'/'+ybybl,
						 type:'get',
						 dataType:'json',
						 async:false,
						 success:function(data){
							 $("#fkryl").val(data.toFixed(3));
							 v2 = Number($("#fkryl").val());
						 }
					 });
					$("#fksjxql").html((v1+v2).toFixed(2)); 
				});
				
				$("#qd").on("click",function(){
					$("#tbody").empty();
					var checkLen = $(".smart-form").length;
					var gpbh = new Array();
					for(var i=1;i<checkLen;i++){
						if($(".smart-form").eq(i).find("input[type=checkbox]")[0].checked){
							gpbh.push($(".smart-form").eq(i).find("input[type=hidden]").val());
						}
					}
					
					for(var i=0;i<gpbh.length;i++){
						$.ajax({
							'url' : 'fkzzfxAction!*findGpBh?bh='+gpbh[i],
							'type' : 'post',
							'dataType' : 'json',
							'async' : false,
							'success' : function(data) {
								var tr = '<tr>'+
											'<td width="3%">'+(i+1)+'</td>'+
											'<td width="10%">'+data.gpmc+'</td>'+
											'<td width="8%">'+data.bzxnzs+'</td>'+
											'<td width="8%" class="showTips table-Show-slider">'+
												'<div class="progress">'+
													'<div id="jdt_'+i+'" class="progress-bar" aria-valuetransitiongoal="100" aria-valuenow="80">80</div>'+
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
											'<td width="8%">'+data.wqkc+'</td>'+
											'<td width="8%" class="bc_blue_10"></td>'+
											'<td width="8%" class="bc_blue_10"></td>'+
											'<td width="8%">'+
												'<div class="input-p" style="float:none;">'+
													'<input class="input-lg t-center" type="text" value="'+data.zjshl+'" style="float:none;">'+
												'</div>'+
											'</td>'+
											'<td width="8%">'+
												'<div class="input-p" style="float:none;">'+
													'<input class="input-lg t-center" type="text" value="'+data.zrshl+'" style="float:none;">'+
												'</div>'+
											'</td>'+
											'<td width="8%">'+
												'<div class="input-p" style="float:none;">'+
													'<input class="input-lg t-center" type="text" value="'+data.ryl+'" style="float:none;">'+
												'</div>'+
											'</td>'+
											'<td width="8%">'+data.dykc+'</td>'+
											'<td class="bc_blue_10" width="8%"></td>'+
											'<td class="bc_blue_10" width="8%"></td>'+
											'<input type="hidden" value="'+data.dchsgl+'" class="dcdshsgl"/>'+
											'<input type="hidden" value="'+data.dchdl+'" class="dcdshdl"/>'+
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
				
				$("#js2").on("click",function(){
					var sjxql = Number($("#fksjxql").html());
					var length = $("#tbody").find("tr").length;
					var blCount = 0;
					for(var i=0;i<length;i++){
						//高炮需求量参数
						var bl = Number($("#jdt_"+i).text());
						blCount = blCount + bl;
					}
					if(blCount.toFixed(1) == 1.0){
						for(var i=0;i<length;i++){
							//高炮需求量参数
							var bl = Number($("#jdt_"+i).text());
							var bzhhn = $("#tbody").find("tr").eq(i).find("td").eq(2).text();
							$.ajax({
								url:'${webServiceURL}/fkhldy/fkhl/hyjs/'+sjxql+'/'+bl+'/'+bzhhn,
								type:'get',
								dataType:'json',
								async:false,
								success:function(data){
									 $("#tbody").find("tr").eq(i).find("td").eq(5).text(Math.ceil(data));
								}
							});
							
							var xql = Number($("#tbody").find("tr").eq(i).find("td").eq(5).text());
							var pbl = Number($("#tbody").find("tr").eq(i).find("td").eq(4).text());
							if(xql<pbl){
								$("#tbody").find("tr").eq(i).find("td").eq(6).text("100%");
							}else{
								var db = pbl/xql;
								$("#tbody").find("tr").eq(i).find("td").eq(6).text(Math.floor(db*100)+"%");
							}
							
							//-----------------------------------------------------------------------------------------
							//弹药需求量参数
							//消耗量
							var kxgm = Number($("#kxgm").val());
							var kjzb = Number($("#ztkjl").val())*Number($("#rwbl").val());
							var mi = Number($("#fksjxql").html())*Number($("#jdt_"+i).text());
							var m = Number($("#fksjxql").html());
							var hszb = Number($("#hszb").val());
							var xzxs = Number($("#xzxs").val());
							var dcdshsgl = Number($(".dcdshsgl").eq(i).val());
							var dcdshdl = Number($(".dcdshdl").eq(i).val());
							$.ajax({
								url:'${webServiceURL}/fkhldy/fkdyxq/xhl/'+kxgm+'/'+kjzb+'/'+mi+'/'+m+'/'+hszb+'/'+xzxs+'/'+dcdshsgl+'/'+dcdshdl,
								type:'get',
								dataType:'json',
								async:false,
								success:function(data){
									ni1 = data;
								}
							});
							//损耗量
							var ai = $("#tbody").find("tr").eq(i).find("td").eq(7).find("input[type=text]").val();
							var bi = $("#tbody").find("tr").eq(i).find("td").eq(8).find("input[type=text]").val()
							$.ajax({
								url:'${webServiceURL}/fkhldy/fkdyxq/hsl/'+ni1+'/'+ai+'/'+bi,
								type:'get',
								dataType:'json',
								async:false,
								success:function(data){
									ni2 = data;
								}
							});
							//冗余量
							var ci = $("#tbody").find("tr").eq(i).find("td").eq(9).find("input[type=text]").val();
							var ni3 = ni1*ci;
							var ni0 = ni1+ni2+ni3;
							$("#tbody").find("tr").eq(i).find("td").eq(11).html(Math.ceil(ni0));
							
							var xql2 = Number($("#tbody").find("tr").eq(i).find("td").eq(11).html());
							var kcl2 = Number($("#tbody").find("tr").eq(i).find("td").eq(10).html());
							if(xql2<kcl2){
								$("#tbody").find("tr").eq(i).find("td").eq(12).text("100%");
							}else{
								var db2 = kcl2/xql2;
								$("#tbody").find("tr").eq(i).find("td").eq(12).text(Math.floor(db2*100)+"%");
							}
						}
					}else{
						alert("任务比例总和必须为1！！！");
					}
					
				});
				
				$("#bc").on("click",function(){
					var length = $("#tbody").find("tr").length;
					var gpsz = new Array();
					for(var i=0;i<length;i++){
						var gpbc = {};
						gpbc.id = $("#tbody").find("tr").eq(i).find("td").eq(0).html();
						gpbc.xh = $("#tbody").find("tr").eq(i).find("td").eq(1).html();
						gpbc.rwbl = Number($("#jdt_"+i).text());
						gpbc.hlxq = Number($("#tbody").find("tr").eq(i).find("td").eq(5).html());
						gpbc.hlmyd = Number($("#tbody").find("tr").eq(i).find("td").eq(6).html().split("%")[0])/100;
						gpbc.dyxq = Number($("#tbody").find("tr").eq(i).find("td").eq(11).html());
						gpbc.dymyd = Number($("#tbody").find("tr").eq(i).find("td").eq(12).html().split("%")[0])/100;
						gpsz.push(gpbc);
					}
					var gpz = JSON.stringify(gpsz);
					$.ajax({
						url:'fkzzfxAction!*insertGp?gpz='+gpz,
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
