<%@page pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
		<title>炮兵作战能力评估</title>
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
					<p>炮兵作战能力评估</p>
				</a>
			</div>
			<div class="am-top-nav">
				<ul>
					<li class="active button--moema"><a>炮兵作战能力</a></li>
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
								<p>炮兵作战能力</p>
								<div class="am-title-notice pull-right js-am-title-notice m-l-10 am-title-notice-active">
									<div class="p">
										...
									</div>
									<b class="fa fa-sort-asc" style=""></b>
									<div class="sort-box" style="margin-left:-105px;" hidden>
										<div class="more-setting" style="width:220px;">
											<c:forEach items="${selects }" var="s" >
												<div class="am-title-notice pull-left ">
													<div class="smart-form pull-left m-t-8 m-r-10">
														<label class="radio">
															<input type="radio" name="checkbox-inline" >
															<i></i><div class="pull-left" style="margin:-2px 0 0 17px;color:#fff;font-size:15px;">${s}</div>
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
										<a style="" class="active">打击能力</a>
										<a style="">机动能力</a>
										<a style="">防护能力</a>
										<a style="">侦查能力</a>
										<a style="">指挥控制能力</a>
										<a style="">持续作战能力</a>  
									</div>
									<div class="tab-box-content p-t-20" style="width:100%;height:335px;">
										<div class="col-lg-4" >
											<table class="am-table am-table-bordered am-table-striped am-table-hover "  >
												<thead>
													<tr>
														<th colspan="2" class="t-center">
															电子、干扰能力
														</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">干扰频带宽度</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.1">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">干扰距离</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.1">
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
															<td></td>
															<td></td>
														</tr>
														<tr>
															<td style="height:90px !important" class="t-center">
																<div id="jsdzgr" class="am-btn-lg">计算电子、干扰能力</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text" value="0.1" class="t-center">
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
										<div class="col-lg-4">
											<table class="am-table am-table-bordered am-table-striped  "  >
												<thead>
													<tr>
														<th colspan="2" class="t-center">火力能力</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%"class="t-center">直瞄火力</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.1">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">间瞄支援火力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.1">
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
															<td></td>
															<td></td>
														</tr>
														<tr>
															<td style="height:90px !important" class="t-center">
																<div id="hlnl" class="am-btn-lg">计算火力能力</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text" value="0.1" class="t-center">
																</div>
															</td>
													</tbody>
												</table>
											</div>
										</div>
										<div class="col-lg-4">
											<table class="am-table am-table-bordered am-table-striped am-table-striped-light"  >
												<thead>
													<tr>
														<th colspan="2" class="t-center" >打击能力</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">
																<div id="jsdjnl" class="am-btn-lg">计算打击能力</div>
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
									<!-- 打击能力 end -->
									<div class="tab-box-content p-t-20" style="width:100%;height:335px;" hidden>
										<div class="col-lg-3">
											<table class="am-table am-table-bordered am-table-striped am-table-hover "  >
												<thead>
													<tr>
														<th colspan="2" class="t-center">
															运动保障能力
														</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">作业能力</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.1">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">作业速度</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.1">
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
															<td></td>
															<td></td>
														</tr>
														<tr>
															<td style="height:90px !important" class="t-center">
																<div id="jsydbznl" class="am-btn-lg">计算运动保障能力</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text" value="0.1" class="t-center">
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
										<div class="col-lg-3">
											<table class="am-table am-table-bordered am-table-striped am-table-hover "  >
												<thead>
													<tr>
														<th colspan="2" class="t-center">
															运动能力
														</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">牵引</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.5">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">自行</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.6">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">履带</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.4">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">轮式</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.8">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td style="height:90px !important" class="t-center">
																<div id="jsydnl" class="am-btn-lg">计算运动能力</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text" value="0.7" class="t-center">
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
														<th colspan="2" class="t-center">速度</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">履带</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.6">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">牵引</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.7">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">自行</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.5">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">轮式</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.7">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td style="height:90px !important" class="t-center">
																<div id="jssdnl" class="am-btn-lg">计算速度能力</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text" value="0.6" class="t-center">
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
														<th colspan="2" class="t-center" >机动能力</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">
																<div id="jsjdnl" class="am-btn-lg">计算机动能力</div>
															</td>
															<td style="height:253px !important;padding:20px 0px;" class="t-center">
																<div id="circleDom2" style="width:200px;height:200px;margin:0 auto;">
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
										<div class="col-lg-3">
											<table class="am-table am-table-bordered am-table-striped am-table-hover "  >
												<thead>
													<tr>
														<th colspan="2" class="t-center">
															对地面火力防护能力
														</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">人员防杀伤器材</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.7">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">构筑工事及其防护能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.8">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">伪装能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.7">
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
																<div id="ddmhlfhnl" class="am-btn-lg">对地面火力防护能力</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text" value="0.8" class="t-center">
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
										<div class="col-lg-3">
											<table class="am-table am-table-bordered am-table-striped am-table-hover "  >
												<thead>
													<tr>
														<th colspan="2" class="t-center">
															防核化燃烧能力
														</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">构筑工事及其防护能力</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.7">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">专业防护能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.8">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">伪装能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.7">
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
																<div id="fhhrsnl" class="am-btn-lg">计算防核化燃烧能力</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text" value="0.8" class="t-center">
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
														<th colspan="2" class="t-center">防空能力</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">构筑工事及其防护能力</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.9">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">伪装能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.9">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">对空掩护能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.8">
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
																<div id="jsfknl" class="am-btn-lg">计算防空能力</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text" value="0.9" class="t-center">
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
														<th colspan="2" class="t-center" >防护能力</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">
																<div id="jsfhnl" class="am-btn-lg">计算防护能力</div>
															</td>
															<td style="height:253px !important;padding:20px 0px;" class="t-center">
																<div id="circleDom3" style="width:200px;height:200px;margin:0 auto;">
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
									</div>
									<!-- 防护能力 end -->
									<div class="tab-box-content p-t-20" style="width:100%;height:335px;" hidden>
										<div class="col-lg-9" style="padding:0;">
											<div class="col-lg-3">
												<table class="am-table am-table-bordered am-table-striped am-table-hover "  >
													<thead>
														<tr>
															<th colspan="2" class="t-center">
																侦查密度
															</th>
														</tr>
													</thead>
												</table>
												<div class="src-bar">
													<table class="am-table am-table-bordered am-table-striped"  >
														<tbody>
															<tr>
																<td width="50%" class="t-center">侦查器材数量</td>
																<td width="50%">
																	<div class="effect-9-box">
																		<input class="effect-9 t-center" type="text" value="0.9">
																		<span class="focus-border">
																			<i></i>
																		</span>
																	</div>
																</td>
															</tr>
															<tr>
																<td class="t-center">侦查器材性能</td>
																<td>
																	<div class="effect-9-box">
																		<input class="effect-9 t-center" type="text" value="0.9">
																		<span class="focus-border">
																			<i></i>
																		</span>
																	</div>
																</td>
															</tr>
															<tr>
																<td class="t-center">侦查手段</td>
																<td>
																	<div class="effect-9-box">
																		<input class="effect-9 t-center" type="text" value="0.9">
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
																	<div id="jszcmd" class="am-btn-lg">计算侦查密度</div>
																</td>
																<td>
																	<div class="circle-input">
																		<input type="text" value="0.9" class="t-center">
																	</div>
																</td>
															</tr>
														</tbody>
													</table>
												</div>
											</div>
											<div class="col-lg-3">
												<table class="am-table am-table-bordered am-table-striped am-table-hover "  >
													<thead>
														<tr>
															<th colspan="2" class="t-center">
																准确程度
															</th>
														</tr>
													</thead>
												</table>
												<div class="src-bar">
													<table class="am-table am-table-bordered am-table-striped"  >
														<tbody>
															<tr>
																<td width="50%" class="t-center">侦查器材数量</td>
																<td width="50%">
																	<div class="effect-9-box">
																		<input class="effect-9 t-center" type="text" value="0.8">
																		<span class="focus-border">
																			<i></i>
																		</span>
																	</div>
																</td>
															</tr>
															<tr>
																<td class="t-center">侦查器材性能</td>
																<td>
																	<div class="effect-9-box">
																		<input class="effect-9 t-center" type="text" value="0.8">
																		<span class="focus-border">
																			<i></i>
																		</span>
																	</div>
																</td>
															</tr>
															<tr>
																<td class="t-center">侦查手段</td>
																<td>
																	<div class="effect-9-box">
																		<input class="effect-9 t-center" type="text" value="0.7">
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
																	<div id="jszqcd" class="am-btn-lg">计算准确程度</div>
																</td>
																<td>
																	<div class="circle-input">
																		<input type="text" value="0.8" class="t-center">
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
															<th colspan="2" class="t-center">全天候侦查能力</th>
														</tr>
													</thead>
												</table>
												<div class="src-bar">
													<table class="am-table am-table-bordered am-table-striped"  >
														<tbody>
															<tr>
																<td width="50%" class="t-center">侦查器材性能</td>
																<td width="50%">
																	<div class="effect-9-box">
																		<input class="effect-9 t-center" type="text" value="0.9">
																		<span class="focus-border">
																			<i></i>
																		</span>
																	</div>
																</td>
															</tr>
															<tr>
																<td class="t-center">侦查手段</td>
																<td>
																	<div class="effect-9-box">
																		<input class="effect-9 t-center" type="text" value="0.9">
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
																<td></td>
																<td></td>
															</tr>
															<tr>
																<td style="height:90px !important" class="t-center">
																	<div id="jsqthzcnl" class="am-btn-lg">计算全天候侦查能力</div>
																</td>
																<td>
																	<div class="circle-input">
																		<input type="text" value="0.9" class="t-center">
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
															<th colspan="2" class="t-center">侦查范围</th>
														</tr>
													</thead>
												</table>
												<div class="src-bar">
													<table class="am-table am-table-bordered am-table-striped"  >
														<tbody>
															<tr>
																<td width="50%" class="t-center">侦查器材性能</td>
																<td width="50%">
																	<div class="effect-9-box">
																		<input class="effect-9 t-center" type="text" value="0.9">
																		<span class="focus-border">
																			<i></i>
																		</span>
																	</div>
																</td>
															</tr>
															<tr>
																<td class="t-center">侦查手段</td>
																<td>
																	<div class="effect-9-box">
																		<input class="effect-9 t-center" type="text" value="0.9">
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
																<td></td>
																<td></td>
															</tr>
															<tr>
																<td style="height:90px !important" class="t-center">
																	<div id="jszcfw" class="am-btn-lg">计算侦查范围</div>
																</td>
																<td>
																	<div class="circle-input">
																		<input type="text" value="0.9" class="t-center">
																	</div>
																</td>
															</tr>
														</tbody>
													</table>
												</div>
											</div>
										</div>
										<div class="col-lg-3">
											<table class="am-table am-table-bordered am-table-striped am-table-striped-light"  >
												<thead>
													<tr>
														<th colspan="2" class="t-center" >侦查能力</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">
																<div id="jszcnl" class="am-btn-lg">计算侦查能力</div>
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
									<!-- 侦查能力 end -->
									<div class="tab-box-content p-t-20" style="width:100%;height:335px;" hidden>
										<div class="col-lg-3">
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
															<td width="50%" class="t-center">电子欺骗能力</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.7">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">抗电子干扰能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.6">
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
															<td></td>
															<td></td>
														</tr>
														<tr>
															<td style="height:90px !important" class="t-center">
																<div id="jsdzfhnl" class="am-btn-lg">计算电子防护能力</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text" value="0.6" class="t-center">
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
										<div class="col-lg-3">
											<table class="am-table am-table-bordered am-table-striped am-table-hover "  >
												<thead>
													<tr>
														<th colspan="2" class="t-center">
															通信能力
														</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">无线电通信能力</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.5">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">有线电通信能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.6">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">运动通信能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.4">
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
																<div id="jstxnl" class="am-btn-lg">计算通信能力</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text" value="0.7" class="t-center">
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
														<th colspan="2" class="t-center">指挥能力</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">指挥效率</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.6">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">指挥方法</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.7">
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
															<td></td>
															<td></td>
														</tr>
														<tr>
															<td style="height:90px !important" class="t-center">
																<div id="jszhnl" class="am-btn-lg">计算指挥能力</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text" value="0.6" class="t-center">
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
														<th colspan="2" class="t-center" >指挥控制能力</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">
																<div id="jszhkznl" class="am-btn-lg">计算指挥控制能力</div>
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
									<!-- 控制指挥能力 end -->
									<div class="tab-box-content p-t-20" style="width:100%;height:335px;" hidden>
										<div class="col-lg-3">
											<table class="am-table am-table-bordered am-table-striped am-table-hover "  >
												<thead>
													<tr>
														<th colspan="2" class="t-center">
															协同与编组能力
														</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">协同程度</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.7">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">火炮编组</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.6">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">部队编组</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.6">
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
																<div id="jsxtbznl" class="am-btn-lg">计算协同与编组能力</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text" value="0.6" class="t-center">
																</div>
															</td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
										<div class="col-lg-3">
											<table class="am-table am-table-bordered am-table-striped am-table-hover "  >
												<thead>
													<tr>
														<th colspan="2" class="t-center">
															保障能力
														</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">卫生勤务能力</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.5">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">技术保障能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.6">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">后勤保障能力</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.4">
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
																<div id="jsbznl" class="am-btn-lg">计算保障能力</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text" value="0.7" class="t-center">
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
														<th colspan="2" class="t-center">消耗</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">人员损耗</td>
															<td width="50%">
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.6">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">物资器材损伤</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.7">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">油料消耗</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.5">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td class="t-center">弹药消耗</td>
															<td>
																<div class="effect-9-box">
																	<input class="effect-9 t-center" type="text" value="0.7">
																	<span class="focus-border">
																		<i></i>
																	</span>
																</div>
															</td>
														</tr>
														<tr>
															<td style="height:90px !important" class="t-center">
																<div id="jsxh" class="am-btn-lg">计算消耗</div>
															</td>
															<td>
																<div class="circle-input">
																	<input type="text" value="0.6" class="t-center">
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
														<th colspan="2" class="t-center" >持续作战能力</th>
													</tr>
												</thead>
											</table>
											<div class="src-bar">
												<table class="am-table am-table-bordered am-table-striped"  >
													<tbody>
														<tr>
															<td width="50%" class="t-center">
																<div id="jscxzznl" class="am-btn-lg">计算持续作战能力</div>
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
									<!-- 机动能力 end -->
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
									<p>炮兵作战能力雷达图</p>
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
									<p>炮兵作战能力评估</p>
									<div id="pgz" class="am-btn-1 pull-right button--moema">
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
										<table class="am-table am-table-bordered am-table-striped am-table-hover"  id="tab">
											<tbody>
												<tr>
													<td width="40%">
														打击能力
													</td>
													<td width="60%" class="showTips table-Show-slider">
														<div class="progress">
															<div id="vv" class="progress-bar " aria-valuetransitiongoal="100" aria-valuenow="100">7</div>
														</div>
														<div class="slider-box tips" style="display:none;">
															<input id="dj" type="text" class="slider-num-point slider-success" value="" 
																		data-sliderinput-min="0" 
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
														防护能力
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
														侦查能力
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
														持续作战能力
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
									<div id="zzzhnl" class="am-btn-1 pull-right button--moema">
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
		<!-- <div class="dialog-overlay-1"></div> -->
		<script src="build/dist/echarts.js"></script>
		<script src="js/divscroll.js"></script>
		<script src="js/jquery-awesomodals.min.js"></script>
		<script src="js/bootstrap-slider.js"></script>
		<script src="js/ui-choose.js"></script>
		<script type="text/javascript">
		    var datas;
		    
		    var getAjaxVal = function(){
		    	var sele = $(".p").text();
				$.ajax({
	        		url:'<%=basePath%>ty_zznlxxAction!*findZznlxx',
	        		type:'post',
	        		data:{select:sele},
	        		dataType:'json',
	        		async:false,
	        		success:function(data){
	        			datas = data ;
	        			var nlzbzs = [];
	        			if(data.length != 0){
	        				for(var i=0;i<data.length;i++){
		        				var ch1 = data[i].children;
		        				if(ch1.length !=0){
		        					for(var j=0;j<ch1.length;j++){
			        					var ch2 = ch1[j].children;
			        				    //console.log(ch1[j]);
			        				    if(ch2.length !=0){
			        				    	for(var k=0;k<ch2.length;k++){
				        				    	var ch3 = ch2[k].children;
				        				        //console.log(ch2[k]);
				        				        if(ch3.length !=0){
				        				        	for(var l=0;l<ch3.length;l++){
					        				            //console.log(ch3[l]);
					        				            //console.log(ch3[l].nlzbz);
					        				            nlzbzs.push(ch3[l].nlzbz);
						        				    }
						        				        //console.log("-------------------");
				        				        }
				        				    }
				        				     //console.log("|||||||||||||||||||||||");
			        				    }
			        				}
		        				}else{
		        					alert("此下拉选没有值！！！");
		        				}
		        			}
	        			}else{
	        				alert("无数据！！！");
	        			}
	        			//console.log(nlzbzs);
	        			//console.log(nlzbzs.length);
	        			$(".effect-9").each(function(i,v){
        					$(this).val("");
        				});
	        			for(var i =0;i<nlzbzs.length;i++){
	        				$(".effect-9").each(function(i,v){
	        					$(this).val(nlzbzs[i]);
	        				});
	        			}
	        		}
	        	}); 
		    };
		    
		    var zhnlt = function(val1,val2,val3,val4,val5,val6){
		    	$.ajax({
		    		'url':'${webServiceURL}/LJPBzznl/zznl/power/1/'+val1+','+val2+','+val3+','+val4+','+val5+','+val6+'/'+datas[0].children[0].nlzbqz+','+datas[0].children[1].nlzbqz+','+datas[0].children[2].nlzbqz+','+datas[0].children[3].nlzbqz+','+datas[0].children[4].nlzbqz+','+datas[0].children[5].nlzbqz,
		    		'type':'get',
		    		'dataType':'json',
		    		'async':false,
		    		'success':function(data){
		    			var val = Math.round(data.value*100);
		    			carCir(val);
		    		}
		    	});
		    }
		    
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
			
				getAjaxVal();
				 
				$(".p").parent().find("input[type=radio]:first").prop("checked",true);
				$(".p").parent().find(".radio").on("change",function(){
					var se = $(this).find(".pull-left").text();
				  	$(".p").text(se);
				  	getAjaxVal();
				});
				
				$("#jsdzgr").on("click",function(){
    				var pdkd = $("#jsdzgr").parent().parent().siblings('tr').eq(0).find("input").val();
    				var jl = $("#jsdzgr").parent().parent().siblings('tr').eq(1).find("input").val();
    				$.ajax({
    		    		'url':'${webServiceURL}/LJPBdzgrnl/dzgrnl/power/1/'+pdkd+','+jl+'/'+datas[0].children[0].children[0].children[0].nlzbqz+','+datas[0].children[0].children[0].children[1].nlzbqz,
    		    		'type':'get',
    		    		'dataType':'json',
    		    		'async':false,
    		    		'success':function(data){
    		    			var val = Math.round(data.value*10)/10;
    		    			val11 = val;
    		    			$("#jsdzgr").parent().parent().find("td input[type=text]").val(val);
    		    		}
    		    	});
    			});
    			
    			$("#hlnl").on("click",function(){
    				var pdkd = $("#hlnl").parent().parent().siblings('tr').eq(0).find("input").val();
    				var jl = $("#hlnl").parent().parent().siblings('tr').eq(1).find("input").val();
    				$.ajax({
    		    		'url':'${webServiceURL}/LJPBhlpg/hlpg/power/1/'+pdkd+','+jl+'/'+datas[0].children[0].children[1].children[0].nlzbqz+','+datas[0].children[0].children[1].children[1].nlzbqz,
    		    		'type':'get',
    		    		'dataType':'json',
    		    		'async':false,
    		    		'success':function(data){
    		    			var val = Math.round(data.value*10)/10;
    		    			val12 = val;
    		    			$("#hlnl").parent().parent().find("td input[type=text]").val(val);
    		    		}
    		    	});
    			});
    			
    			$("#jsdjnl").on("click",function(){
    				/* if(flag){
    					$("#jsdzgr").click();
        				$("#hlnl").click();
    				} */
    				var jsdzgrv = $("#jsdzgr").parent().parent().find("td input[type=text]").val();
    				var hlnlv = $("#hlnl").parent().parent().find("td input[type=text]").val();
    				if(jsdzgrv == ""){
    					$("#jsdzgr").click();
    				}
    				if(hlnlv == ""){
    					$("#hlnl").click();
    				}
    				var dzgr = $("#jsdzgr").parent().siblings("td").find("input").val();
    				var hl = $("#hlnl").parent().siblings("td").find("input").val();
    				$.ajax({
    		    		'url':'${webServiceURL}/LJPBdjnl/djnl/power/1/'+dzgr+','+hl+'/'+datas[0].children[0].children[0].nlzbqz+','+datas[0].children[0].children[1].nlzbqz,
    		    		'type':'get',
    		    		'dataType':'json',
    		    		'async':false,
    		    		'success':function(data){
    		    			var val = Math.round(data.value*10)/10;
    		    			val1 = val;
    		    			circleDom('打击能力','circleDom',val*100); //打击能力
    		    			$('.slider-num-point').eq(0).slider('setValue',val*10);
    		    		}
    		    	});
    			});
    			
    		    $("#jsydbznl").on("click",function(){
    		    	var pdkd = $("#jsydbznl").parent().parent().siblings('tr').eq(0).find("input").val();
    				var jl = $("#jsydbznl").parent().parent().siblings('tr').eq(1).find("input").val();
    				$.ajax({
    		    		'url':'${webServiceURL}/LJPBydbznlpg/ydbznlpg/power/1/'+pdkd+','+jl+'/'+datas[0].children[1].children[0].children[0].nlzbqz+','+datas[0].children[1].children[0].children[1].nlzbqz,
    		    		'type':'get',
    		    		'dataType':'json',
    		    		'async':false,
    		    		'success':function(data){
    		    			var val = Math.round(data.value*10)/10;
    		    			$("#jsydbznl").parent().parent().find("td input[type=text]").val(val);
    		    		}
    		    	});
    		    });
    		    
    		    $("#jsydnl").on("click",function(){
    		    	var jl0 = $("#jsydnl").parent().parent().siblings('tr').eq(0).find("input").val();
    				var jl1 = $("#jsydnl").parent().parent().siblings('tr').eq(1).find("input").val();
    				var jl2 = $("#jsydnl").parent().parent().siblings('tr').eq(2).find("input").val();
    				var jl3 = $("#jsydnl").parent().parent().siblings('tr').eq(3).find("input").val();
    				$.ajax({
    		    		'url':'${webServiceURL}/LJPBydnlpg/ydnlpg/power/1/'+jl0+','+jl1+','+jl2+','+jl3+'/'+datas[0].children[1].children[1].children[0].nlzbqz+','+datas[0].children[1].children[1].children[1].nlzbqz+','+datas[0].children[1].children[1].children[2].nlzbqz+','+datas[0].children[1].children[1].children[3].nlzbqz,
    		    		'type':'get',
    		    		'dataType':'json',
    		    		'async':false,
    		    		'success':function(data){
    		    			var val = Math.round(data.value*10)/10;
    		    			$("#jsydnl").parent().parent().find("td input[type=text]").val(val);
    		    		}
    		    	});
    		    });
    		    
    		    $("#jssdnl").on("click",function(){
    		    	var jl0 = $("#jssdnl").parent().parent().siblings('tr').eq(0).find("input").val();
    				var jl1 = $("#jssdnl").parent().parent().siblings('tr').eq(1).find("input").val();
    				var jl2 = $("#jssdnl").parent().parent().siblings('tr').eq(2).find("input").val();
    				var jl3 = $("#jssdnl").parent().parent().siblings('tr').eq(3).find("input").val();
    				$.ajax({
    		    		'url':'${webServiceURL}/LJPBsdpg/sdpg/power/1/'+jl0+','+jl1+','+jl2+','+jl3+'/'+datas[0].children[1].children[2].children[0].nlzbqz+','+datas[0].children[1].children[2].children[1].nlzbqz+','+datas[0].children[1].children[2].children[2].nlzbqz+','+datas[0].children[1].children[2].children[3].nlzbqz,
    		    		'type':'get',
    		    		'dataType':'json',
    		    		'async':false,
    		    		'success':function(data){
    		    			var val = Math.round(data.value*10)/10;
    		    			$("#jssdnl").parent().parent().find("td input[type=text]").val(val);
    		    		}
    		    	});
    		    });
    		    
    		    $("#jsjdnl").on("click",function(){
    				/* if(flag2){
    					$("#jsydbznl").click();
    					$("#jsydnl").click();
    					$("#jssdnl").click();
    				} */
    		    	var jsydbznlv = $("#jsydbznl").parent().parent().find("td input[type=text]").val();
    				var jsydnlv = $("#jsydnl").parent().parent().find("td input[type=text]").val();
    				var jssdnlv = $("#jssdnl").parent().parent().find("td input[type=text]").val();
    				if(jsydbznlv == ""){
    					$("#jsydbznl").click();
    				}
    				if(jsydnlv == ""){
    					$("#jsydnl").click();
    				}
    				if(jssdnlv == ""){
    					$("#jssdnl").click();
    				}
    				var ydbz = $("#jsydbznl").parent().siblings("td").find("input").val();
    				var ydnl = $("#jsydnl").parent().siblings("td").find("input").val();
    				var ydsd = $("#jssdnl").parent().siblings("td").find("input").val();
    				$.ajax({
    		    		'url':'${webServiceURL}/LJPBjdnlpg/jdnlpg/power/1/'+ydbz+','+ydnl+','+ydsd+'/'+datas[0].children[1].children[0].nlzbqz+','+datas[0].children[1].children[1].nlzbqz+','+datas[0].children[1].children[2].nlzbqz,
    		    		'type':'get',
    		    		'dataType':'json',
    		    		'async':false,
    		    		'success':function(data){
    		    			var val = Math.round(data.value*10)/10;
    		    			val2 = val;
    		    			circleDom('机动能力','circleDom2',val*100); //打击能力
    		    			$('.slider-num-point').eq(1).slider('setValue',val*10);
    		    		}
    		    	});
    			});
    		    
    		    $("#ddmhlfhnl").on("click",function(){
    		    	var jl0 = $("#ddmhlfhnl").parent().parent().siblings('tr').eq(0).find("input").val();
    				var jl1 = $("#ddmhlfhnl").parent().parent().siblings('tr').eq(1).find("input").val();
    				var jl2 = $("#ddmhlfhnl").parent().parent().siblings('tr').eq(2).find("input").val();
    				$.ajax({
    		    		'url':'${webServiceURL}/LJPBddmhlfhpg/ddmhlfhpg/power/1/'+jl0+','+jl1+','+jl2+'/'+datas[0].children[2].children[0].children[0].nlzbqz+','+datas[0].children[2].children[0].children[1].nlzbqz+','+datas[0].children[2].children[0].children[2].nlzbqz,
    		    		'type':'get',
    		    		'dataType':'json',
    		    		'async':false,
    		    		'success':function(data){
    		    			var val = Math.round(data.value*10)/10;
    		    			$("#ddmhlfhnl").parent().parent().find("td input[type=text]").val(val);
    		    		}
    		    	});
    		    });
    		    
    		    $("#fhhrsnl").on("click",function(){
    		    	var jl0 = $("#fhhrsnl").parent().parent().siblings('tr').eq(0).find("input").val();
    				var jl1 = $("#fhhrsnl").parent().parent().siblings('tr').eq(1).find("input").val();
    				var jl2 = $("#fhhrsnl").parent().parent().siblings('tr').eq(2).find("input").val();
    				$.ajax({
    		    		'url':'${webServiceURL}/LJPBfhhrspg/fhhrspg/power/1/'+jl0+','+jl1+','+jl2+'/'+datas[0].children[2].children[1].children[0].nlzbqz+','+datas[0].children[2].children[1].children[1].nlzbqz+','+datas[0].children[2].children[1].children[2].nlzbqz,
    		    		'type':'get',
    		    		'dataType':'json',
    		    		'async':false,
    		    		'success':function(data){
    		    			var val = Math.round(data.value*10)/10;
    		    			$("#fhhrsnl").parent().parent().find("td input[type=text]").val(val);
    		    		}
    		    	});
    		    });
    		    
    		    $("#jsfknl").on("click",function(){
    		    	var jl0 = $("#jsfknl").parent().parent().siblings('tr').eq(0).find("input").val();
    				var jl1 = $("#jsfknl").parent().parent().siblings('tr').eq(1).find("input").val();
    				var jl2 = $("#jsfknl").parent().parent().siblings('tr').eq(2).find("input").val();
    				$.ajax({
    		    		'url':'${webServiceURL}/LJPBfkpg/fkpg/power/1/'+jl0+','+jl1+','+jl2+'/'+datas[0].children[2].children[2].children[0].nlzbqz+','+datas[0].children[2].children[2].children[1].nlzbqz+','+datas[0].children[2].children[2].children[2].nlzbqz,
    		    		'type':'get',
    		    		'dataType':'json',
    		    		'async':false,
    		    		'success':function(data){
    		    			var val = Math.round(data.value*10)/10;
    		    			$("#jsfknl").parent().parent().find("td input[type=text]").val(val);
    		    		}
    		    	});
    		    });
    		    
    		    $("#jsfhnl").on("click",function(){
    				/* if(flag3){
    					$("#ddmhlfhnl").click();
    					$("#fhhrsnl").click();
    					$("#jsfknl").click();
    				} */
    		    	var ddmhlfhnlv = $("#ddmhlfhnl").parent().parent().find("td input[type=text]").val();
    				var fhhrsnlv = $("#fhhrsnl").parent().parent().find("td input[type=text]").val();
    				var jsfknlv = $("#jsfknl").parent().parent().find("td input[type=text]").val();
    				if(ddmhlfhnlv == ""){
    					$("#ddmhlfhnl").click();
    				}
    				if(fhhrsnlv == ""){
    					$("#fhhrsnl").click();
    				}
    				if(jsfknlv == ""){
    					$("#jsfknl").click();
    				}
    				var ydbz = $("#ddmhlfhnl").parent().siblings("td").find("input").val();
    				var ydnl = $("#fhhrsnl").parent().siblings("td").find("input").val();
    				var ydsd = $("#jsfknl").parent().siblings("td").find("input").val();
    				$.ajax({
    		    		'url':'${webServiceURL}/LJPBfhnlpg/fhnlpg/power/1/'+ydbz+','+ydnl+','+ydsd+'/'+datas[0].children[2].children[0].nlzbqz+','+datas[0].children[2].children[1].nlzbqz+','+datas[0].children[2].children[2].nlzbqz,
    		    		'type':'get',
    		    		'dataType':'json',
    		    		'async':false,
    		    		'success':function(data){
    		    			var val = Math.round(data.value*10)/10;
    		    			val3 = val;
    		    			circleDom('防护能力','circleDom3',val*100); //打击能力
    		    			$('.slider-num-point').eq(2).slider('setValue',val*10);
    		    		}
    		    	});
    			});
    		    
    		    $("#jszcmd").on("click",function(){
    		    	var jl0 = $("#jszcmd").parent().parent().siblings('tr').eq(0).find("input").val();
    				var jl1 = $("#jszcmd").parent().parent().siblings('tr').eq(1).find("input").val();
    				var jl2 = $("#jszcmd").parent().parent().siblings('tr').eq(2).find("input").val();
    				$.ajax({
    		    		'url':'${webServiceURL}/LJPBzcmdpg/zcmdpg/power/1/'+jl0+','+jl1+','+jl2+'/'+datas[0].children[3].children[0].children[0].nlzbqz+','+datas[0].children[3].children[0].children[1].nlzbqz+','+datas[0].children[3].children[0].children[2].nlzbqz,
    		    		'type':'get',
    		    		'dataType':'json',
    		    		'async':false,
    		    		'success':function(data){
    		    			var val = Math.round(data.value*10)/10;
    		    			$("#jszcmd").parent().parent().find("td input[type=text]").val(val);
    		    		}
    		    	});
    		    });
    		    
    		    $("#jszqcd").on("click",function(){
    		    	var jl0 = $("#jszqcd").parent().parent().siblings('tr').eq(0).find("input").val();
    				var jl1 = $("#jszqcd").parent().parent().siblings('tr').eq(1).find("input").val();
    				var jl2 = $("#jszqcd").parent().parent().siblings('tr').eq(2).find("input").val();
    				$.ajax({
    		    		'url':'${webServiceURL}/LJPBzqcdpg/zqcdpg/power/1/'+jl0+','+jl1+','+jl2+'/'+datas[0].children[3].children[1].children[0].nlzbqz+','+datas[0].children[3].children[1].children[1].nlzbqz+','+datas[0].children[3].children[1].children[2].nlzbqz,
    		    		'type':'get',
    		    		'dataType':'json',
    		    		'async':false,
    		    		'success':function(data){
    		    			var val = Math.round(data.value*10)/10;
    		    			$("#jszqcd").parent().parent().find("td input[type=text]").val(val);
    		    		}
    		    	});
    		    });
    		    
    		    $("#jsqthzcnl").on("click",function(){
    		    	var jl0 = $("#jsqthzcnl").parent().parent().siblings('tr').eq(0).find("input").val();
    				var jl1 = $("#jsqthzcnl").parent().parent().siblings('tr').eq(1).find("input").val();
    				$.ajax({
    		    		'url':'${webServiceURL}/LJPBqthzcnlpg/qthzcnlpg/power/1/'+jl0+','+jl1+'/'+datas[0].children[3].children[2].children[0].nlzbqz+','+datas[0].children[3].children[2].children[1].nlzbqz,
    		    		'type':'get',
    		    		'dataType':'json',
    		    		'async':false,
    		    		'success':function(data){
    		    			var val = Math.round(data.value*10)/10;
    		    			$("#jsqthzcnl").parent().parent().find("td input[type=text]").val(val);
    		    		}
    		    	});
    		    });
    		    
    		    $("#jszcfw").on("click",function(){
    		    	var jl0 = $("#jszcfw").parent().parent().siblings('tr').eq(0).find("input").val();
    				var jl1 = $("#jszcfw").parent().parent().siblings('tr').eq(1).find("input").val();
    				$.ajax({
    		    		'url':'${webServiceURL}/LJPBzcfwpg/zcfwpg/power/1/'+jl0+','+jl1+'/'+datas[0].children[3].children[3].children[0].nlzbqz+','+datas[0].children[3].children[3].children[1].nlzbqz,
    		    		'type':'get',
    		    		'dataType':'json',
    		    		'async':false,
    		    		'success':function(data){
    		    			var val = Math.round(data.value*10)/10;
    		    			$("#jszcfw").parent().parent().find("td input[type=text]").val(val);
    		    		}
    		    	});
    		    });
    		    
    		    $("#jszcnl").on("click",function(){
    				/* if(flag4){
    					$("#jszcmd").click();
    					$("#jszqcd").click();
    					$("#jsqthzcnl").click();
    					$("#jszcfw").click();
    				} */
    		    	var jszcmd = $("#jszcmd").parent().parent().find("td input[type=text]").val();
    				var jszqcd = $("#jszqcd").parent().parent().find("td input[type=text]").val();
    				var jsqthzcnl = $("#jsqthzcnl").parent().parent().find("td input[type=text]").val();
    				var jszcfw = $("#jszcfw").parent().parent().find("td input[type=text]").val();
    				if(jszcmd == ""){
    					$("#jszcmd").click();
    				}
    				if(jszqcd == ""){
    					$("#jszqcd").click();
    				}
    				if(jsqthzcnl == ""){
    					$("#jsqthzcnl").click();
    				}
    				if(jszcfw == ""){
    					$("#jszcfw").click();
    				}
    				var ydbz2 = $("#jszcmd").parent().siblings("td").find("input").val();
    				var ydbz = $("#jszqcd").parent().siblings("td").find("input").val();
    				var ydnl = $("#jsqthzcnl").parent().siblings("td").find("input").val();
    				var ydsd = $("#jszcfw").parent().siblings("td").find("input").val();
    				$.ajax({
    		    		'url':'${webServiceURL}/LJPBfhnlpg/fhnlpg/power/1/'+ydbz2+','+ydbz+','+ydnl+','+ydsd+'/'+datas[0].children[3].children[0].nlzbqz+','+datas[0].children[3].children[1].nlzbqz+','+datas[0].children[3].children[2].nlzbqz+','+datas[0].children[3].children[3].nlzbqz,
    		    		'type':'get',
    		    		'dataType':'json',
    		    		'async':false,
    		    		'success':function(data){
    		    			var val = Math.round(data.value*10)/10;
    		    			val4 = val;
    		    			circleDom('侦查能力','circleDom4',val*100); //打击能力
    		    			$('.slider-num-point').eq(3).slider('setValue',val*10);
    		    		}
    		    	});
    			});
    		    
    		    $("#jsdzfhnl").on("click",function(){
    		    	var jl0 = $("#jsdzfhnl").parent().parent().siblings('tr').eq(0).find("input").val();
    				var jl1 = $("#jsdzfhnl").parent().parent().siblings('tr').eq(1).find("input").val();
    				$.ajax({
    		    		'url':'${webServiceURL}/LJPBdzfhnlpg/dzfhnlpg/power/1/'+jl0+','+jl1+'/'+datas[0].children[4].children[0].children[0].nlzbqz+','+datas[0].children[4].children[0].children[1].nlzbqz,
    		    		'type':'get',
    		    		'dataType':'json',
    		    		'async':false,
    		    		'success':function(data){
    		    			var val = Math.round(data.value*10)/10;
    		    			$("#jsdzfhnl").parent().parent().find("td input[type=text]").val(val);
    		    		}
    		    	});
    		    });
    		    
    		    $("#jstxnl").on("click",function(){
    		    	var jl0 = $("#jstxnl").parent().parent().siblings('tr').eq(0).find("input").val();
    				var jl1 = $("#jstxnl").parent().parent().siblings('tr').eq(1).find("input").val();
    				var jl2 = $("#jstxnl").parent().parent().siblings('tr').eq(2).find("input").val();
    				$.ajax({
    		    		'url':'${webServiceURL}/LJPBdzfhnlpg/dzfhnlpg/power/1/'+jl0+','+jl1+','+jl2+'/'+datas[0].children[4].children[1].children[0].nlzbqz+','+datas[0].children[4].children[1].children[1].nlzbqz+','+datas[0].children[4].children[1].children[2].nlzbqz,
    		    		'type':'get',
    		    		'dataType':'json',
    		    		'async':false,
    		    		'success':function(data){
    		    			var val = Math.round(data.value*10)/10;
    		    			$("#jstxnl").parent().parent().find("td input[type=text]").val(val);
    		    		}
    		    	});
    		    });
    		    
    		    $("#jszhnl").on("click",function(){
    		    	var jl0 = $("#jszhnl").parent().parent().siblings('tr').eq(0).find("input").val();
    				var jl1 = $("#jszhnl").parent().parent().siblings('tr').eq(1).find("input").val();
    				$.ajax({
    		    		'url':'${webServiceURL}/LJPBzhnlpg/zhnlpg/power/1/'+jl0+','+jl1+'/'+datas[0].children[4].children[2].children[0].nlzbqz+','+datas[0].children[4].children[1].children[1].nlzbqz+','+datas[0].children[4].children[2].children[1].nlzbqz,
    		    		'type':'get',
    		    		'dataType':'json',
    		    		'async':false,
    		    		'success':function(data){
    		    			var val = Math.round(data.value*10)/10;
    		    			$("#jszhnl").parent().parent().find("td input[type=text]").val(val);
    		    		}
    		    	});
    		    });
    		    
    		    $("#jszhkznl").on("click",function(){
    				/* if(flag5){
    					$("#jsdzfhnl").click();
    					$("#jstxnl").click();
    					$("#jszhnl").click();
    				} */
    		    	var jsdzfhnl = $("#jsdzfhnl").parent().parent().find("td input[type=text]").val();
    				var jstxnl = $("#jstxnl").parent().parent().find("td input[type=text]").val();
    				var jszhnl = $("#jszhnl").parent().parent().find("td input[type=text]").val();
    				if(jsdzfhnl == ""){
    					$("#jsdzfhnl").click();
    				}
    				if(jstxnl == ""){
    					$("#jstxnl").click();
    				}
    				if(jszhnl == ""){
    					$("#jszhnl").click();
    				}
    				var ydbz = $("#jsdzfhnl").parent().siblings("td").find("input").val();
    				var ydnl = $("#jstxnl").parent().siblings("td").find("input").val();
    				var ydsd = $("#jszhnl").parent().siblings("td").find("input").val();
    				$.ajax({
    		    		'url':'${webServiceURL}/LJPBzhkznlpg/zhkznlpg/power/1/'+ydbz+','+ydnl+','+ydsd+'/'+datas[0].children[4].children[0].nlzbqz+','+datas[0].children[4].children[1].nlzbqz+','+datas[0].children[4].children[2].nlzbqz,
    		    		'type':'get',
    		    		'dataType':'json',
    		    		'async':false,
    		    		'success':function(data){
    		    			var val = Math.round(data.value*10)/10;
    		    			val5 = val;
    		    			circleDom('计算指挥控制能力','circleDom5',val*100); //打击能力
    		    			$('.slider-num-point').eq(4).slider('setValue',val*10);
    		    		}
    		    	});
    			});
    		    
    		    $("#jsxtbznl").on("click",function(){
    		    	var jl0 = $("#jsxtbznl").parent().parent().siblings('tr').eq(0).find("input").val();
    				var jl1 = $("#jsxtbznl").parent().parent().siblings('tr').eq(1).find("input").val();
    				var jl2 = $("#jsxtbznl").parent().parent().siblings('tr').eq(2).find("input").val();
    				$.ajax({
    		    		'url':'${webServiceURL}/LJPBxtybznlpg/xtybznlpg/power/1/'+jl0+','+jl1+','+jl2+'/'+datas[0].children[5].children[0].children[0].nlzbqz+','+datas[0].children[5].children[0].children[1].nlzbqz+','+datas[0].children[5].children[0].children[2].nlzbqz,
    		    		'type':'get',
    		    		'dataType':'json',
    		    		'async':false,
    		    		'success':function(data){
    		    			var val = Math.round(data.value*10)/10;
    		    			$("#jsxtbznl").parent().parent().find("td input[type=text]").val(val);
    		    		}
    		    	});
    		    });
    		    
    		    $("#jsbznl").on("click",function(){
    		    	var jl0 = $("#jsbznl").parent().parent().siblings('tr').eq(0).find("input").val();
    				var jl1 = $("#jsbznl").parent().parent().siblings('tr').eq(1).find("input").val();
    				var jl2 = $("#jsbznl").parent().parent().siblings('tr').eq(2).find("input").val();
    				$.ajax({
    		    		'url':'${webServiceURL}/LJPBbznlpg/bznlpg/power/1/'+jl0+','+jl1+','+jl2+'/'+datas[0].children[5].children[1].children[0].nlzbqz+','+datas[0].children[5].children[1].children[1].nlzbqz+','+datas[0].children[5].children[1].children[2].nlzbqz,
    		    		'type':'get',
    		    		'dataType':'json',
    		    		'async':false,
    		    		'success':function(data){
    		    			var val = Math.round(data.value*10)/10;
    		    			$("#jsbznl").parent().parent().find("td input[type=text]").val(val);
    		    		}
    		    	});
    		    });
    		    
    		    $("#jsxh").on("click",function(){
    		    	var jl0 = $("#jsxh").parent().parent().siblings('tr').eq(0).find("input").val();
    				var jl1 = $("#jsxh").parent().parent().siblings('tr').eq(1).find("input").val();
    				var jl2 = $("#jsxh").parent().parent().siblings('tr').eq(2).find("input").val();
    				var jl3 = $("#jsxh").parent().parent().siblings('tr').eq(3).find("input").val();
    				$.ajax({
    		    		'url':'${webServiceURL}/LJPBbznlpg/bznlpg/power/1/'+jl0+','+jl1+','+jl2+','+jl3+'/'+datas[0].children[5].children[2].children[0].nlzbqz+','+datas[0].children[5].children[2].children[1].nlzbqz+','+datas[0].children[5].children[2].children[2].nlzbqz+','+datas[0].children[5].children[2].children[3].nlzbqz,
    		    		'type':'get',
    		    		'dataType':'json',
    		    		'async':false,
    		    		'success':function(data){
    		    			var val = Math.round(data.value*10)/10;
    		    			$("#jsxh").parent().parent().find("td input[type=text]").val(val);
    		    		}
    		    	});
    		    });
    		    
    		    $("#jscxzznl").on("click",function(){
    				/* if(flag6){
    					$("#jsxtbznl").click();
    					$("#jsbznl").click();
    					$("#jsxh").click();
    				} */
    		    	var jsxtbznl = $("#jsxtbznl").parent().parent().find("td input[type=text]").val();
    				var jsbznl = $("#jsbznl").parent().parent().find("td input[type=text]").val();
    				var jsxh = $("#jsxh").parent().parent().find("td input[type=text]").val();
    				if(jsxtbznl == ""){
    					$("#jsxtbznl").click();
    				}
    				if(jsbznl == ""){
    					$("#jsbznl").click();
    				}
    				if(jsxh == ""){
    					$("#jsxh").click();
    				}
    				var ydbz = $("#jsxtbznl").parent().siblings("td").find("input").val();
    				var ydnl = $("#jsbznl").parent().siblings("td").find("input").val();
    				var ydsd = $("#jsxh").parent().siblings("td").find("input").val();
    				$.ajax({
    		    		'url':'${webServiceURL}/LJPBcxzznlpg/cxzznlpg/power/1/'+ydbz+','+ydnl+','+ydsd+'/'+datas[0].children[5].children[0].nlzbqz+','+datas[0].children[5].children[1].nlzbqz+','+datas[0].children[5].children[2].nlzbqz,
    		    		'type':'get',
    		    		'dataType':'json',
    		    		'async':false,
    		    		'success':function(data){
    		    			var val = Math.round(data.value*10)/10;
    		    			val6 = val;
    		    			circleDom('计算持续作战能力','circleDom6',val*100);
    		    			$('.slider-num-point').eq(5).slider('setValue',val*10);
    		    		}
    		    	});
    			});
    		    
    		    $("#ldt").on("click",function(){
    		    	$("#jsdjnl").click();
    		    	$("#jsjdnl").click();
    		    	$("#jsfhnl").click();
    		    	$("#jszcnl").click();
    		    	$("#jszhkznl").click();
    		    	$("#jscxzznl").click();
    		    	option.series[0].data[0].value = [val1,val2,val3,val4,val5,val6];
    		    	myChart.setOption(option);
    		    });
    		    
    		    $("#pgz").on("click",function(){
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
        		    	zhnlt.apply(this,pg);
    		    	}else{
    		    		alert("请分配所有"+pg.length+"项能力值！！！");
    		    	}
    		    });
    		    
    		    $("#zzzhnl").on("click",function(){
    		    	$("#ldt").click();
    		    	//$("#pgz").click();
    		    	zhnlt(val1,val2,val3,val4,val5,val6);
    		    });
			});		
		</script>
		<script src="js/layout.js"></script>
		<!-- Morris Chart Dependencies -->
		<script type="text/javascript">
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
								data:['炮兵团'],
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
									   { text: '打击能力', max: 1},
									   { text: '机动能力', max: 1},
									   { text: '防护能力', max: 1},
									   { text: '侦查能力', max: 1},
									   { text: '指挥控制能力', max: 1},
									   { text: '持续作战能力', max: 1}
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
											value : [0,0,0,0,0,0],
											name : '炮兵团'
										}
									]
								}
							]
						};
                    
						// 为echarts对象加载数据 
						myChart.setOption(option); 
					}
				);
			
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
									name:'作战综合能力计算',
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
						myChart2 = ec.init(document.getElementById(idName)); 
						
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
								color: 'rgba(255,0,0,0.6)'
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
			circleDom('打击能力','circleDom',0); //打击能力
			circleDom('机动能力','circleDom2',0); //机动能力
			circleDom('防护能力','circleDom3',0); //机动能力
			circleDom('侦查能力','circleDom4',0); //机动能力
			circleDom('指挥控制能力','circleDom5',0); //机动能力
			circleDom('持续作战能力','circleDom6',0); //机动能力
		</script>
	</body>
</html>