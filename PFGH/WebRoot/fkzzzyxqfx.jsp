<%@page pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>防空作战资源需求分析</title>
<meta name="description" content="">
<meta name="author" content="">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<!-- Basic Styles -->
<link rel="stylesheet" type="text/css" media="screen"
	href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" media="screen"
	href="css/font-awesome.min.css">
<!-- SmartAdmin Styles : Please note (smartadmin-production.css) was created using LESS variables -->
<link rel="stylesheet" type="text/css" media="screen"
	href="css/smartadmin-production.css">
<link rel="stylesheet" type="text/css" media="screen"
	href="css/smartadmin-skins.css">
<link rel="stylesheet" type="text/css" media="screen"
	href="css/demo.css">
<link rel="stylesheet" type="text/css" media="screen"
	href="css/ani-buttons.css">
<link rel="stylesheet" type="text/css" media="screen"
	href="css/blue/global.css">
<link rel="stylesheet" type="text/css" media="screen"
	href="css/blue/style.css">
<!-- FAVICONS
    <link rel="shortcut icon" href="img/favicon/favicon.ico" type="image/x-icon">
    <link rel="icon" href="img/favicon/favicon.ico" type="image/x-icon">-->
<script src="js/jquery-1.9.1.min.js"></script>
<script src="js/bootstrap/bootstrap.min.js"></script>
<style>
span {
	float: left;
	margin-top: 2px;
	padding-right: 5px;
	font-size: 15px;;
}

.effect-9-box {
	float: left;
	width: 115px;
}

.effect-9-box input {
	float: left;
}

.am-btn-lg:hover {
	background: url(images/blue/title-btn-bg-1-hover.png);
	background-size: 100% 100%;
	color: #fff;
	animation: am-btn-lg 4s ease infinite;
}
</style>
</head>
<div class="am-header">
	<div class="am-logo" style="width:400px;">
		<a href="集成首页.html"> <img src="images/blue/logo.png" width="70"
			height="70" border="0" class="fa fa-spin ">
			<p>防空作战资源需求</p>
		</a>
	</div>
	<div class="am-top-nav" style="width: 78%;">
		<ul>
			<li class="active button--moema"><a>防空作战资源</a></li>
		</ul>

		<div class="toptime">
			<div id="amtopTime"></div>
			<div class="toptime-ico"></div>
		</div>
	</div>
</div>
<!-- BOOTSTRAP JS -->
<div class="am-content">
	<div class="row" style="color:white">
		<div class="col-lg-8"
			style="padding-right:0!important;margin-left: -8px;width: 65%">
			<div class="border-polygon-450-700 height-2"
				style="width:100%;height:935px;">
				<div class="am-box">
					<div class="am-box-title">
						<i class="fa fa-crosshairs"></i>
						<p style="width:234px;">防空火力单元及其弹药需求量</p>
					</div>
					<br /> </br>
					<div class="row">
						<div class="col-lg-12" style="margin-top: -50px;">
							<!-- -->
							<div class="am-box-content" style="z-index: 1">
								<div class="pull-left tab-box m-l-5"
									style="width:100%;height:77px; margin-left: 32px!important;">
									<div class="tab-box-title" style="width:20%;">
										<a style="" class="active">整体任务信息</a>
									</div>
									<div class="tab-box-content p-t-20"
										style="width:94%;height:80px;margin:0 !important;">
										<div class="row" id="gphl">
											<div class="col-lg-4" style="z-index: 2">
												<span>标准空袭兵器</span>
												<div class="effect-9-box">
													<input style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;" class="effect-9" type="text" value="">
												</div>
											</div>
											<div class="col-lg-4" style="z-index: 2">
												<span>空袭规模(标准空袭兵器)</span>
												<div class="effect-9-box">
													<input style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;" class="effect-9" type="text" value="">
												</div>
												 <div class="tree smart-form" style="float:left;width:0px;">
                                    <label class="checkbox inline-block fl fl-r">
                                        <input type="checkbox" name="checkbox-inline">
                                        <i></i>
                                    </label>
                                    </div>
											</div>
											<div class="col-lg-4" style="z-index: 2">
												<span>整体抗击率</span>
												<div class="effect-9-box">
													<input style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;" class="effect-9" type="text" value="">
												</div>
											</div>

										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-lg-12" style="margin-top:45px;">
								<!-- -->
								<div class="am-box-content ">
									<div class="pull-left tab-box m-l-5"
										style="width:100%; margin-left:45px!important;margin-top:-10px;">
										<div class="tab-box-title" style="width:100%;">
											<a style="" class="active">高炮火力单元计算</a> <a
												style="width:173px;" class="">地空导弹火力单元计算</a>
										</div>
										<div class="tab-box-content p-t-20"
											style="width:92%;height:690px;margin:0 !important;">

											<div class="am-box-content">
												<div class="pull-left tab-box m-l-5"
													style="width:100%; margin-left:45px!important;height:106px;position: relative">

													<a
														style="color:#ffffff;position:absolute;top:-8px; left:10px;background:#162536;font-size:13px"
														class="">任务信息</a>

													<div class="tab-box-content-2 p-t-20"
														style="width:92%;height:85px;margin:0 !important;">
														<div class="col-lg-3">
															<span>高炮任务比例</span>
															<div class="effect-9-box">
																<input
																	style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
																	class="effect-9" type="text" value="">
															</div>
														</div>

														<div class="col-lg-3">
															<span>毁伤指标</span>
															<div class="effect-9-box">
																<input
																	style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
																	class="effect-9" type="text" value="">
															</div>
														</div>

														<div class="col-lg-3">
															<span>允许战损率</span>
															<div class="effect-9-box">
																<input
																	style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
																	class="effect-9" type="text" value="">
															</div>
														</div>
														<div class="col-lg-3">
															<span>预备役比例</span>
															<div class="effect-9-box">
																<input
																	style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
																	class="effect-9" type="text" value="">
															</div>
														</div>
													</div>

												</div>
											</div>

											<div class="am-box-content ">
												<div class="pull-left tab-box m-l-5"
													style="width:100%; margin-left:45px!important;height:106px;position: relative">

													<a
														style="color:#ffffff;position:absolute;top:-8px; left:10px;background:#162536;font-size:13px"
														class="">标准高炮火力单元信息</a>

													<div class="tab-box-content-2 p-t-20"
														style="width:92%;height:85px;margin:0 !important;">

														<div class="col-lg-4">
															<span>标准火力单元</span>
															<div class="effect-9-box">
																<input
																	style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
																	class="effect-9" type="text" value="">
															</div>
														</div>
														<div class="col-lg-4">
															<span>装备可靠性</span>
															<div class="effect-9-box">
																<input
																	style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
																	class="effect-9" type="text" value="">
															</div>
														</div>
														<div class="col-lg-4" id="rr">
															<div class="am-btn-lg pull-right m-t-20 m-r-20"
																style="width: 220px;margin-top:0!important">计算标准防空火力单元需求量</div>
														</div>
													</div>

												</div>
											</div>

											<div class="am-box-content ">
												<div class="pull-left tab-box m-l-5"
													style="width:100%; margin-left:45px!important;height:106px;position: relative">
													<a
														style="color:#ffffff;position:absolute;top:-8px; left:10px;background:#162536;font-size:13px"
														class="">标准高炮火力单元需求</a>


													<div class="tab-box-content-2 p-t-20"
														style="width:92%;height:85px;margin:0 !important;">
														<div class="col-lg-4">
															<span>理论需求量</span>
															<div class="effect-9-box">
																<input
																	style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
																	class="effect-9" type="text" value="" id="fkllxql">
															</div>
														</div>

														<div class="col-lg-4">
															<span>&nbsp;&nbsp;&nbsp;&nbsp;冗余量</span>
															<div class="effect-9-box">
																<input
																	style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
																	class="effect-9" type="text" value="" id="fkryl">
															</div>
														</div>

														<div class="col-lg-4">
															<span>实际需求量</span>
															<div class="effect-9-box">
																<input
																	style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
																	class="effect-9" type="text" value="" id="fksjxql">
															</div>
														</div>

													</div>
												</div>
											</div>

											<div class="am-box-content ">
												<div class="pull-left tab-box m-l-5"
													style="width:100%; margin-left:45px!important;height:140px;position: relative">
													<a
														style="color:#ffffff;position:absolute;top:-8px; left:10px;background:#162536;font-size:13px"
														class="">高炮需求量还原</a>


													<div class="tab-box-content-2 p-t-20"
														style="width:92%;height:322px;margin:0 !important;">
														<div class="am-btn-1 pull-right"
															style="margin-top: -15px;;height:48px;width:170px;background-size: 100% 100%;text-align:center">
															<strong style="line-height: 49px;float:none;padding:0;">高炮需求量还原计算</strong>
														</div>

														<div
															class="am-title-notice pull-right js-save-ok m-l-20"
															style="margin-top: -4px;">
															<div class="p m-l-5">
																加载现有高炮火力单元 <b class="fa fa-sun-o pull-right m-t-10"
																	style=""></b>
																<div class="sort-box" hidden></div>
															</div>
														</div>
														</br> </br>
														<table
															class="am-table am-table-bordered am-table-striped "
															style="text-align: center;margin-top:10px!important;">
															<tr>
																<td rowspan="2">序号</td>
																<td colspan="3">高炮火力单元</td>
																<td colspan="3">弹药</td>
																<td rowspan="2">单元需求量/库存量</td>
																<td rowspan="2">弹药需求量/库存量</td>
															</tr>
															<tr>
																<td>高炮型号</td>
																<td>标准化作战效能</td>
																<td>比例</td>
																<td>直接损失率</td>
																<td>自然损失率</td>
																<td>冗余率</td>
															</tr>
														</table>

														<table
															class="am-table am-table-bordered am-table-striped am-table-hover"
															style="text-align: center;">
															<c:set var="flag" value="true" />
															<c:forEach items="${pzcss2}" var="p" varStatus="s">
																<c:if test="${flag}">
																	<tr>
																		<td width="5.58%">${s.index+1}</td>
																		<td width="9.3%">${p.gpmc}</td>
																		<td width="14.7%">${p.bzxnzs}</td>
																		<c:choose>
																			<c:when test="${s.index eq 0 || s.index eq 1}">
																				<td class="dbclick" width="5.7%">0.4</td>
																			</c:when>
																			<c:when test="${s.index eq 2}">
																				<td class="dbclick" width="5.7%">0.2</td>
																			</c:when>
																		</c:choose>
																		<td width="11.1%">${p.zjshl}</td>
																		<td width="11.2%">${p.zrshl}</td>
																		<td width="7.5%">${p.ryl}</td>
																		<td width="17.7%"></td>
																		<td></td>
																		<input type="hidden" value="${p.xzxs}" />
																		<input type="hidden" value="${p.dchsgl}" />
																		<input type="hidden" value="${p.dchdl}" />
																	</tr>
																</c:if>
																<c:if test="${s.index eq 2}">
																	<c:set var="flag" value="false" />
																</c:if>
															</c:forEach>

														</table>
													</div>
												</div>
											</div>



										</div>
										<div class="tab-box-content p-t-20"
											style="width:92%;height:690px;margin:0 !important;display:none">

											<div class="am-box-content">
												<div class="pull-left tab-box m-l-5"
													style="width:100%; margin-left:45px!important;height:106px;position: relative">

													<a
														style="color:#ffffff;position:absolute;top:-8px; left:10px;background:#162536;font-size:13px"
														class="">任务信息</a>

													<div class="tab-box-content-2 p-t-20"
														style="width:92%;height:85px;margin:0 !important;">
														<div class="col-lg-3">
															<span>地空任务比例</span>
															<div class="effect-9-box">
																<input
																	style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
																	class="effect-9" type="text" value="">
															</div>
														</div>

														<div class="col-lg-3">
															<span>毁伤指标</span>
															<div class="effect-9-box">
																<input
																	style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
																	class="effect-9" type="text" value="">
															</div>
														</div>

														<div class="col-lg-3">
															<span>允许战损率</span>
															<div class="effect-9-box">
																<input
																	style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
																	class="effect-9" type="text" value="">
															</div>
														</div>
														<div class="col-lg-3">
															<span>预备役比例</span>
															<div class="effect-9-box">
																<input
																	style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
																	class="effect-9" type="text" value="">
															</div>
														</div>
													</div>

												</div>
											</div>

											<div class="am-box-content ">
												<div class="pull-left tab-box m-l-5"
													style="width:100%; margin-left:45px!important;height:106px;position: relative">

													<a
														style="color:#ffffff;position:absolute;top:-8px; left:10px;background:#162536;font-size:13px"
														class="">标准地空火力单元信息</a>

													<div class="tab-box-content-2 p-t-20"
														style="width:92%;height:85px;margin:0 !important;">

														<div class="col-lg-4">
															<span>标准火力单元</span>
															<div class="effect-9-box">
																<input
																	style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
																	class="effect-9" type="text" value="">
															</div>
														</div>
														<div class="col-lg-4">
															<span>装备可靠性</span>
															<div class="effect-9-box">
																<input
																	style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
																	class="effect-9" type="text" value="">
															</div>
														</div>

														<div class="col-lg-4">
															<div class="am-btn-lg pull-right m-t-20 m-r-20"
																style="width: 220px;margin-top:0!important">计算标准地空火力单元需求量</div>
														</div>

													</div>

												</div>
											</div>

											<div class="am-box-content ">
												<div class="pull-left tab-box m-l-5"
													style="width:100%; margin-left:45px!important;height:106px;position: relative">
													<a
														style="color:#ffffff;position:absolute;top:-8px; left:10px;background:#162536;font-size:13px"
														class="">标准地空火力单元需求</a>


													<div class="tab-box-content-2 p-t-20"
														style="width:92%;height:85px;margin:0 !important;">
														<div class="col-lg-4">
															<span>理论需求量</span>
															<div class="effect-9-box">
																<input
																	style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
																	class="effect-9" type="text" value="" id="dkllxql">
															</div>
														</div>

														<div class="col-lg-4">
															<span>&nbsp;&nbsp;&nbsp;&nbsp;冗余量</span>
															<div class="effect-9-box">
																<input
																	style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
																	class="effect-9" type="text" value="" id="dkryl">
															</div>
														</div>

														<div class="col-lg-4">
															<span>实际需求量</span>
															<div class="effect-9-box">
																<input
																	style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
																	class="effect-9" type="text" value="" id="dksjxql">
															</div>
														</div>

													</div>
												</div>
											</div>

											<div class="am-box-content ">
												<div class="pull-left tab-box m-l-5"
													style="width:100%; margin-left:45px!important;height:140px;position: relative">
													<a
														style="color:#ffffff;position:absolute;top:-8px; left:10px;background:#162536;font-size:13px"
														class="">地空需求量还原</a>


													<div class="tab-box-content-2 p-t-20"
														style="width:92%;height:322px;margin:0 !important;">
														<div class="am-btn-1 pull-right"
															style="margin-top: -15px;;height:48px;width:170px;background-size: 100% 100%;text-align:center">
															<strong style="line-height: 49px;float:none;padding:0;">高炮需求量还原计算</strong>
														</div>

														<div
															class="am-title-notice pull-right js-save-ok m-l-20"
															style="margin-top: -4px;">
															<div class="p m-l-5">
																加载现有地空火力单元 <b class="fa fa-sun-o pull-right m-t-10"
																	style=""></b>
																<div class="sort-box" hidden></div>
															</div>
														</div>
														</br> </br>
														<table
															class="am-table am-table-bordered am-table-striped "
															style="text-align: center;margin-top:10px;">
															<tr>
																<td rowspan="2">序号</td>
																<td colspan="3">地空火力单元</td>
																<td colspan="3">弹药</td>
																<td rowspan="2">单元需求量/库存量</td>
																<td rowspan="2">弹药需求量/库存量</td>
															</tr>
															<tr>
																<td>地空型号</td>
																<td>标准化作战效能</td>
																<td>比例</td>
																<td>直接损失率</td>
																<td>自然损失率</td>
																<td>冗余率</td>
															</tr>
														</table>

														<table
															class="am-table am-table-bordered am-table-striped am-table-hover"
															style="text-align: center;">
															<c:set var="flag" value="true" />
                                                            <c:forEach items="${pzcss3}" var="p" varStatus="s">
	                                                            <c:if test="${flag}">
		                                                            <tr>
		                                                                <td width="5.6%">${s.index+1}</td>
		                                                                <td width="9.3%">${p.dkddmc}</td>
		                                                                <td width="14.7%">${p.bzxnzs}</td>
		                                                                <c:choose>
											                        		<c:when test="${s.index eq 0 || s.index eq 1}">
											                        			<td class="dbclick" width="5.7%">0.4</td>
											                        		</c:when>
											                        		<c:when test="${s.index eq 2}">
											                        			<td class="dbclick" width="5.7%">0.2</td>
											                        		</c:when>
											                        	</c:choose>
		                                                                <td width="11.1%">${p.zjshl}</td>
		                                                                <td width="11.2%">${p.zrshl}</td>
		                                                                <td width="7.5%">${p.ryl}</td>
		                                                                <td width="17.7%"></td>
		                                                                <td></td>
		                                                                <input type="hidden" value="${p.xzxs}" />
                                                                		<input type="hidden" value="${p.dfhsgl}" />
		                                                            </tr>
	                                                            </c:if>
	                                                            <c:if test="${s.index eq 2}">
	                                                            	<c:set var="flag" value="false" />
	                                                            </c:if>
                                                            </c:forEach>

														</table>
													</div>
												</div>
											</div>



										</div>
									</div>
									<!-- -->
								</div>
								<!-- -->
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="col-lg-4" style="padding-right:0;width: 35%;">
			<div class="border-polygon-450-700 height-2"
				style="width:100%;height:935px;">
				<div class="am-box">
					<div class="am-box-title">
						<i class="fa fa-crosshairs"></i>
						<p>侦察预警单元需求量</p>
					</div>
					<div class="row">
						<div class="col-lg-12">
							<div class="am-box-content">
								<div class="pull-left tab-box m-l-5"
									style="width:106%; margin-left:5px!important;height:124px;position: relative">

									<a
										style="color:#ffffff;position:absolute;top:-8px; left:10px;background:#162536;font-size:13px"
										class="">任务信息</a>

									<div class="tab-box-content-2 p-t-20"
										style="width:92%;height:120px;margin:0 !important;">
										<div class="row">
											<div class="col-lg-6">
												<span>侦察预警区域面积</span>
												<div class="effect-9-box">
													<input
														style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
														class="effect-9" type="text" value="">
												</div>
												 <div class="tree smart-form" style="float:left;width:0px;">
                                    <label class="checkbox inline-block fl fl-r">
                                        <input type="checkbox" name="checkbox-inline" >
                                        <i></i>
                                    </label>
                                    </div>
											</div>
											<div class="col-lg-6">
												<span>加强侦察方向个数</span>
												<div class="effect-9-box">
													<input
														style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
														class="effect-9" type="text" value="">
												</div>
											</div>
										</div>
										<div class="row">
											<div class="col-lg-6">
												<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;允许战损率</span>
												<div class="effect-9-box">
													<input
														style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
														class="effect-9" type="text" value="">
												</div>
											</div>
											<div class="col-lg-6">
												<span>要求发现目标概率</span>
												<div class="effect-9-box">
													<input
														style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
														class="effect-9" type="text" value="">
												</div>
											</div>
										</div>
										<div class="row">
											<div class="col-lg-6">
												<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;预备役比例</span>
												<div class="effect-9-box">
													<input
														style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
														class="effect-9" type="text" value="">
												</div>
											</div>

										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<!--  -->
					<!--  -->
					<div class="am-box-content">
						<div class="pull-left tab-box m-l-5"
							style="width:106%; margin-left:5px!important;height:140px;position: relative">

							<a
								style="color:#ffffff;position:absolute;top:-8px; left:10px;background:#162536;font-size:13px"
								class="">标准侦察预警单元信息</a>

							<div class="tab-box-content-2 p-t-20"
								style="width:92%;height:120px;margin:0 !important;">
								<div class="row">
									<div class="col-lg-6">
										<span>标准侦察预警单元</span>
										<div class="effect-9-box">
											<input
												style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
												class="effect-9" type="text" value="">
										</div>
									</div>
									<div class="col-lg-6">
										<span>&nbsp;&nbsp;&nbsp;&nbsp;发现目标概率</span>
										<div class="effect-9-box">
											<input
												style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
												class="effect-9" type="text" value="">
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-lg-6">
										<span>&nbsp;&nbsp;&nbsp;&nbsp;搜索区域面积</span>
										<div class="effect-9-box">
											<input
												style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
												class="effect-9" type="text" value="">
										</div>
									</div>
									<div class="col-lg-6">
										<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;装备可靠性</span>
										<div class="effect-9-box">
											<input
												style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
												class="effect-9" type="text" value="">
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-lg-6">
										<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;配置间隔</span>
										<div class="effect-9-box">
											<input
												style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
												class="effect-9" type="text" value="">
										</div>
									</div>

									<div class="col-lg-6">
										<span>&nbsp;&nbsp;&nbsp;&nbsp;有效探测半径</span>
										<div class="effect-9-box">
											<input
												style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
												class="effect-9" type="text" value="">
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>


				<div class="am-box-content">
					<div class="pull-left tab-box m-l-5"
						style="width:101%; margin-left:19px!important;height:227px;position: relative">

						<a
							style="color:#ffffff;position:absolute;top:-8px; left:10px;background:#162536;font-size:13px"
							class="">标准侦察预警单元</a>

						<div class="tab-box-content-2 p-t-20"
							style="width:92%;height:207px;margin:0 !important;">
							<div class="col-lg-6">
								<div class="row">
									<div class="col-lg-12">
										<span>基本需求量</span>
										<div class="effect-9-box">
											<input
												style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
												class="effect-9" type="text" value="" id="zcjbxql">
										</div>
									</div>
								</div>
								<br />
								<div class="row">
									<div class="col-lg-12">
										<span>需求加强量</span>
										<div class="effect-9-box">
											<input
												style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
												class="effect-9" type="text" value="" id="zcxqjql">
										</div>
									</div>
								</div>
								<br />
								<div class="row">
									<div class="col-lg-12">
										<span>&nbsp;&nbsp;&nbsp;&nbsp;冗余量</span>
										<div class="effect-9-box">
											<input
												style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
												class="effect-9" type="text" value="" id="zcryl">
										</div>
									</div>
								</div>
								<br />
								<div class="row">
									<div class="col-lg-12">
										<span>实际需求量</span>
										<div class="effect-9-box">
											<input
												style="border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"
												class="effect-9" type="text" value="" id="zcsjxql">
										</div>
									</div>
								</div>
							</div>
							<div class="col-lg-6">
								<div class="row" style="margin-top: -20px;">
									<div class="col-lg-12">
										<div class="am-btn-lg pull-right m-t-20 m-r-20"
											style="width: 240px;">标准侦察预警单元需求量计算</div>
									</div>
								</div>
								<div class="row">

									<div id="circleDom2" style="width:100%;height:120px;"></div>

								</div>
							</div>
						</div>
					</div>

				</div>
				<!-- -->
				<!-- -->

				<div class="am-box-content">
					<div class="pull-left tab-box m-l-5"
						style="width:101%; margin-left:19px!important;height:106px;position: relative">

						<a style="color:#ffffff;position:absolute;top:-8px; left:10px;background:#162536;font-size:13px"
							class="">侦察预警单元需求量还原</a>

						<div class="tab-box-content-2 p-t-20"
							style="width:92%;height:335px;margin:0 !important;">
							<div class="am-btn-1 pull-right"
								style="margin-top: -15px;;height:56px;width:200px;text-align: center">
								<strong style="line-height:56px;float:none;padding:0;">侦察预警单元需求量还原计算</strong>
							</div>
							<div
								class="am-title-notice pull-right js-save-ok m-l-20"
								style="margin-top: -4px;">
								<div class="p m-l-5">
									加载现有侦察预警单元 <b class="fa fa-sun-o pull-right m-t-10" style=""></b>
									<div class="sort-box" hidden></div>
								</div>
							</div>
							</br>
							</br>
							</br>
							<table
								class="am-table am-table-bordered am-table-striped am-table-hover "
								style="text-align: center;width:583px;margin-left:-6px;">
								<tr>
									<td>序号</td>
									<td>侦察预警单元型号</td>
									<td>侦察预警空域</td>
									<td>标准化效能</td>
									<td>比例</td>
									<td>侦察预警单元需求量/库存量</td>
								</tr>
							</table>
							<div class="src-bar"
								style="height:204px;width:583px;margin-left:-6px;">

								<table
									class="am-table am-table-bordered am-table-striped am-table-hover "
									style="text-align: center;width:583px;">
									<c:set var="flag" value="true"></c:set>
									<c:forEach items="${pzcss4}" var="p" varStatus="s">
										<c:if test="${flag }">
											<tr>
												<td width="7.5%">${s.index+1}</td>
												<td width="21.5%">${p.zcyjmc}</td>
												<td width="16.9%">${p.zcyjky}</td>
												<td width="14.5%">${p.bzhxs}</td>
												<c:choose>
													<c:when test="${s.index eq 0 || s.index eq 1}">
														<td class="dbclick" width="7.5%">0.4</td>
													</c:when>
													<c:when test="${s.index eq 2}">
														<td class="dbclick" width="7.5">0.2</td>
													</c:when>
												</c:choose>
												<td></td>
											</tr>
										</c:if>
										<c:if test="${s.index eq 2}">
											<c:set var="flag" value="false"></c:set>
										</c:if>
									</c:forEach>
								</table>
							</div>
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
<script src="js/layout.js"></script>
<script type="text/javascript">

$(function(){
    $(".dbclick").dblclick(function(){
    	var s=$(this).text();
        $(this).html('<div class="effect-9-box"><input type="text" value=\"'+s+'\" id="click1" style="color:#ffffff;border: 1px solid rgba(122,245,255,40);height:24px; width:115px;"></div>')
    });
   $(".dbclick").mouseleave(function(){
         var a=document.getElementById("click1").value;
         $(this).remove("input");
        $(this).text(a);
        if(a.value==0){
        	
        }
      }); 
});
	$(function() {
		var gpxqlsz = new Array();
		var gpdyxqlsz = new Array();
		<c:forEach var="t" items="${pzcss2}" varStatus="c">
			gpxqlsz['${c.index}'] = ${t.wqkc}; 
			gpdyxqlsz['${c.index}'] = ${t.dykc};
		</c:forEach>
		
		var dkxqlsz = new Array();
		var dkdyxqlsz = new Array();
		<c:forEach var="t" items="${pzcss3}" varStatus="c">
			dkxqlsz['${c.index}'] = ${t.wqkc}; 
			dkdyxqlsz['${c.index}'] = ${t.dykc};
		</c:forEach>
		
		var zckclsz = new Array();
		<c:forEach var="t" items="${pzcss4}" varStatus="c">
			zckclsz['${c.index}'] = ${t.kcl}; 
		</c:forEach>
		
		$.ajax({
			'url' : 'fkzzfxAction!*dataLee',
			'type' : 'post',
			'dataType' : 'json',
			'async' : true,
			'success' : function(data) {
				$("#gphl > div").eq(0).find("input[type=text]").val(data[0].cslg);
				$("#gphl > div").eq(1).find("input[type=checkbox]").on("click",function(){
					if($("#gphl > div").eq(1).find("input[type=checkbox]")[0].checked){
						$("#gphl > div").eq(1).find("input[type=text]").val(data[4].csz);
					}else{
						$("#gphl > div").eq(1).find("input[type=text]").val("");
					}
				});
				
				$("#gphl > div").eq(2).find("input[type=text]")
						.val(data[5].csz);
				$(".tab-box-content").eq(1).find(".am-box-content").eq(0).find("input[type=text]").eq(0).val(
								data[6].csz);
				$(".tab-box-content").eq(1).find(".am-box-content").eq(0).find("input[type=text]").eq(1).val(
						data[8].csz);
				$(".tab-box-content").eq(1).find(".am-box-content").eq(0).find("input[type=text]").eq(2).val(
						data[11].csz);
				$(".tab-box-content").eq(1).find(".am-box-content").eq(0).find("input[type=text]").eq(3).val(
						data[13].csz);
				$(".tab-box-content").eq(1).find(".am-box-content").eq(1).find("input[type=text]").eq(0).val(
						data[1].cslg);
				$(".tab-box-content").eq(1).find(".am-box-content").eq(1).find("input[type=text]").eq(1).val(
						data[12].csz);

				$(".tab-box-content").eq(2).find(".am-box-content").eq(0).find("input[type=text]").eq(0).val(
						data[7].csz);
				$(".tab-box-content").eq(2).find(".am-box-content").eq(0).find("input[type=text]").eq(1).val(
						data[14].csz);
				$(".tab-box-content").eq(2).find(".am-box-content").eq(0).find("input[type=text]").eq(2).val(
						data[17].csz);
				$(".tab-box-content").eq(2).find(".am-box-content").eq(0).find("input[type=text]").eq(3).val(
						data[19].csz);
				$(".tab-box-content").eq(2).find(".am-box-content").eq(1).find("input[type=text]").eq(0).val(
						data[2].cslg);
				$(".tab-box-content").eq(2).find(".am-box-content").eq(1).find("input[type=text]").eq(1).val(
						data[18].csz);
				
				$(".am-box").eq(1).find(".row").eq(0).find(".row").eq(0).find(".col-lg-6").eq(0).find("input[type=checkbox]").on("click",function(){
					if(this.checked){
						$(".am-box").eq(1).find(".row").eq(0).find(".row").eq(0).find("input[type=text]").eq(0).val(data[20].csz);
					}else{
						$(".am-box").eq(1).find(".row").eq(0).find(".row").eq(0).find("input[type=text]").eq(0).val("");
					}
				});
				
				$(".am-box").eq(1).find(".row").eq(0).find(".row").eq(0).find("input[type=text]").eq(1).val(data[24].csz);
				$(".am-box").eq(1).find(".row").eq(0).find(".row").eq(1).find("input[type=text]").eq(0).val(data[27].csz);
				$(".am-box").eq(1).find(".row").eq(0).find(".row").eq(1).find("input[type=text]").eq(1).val(data[25].csz);
				$(".am-box").eq(1).find(".row").eq(0).find(".row").eq(2).find("input[type=text]").eq(0).val(data[29].csz);
				$(".am-box").eq(1).find(".row").eq(4).find("input").eq(0).val(data[3].cslg);
				$(".am-box").eq(1).find(".row").eq(4).find("input").eq(1).val(data[26].csz);
				$(".am-box").eq(1).find(".row").eq(5).find("input").eq(0).val(data[21].csz);
				$(".am-box").eq(1).find(".row").eq(5).find("input").eq(1).val(data[28].csz);
				$(".am-box").eq(1).find(".row").eq(6).find("input").eq(0).val(data[22].csz);
				$(".am-box").eq(1).find(".row").eq(6).find("input").eq(1).val(data[23].csz);
			}
		});
		
		 $(".am-table-hover").eq(0).hide();
		 $(".am-table-hover").eq(1).hide();
		 $(".am-table-hover").eq(3).hide(); 
		
		 $(".p").on("click",function(){
			$(this).text().trim()=="加载现有高炮火力单元";
			if($(this).text().trim() == $(".p:eq(0)").text().trim()){
				$(".am-table-hover").eq(0).show();
			}else if($(this).text().trim() == $(".p:eq(1)").text().trim()){
				$(".am-table-hover").eq(1).show();
			}else{
				$(".am-table-hover").eq(3).show();
			}
			
		});		 
		
		$(".am-btn-lg").bind("click",function(){
			var kxgm = Number($("#gphl > div").eq(1).find("input[type=text]").val());
			if($(this).text()==$(".am-btn-lg:eq(0)").text()){
				var v1 = 0;
				var v2 = 0;
				var kjzb = Number($("#gphl > div").eq(2).find("input[type=text]").val()*$(".tab-box-content").eq(1).find(".am-box-content").eq(0).find("input[type=text]").eq(0).val());
				var hszb = Number($(".tab-box-content").eq(1).find(".am-box-content").eq(0).find("input[type=text]").eq(1).val());
				var xzxs = Number("${pzcss2[0].xzxs}");
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
				
				var yxzsl = Number($(".tab-box-content").eq(1).find(".am-box-content").eq(0).find("input[type=text]").eq(2).val());
				var zbkkx = Number($(".tab-box-content").eq(1).find(".am-box-content").eq(1).find("input[type=text]").eq(1).val());
				var ybybl = Number($(".tab-box-content").eq(1).find(".am-box-content").eq(0).find("input[type=text]").eq(3).val());
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
				$("#fksjxql").val(v1+v2); 
				
			}else if($(this).text()==$(".am-btn-lg:eq(1)").text()){
				var v1 = 0;
				var v2 = 0;
				var kjzb = Number($("#gphl > div").eq(2).find("input[type=text]").val()*$(".tab-box-content").eq(2).find(".am-box-content").eq(0).find("input[type=text]").eq(0).val());
				var hszb = Number($(".tab-box-content").eq(2).find(".am-box-content").eq(0).find("input[type=text]").eq(1).val());
				var xzxs = Number("${pzcss3[0].xzxs}");
				var dfhsgl = Number("${pzcss3[0].dfhsgl}");
				$.ajax({
					url:'${webServiceURL}/fkhldy/fkhl/llxq/'+kxgm+'/'+kjzb+'/'+hszb+'/'+xzxs+'/'+dfhsgl,
					type:'get',
					dataType:'json',
					async:false,
					success:function(data){
						$("#dkllxql").val(data);
						v1 = Number($("#dkllxql").val());
					}
				}); 
				
				var yxzsl = Number($(".tab-box-content").eq(2).find(".am-box-content").eq(0).find("input[type=text]").eq(2).val());
				var zbkkx = Number($(".tab-box-content").eq(2).find(".am-box-content").eq(1).find("input[type=text]").eq(1).val());
				var ybybl = Number($(".tab-box-content").eq(2).find(".am-box-content").eq(0).find("input[type=text]").eq(3).val());
				$.ajax({
					 url:'${webServiceURL}/fkhldy/fkhl/ryl/'+$("#dkllxql").val()+'/'+yxzsl+'/'+zbkkx+'/'+ybybl,
					 type:'get',
					 dataType:'json',
					 async:false,
					 success:function(data){
						 $("#dkryl").val(data.toFixed(3));
						 v2 = Number($("#dkryl").val());
					 }
				 });
				
				$("#dksjxql").val(v1+v2);
			}else{
				var zcqymj = Number($(".am-box").eq(1).find(".row").eq(0).find(".row").eq(0).find("input[type=text]").eq(0).val());
				var yxtcbj = Number($(".am-box").eq(1).find(".row").eq(6).find("input").eq(1).val());
				var bzzcyjdy = Number($(".am-box").eq(1).find(".row").eq(5).find("input").eq(0).val());
				var pzjg = Number($(".am-box").eq(1).find(".row").eq(6).find("input").eq(0).val());
				$.ajax({
					url:'${webServiceURL}/fkhldy/zcyjdy/jbxq/'+zcqymj+'/'+yxtcbj+'/'+bzzcyjdy+'/'+pzjg,
					type:'get',
					dataType:'json',
					async:false,
					success:function(data){
						$("#zcjbxql").val(data);
						zcjbxql = Number($("#zcjbxql").val());
					}
				});
				
				var jqfxzcgs = Number($(".am-box").eq(1).find(".row").eq(0).find(".row").eq(0).find("input[type=text]").eq(1).val());
				var yqfxmbgl = Number($(".am-box").eq(1).find(".row").eq(0).find(".row").eq(1).find("input[type=text]").eq(1).val());
				var fxmbgl = Number($(".am-box").eq(1).find(".row").eq(4).find("input").eq(1).val());
				$.ajax({
					url:'${webServiceURL}/fkhldy/zcyjdy/xqjql/'+zcjbxql+'/'+jqfxzcgs+'/'+yqfxmbgl+'/'+fxmbgl,
					type:'get',
					dataType:'json',
					async:false,
					success:function(data){
						$("#zcxqjql").val(data);
						zcxqjql = Number($("#zcxqjql").val());
						n1 = zcxqjql+zcjbxql;
					}
				});
				
				var k1 = Number($(".am-box").eq(1).find(".row").eq(0).find(".row").eq(1).find("input[type=text]").eq(0).val());
				var k2 = Number($(".am-box").eq(1).find(".row").eq(5).find("input").eq(1).val());
				var k3 = Number($(".am-box").eq(1).find(".row").eq(0).find(".row").eq(2).find("input[type=text]").eq(0).val());
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
				circleDom2(zcjbxql,zcxqjql,zcryl);
			}
		});
		
		//高炮弹药需求量
		$(".am-btn-1:eq(0)").on("click",function(){
			var sjxql = Number($("#fksjxql").val());
			var length = $(".am-table-hover").eq(0).find("tr").length;
			for(var i=0;i<length;i++){
				//高炮需求量参数
				var bl = $(".am-table-hover").eq(0).find("tr").eq(i).find("td:eq(3)").text();
				var bzhhn = $(".am-table-hover").eq(0).find("tr").eq(i).find("td:eq(2)").text();
				$.ajax({
					url:'${webServiceURL}/fkhldy/fkhl/hyjs/'+sjxql+'/'+bl+'/'+bzhhn,
					type:'get',
					dataType:'json',
					async:false,
					success:function(data){
						$(".am-table-hover").eq(0).find("tr").eq(i).find("td:eq(7)").text(Math.ceil(data)+"/"+gpxqlsz[i]);
					}
				});
				//-----------------------------------------------------------------------------------------
				//弹药需求量参数
				//消耗量
				var kxgm = Number($("#gphl > div").eq(1).find("input[type=text]").val());
				var kjzb = Number($("#gphl > div").eq(2).find("input[type=text]").val()*$(".tab-box-content").eq(1).find(".am-box-content").eq(0).find("input[type=text]").eq(0).val());
				var mi = Number($("#fksjxql").val())*Number($(".am-table-hover").eq(0).find("tr").eq(i).find("td:eq(3)").text());
				var m = Number($("#fksjxql").val());
				var hszb = Number($(".tab-box-content").eq(1).find(".am-box-content").eq(0).find("input[type=text]").eq(1).val());
				var xzxs = Number($(".am-table-hover").eq(0).find("tr").eq(i).find("input[type=hidden]:eq(0)").val());
				var dcdshsgl = Number($(".am-table-hover").eq(0).find("tr").eq(i).find("input[type=hidden]:eq(1)").val());
				var dcdshdl = Number($(".am-table-hover").eq(0).find("tr").eq(i).find("input[type=hidden]:eq(2)").val());
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
				var ai = $(".am-table-hover").eq(0).find("tr").eq(i).find("td:eq(4)").text();
				var bi = $(".am-table-hover").eq(0).find("tr").eq(i).find("td:eq(5)").text();
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
				var ci = $(".am-table-hover").eq(0).find("tr").eq(i).find("td:eq(6)").text();
				var ni3 = ni1*ci;
				var ni0 = ni1+ni2+ni3;
				$(".am-table-hover").eq(0).find("tr").eq(i).find("td:eq(8)").text(Math.ceil(ni0)+"/"+gpdyxqlsz[i]); 
			}
		});
		
		//地空弹药需求量
		$(".am-btn-1:eq(1)").on("click",function(){
			var sjxql = Number($("#dksjxql").val());
			var length = $(".am-table-hover").eq(1).find("tr").length;
			for(var i=0;i<length;i++){
				//地空需求量参数
				var bl = $(".am-table-hover").eq(1).find("tr").eq(i).find("td:eq(3)").text();
				var bzhhn = $(".am-table-hover").eq(1).find("tr").eq(i).find("td:eq(2)").text();
				$.ajax({
					url:'${webServiceURL}/fkhldy/fkhl/hyjs/'+sjxql+'/'+bl+'/'+bzhhn,
					type:'get',
					dataType:'json',
					async:false,
					success:function(data){
						$(".am-table-hover").eq(1).find("tr").eq(i).find("td:eq(7)").text(Math.ceil(data)+"/"+dkxqlsz[i]);
					}
				});
				//-----------------------------------------------------------------------------------------
				//弹药需求量参数
				//消耗量
				var kxgm = Number($("#gphl > div").eq(1).find("input[type=text]").val());
				var kjzb = Number($("#gphl > div").eq(2).find("input[type=text]").val()*$(".tab-box-content").eq(2).find(".am-box-content").eq(0).find("input[type=text]").eq(0).val());
				var mi = Number($("#dksjxql").val())*Number($(".am-table-hover").eq(1).find("tr").eq(i).find("td:eq(3)").text());
				var m = Number($("#dksjxql").val());
				var hszb = $(".tab-box-content").eq(2).find(".am-box-content").eq(0).find("input[type=text]").eq(1).val();
				var xzxs = Number($(".am-table-hover").eq(1).find("tr").eq(i).find("input[type=hidden]:eq(0)").val());
				var dcdshsgl = Number($(".am-table-hover").eq(1).find("tr").eq(i).find("input[type=hidden]:eq(1)").val());
				$.ajax({
					url:'${webServiceURL}/fkhldy/fkdyxq/xhl/'+kxgm+'/'+kjzb+'/'+mi+'/'+m+'/'+hszb+'/'+xzxs+'/'+dcdshsgl+'/'+1,
					type:'get',
					dataType:'json',
					async:false,
					success:function(data){
						ni1 = data;
					}
				});
 				//损耗量
				var ai = $(".am-table-hover").eq(1).find("tr").eq(i).find("td:eq(4)").text();
				var bi = $(".am-table-hover").eq(1).find("tr").eq(i).find("td:eq(5)").text();
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
				var ci = $(".am-table-hover").eq(1).find("tr").eq(i).find("td:eq(6)").text();
				var ni3 = ni1*ci;
				var ni0 = ni1+ni2+ni3;
				$(".am-table-hover").eq(1).find("tr").eq(i).find("td:eq(8)").text(Math.ceil(ni0)+"/"+dkdyxqlsz[i]); 
			}
		});
		
		//侦察预警单元需求量
		$(".am-btn-1:eq(2)").on("click",function(){
			var length = $(".am-table-hover").eq(3).find("tr").length;
			var n0 = $("#zcsjxql").val();
			for(var i=0;i<length;i++){
				var ci = $(".am-table-hover").eq(3).find("tr").eq(i).find("td:eq(4)").text();
				var bi = $(".am-table-hover").eq(3).find("tr").eq(i).find("td:eq(3)").text();
				$.ajax({
					url:'${webServiceURL}/fkhldy/zcyjdy/hyjs/'+n0+'/'+ci+'/'+bi,
					type:'get',
					dataType:'json',
					async:false,
					success:function(data){
						$(".am-table-hover").eq(3).find("tr").eq(i).find("td:eq(5)").text(Math.ceil(data)+"/"+zckclsz[i]); 
					}
				});
			}
		});
	});

    function circleDom2(zcjbxql,zcxqjql,zcryl){
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
                    var myChart = ec.init(document.getElementById('circleDom2'));
                    option = {
                        title : {
                            text: '',   //title标题
                            subtext: '',                   //title 小标题
                            x:'center',
                            textStyle:{
                                color: '#ffffff',
                                fontSize:'15',
                                fontFamily:'黑体',
                            },
                            subtextStyle:{
                                color: '#ffffff',
                                fontSize:'10',
                                fontFamily:'黑体',
                            }
                        },
                        tooltip : {
                            trigger: 'item',
                            formatter: "{a} <br/>{b} : {c} ({d}%)"
                        },
                        legend: {
                            orient : 'vertical',
                            x : 'left',
                            data:['','','','','']
                        },
                        toolbox: {
                            show : false,
                            feature : {
                                mark : {show: false},
                                dataView : {show: false, readOnly: false},
                                magicType : {
                                    show: false,
                                    type: ['pie', 'funnel'],
                                    option: {
                                        funnel: {
                                            x: '25%',
                                            width: '50%',
                                            funnelAlign: 'left',
                                            max: 1548
                                        }
                                    }
                                },
                                restore : {show: true},
                                saveAsImage : {show: true}
                            }
                        },
                        calculable :false,
                        series : [
                            {
                                type:'pie',
                                radius : '55%',
                                center: ['50%', '60%'],
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
    circleDom2(0,0,0);
</script>
</body>
</html>