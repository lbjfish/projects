<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>防空行动方案</title>
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
        div {
            overflow: visible;
        }
    </style>
</head>
<body>
<div class="am-header">
    <div class="am-logo">
        <a href="集成首页.html">
            <img src="images/blue/logo.png" width="70px" height="70px" border="0" class="fa fa-spin ">
            <p>防空行动方案</p>
        </a>
    </div>
    <div class="am-top-nav">
        <ul>
            <li class="active button--moema"><a>防空行动方案</a></li>
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
        <div class="col-lg-3">
            <table class="am-table am-table-bordered am-table-striped" style="text-align: center;width:97%">
                <tr>
                    <td width="100%" style="position: relative">
                        <span style="position: absolute;left:10px;top:-10px;background: #162536;font-size:14px;;">方案选择</span>
                        <div class="dropdown">
                            <div class="dropdown-toggle" style="padding:0;width:100%;;" data-toggle="dropdown"> <span></span> <b class="caret"></b> </div>
                            <div class="dropdown-menu" style="left:30%;">
                            	<c:forEach items="${famcs}" var="f">
	                                <li>
	                                    <a style="padding-left:0;">${f.famc}</a>
	                                    <input type="hidden" value="${f.fanm}" />
	                                </li>
                                </c:forEach>
                            </div>
                        </div>
                    </td>
                </tr>
            </table>
            <br/>
            <div class="border-polygon-450-700 height-3 pull-left" style="height:880px">
                <div class="am-box">
                    <div class="am-box-title">
                        <i class="fa   fa-sun-o"></i>

                        <p>防空行动</p>
                    </div>
                </div>
                <div class="am-box-content">
                    <div class=" o-x p-l-20">
                        <div class="tree smart-form  src-bar" style="color: #ffffff!important;height:830px;">
                            <div class="am-box-content ">
                                <div class=" o-x p-l-20">
                                    <div class="tree smart-form  ">
                                        <ul role="tree">
                                            <li class="parent_li" role="treeitem">
                                                <span class="fl"><i class="fa fa-lg fa-minus-circle "></i>方案行动</span>
                                                <div class="clearfix"></div>
                                                <ul role="group" id="xdlb">
                                                
                                                </ul>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-lg-9" style="color:white!important;">
            <div class="border-polygon-1800-900 height-2" style="height:280px">
                <div class="am-box">
                    <div class="am-box-title">
                        <i class="fa  fa-sitemap"></i>
                        <p class="c_7af5ff">保卫目标</p>
                    </div>
                    <br/>
                    <div class="src-bar" style="height:206px!important;">
                        <table class="am-table am-table-bordered am-table-striped am-table-hover" style="text-align: center;width:100%;" id="tab1">
                            <tr>
                                <td>序号</td>
                                <td>名称</td>
                                <td>性质</td>
                                <td>中心经度</td>
                                <td>中心纬度</td>
                            </tr>
                            
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-lg-9" style="color:white">
            <div class="border-polygon-1800-900 height-2" style="height:280px">
                <div class="am-box">
                    <div class="am-box-title">
                        <i class="fa  fa-sitemap"></i>

                        <p class="c_7af5ff">部队配属</p>
                    </div>
                    <br/>
                    <div class="src-bar" style="height:206px!important;">
                        <table class="am-table am-table-bordered am-table-striped am-table-hover"
                               style="text-align: center" id="tab2">
                            <tr>
                                <td colspan="2">配属部队</td>
                                <td colspan="3">防空1群</td>
                            </tr>
                            <tr>
                                <td>序号</td>
                                <td>名称</td>
                                <td>部队级别</td>
                                <td>部署经度</td>
                                <td>部署纬度</td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-lg-9">
            <div class="border-polygon-1800-900 height-2" style="height:280px">
                <div class="am-box">
                    <div class="am-box-title">
                        <i class="fa  fa-sitemap"></i>

                        <p class="c_7af5ff">雷达配属</p>
                    </div>
                    <br/>
                    <div class="src-bar" style="height:206px;">
                        <table class="am-table am-table-bordered am-table-striped am-table-hover"
                               style="text-align: center" id="tab3">
                            <tr>
                                <td>序号</td>
                                <td>名称</td>
                                <td>雷达类型</td>
                                <td>部署经度</td>
                                <td>部署纬度</td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <div class="am-btn-lg pull-right m-t-20 m-l-10 button-moema"
             style="margin-top: -0px!important;margin-right:100px!important;">方案修改
        </div>
        <div class="am-btn-lg pull-right m-t-20 m-l-10 button-moema"
             style="margin-top: -0px!important;margin-right: 20px!important;">方案保存
        </div>
    </div>
</div>
<!---->
<!---->
<!--导弹连-->
<div class=" dialog-2" id="tips-value-3">
    <div class="dialog-content-2">
        <div class="dialog-header">
            <div class="dialog-header-left">
                <i class="fa fa-fire c_7af5ff"></i><span>HQ-17导弹连 </span>
            </div>
            <div class="pull-right">
                <div class="dialog-close button--moema" data-modal-close>
                </div>
            </div>
        </div>
        <div class="dialog-body">
            <div class="m-t-20 pull-left m-l-10 amCheckAllBox" style="width:100%;">
                <div class="src-bar" style="width:100%;max-height:288px;padding:0;margin:0;">
                    <table class="am-table am-table-bordered am-table-striped am-table-hover"
                           style="text-align: center" id="tab4">
                        <tr>
                            <td>序号</td>
                            <td>名称</td>
                            <td>装备类型</td>
                            <td>部署经度</td>
                            <td>部署纬度</td>
                        </tr>
                        
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
<!--end-->

<!--高炮35-->
<div class=" dialog-2" id="tips-value-4">
    <div class="dialog-content-2">
        <div class="dialog-header">
            <div class="dialog-header-left">
                <i class="fa fa-fire c_7af5ff"></i><span>牵引双35高炮营</span>
            </div>
            <div class="pull-right">
                <div class="dialog-close button--moema" data-modal-close>
                </div>
            </div>
        </div>
        <div class="dialog-body">
            <div class="m-t-20 pull-left m-l-10 amCheckAllBox" style="width:100%;">
                <div class="src-bar" style="width:100%;max-height:288px;padding:0;margin:0;">
                    <table class="am-table am-table-bordered am-table-striped am-table-hover"
                           style="text-align: center">
                        <tr>
                            <td>序号</td>
                            <td>名称</td>
                            <td>装备类型</td>
                            <td>部署经度</td>
                            <td>部署纬度</td>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>1连</td>
                            <td>双35牵引高炮</td>
                            <td>109.23120</td>
                            <td>39.78652</td>
                        </tr>
                        <tr>
                            <td>2</td>
                            <td>2连</td>
                            <td>双35牵引高炮</td>
                            <td>109.23120</td>
                            <td>39.78652</td>
                        </tr>
                        <tr>
                            <td>3</td>
                            <td>3连</td>
                            <td>双35牵引高炮</td>
                            <td>109.23120</td>
                            <td>39.78652</td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
<!--end-->
<script src="build/dist/echarts.js"></script>
<script src="js/divscroll.js"></script>
<script src="js/jquery-awesomodals.min.js"></script>
<script src="js/bootstrap-slider.js"></script>
<script src="js/ui-choose.js"></script>
<script src="js/layout.js"></script>
<script>
    $(function(){
        $("#ascrail2001").css("display","block")
        $("#ascrail2002").css("display","block")
        $("#ascrail2003").css("display","block")
        $("#ascrail2004").css("display","block")
    })
    $('.tree > ul').attr('role', 'tree').find('ul').attr('role', 'group');
    $('.tree').find('li:has(ul)').addClass('parent_li').attr('role', 'treeitem').find(' > span').on('click', function (e) {
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
    $(function () {
        $('#ascrail2001').show();
        $('#ascrail2005').css('z-index', 1000010);
    });
</script>

<script src="js/lj/fkxdfa.js"></script>
<script type="text/javascript">
	$(function(){
		bbfa.detail.init({
			
		});
	});
</script>
</body>
</html>