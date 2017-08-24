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
		<title>毁伤能力分析</title>
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
					<p>毁伤能力分析</p>
				</a>
			</div>
			<div class="am-top-nav">
				<ul>
					<li class="active button--moema"><a>毁伤资源计算</a></li>
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
				<div class="col-lg-5">
					<div class="border-square height-2">
						<div class="am-box-title">
							<i class="fa  fa-sitemap" style=""></i>
							<p style="">我方战斗潜力</p>
						</div>

						   <div class="row">
	  							<div class="col-lg-3">
	<div class="am-btn-lg pull-left m-t-5 m-l-20 button-moema" style="height: 45px; width:135px;" data-modal="#tips-value-3" data-modal-init >我方兵力选择</div>
								</div>
	<div class="col-lg-3">
	<div id="wnljs" class="am-btn-lg pull-left m-t-5  button-moema" style="height: 45px; width:160px;">能力计算</div>
	</div>
	<div class="col-lg-6">
		<span class="m-t-20 p-r-10" style="color:white;font-size:15px;float:left">我方允许损失率</span>
		<div class="effect-9-box m-t-15" style="width:120px">
		<input style="border: 1px solid rgba(122,245,255,40); width:100%" class="effect-9" type="text" value="输入（0-1）"onfocus="javascript:if(this.value=='输入（0-1）')this.value=''" >
		</div>
	</div>

						</div>

<br/>
						<div class="row">
	 		<div class="col-lg-12">
	<div class="srcla-bar" style="width: 700px;margin:0 auto; height:316px;" >
	<table class="am-table am-table-bordered am-table-striped am-table-hover" style="text-align: center" >
	<tbody>
	<tr id="wfdr">
	<td >
	<div class="dropdown">
	<div class="dropdown-toggle" data-toggle="dropdown"> 我方 </div>
	</div>

	</td>
	<td >
	<div class="dropdown">
	<div class="dropdown-toggle" data-toggle="dropdown"> 配备程度 </div>
	</div>

	</td>
	<td >
	<div class="dropdown">
	<div class="dropdown-toggle" data-toggle="dropdown"> 战斗潜力 </div>
	</div>
	</td>
	<td >
	<div class="dropdown">
	<div class="dropdown-toggle" data-toggle="dropdown">压制火炮标准数 </div>

	</div>
	</td>
	<td >
	<div class="dropdown">
	<div class="dropdown-toggle" data-toggle="dropdown"> 压制弹药基数</div>

	</div>
	</td>
	<td >
	<div class="dropdown">
	<div class="dropdown-toggle" data-toggle="dropdown">反坦克兵器数量  </div>

	</div>
	</td>
	</tr>

	<tr>
	<td>
	<div class="dropdown">
	<div class="dropdown-toggle" data-toggle="dropdown"> 合计</div>

	</div>
	</td>
	<td>
	<div class="dropdown">
	<div class="dropdown-toggle" data-toggle="dropdown"> </div>

	</div>
	</td>
	<td>
	<div class="dropdown">
	<div class="dropdown-toggle" data-toggle="dropdown"> </div>

	</div>
	</td>
	<td>
	<div class="dropdown">
	<div class="dropdown-toggle" data-toggle="dropdown">  </div>

	</div>
	</td>
	<td>
	<div class="dropdown">
	<div class="dropdown-toggle" data-toggle="dropdown"> </div>

	</div>
	</td>
	<td>
	<div class="dropdown">
	<div class="dropdown-toggle" data-toggle="dropdown"> </div>

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

					<div class="col-lg-3">
						<div class=" border-polygon-lg height-2">
							<div class="am-box">
								<div class="am-box-title">
									<i class="fa fa-crosshairs"></i>
									<p>战斗潜力对比</p>
								</div>

									<div class="row">
										<div class="col-lg-12">
	<div class="row">
	<div class="col-lg-12">
	<div id="circleDom6" style="width:100%; height: 300px;   -webkit-tap-highlight-color: transparent; -webkit-user-select: none; cursor: default; background-color: rgba(0, 0, 0, 0);" _echarts_instance_="1472181565817"></div>
	</div>
	</div>
	<div class="row">
	<div class="col-lg-12">
	<div style="border:0px solid red; margin:0 auto;width:60%;">
	<span class="p-r-5" style="font-size:15px; color:white;float:left">战斗潜力初始比</span>
	<div class="effect-9-box" style="width:100px;">
	<input id="csb" style="border: 1px solid rgba(122,245,255,40);height:24px; width:100%;" class="effect-9" type="text" value="" onfocus="javascript:if(this.value=='')this.value=''">
	</div>
	</div>
	</div>
	</div>
	<div class="row">
	<div class="col-lg-12">
	<div style="border:0px solid red;margin:0 auto;width:77%;">
		<div class="am-btn-lg pull-left m-r-10 button-moema" style="height: 45px; width:135px;" id="jshscd">计算所需毁伤程度</div>
		<div class="effect-9-box p-t-10" style="width:100px;height:40px;">
			<input id="jshscd2" style="border: 1px solid rgba(122,245,255,40);width:100%;" class="effect-9" type="text" value="">
		</div>
	</div>
	</div>
	</div>
	</div>
	</div>
	</div>
	</div>
	</div>
							<div class="col-lg-4">
								<div class="border-polygon height-2">
									<div class="am-box">
										<div class="am-box-title">
											<i class="fa  fa-sitemap"></i>
											<p>敌方战斗潜力</p>
										</div>
	<div class="row">
	<div class="col-lg-3">
	<div  class="am-btn-lg pull-left m-t-5  button-moema" style="height: 45px; width:135px;" data-modal="#tips-value-2" data-modal-init>敌方兵力选择</div>
	</div>
	<div class="col-lg-3">
	<div  class="am-btn-lg pull-left m-t-5  button-moema" style="height: 45px; width:135px;" id="dnljs">能力计算</div>
	</div>
	<div class="col-lg-6">
	<span class="m-t-15 p-r-10 m-l-10" style="color:white; font-size:15px;float:left">敌隐蔽程度</span>
	<div class="effect-9-box m-t-10" style="width:130px;">
	<input id="dyb" style="border: 1px solid rgba(122,245,255,40); width:100%;" class="effect-9" type="text" value="输入 (0-0.5)" onfocus="javascript:if(this.value=='输入 (0-0.5)')this.value=''" >
	</div>
	</div>
	</div>
	<br/>

	<div class="row">
	<div class="col-lg-12">
			<div class="srcla-bar2" style="height:288px;">
			<table class="am-table am-table-bordered am-table-striped am-table-hover" style="text-align: center;" >
			<tr id="dfdr">
			<td>敌方</td>
			<td>配备程度</td>
			<td>战斗潜力</td>
			<td>抗毁能力标准师数</td>
			<td>装甲力量标准师数</td>
			</tr>
			<tr>
			<td>合计</td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			</tr>
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
	</div>
	</div>
	</div>
	<div class="row">
	 <div class="col-lg-3 m-l-20">
	<div class="row">
	<div class="col-lg-12">
	<div class=" border-polygon-lg height-2">
	<div class="am-box">
	<div class="am-box-title">
	<i class="fa fa-crosshairs"></i>
	<p>炮兵压制火力毁伤能力</p>
	</div>
	<div class="row">
	<div class="col-lg-12">
	<div style="border:0px solid red;width:65%;margin:0 auto;">
	<span class="p-r-10 m-t-5" style=" color: white; font-size: 15px;float:left">战役储备百分比</span>
	<div class="effect-9-box" style="width:130px;height:40px">
	<input id="zycb1" style="border: 1px solid rgba(122,245,255,40);width:100%;" class="effect-9" type="text" value="输入 (0-1)" onfocus="javascript:if(this.value=='输入 (0-1)')this.value=''">
	</div>
	</div>
	</div>
	</div>
	<div class="row">
	<div class="col-lg-6">
	<div id="pbdr" class="am-btn-lg pull-left  button-moema" style="height: 45px; width:100%;">导入上级分配弹药基数</div>
	</div>
	<div class="col-lg-6">
	<div id="pbjs" class="am-btn-lg pull-left button-moema" style="height: 45px; width:100%;">计算火力毁伤能力</div>
	</div>
	</div>
	</div>
	<div class="row">
	<div class="col-lg-12">
	<div class="src-bar" style="margin:0 auto;height:288px;width:95%">
	<table class="am-table am-table-bordered am-table-striped am-table-hover"style="text-align: center" >
	<tbody>
	<tr>
	<td>武器</td>
	<td>上级分配弹药</td>
	<td>火力配备程度</td>
	<td>火力毁伤能力（千标弹）</td>
	</tr>
	<c:forEach items="${zhs}" var="z">
		<tr class="thtr">
		<td>${z.mc}</td>
		<td>${z.dysl}</td>
		<td>${z.pbcd}</td>
		<td></td>
		</tr>
	</c:forEach>
	<tr id="hj1">
	<td>合计</td>
	<td></td>
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
	</div>
	</div>
	<div class="col-lg-3">
	<div class="row">
	<div class="col-lg-12">
	<div class=" border-polygon-lg height-2">
	<div class="am-box">
	<div class="am-box-title">
	<i class="fa fa-crosshairs"></i>
	<p>火箭军火力毁伤能力</p>
	</div>
	<div class="row">
	<div class="col-lg-12">
	<div style="border:0px solid red;width:65%;margin:0 auto;">
	<span class="m-t-5 p-r-5" style="color: white; font-size: 15px;float:left">战役储备百分比</span>
	<div class="effect-9-box" style="width:130px;height:40px;">
	<input id="zycb2" style="border: 1px solid rgba(122,245,255,40);width:100%;" class="effect-9" type="text" value="输入 (0-1)" onfocus="javascript:if(this.value=='输入 (0-1)')this.value=''">
	</div>
	</div>
	</div>
	</div>
	<div class="row">
	<div class="col-lg-6">
	<div id="hjjdr" class="am-btn-lg pull-left button-moema" style="height: 45px; width:100%">导入上级分配弹药数量</div>
	</div>
	<div class="col-lg-6">
	<div id="hjjjs" class="am-btn-lg pull-left button-moema" style="height: 45px; width:100%">计算火力毁伤能力</div>
	</div>
	</div>
	</div>
	<div class="row">
	<div class="col-lg-12">
	<div class="src-bar" style="width:95%;margin:0 auto">
	<table class="am-table am-table-bordered am-table-striped am-table-hover"  style="text-align: center" >
	<tbody>
	<tr>
	<td>武器</td>
	<td>数量</td>
	<td>火力毁伤能力（千标弹）</td>
	</tr>
	<c:forEach items="${jhs}" var="j">
		<tr class="thtr2">
		<td>${j.mc}</td>
		<td>${j.dysl}</td>
		<td></td>
		</tr>
	</c:forEach>
	<tr id="hj2">
	<td>合计</td>
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
	</div>
	</div>
	<div class="col-lg-3">
	<div class="row">
	<div class="col-lg-12">
	<div class=" border-polygon-lg height-2">
	<div class="am-box">
	<div class="am-box-title">
	<i class="fa fa-crosshairs"></i>
	<p>航空兵火力毁伤能力</p>
	</div>
		<div class="row">
	<div class="col-lg-7">
	<span class="m-t-5 p-r-5" style="color: white; font-size: 15px;float:left">战役储备百分比</span>
	<div class="effect-9-box" style="width:95px">
	<input id="zycb3" style="border: 1px solid rgba(122,245,255,40);width:100%;" class="effect-9" type="text" value="输入(0-1)" onfocus="javascript:if(this.value=='输入(0-1)')this.value=''">
	</div>
	</div>
	<div class="col-lg-5">
	<span class="m-t-5 p-r-5" style=" color:white;font-size: 15px;float:left">配备程度</span>
	<div class="effect-9-box" style="width:92px;">
	<input id="hkpbcd" style="border: 1px solid rgba(122,245,255,40);width:100%;" class="effect-9" type="text" value="输入(0-1)" onfocus="javascript:if(this.value=='输入(0-1)')this.value=''">
	</div>
	</div>
	</div>
	<div class="row">
	<div class="col-lg-6">
	<div id="fkbdr" class="am-btn-lg pull-left m-t-10 button-moema" style="height: 45px; width:100%">导入上级规定出动量</div>
	</div>
	<div class="col-lg-6">
	<div id="fkbjs" class="am-btn-lg pull-left m-t-10 button-moema" style="height: 45px; width:100%;">计算火力毁伤能力</div>
	</div>
	</div>
	</div>
	<div class="row">
	<div class="col-lg-12">
	<div class="src-bar" style="width:95%;margin:0 auto">
	<table class="am-table am-table-bordered am-table-striped am-table-hover"  style="text-align: center" >
	<tbody>
	<tr>
	<td>武器</td>
	<td>战役出动量（团架次）</td>
	<td>火力毁伤能力（千标弹）</td>
	</tr>
	<c:forEach items="${bhs}" var="b">
		<tr class="thtr3">
		<td>${b.mc}</td>
		<td>${b.cdl}</td>
		<td></td>
		</tr>
	</c:forEach>
	<tr id="hj3">
	<td>合计</td>
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
	</div>
	</div>
	<div class="col-lg-2" style="width:23%">
	<div class="row">
	<div class="col-lg-12">
	<div class=" border-polygon-lg height-2">
	<div class="am-box">
	<div class="am-box-title">
	<i class="fa fa-crosshairs"></i>
	<p>总能力与份额</p>
	</div>
	<div class="row">
	<div class="col-lg-12">
	<div id="circleDom5" style="width:100%; height: 370px; -webkit-tap-highlight-color: transparent; -webkit-user-select: none; cursor: default; background-color: rgba(0, 0, 0, 0);" _echarts_instance_="1472195255801"></div>
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




	<div class="dialog-2" id="tips-value-3" >
		<div class="dialog-content-2" style="width:464px; background-size: 470px 588px; margin-left:52%;">
			<div class="dialog-header">
				<div class="dialog-header-left">
					<i class="fa fa-fire c_7af5ff"></i><span>我方兵力选择</span>
				</div>
			</div>

			<div class="am-box-content " style="height:370px;">
				<div class="src-bar o-x p-l-20" style="height:370px;">
					<div class="tree smart-form  ">
						<ul>
							<li>
								<span class="fl"><i class="fa fa-lg fa-minus-circle "></i> ${zzjt.mc } </span>
								<label class="checkbox inline-block fl fl-r">
									<input type="checkbox" name="checkbox-inline">
									<i ></i>
								</label><i class="fa fa-lg fa-sitemap edit-i fl"></i>
								<div class="clearfix"></div>
								<ul>
									<c:forEach items="${zzjt.wfbdcs }" var="w">
									<li>
										<span class="fl"><i class="fa fa-lg fa-minus-circle"></i> ${w.wmc }</span>
										<input type="hidden" value="${w.pbcd }"/>
										<div class="clearfix"></div>
									</li>
									</c:forEach>
								</ul>
							</li>
						</ul>
					</div>
				</div>

			<div class="dialog-footer " style="">
				<div class="dialog-btn pull-left button--moema" data-modal-close >
					确认
				</div>
				<div class="dialog-btn pull-right button--moema " data-modal-close>
					取消
				</div>
			</div>
		</div>
	</div>
	</div>
	<div class="dialog-2" id="tips-value-2" >
		<div class="dialog-content-2" style="width:464px; background-size: 470px 588px; margin-left:52%;">
			<div class="dialog-header">
				<div class="dialog-header-left">
					<i class="fa fa-fire c_7af5ff"></i><span>敌方兵力选择</span>
				</div>
			</div>

			<div class="am-box-content " style="height:370px;">
				<div class="src-bar o-x p-l-20" style="height:370px;">
					<div class="tree smart-form  ">
						<ul>
							<li>
								<span class="fl"><i class="fa fa-lg fa-minus-circle "></i> ${zzjt2.mc } </span>
								<label class="checkbox inline-block fl fl-r">
									<input type="checkbox" name="checkbox-inline">
									<i ></i>
								</label><i class="fa fa-lg fa-sitemap edit-i fl"></i>
								<div class="clearfix"></div>
								<ul>
									<c:forEach items="${zzjt2.dfbdcs }" var="d">
									<li>
										<span class="fl"><i class="fa fa-lg fa-minus-circle"></i> ${d.mc }</span>
										<input type="hidden" value="${d.pbcd }"/>
										<div class="clearfix"></div>
									</li>
									</c:forEach>
								</ul>
							</li>
						</ul>
					</div>
				</div>

				<div class="dialog-footer " style="">
					<div class="dialog-btn pull-left button--moema" data-modal-close>
						确认
					</div>
					<div class="dialog-btn pull-right button--moema " data-modal-close>
						取消
					</div>
				</div>
			</div>
		</div>
	</div>
		<div class="dialog-overlay-1"></div>
		<div class="dialog-overlay"></div>
		<script src="build/dist/echarts.js"></script>
		<script src="js/divscroll.js"></script>
		<script src="js/jquery-awesomodals.min.js"></script>
		<script src="js/bootstrap-slider.js"></script>
		<script src="js/ui-choose.js"></script>
		<script src="js/layout.js"></script>
		<script type="text/javascript" src="js/lj/url.js"></script>
		<script type="text/javascript" src="js/lj/pbzznl.js"></script>
		<script type="text/javascript">
			$(function(){
				/*
				 *我方兵力部分
				 */
				var wsl = new Array();
				var wpbcd = new Array();
				var whsxs = new Array();
				var wbh = new Array();
				<c:forEach var="t" items="${zzjt.wfbdcs}" varStatus="c">
					wsl['${c.index}'] = ${t.sl}; 
					wpbcd['${c.index}'] = ${t.pbcd};
					whsxs['${c.index}'] = ${t.hsxs};
					wbh['${c.index}'] = '${t.wbh}';
				</c:forEach>
				
				/*
				 *敌方兵力部分
				 */
				var dsl = new Array();
				var dpbcd = new Array();
				var dqlhs = new Array();
				var dbcbl = new Array();
				var dkhhs = new Array();
				var djqxs = new Array();
				var dzjhs = new Array();
				<c:forEach var="t" items="${zzjt2.dfbdcs}" varStatus="c">
					dsl['${c.index}'] = ${t.sl}; 
					dpbcd['${c.index}'] = ${t.pbcd};
					dqlhs['${c.index}'] = ${t.qlhs};
					dbcbl['${c.index}'] = ${t.bcbl};
					dkhhs['${c.index}'] = ${t.khhs};
					djqxs['${c.index}'] = ${t.jqxs};
					dzjhs['${c.index}'] = ${t.zjhs};
				</c:forEach>
				
				/*
				 *炮兵压制火力毁伤能力
				 */
				var pdyhs = new Array();
				var pdysl = new Array();
				var ppbcd = new Array();
				<c:forEach items="${zhs}" var="z" varStatus="c">
					pdyhs['${c.index}'] = ${z.dyhs}; 
					pdysl['${c.index}'] = ${z.dysl}; 
					ppbcd['${c.index}'] = ${z.pbcd}; 
				</c:forEach>
				
				var hdysl = new Array();
				var hdyhs = new Array();
				<c:forEach items="${jhs}" var="j" varStatus="c">
					hdysl['${c.index}'] = ${j.dysl}; 
					hdyhs['${c.index}'] = ${j.dyhs}; 
				</c:forEach>
				
				var hktjc = new Array();
				var hkcdl = new Array();
				<c:forEach items="${bhs}" var="b" varStatus="c">
					hktjc['${c.index}'] = ${b.tjc}; 
					hkcdl['${c.index}'] = ${b.cdl}; 
				</c:forEach>
				
				zzjt.detail.init({
					wfbl : {
						wsl : wsl,
						wpbcd : wpbcd,
						whsxs : whsxs,
						wbh : wbh
					},
					dfbl : {
						dsl : dsl,
						dpbcd : dpbcd,
						dqlhs : dqlhs,
						dbcbl : dbcbl,
						dkhhs : dkhhs,
						djqxs : djqxs,
						dzjhs : dzjhs
					},
					pbnl : {
						pdyhs : pdyhs,
						pdysl : pdysl,
						ppbcd : ppbcd
					},
					hjjnl : {
						hdysl : hdysl,
						hdyhs : hdyhs
					},
					hkbnl : {
						hktjc : hktjc,
						hkcdl : hkcdl
					}
				});
			});
		</script>
	</body>
</html>
