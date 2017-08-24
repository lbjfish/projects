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
		<title>防空作战能力评估</title>
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
					<p>防空作战能力评估</p>
				</a>
			</div>
			<div class="am-top-nav">
				<ul>
					<li class="active button--moema"><a>防空作战能力</a></li>
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
				<div class="col-lg-12">
					<div class=" border-polygon-lg height-2">
						<div class="am-box">
							<div class="am-box-title">
								<i class="fa fa-crosshairs"></i>
								<p>防空作战能力</p>
								<div class="am-title-notice pull-right js-am-title-notice m-l-10 am-title-notice-active">
									<div class="p">
										
									</div>
									<b class="fa fa-sort-asc" style=""></b>
									<div class="sort-box" style="margin-left:-105px;" hidden>
										<div class="more-setting" style="width:220px;">
										<c:forEach items="${selects }" var="s">
											<div class="am-title-notice pull-left ">
												<div class="smart-form pull-left m-t-8 m-r-10">
													<label class="radio">
														<input type="radio" name="checkbox-inline" checked="">
														<i></i><div class="pull-left" style="margin:-2px 0 0 17px;color:#fff;font-size:15px;" >${s}</div>
													</label>
												</div>
											</div>
											</c:forEach>
										</div>
									</div>
								</div>
							</div>
							<div class="am-box-content ">
								<div class="pull-left tab-box m-l-5" style="width:100%;">
									<div class="tab-box-title" style="width:100%;" >
										<a style="" class="active">侦察预警能力</a>
										<a style="">指挥控制能力</a>
										<a style="">火力拦截能力</a>
										<a style="">机动能力</a>
										<a style="">电子对抗能力</a>
										<a style="">综合保障能力</a>
									</div>
									<div class="tab-box-content p-t-20" style="width:100%;height:335px;" >
										<div class="col-lg-3">
											<table class="am-table am-table-bordered am-table-striped am-table-hover "  >
												<thead>
													<tr>
														<th colspan="2" class="t-center">
															探测能力 
														</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar" style="height:164px;">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">最大探测距离</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" id="zdtcjl" value="300km">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">发现概率</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.8" id="fxgl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">远方空情保障能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.8" id="yfbznl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">中高空覆盖率</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.8" id="zgkfgl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">中低空覆盖率</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.8" id="zdkfgl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">重迭系数</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.8" id="cdxs">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
											<table class="am-table am-table-bordered am-table-striped"  >
												<tbody>
													<tr>
														<td width="50%" style="height:90px !important" class="t-center">
															<div class="am-btn-lg" id="jstcnl">开始计算</div>
														</td>
														<td width="50%">
															<div class="circle-input">
																<input type="text" class="t-center" id="tcnl" value="">
															</div>
														</td>
													</tr>
												</tbody>
											</table>
										</div>
										<div class="col-lg-3">
											<table class="am-table am-table-bordered am-table-striped am-table-hover "  >
												<thead>
													<tr>
														<th colspan="2" class="t-center">
															情报能力
														</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">空情收集能力</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.5" id="kqsjnl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">空情传递能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.6" id="kqcdnl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">空情识别能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.4" id="kqsbnl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">空情处理能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.8" id="kqclnl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td style="height:90px !important" class="t-center">
																<div class="am-btn-lg" id="jsqbnl">开始计算</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text"  class="t-center" id="qbnl" value="" >
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
										<div class="col-lg-3">
											<table class="am-table am-table-bordered am-table-striped  "  >
												<thead>
													<tr>
														<th colspan="2" class="t-center" >目标定位能力</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">探测精度</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text"  id="tcjd">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">分辨率</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text"  id="fbl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">目标容量</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" id="mbrl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td ></td>
															<td ></td>
														</tr>
														<tr>
															<td style="height:90px !important" class="t-center">
																<div class="am-btn-lg" id="jsmbdw">开始计算</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text" class="t-center" id="mbdw" value="">
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
										<div class="col-lg-3">
											<table class="am-table am-table-bordered am-table-striped am-table-striped-light"  >
												<thead>
													<tr>
														<th colspan="2" class="t-center" >侦察预警能力</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">
																<div class="am-btn-lg" id="jszcyjnl">开始计算</div>
															</td>
															<td style="height:253px !important;padding:20px 0px;" class="t-center">
																<div id="circleDom" style="width:200px;height:200px;margin:0 auto;">
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
									</div>
									<!-- 侦察预警能力 end -->
									<div class="tab-box-content p-t-20" style="width:100%;height:335px;" hidden>
										<div class="col-lg-8" style="padding-top:2px;">
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">组织计划能力</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.5" id="zzjhnl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">决策能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.6" id="jcnl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">信息获取能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.4" id="xxhqnl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">战场控制能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.8" id="zckznl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">指挥协调能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.8" id="zhxtnl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr><td></td><td></td></tr>
														<tr><td></td><td></td></tr>
													</tbody>
												</table>
											</div>
										</div>
										<div class="col-lg-4">
											<table class="am-table am-table-bordered am-table-striped am-table-striped-light"  >
												<thead>
													<tr>
														<th colspan="2" class="t-center" >指挥控制能力</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">
																<div class="am-btn-lg" id="jszhkznl">开始计算</div>
															</td>
															<td style="height:248px !important;padding:20px 0px;" class="t-center" >
																<div id="circleDom2" style="width:200px;height:200px;margin:0 auto;">
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
									</div>
									<!-- 指挥控制能力 end -->
									<div class="tab-box-content p-t-20" style="width:100%;height:335px;" hidden>
										<div class="col-lg-2">
											<table class="am-table am-table-bordered am-table-striped am-table-hover "  >
												<thead>
													<tr>
														<th colspan="2" class="t-center">
															火力覆盖能力
														</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">兵器火力范围</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" id="bqhlfw">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">杀伤概率</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" id="ssgl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr><td></td><td></td></tr>
														<tr><td></td><td></td></tr>
														<tr>
															<td style="height:90px !important" class="t-center">
																<div class="am-btn-small" id="jshlfgnl">开始计算</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text"  class="t-center" id="hlfgnl">
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
										<div class="col-lg-2">
											<table class="am-table am-table-bordered am-table-striped am-table-hover "  >
												<thead>
													<tr>
														<th colspan="2" class="t-center">
															火力转移能力
														</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">准备时间</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" id="zbsj">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">转移时间</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" id="zysj">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">反应时间</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" id="fysj">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr><td></td><td></td></tr>
														<tr>
															<td style="height:90px !important" class="t-center">
																<div class="am-btn-small" id="jshlzynl">开始计算</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text"  class="t-center" id="hlzynl">
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
										<div class="col-lg-2">
											<table class="am-table am-table-bordered am-table-striped am-table-hover "  >
												<thead>
													<tr>
														<th colspan="2" class="t-center">
															火力服务能力
														</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">可射击概率</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" id="knsjgl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">射击次数</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" id="sjcs">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr><td></td><td></td></tr>
														<tr><td></td><td></td></tr>
														<tr>
															<td style="height:90px !important" class="t-center">
																<div class="am-btn-small" id="jshlfwnl">开始计算</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text"  class="t-center" id="hlfwnl">
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
										<div class="col-lg-2">
											<table class="am-table am-table-bordered am-table-striped am-table-hover "  >
												<thead>
													<tr>
														<th colspan="2" class="t-center">
															火力集中能力
														</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">火力密度</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" id="hlmd">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">弹药密度</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" id="dymd">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr><td></td><td></td></tr>
														<tr><td></td><td></td></tr>
														<tr>
															<td style="height:90px !important" class="t-center">
																<div class="am-btn-small" id="jshljznl">开始计算</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text"  class="t-center" id="hljznl">
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
										<div class="col-lg-2">
											<table class="am-table am-table-bordered am-table-striped am-table-hover "  >
												<thead>
													<tr>
														<th colspan="2" class="t-center">
															火力毁伤能力
														</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="60%" class="t-center">完成任务能力</td>
															<td width="40%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" id="wcrwnl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">参战可能性</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" id="czknx">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">毁伤概率</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" id="hsgl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">同时占用目标通道数</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" id="zymbds">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td style="height:90px !important" class="t-center">
																<div class="am-btn-small" id="jshlhsnl">开始计算</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text" value="" class="t-center" id="hlhsnl">
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
										<div class="col-lg-2">
											<table class="am-table am-table-bordered am-table-striped am-table-striped-light"  >
												<thead>
													<tr>
														<th colspan="2" class="t-center" >火力拦截能力</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td style="height:253px !important;padding:10px 0px;" class="t-center" colspan="2">
																<div class="am-btn-small" style="margin:5px auto 10px;" id="jshlljnl">开始计算</div>
																<div id="circleDom3" style="width:180px;height:180px;margin:0 auto;">
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
									</div>
									<!-- 火力拦截能力 end -->
									<div class="tab-box-content p-t-20" style="width:100%;height:335px;" hidden>
										<div class="col-lg-8" style="padding-top:2px;">
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">机动距离</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="" id="jdjl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">机动速度</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="" id="jdsd">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">转换时间</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="" id="zhsj">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">通行能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="" id="txnl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr><td></td><td></td></tr>
														<tr><td></td><td></td></tr>
														<tr><td></td><td></td></tr>
													</tbody>
												</table>
											</div>
										</div>
										<div class="col-lg-4">
											<table class="am-table am-table-bordered am-table-striped am-table-striped-light"  >
												<thead>
													<tr>
														<th colspan="2" class="t-center" >机动能力</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">
																<div class="am-btn-lg" id="jsjdnl">开始计算</div>
															</td>
															<td style="height:253px !important;padding:20px 0px;" class="t-center">
																<div id="circleDom4" style="width:200px;height:200px;margin:0 auto;">
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
									</div>
									<!-- 机动能力 end -->
									<div class="tab-box-content p-t-20" style="width:100%;height:335px;" hidden>
										<div class="col-lg-4">
											<table class="am-table am-table-bordered am-table-striped am-table-hover "  >
												<thead>
													<tr>
														<th colspan="2" class="t-center">
															电子防护能力
														</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">反敌电子侦查能力</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="" id="fdzcnl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">抗敌电子干扰能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.6" id="kdgrnl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">防敌火力摧毁能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="" id="fdchnl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td></td>
															<td></td>
														</tr>
														<tr>
															<td style="height:90px !important" class="t-center">
																<div class="am-btn-lg" id="jsdzfhnl">开始计算</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text" value="" class="t-center" id="dzfhnl">
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
										<div class="col-lg-4">
											<table class="am-table am-table-bordered am-table-striped am-table-hover "  >
												<thead>
													<tr>
														<th colspan="2" class="t-center">
															电子进攻能力
														</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">干扰概率</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="" id="grgl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">平均干扰时间</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="" id="pjgrsj">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">被干扰概率</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="" id="bgrgl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td></td>
															<td></td>
														</tr>
														<tr>
															<td style="height:90px !important" class="t-center">
																<div class="am-btn-lg" id="jsdzjgnl">开始计算</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text" value="" class="t-center" id="dzjgnl">
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
										<div class="col-lg-4">
											<table class="am-table am-table-bordered am-table-striped am-table-striped-light"  >
												<thead>
													<tr>
														<th colspan="2" class="t-center" >电子对抗能力</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">
																<div class="am-btn-lg" id="jsdzdknl">开始计算</div>
															</td>
															<td style="height:253px !important;padding:20px 0px;" class="t-center">
																<div id="circleDom5" style="width:200px;height:200px;margin:0 auto;">
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
									</div>
									<!-- 电子对抗能力 end -->
									<div class="tab-box-content p-t-20" style="width:100%;height:335px;" hidden>
										<div class="col-lg-3">
											<table class="am-table am-table-bordered am-table-striped am-table-hover "  >
												<thead>
													<tr>
														<th colspan="2" class="t-center">
															战斗保障能力 <i class="fa fa-plus" style="font-size:12px;"></i>
														</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar" style="height:164px;">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">气象保障能力</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="" id='qxbznl' >
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">通行保障能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="" id='txbznl'>
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">工程保障能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="" id='gcbznl'>
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">伪装防护能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="" id='wzfhnl'>
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">三防能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="" id='sfnl'>
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
											<table class="am-table am-table-bordered am-table-striped"  >
												<tbody>
													<tr>
														<td width="50%" style="height:90px !important" class="t-center">
															<div class="am-btn-lg" id="jszdbznl">开始计算</div>
														</td>
														<td width="50%">
															<div class="circle-input">
																<input type="text" value="" class="t-center" id="zdbznl">
															</div>
														</td>
													</tr>
												</tbody>
											</table>
										</div>
										<div class="col-lg-3">
											<table class="am-table am-table-bordered am-table-striped am-table-hover "  >
												<thead>
													<tr>
														<th colspan="2" class="t-center">
															后勤保障能力
														</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">物资保障能力</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="" id="wzbznl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">经费保障能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="" id="jfbznl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">卫勤保障能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="" id="wqbznl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">运输保障能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="" id="ysbznl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td style="height:90px !important" class="t-center">
																<div class="am-btn-lg" id="jshqbznl">开始计算</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text" value="" class="t-center" id="hqbznl"/>
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
										<div class="col-lg-3">
											<table class="am-table am-table-bordered am-table-striped  "  >
												<thead>
													<tr>
														<th colspan="2" class="t-center">装备技术保障能力</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">装备补充能力</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="" id="zbbcnl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">装备使用管理能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="" id="zbsyglnl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">装备维修能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="" id="zbwxnl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">弹药保障能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="" id="dybznl">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td style="height:90px !important" class="t-center">
																<div class="am-btn-lg" id="jszbjsbznl">开始计算</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text" value="" class="t-center" id="zbjsbznl">
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
										<div class="col-lg-3">
											<table class="am-table am-table-bordered am-table-striped am-table-striped-light"  >
												<thead>
													<tr>
														<th colspan="2" class="t-center" >综合保障能力</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">
																<div class="am-btn-lg" id="jszhbznl">开始计算</div>
															</td>
															<td style="height:253px !important;padding:20px 0px;" class="t-center">
																<div id="circleDom6" style="width:200px;height:200px;margin:0 auto;">
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
									</div>
									<!-- 综合保障能力 end -->
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-12" style="padding:0;">
					<div class="col-lg-4">
						<div class=" border-square height-2">
							<div class="am-box">
								<div class="am-box-title">
									<i class="fa fa-crosshairs"></i>
									<p>防空作战能力雷达图</p>
									<div class="am-btn-1 pull-right button--moema" id="ldt">
										<b class="fa fa-sun-o"></b>
										<span>生成雷达图</span>
									</div>
								</div>
								<div class="am-box-content ">
									<div style="width:560px;height:420px;">
										<div id="forceDom" style="height:350px;">
											
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-4">
						<div class=" border-square height-2">
							<div class="am-box">
								<div class="am-box-title">
									<i class="fa fa-crosshairs"></i>
									<p>防空作战能力评估</p>
									<div class="am-btn-1 pull-right button--moema" id="zznlpg">
										<b class="fa fa-sun-o"></b>
										<span>修改评估值</span>
									</div>
								</div>
								<div class="am-box-content ">
									<table class="am-table am-table-bordered am-table-striped am-table-hover "  >
										<thead>
											<tr>
												<th width="40%">作战能力</th>
												<th width="60%">评估值</th>
											</tr>
										</thead>
									</table>
									<div class="src-bar">
										<table class="am-table am-table-bordered am-table-striped am-table-hover" id="tab" >
											<tbody>
												<tr>
													<td width="40%">
														侦察预警能力
													</td>
													<td width="60%" class="showTips table-Show-slider">
														<div class="progress">
															<div class="progress-bar " aria-valuetransitiongoal="100" aria-valuenow="100">7</div>
														</div>
														<div class="slider-box tips" style="display:none;">
															<input type="text" class="slider-num-point slider-success" value="" 
																		data-slider-min="0" 
																		data-slider-max="10"  
																		data-slider-value="0"
																		data-slider-selection = "before"
																		data-slider-handle="squar">
														</div>
													</td>
												</tr>
												<tr>
													<td>
														指挥控制能力
													</td>
													<td class="showTips table-Show-slider">
														<div class="progress">
															<div class="progress-bar " aria-valuetransitiongoal="100" aria-valuenow="100">7</div>
														</div>
														<div class="slider-box tips" style="display:none;">
															<input type="text" class="slider-num-point slider-success" value="" 
																		data-slider-min="0" 
																		data-slider-max="10"  
																		data-slider-value="0" 
																		data-slider-selection = "before"
																		data-slider-handle="squar">
														</div>
													</td>
												</tr>
												<tr>
													<td>
														火力拦截能力
													</td>
													<td class="showTips table-Show-slider">
														<div class="progress">
															<div class="progress-bar " aria-valuetransitiongoal="100" aria-valuenow="100">7</div>
														</div>
														<div class="slider-box tips" style="display:none;">
															<input type="text" class="slider-num-point slider-success" value="" 
																		data-slider-min="0" 
																		data-slider-max="10"  
																		data-slider-value="0" 
																		data-slider-selection = "before"
																		data-slider-handle="squar">
														</div>
													</td>
												</tr>
												<tr>
													<td>
														机动能力
													</td>
													<td class="showTips table-Show-slider">
														<div class="progress">
															<div class="progress-bar " aria-valuetransitiongoal="100" aria-valuenow="100">7</div>
														</div>
														<div class="slider-box tips" style="display:none;">
															<input type="text" class="slider-num-point slider-success" value="" 
																		data-slider-min="0" 
																		data-slider-max="10"  
																		data-slider-value="0" 
																		data-slider-selection = "before"
																		data-slider-handle="squar">
														</div>
													</td>
												</tr>
												<tr>
													<td>
														电子对抗能力
													</td>
													<td class="showTips table-Show-slider">
														<div class="progress">
															<div class="progress-bar " aria-valuetransitiongoal="100" aria-valuenow="100">7</div>
														</div>
														<div class="slider-box tips" style="display:none;">
															<input type="text" class="slider-num-point slider-success" value="" 
																		data-slider-min="0" 
																		data-slider-max="10"  
																		data-slider-value="0" 
																		data-slider-selection = "before"
																		data-slider-handle="squar">
														</div>
													</td>
												</tr>
												<tr>
													<td>
														综合保障能力
													</td>
													<td class="showTips table-Show-slider">
														<div class="progress">
															<div class="progress-bar " aria-valuetransitiongoal="100" aria-valuenow="100">7</div>
														</div>
														<div class="slider-box tips" style="display:none;">
															<input type="text" class="slider-num-point slider-success" value="" 
																		data-slider-min="0" 
																		data-slider-max="10"  
																		data-slider-value="0" 
																		data-slider-selection = "before"
																		data-slider-handle="squar">
														</div>
													</td>
												</tr>
												<tr>
													<td></td>
													<td></td>
												</tr>
												<tr>
													<td></td>
													<td></td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-4">
						<div class=" border-square height-2">
							<div class="am-box">
								<div class="am-box-title">
									<i class="fa fa-crosshairs"></i>
									<p>作战综合能力计算</p>
									<div class="am-btn-1 pull-right button--moema"  id="zzzhnl">
									<b class="fa fa-sun-o"></b>
									<span>能力计算</span>
								</div>
								</div>
								<div class="am-box-content ">
									<div style="width:560px;height:420px;">
										<div id="carCir" style="height:300px;"></div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="dialog-overlay-1"></div>
		<script src="build/dist/echarts.js"></script>
		<script src="js/divscroll.js"></script>
		<script src="js/jquery-awesomodals.min.js"></script>
		<script src="js/bootstrap-slider.js"></script>
		<script src="js/ui-choose.js"></script>
		<!-- Morris Chart Dependencies -->
		<script type="text/javascript">
			var datas;
			
			//获取防空旅数据
		var getAjaxData = function(){
			var sele = $(".p").text();
				$.ajax({
					url:'<%=basePath%>pfgh_fkbAction!*findFkb',
					type:'post',
					dataType:'json',
					data:{select : sele},
					async:false,
					success:function(data){
						console.log(data);
						var nlzbzs = [];
							for(var i =0;i<data.length;i++){
								var ch1 = data[i].fkbChild;
		        				for(var j=0;j<ch1.length;j++){
		        					var ch2 = ch1[j].fkbChild;
		        				    for(var k=0;k<ch2.length;k++){
		        				    	var ch3 = ch2[k].fkbChild;
		        				        for(var l=0;l<ch3.length;l++){
		        				          nlzbzs.push(ch3[l].nlzbz);
		        				        }
		        				    }
		        				}
							}
						//将获取数据存入到界面上
						for(var i =0;i<nlzbzs.length;i++){
	        				$(".effect-9").each(function(i,v){
	        					$(this).val(nlzbzs[i]);
	        				});
	        			}
					}
				});
			};
		
			
				
			$(function(){
				 var ptext = $(".p").parent().find("label").eq(0).find(".pull-left").text();
				 $(".p").text(ptext);
				 
				 $(".circle-input").children().val("");		
				 
				 $(".sort-box").hover(
					function(){
						
				  	},
				  	function(){
				  		$(".sort-box").hide();
				  	}
				); 
			
				 getAjaxData();
				//计算探测能力
				$("#jstcnl").on("click",function(){
					var zdtcjl = document.getElementById("zdtcjl").value;
					var fxgl = document.getElementById("fxgl").value;
					var yfbznl = document.getElementById("yfbznl").value;
					var zgkfgl = document.getElementById("zgkfgl").value;
					var zdkfgl = document.getElementById("zdkfgl").value;
					var cdxs = document.getElementById("cdxs").value;
					$.ajax({
						url:'${webServiceURL}/LJPBzznl/zznl/power/1/'+zdtcjl+','+fxgl+','+yfbznl+','+zgkfgl+','+zdkfgl+','+cdxs+'/'+'0.2601,0.2488,0.1742,0.0690,0.1847',
						type:'get',
						dataType:'json',
						async:false,
						success:function(data){
							 var val = Math.round(data.value*10)/10;
	    		    			val11 = val;
	    		    			$("#jstcnl").parent().parent().find("td input[type=text]").val(val);
						}
						
					});
				});
				//计算情报能力
				$("#jsqbnl").on("click",function(){
					var kqsjnl = document.getElementById("kqsjnl").value;
					var kqcdnl = document.getElementById("kqcdnl").value;
					var kqsbnl = document.getElementById("kqsbnl").value;
					var kqclnl = document.getElementById("kqclnl").value;
					$.ajax({
						url:'${webServiceURL}/LJPBzznl/zznl/power/1/'+kqsjnl+','+kqcdnl+','+kqsbnl+','+kqclnl+'/'+'0.1714,0.1571,0.3572,0.3143',
						type:'get',
						dataType:'json',
						async:false,
						success:function(data){
							console.log(data);
							var val = Math.round(data.value*10)/10;
							var12 = val;
							$("#jsqbnl").parent().parent().find("td input[type=text]").val(val);
						}
					});
					
				});
				//计算目标定位能力
				$("#jsmbdw").on("click",function(){
					var tcjd = document.getElementById("tcjd").value;
					var fbl = document.getElementById("fbl").value;
					var mbrl = document.getElementById("mbrl").value;
					
					$.ajax({
						url:'${webServiceURL}/LJPBzznl/zznl/power/1/'+tcjd+','+fbl+','+mbrl+'/'+'0.4285,0.1430,0.4285',
						type:'get',
						dataType:'json',
						async:false,
						success:function(data){
							console.log(data);
							var val = Math.round(data.value*10)/10;
						    val13 = val;
						    $("#jsmbdw").parent().parent().find("td input[type=text]").val(val);
						}
					});
				});
				//计算侦察预警能力
				$("#jszcyjnl").on("click",function(){
					var jstcnl = $("#jstcnl").parent().parent().find("td input[type=text]").val();
					var jsqbnl = document.getElementById("qbnl").value;
					var jsmbdw = document.getElementById("mbdw").value;
					if(jstcnl == ""){
						$("#jstcnl").click();
					}
					if(jsqbnl == ""){
						$("#jsqbnl").click();
					}
					if(jsmbdw == ""){
						$("#jsmbdw").click();
					}
				   var	 jstcnl1 = $("#tcnl").val();
				   var	 jsqbnl1 = $("#qbnl").val();
				   var	 jsmbdw1 = $("#mbdw").val();
					$.ajax({
						'url':'${webServiceURL}/LJPBdjnl/djnl/power/1/'+jstcnl1+','+jsqbnl1+','+jsmbdw1+'/'+'0.3333,0.3333,0.3334',
						'type':'get',
						'dataType':'json',
						'async':false,
						success:function(data){
							var val = Math.round(data.value*10)/10;
							val1 = val;
							circleDom('打击能力','circleDom',val*100);
							$('.slider-num-point').eq(0).slider('setValue',val*10);
						}
					});
				});
				
				//计算指挥控制能力
				$("#jszhkznl").on("click",function(){
					var zzjhnl = document.getElementById("zzjhnl").value;
					var jcnl =   document.getElementById("jcnl").value;
					var xxhqnl = document.getElementById("xxhqnl").value;
					var zckznl = document.getElementById("zckznl").value;
					var zhxtnl = document.getElementById("zhxtnl").value;
					$.ajax({
						url:'${webServiceURL}/LJPBdjnl/djnl/power/1/'+zzjhnl+','+jcnl+','+xxhqnl+','+zckznl+','+zhxtnl+'/'+'0.1528,0.1102,0.3131,0.2528,0.1711',
						type:'get',
						dataType:'json',
						async:false,
						success:function(data){
							var val = Math.round(data.value*10)/10;
							val2 = val;
							circleDom('指挥控制能力','circleDom2',val*100);
							$('.slider-num-point').eq(1).slider('setValue',val*10);
						}
					});
				});
				
				
				//计算火力覆盖能力
				$("#jshlfgnl").on("click",function(){
					var bqhlfw = document.getElementById("bqhlfw").value;
					var ssgl = document.getElementById("ssgl").value;
					$.ajax({
						url:'${webServiceURL}/LJPBzznl/zznl/power/1/'+bqhlfw+','+ssgl+'/'+'0.5053,0.4947',
						type:'get',
						dataType:'json',
						async:false,
						success:function(data){
							var val = Math.round(data.value*10)/10;
							val14 = val;
							$("#jshlfgnl").parent().parent().find("td input[type=text]").val(val);
						}
					});
					
				});
				//计算火力转移能力
				$("#jshlzynl").on("click",function(){
					var zbsj = document.getElementById("zbsj").value;
					var zysj = document.getElementById("zysj").value;
					var fysj = document.getElementById("fysj").value;
 					$.ajax({
						url:'${webServiceURL}/LJPBzznl/zznl/power/1/'+zbsj+','+zysj+','+fysj+'/'+'0.2741,0.5283,0.1976',
						type:'get',
						dataType:'json',
						async:false,
						success:function(data){
							var val = Math.round(data.value*10)/10;
							val15 = val;
							$("#jshlzynl").parent().parent().find("td input[type=text]").val(val);
						}
					});
				});
				//计算火力服务能力
				$("#jshlfwnl").on("click",function(){
					var knsjgl = document.getElementById("knsjgl").value;
					var sjcs = document.getElementById("sjcs").value;
					
					$.ajax({
						url:'${webServiceURL}/LJPBzznl/zznl/power/1/'+knsjgl+','+sjcs+'/'+'0.4815,0.5185',
						type:'get',
						dataType:'json',
						async:false,
						success:function(data){
							var val = Math.round(data.value*10)/10;
							val16 = val;
							$("#jshlfwnl").parent().parent().find("td input[type=text]").val(val);
						}
					});
				});
				//计算火力集中能力
				$("#jshljznl").on("click",function(){
					var hlmd = document.getElementById("hlmd").value;
					var dymd = document.getElementById("dymd").value;
					
					$.ajax({
						url:'${webServiceURL}/LJPBzznl/zznl/power/1/'+hlmd+','+dymd+'/'+'0.5015,0.4985',
						type:'get',
						dataType:'json',
						async:false,
						success:function(data){
							var val = Math.round(data.value*10)/10;
							val17 = val;
							$("#jshljznl").parent().parent().find("td input[type=text]").val(val);
						}
					});
				});
				//计算火力毁伤能力
				$("#jshlhsnl").on("click",function(){
					var wcrwnl = document.getElementById("wcrwnl").value;
					var czknx = document.getElementById("czknx").value;
					var hsgl = document.getElementById("hsgl").value;
					var zymbds = document.getElementById("zymbds").value;
					
					$.ajax({
						url:'${webServiceURL}/LJPBzznl/zznl/power/1/'+wcrwnl+','+czknx+','+hsgl+','+zymbds+'/'+'0.1176,0.1765,0.4706,0.2353',
						type:'get',
						dataType:'json',
						async:false,
						success:function(data){
							var val = Math.round(data.value*10)/10;
							val18 = val;
							$("#jshlhsnl").parent().parent().find("td input[type=text]").val(val);
						}
					});
				});
			//计算火力拦截能力
			$("#jshlljnl").on("click",function(){
				var hlfgnl = $("#hlfgnl").val();
				var hlzynl = $("#hlzynl").val();
				var hlfwnl = $("#hlfwnl").val();
				var hljznl = $("#hljznl").val();
				var hlhsnl = $("#hlhsnl").val();
				if(hlfgnl == ""){
					$("#jshlfgnl").click();
				}
				if(hlzynl == ""){
					$("#jshlzynl").click();
				}
				if(hlfwnl == ""){
					$("#jshlfwnl").click();
				}
				if(hljznl == ""){
					$("#jshljznl").click();
				}
				if(hlhsnl == ""){
					$("#jshlhsnl").click();
				}
				var hlfgnl1 = $("#hlfgnl").val();
				var hlzynl1 = $("#hlzynl").val();
				var hlfwnl1 = $("#hlfwnl").val();
				var hljznl1 = $("#hljznl").val();
				var hlhsnl1 = $("#hlhsnl").val();
				$.ajax({
					url:'${webServiceURL}/LJPBdjnl/djnl/power/1/'+hlfgnl1+','+hlzynl1+','+hlfwnl1+','+hljznl1+','+hlhsnl1+'/'+'0.2235,0.1126,0.3101,0.1322,0.2216',
					type:'get',
					dataType:'json',
					async:false,
					success:function(data){
						var val = Math.round(data.value*10)/10;
						val3 = val;
						circleDom('火力拦截能力','circleDom3',val*100);
						$('.slider-num-point').eq(2).slider('setValue',val*10);
					}
				});
			});
			
			//计算机动能力
			$("#jsjdnl").on("click",function(){
				var jdjl = document.getElementById("jdjl").value;
				var jdsd = document.getElementById("jdsd").value;
				var zhsj = document.getElementById("zhsj").value;
				var txnl = document.getElementById("txnl").value;
				$.ajax({
					url:'${webServiceURL}/LJPBdjnl/djnl/power/1/'+jdjl+','+jdsd+','+zhsj+','+txnl+','+'/'+'0.1908,0.3978,0.2861,0.1253',
					type:'get',
					dataType:'json',
					async:false,
					success:function(data){
						var val = Math.round(data.value*10)/10;
						val4 = val;
						circleDom('机动能力','circleDom4',val*100);
						$('.slider-num-point').eq(3).slider('setValue',val*10);
					}
				});
			}
			);
			//计算电子防护能力
			$("#jsdzfhnl").on("click",function(){
				var fdzcnl = $("#fdzcnl").val();
				var kdgrnl = $("#kdgrnl").val();
				var fdchnl = $("#fdchnl").val();
				$.ajax({
					url:'${webServiceURL}/LJPBdjnl/djnl/power/1/'+fdzcnl+','+kdgrnl+','+fdchnl+'/'+'0.2439,0.2543,0.5018',
					type:'get',
					dataType:'json',
					async:false,
					success:function(data){
						var val = Math.round(data.value*10)/10;
						val19 = val;
						$("#dzfhnl").val(val);
					}
				});
			});
			//计算电子进攻能力
			$("#jsdzjgnl").on("click",function(){
				var grgl = $("#grgl").val();
				var pjgrsj = $("#pjgrsj").val();
				var bgrgl = $("#bgrgl").val();
				
				$.ajax({
					url:'${webServiceURL}/LJPBdjnl/djnl/power/1/'+grgl+','+pjgrsj+','+bgrgl+'/'+'0.2212,0.4475,0.3313',
					type:'get',
					dataType:'json',
					async:false,
					success:function(data){
						var val = Math.round(data.value*10)/10;
						var20 =val;
						$("#dzjgnl").val(val);
					}
				});
			});
			//计算电子对抗能力
			$("#jsdzdknl").on("click",function(){
				var dzfhnl = $("#dzfhnl").val();
				var dzjgnl = $("#dzjgnl").val();
				if(dzfhnl == ""){
					$("#jsdzfhnl").click();
				}
				if(dzjgnl == ""){
					$("#jsdzjgnl").click();
				}
				var dzfhnl1 = $("#dzfhnl").val();
				var dzjgnl1 = $("#dzjgnl").val();
				$.ajax({
					url:'${webServiceURL}/LJPBdjnl/djnl/power/1/'+dzfhnl1+','+dzjgnl1+'/'+'0.5376,0.4624',
					type:'get',
					dataType:'json',
					async:false,
					success:function(data){
						var val = Math.round(data.value*10)/10;
						val5 = val;
						circleDom('电子对抗能力','circleDom5',val*100);
						$('.slider-num-point').eq(4).slider('setValue',val*10);
					}
				});
			});
			//计算战斗保障能力
			$("#jszdbznl").on("click",function(){
				var qxbznl = document.getElementById("qxbznl").value;
				var txbznl = $("#txbznl").val();
				var gcbznl = document.getElementById("gcbznl").value;
				var wzfhnl = $("#wzfhnl").val();
				var sfnl = $("#sfnl").val();
				$.ajax({
					url:'${webServiceURL}/LJPBdjnl/djnl/power/1/'+qxbznl+','+txbznl+','+gcbznl+','+wzfhnl+','+sfnl+'/'+'0.1108,0.1522,0.2131,0.2528,0.2711',
					type:'get',
					dataType:'json',
					async:false,
					success:function(data){
						var val = Math.round(data.value*10)/10;
						val21 = val;
						$("#zdbznl").val(val);
					}
				});
			});
			//计算后勤保障能力
			$("#jshqbznl").on("click",function(){
				var wzbznl = document.getElementById("wzbznl").value;
				var jfbznl = document.getElementById("jfbznl").value;
				var wqbznl = document.getElementById("wqbznl").value;
				var ysbznl = document.getElementById("ysbznl").value;
				$.ajax({
					url:'${webServiceURL}/LJPBdjnl/djnl/power/1/'+wzbznl+','+jfbznl+','+wqbznl+','+ysbznl+'/'+'0.4,0.2,0.2,0.2',
					type:'get',
					dataType:'json',
					async:false,
					success:function(data){
						var val = Math.round(data.value*10)/10;
						val22 = val;
						$("#jshqbznl").parent().parent().find("td input[type=text]").val(val);
					}
				});
			});
			//计算装备技术保障能力
			$("#jszbjsbznl").on("click",function(){
				var zbbcnl = $("#zbbcnl").val();
				var zbsyglnl = $("#zbsyglnl").val();
				var zbwxnl = $("#zbwxnl").val();
				var dybznl = $("#dybznl").val();
				$.ajax({
					url:'${webServiceURL}/LJPBdjnl/djnl/power/1/'+zbbcnl+','+zbsyglnl+','+zbwxnl+','+dybznl+'/0.3044,0.3013,0.2921,0.1022',
					type:'get',
					dataType:'json',
					async:false,
					success:function(data){
						var val = Math.round(data.value*10)/10;
						val23 = val;
						$("#zbjsbznl").val(val);
					}
				});
			});
			//计算综合保障能力
			$("#jszhbznl").on("click",function(){
				var zdbznl = $("#zdbznl").val();
				var hqbznl = $("#hqbznl").val();
				var zbjsbznl = $("#zbjsbznl").val();
				if(zdbznl == ""){
					$("#jszdbznl").click();
				}
				if(hqbznl == ""){
					$("#jshqbznl").click();
				}
				if(zbjsbznl == ""){
					$("#jszbjsbznl").click();
				}
			   	 zdbznl = $("#zdbznl").val();
				 hqbznl = $("#hqbznl").val();
				 zbjsbznl = $("#zbjsbznl").val();
				$.ajax({
					url:'${webServiceURL}/LJPBdjnl/djnl/power/1/'+zdbznl+','+hqbznl+','+zbjsbznl+'/0.3600,0.3100,0.3300',
					type:'get',
					dataType:'json',
					async:false,
					success:function(data){
						var val = Math.round(data.value*10)/10;
						val6 = val;
						circleDom('综合保障能力','circleDom6',val*100);
						$('.slider-num-point').eq(5).slider('setValue',val*10);
					}
				});
			});
			
			//计算雷达图
			  $("#ldt").on("click",function(){
    		    	$("#jszcyjnl").click();
    		    	$("#jszhkznl").click();
    		    	$("#jshlljnl").click();
    		    	$("#jsjdnl").click();
    		    	$("#jsdzdknl").click();
    		    	$("#jszhbznl").click();
    		    	option.series[0].data[0].value = [val1,val2,val3,val4,val5,val6];
    		    	myChart.setOption(option);
    		    });
			
			//计算作战综合能力
			$("#zzzhnl").on("click",function(){
				$("#ldt").click();
				$.ajax({
					url:'${webServiceURL}/LJPBdjnl/djnl/power/1/'+val1+','+val2+','+val3+','+val4+','+val5+','+val6+'/0.1879,0.2650,0.1784,0.0912,0.1731,0.1044',
					type:'get',
					dataType:'json',
					async:false,
					success:function(data){
						var val = Math.round(data.value*100);
		    			carCir(val);
					}
				});
			});
			
			//作战能力评估
			$("#zznlpg").on("click",function(){
				var count = 0;
		    	var pg = [];
		    	$("#tab").find(".progress-bar").each(function(i,v){
		    		pg.push($(v).text());
		    	});
		    	for(var i=0;i<pg.length;i++){
		    		if(pg[i]==0){
		    			count++;
		    		}
		    	}
		    	if(count == 0){
		    		option.series[0].data[0].value = pg;
    		    	myChart.setOption(option);
    					$.ajax({
    						url:'${webServiceURL}/LJPBdjnl/djnl/power/1/'+pg+'/0.1879,0.2650,0.1784,0.0912,0.1731,0.1044',
    						type:'get',
    						dataType:'json',
    						async:false,
    						success:function(data){
    							var val = Math.round(data.value*100);
    			    			carCir(val);
    						}
    				});
    		    	
		    	}else{
		    		alert("请分配所有"+pg.length+"项能力值！！！");
		    	}
			});
			});
		</script>
		<script src="js/layout.js"></script>
		<script type="text/javascript">
			function foceDom(){
				require.config({
					paths: {
						echarts: 'build/dist'
					}
				});
				
				// 使用
				require(
					[
						'echarts',
						'echarts/chart/radar' // 使用柱状图就加载bar模块，按需加载在resource中
					],
					function (ec) {
						// 基于准备好的dom，初始化echarts图表
						 myChart = ec.init(document.getElementById('forceDom')); 
						
						
						option = {
							
							tooltip : {
								trigger: 'axis'
							},
							legend: {
								show : false,
								orient : 'horizontal',
								 x : 'center',
								 y : '99%',
								data:['防空兵团'],
								textStyle:{
									color: '#fff',
									fontFamily:'黑体',
									fontSize: '16'
								}
							},
							toolbox: {
								show : false,
								feature : {
									mark : {show: true},
									dataView : {show: true, readOnly: false},
									restore : {show: true},
									saveAsImage : {show: true}
								}
							},
							polar : [
							   {
								   indicator : [
									   { text: '侦察预警能力', max: 1},
									   { text: '指挥控制能力', max: 1},
									   { text: '火力拦截能力', max: 1},
									   { text: '机动能力', max: 1},
									   { text: '电子对抗能力', max: 1},
									   { text: '综合保障能力', max: 1}
									],
									name:{
										show: true,
										formatter: null,
										textStyle: {
											color:'#fff',
											fontFamily:'黑体',
											fontSize: '16'
										}
									}   
								}
							],
							calculable : true,
							series : [
								{
									name: '',
									type: 'radar',
									data : [
										{
											value : [0, 0, 0, 0, 0, 0],
											name : '防空兵团'
										}
									]
								}
							]
						};
                    
						// 为echarts对象加载数据 
						myChart.setOption(option); 
					}
				);
			}
			foceDom();
			function carCir(val){
				require.config({
					paths: {
						echarts: 'build/dist'
					}
				});
				
				// 使用
				require(
					[
						'echarts',
						'echarts/chart/gauge' // 使用柱状图就加载bar模块，按需加载在resource中
					],
					function (ec) {
						// 基于准备好的dom，初始化echarts图表
						 myChart1 = ec.init(document.getElementById('carCir')); 
						
						
						option1 = {
							tooltip : {
								formatter: "{a} <br/>{b} : {c}%"
							},
							toolbox: {
								show : false,
								feature : {
									mark : {show: true},
									restore : {show: true},
									saveAsImage : {show: true}
								}
							},
							series : [
								{
									name:'综合能力',
									type:'gauge',
									startAngle: 180,
									endAngle: 0,
									center : ['50%', '90%'],    // 默认全局居中
									radius : ['100', '196'],
									axisLine: {            // 坐标轴线
										lineStyle: {       // 属性lineStyle控制线条样式
											//color: [[0.2, 'rgba(34,139,34.8)'],[0.8, 'rgba(68,136,187.8)'],[1, 'rgba(255,69,0.8)']], 
											color: [[0.2, 'rgba(34,139,34,.5)'],[0.8, 'rgba(68,136,187,.5)'],[1, 'rgba(255,69,0,.5)']], 
											width: 70
										}
									},
									axisTick: {      
										show: false,       // 坐标轴小标记
										splitNumber: 10,   // 每份split细分多少段
										length :12,        // 属性length控制线长
									},
									axisLabel: {           // 坐标轴文本标签，详见axis.axisLabel
										formatter: function(v){
											switch (v+''){
												case '20': return '较弱';
												case '40': return '一般';
												case '60': return '较强';
												case '80': return '超强';
												default: return '';
											}
										},
										textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
											color: '#fff',
											fontSize: 16,
											fontWeight: 'bolder',
											fontFamily:'黑体'
										}
									},
									pointer: {
										width:20,
										length: '90%',
										color: 'rgba(255, 255, 255, 0.8)'
									},
									title : {
										show : true,
										offsetCenter: [0, '-40%'],       // x, y，单位px
										textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
											color: '#fff',
											fontSize: 20,
											fontFamily:'黑体'
										}
									},
									detail : {
										show : true,
										backgroundColor: 'rgba(0,0,0,0)',
										borderWidth: 0,
										borderColor: '#ccc',
										width: 100,
										height: 80,
										offsetCenter: [0, -40],       // x, y，单位px
										//formatter:option.series[0].data[0].value/100,
										formatter:'{value}%',
										textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
											fontSize : 24,
											color:'rgba(255,69,0,1)'
										}
									},
									data:[
										{
											value: val,
											name: '综合能力'
										}
									]
								}
							]
						};
						// 为echarts对象加载数据 
						myChart1.setOption(option1); 
					}
				);
			}
			carCir(0);
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
						var myChart2 = ec.init(document.getElementById(idName)); 
						
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
										return (100 - params.value)/100
									},
									textStyle: {
										baseline : 'middle',
										fontSize:32,
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
						var radius = [80, 68];
						option2 = {
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
						myChart2.setOption(option2); 
					}
				);
			}
			circleDom('侦察预警能力','circleDom',0); //打击能力
			circleDom('指挥控制能力','circleDom2',0); //机动能力
			circleDom('火力拦截能力','circleDom3',0); //机动能力
			circleDom('机动能力','circleDom4',0); //机动能力
			circleDom('电子对抗能力','circleDom5',0); //机动能力
			circleDom('综合保障能力','circleDom6',0); //机动能力
		</script>
	</body>
</html>