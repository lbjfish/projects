var zzjt = {
	//URL地址部分
	URL : {
		restURL : restURL
	},
	//图表组件
	circleDom : {
		circleDom3 : function() {
			require.config({
				paths : {
					echarts : 'build/dist'
				}
			});
			// 使用
			require([ 'echarts', 'echarts/chart/bar' // 使用柱状图就加载bar模块，按需加载在resource中
			], function(ec) {
				// 基于准备好的dom，初始化echarts图表
				var myChart = ec.init(document.getElementById('circleDom3'));

				option = {
					tooltip : {
						show : false,
						trigger : 'axis',
						axisPointer : { // 坐标轴指示器，坐标轴触发有效
							type : 'shadow' // 默认为直线，可选为：'line' |
						// 'shadow'
						}
					},
					legend : {
						data : [ '一级', '二级', '三级' ],
						textStyle : {
							color : '#eee',
							fontSize : '17',
							fontFamily : '黑体',
						}
					},
					toolbox : {
						show : false,
						feature : {
							mark : {
								show : true
							},
							dataView : {
								show : true,
								readOnly : false
							},
							magicType : {
								show : true,
								type : [ 'line', 'bar', 'stack', 'tiled' ]
							},
							restore : {
								show : true
							},
							saveAsImage : {
								show : true
							}
						}
					},
					calculable : true,
					xAxis : [ {
						type : 'value',
						axisLabel : {
							textStyle : {
								color : '#eee',
								fontSize : '17',
								fontFamily : '黑体',
							}
						}
					} ],
					yAxis : [ {
						type : 'category',
						data : [ '炮兵', '陆航', '火箭军', '空军', '海军' ],
						axisLabel : {
							show : true,
							textStyle : {
								color : '#eee',
								fontSize : '15',
								fontFamily : '黑体',
							}
						}
					} ],
					series : [ {
						name : '一级',
						type : 'bar',
						stack : '总量',
						itemStyle : {
							normal : {
								label : {
									show : true,
									position : 'insideRight'
								}
							}
						},
						data : [ 5, 4, 20, 20, 1 ]
					}, {
						name : '二级',
						type : 'bar',
						stack : '总量',
						itemStyle : {
							normal : {
								label : {
									show : true,
									position : 'insideRight'
								}
							}
						},
						data : [ 40, 10, 10, 0, 1 ]
					}, {
						name : '三级',
						type : 'bar',
						stack : '总量',
						itemStyle : {
							normal : {
								label : {
									show : true,
									position : 'insideRight'
								}
							}
						},
						data : [ 50, 20, 0, 0, 1 ]
					} ]
				};

				// 为echarts对象加载数据
				myChart.setOption(option);
			});
		},
		circleDom4 : function() {
			require.config({
				paths : {
					echarts : 'build/dist'
				}
			});
			// 使用
			require([ 'echarts', 'echarts/chart/pie' // 使用柱状图就加载bar模块，按需加载在resource中
			], function(ec) {
				// 基于准备好的dom，初始化echarts图表
				var myChart = ec.init(document.getElementById('circleDom4'));

				option = {
					title : {
						show : false,
						text : '某站点用户访问来源',
						subtext : '纯属虚构',
						x : 'center'
					},
					tooltip : {
						trigger : 'item',
						formatter : "{a} <br/>{b} : {c} ({d}%)"
					},
					legend : {
						orient : 'horizontal',
						x : 'left',
						y : '5%',
						data : [ '海军', '空军', '火箭军', '陆航', '炮兵' ],
						textStyle : {
							color : '#eee',
							fontSize : '17',
							fontFamily : '黑体',
						}
					},
					toolbox : {
						show : false,
						feature : {
							mark : {
								show : true
							},
							dataView : {
								show : true,
								readOnly : false
							},
							magicType : {
								show : true,
								type : [ 'pie', 'funnel' ],
								option : {
									funnel : {
										x : '25%',
										width : '50%',
										funnelAlign : 'left',
										max : 1548
									}
								}
							},
							restore : {
								show : true
							},
							saveAsImage : {
								show : true
							}
						}
					},
					calculable : true,
					series : [ {
						name : '访问来源',
						type : 'pie',
						radius : '55%',
						center : [ '50%', '55%' ],
						data : [ {
							value : 3,
							name : '海军',
							itemStyle : {
								normal : {
									barBorderColor : '#0C2AF4',
									color : '#0C2AF4'
								}
							},
						}, {
							value : 20,
							name : '空军',
							itemStyle : {
								normal : {
									barBorderColor : '#90C1E4',
									color : '#90C1E4'
								}
							},
						}, {
							value : 30,
							name : '火箭军',
							itemStyle : {
								normal : {
									barBorderColor : '#7B6306',
									color : '#7B6306'
								}
							},
						}, {
							value : 34,
							name : '陆航',
							itemStyle : {
								normal : {
									barBorderColor : '#045208',
									color : '#045208'
								}
							},
						}, {
							value : 95,
							name : '炮兵',
							itemStyle : {
								normal : {
									barBorderColor : '#2DF00E',
									color : '#2DF00E'
								}
							},
						} ]
					} ]
				};

				// 为echarts对象加载数据
				myChart.setOption(option);
			});
		},
		circleDom5 : function(pb,hjj,fkb) {
			require.config({
				paths : {
					echarts : 'build/dist'
				}
			});
			// 使用
			require([ 'echarts', 'echarts/chart/pie' // 使用柱状图就加载bar模块，按需加载在resource中
			], function(ec) {
				// 基于准备好的dom，初始化echarts图表
				var myChart = ec.init(document.getElementById('circleDom5'));

				option = {
					title : {
						show : false,
						text : '某站点用户访问来源',
						subtext : '纯属虚构',
						x : 'center'
					},
					tooltip : {
						trigger : 'item',
						formatter : "{a} <br/>{b} : {c} ({d}%)"
					},
					legend : {
						orient : 'horizontal',
						x : 'left',
						y : '5%',
						data : [ '炮兵', '火箭军', '航空兵' ],
						textStyle : {
							color : '#eee',
							fontSize : '17',
							fontFamily : '黑体',
						}
					},
					
					calculable : true,
					series : [ {
						name : '访问来源',
						type : 'pie',
						radius : '55%',
						center : [ '50%', '55%' ],
						data : [ {
							value : pb,
							name : '炮兵'
						}, {
							value : hjj,
							name : '火箭军'
						}, {
							value : fkb,
							name : '航空兵'
						} ]
					} ]
				};

				// 为echarts对象加载数据
				myChart.setOption(option);
			});
		},
		circleDom6 : function(p1,p2) {
			require.config({
				paths : {
					echarts : 'build/dist'
				}
			});
			// 使用
			require([ 'echarts', 'echarts/chart/pie' // 使用柱状图就加载bar模块，按需加载在resource中
			], function(ec) {
				// 基于准备好的dom，初始化echarts图表
				var myChart = ec.init(document.getElementById('circleDom6'));

				option = {

					tooltip : {
						trigger : 'item',
						formatter : '{a}</br>{b}:({c}%)'
					},
					legend : {
						data : [ '我方战斗潜力', '敌方战斗潜力' ],
						textStyle : {
							color : '#eee',
							fontSize : '15',
							fontFamily : '黑体',
						}
					},
					calculable : true,
					xAxis : [ {
						type : 'category',
						data : [ '军兵种份额占比' ],
						axisLabel : {
							textStyle : {
								color : '#eee',
								fontSize : '15',
								fontFamily : '黑体',
							}
						}
					} ],
					yAxis : [ {
						type : 'value',
						axisLabel : {
							textStyle : {
								color : 'white'
							}
						}
					} ],
					series : [ {
						name : '我方战斗潜力',
						type : 'bar',
						barGap : '60%',
						itemStyle : {
							normal : {
								barBorderColor : '#2DF00E',
								color : '#2DF00E'
							}
						},
						data : [ p1 ]
					}, {
						name : '敌方战斗潜力',
						type : 'bar',
						itemStyle : {
							normal : {
								barBorderColor : '#0C2AF4',
								color : '#0C2AF4'
							}
						},
						data : [ p2 ]
					} ]
				};
				// 为echarts对象加载数据
				myChart.setOption(option);
			});
		}
	},
	/*
	 * 各个输入框
	 */
	srkBoolean : {
		//我方损失率
		sslMethod : function(){
			var wfssl = Number($(".effect-9:eq(0)").val());
			if(wfssl>0 && wfssl <1){
				return true;
			}else{
				return false;
			}
		}
	},
	/*
	 * 我方战斗潜力（为了求压制火炮标准数的部分参数的ajax）
	 */
	getAjax : function(bdbh){
		var defer = $.Deferred();
		$.ajax({
			url : "pb_zzjtAction!*findByBh?bdbh="+bdbh,
			async : false,
			success : function(data){
				defer.resolve(data);
			}
		})
		return defer.promise();
	},
	/*
	 * 我方战斗潜力（为了求反坦克兵器数量的部分参数的ajax）
	 */
	getAjax2 : function(bdbh){
		var defer2 = $.Deferred();
		$.ajax({
			url : "pb_zzjtAction!*findByBh2?bdbh="+bdbh,
			async : false,
			success : function(data2){
				defer2.resolve(data2);
			}
		})
		return defer2.promise();
	},
	/*
	 * 计算所需毁伤程度
	 */
	getAjax3 : function(p,q){
		var defer3 = $.Deferred();
		$.ajax({
			url : zzjt.URL.restURL+"/zdqlxqb/zdql/zdql/"+p+"/"+q,
			async : false,
			success : function(data3){
				defer3.resolve(data3);
			}
		})
		return defer3.promise();
	},
	/*
	 * 页面加载后实例化的一些操作
	 */
	detail : {
		init : function(param) {
			
			$(".thtr").hide();
			$(".thtr2").hide();
			$(".thtr3").hide();
			
			/*
			 * 初始化图表部分
			 */
			zzjt.circleDom.circleDom3();
			zzjt.circleDom.circleDom4();
			
			/*
			 * 下拉列表问题
			 */
			$('#ascrail2001').show();
			$('#ascrail2005').hide();
			
			/*
			 * 前端人员部分
			 */
			$('.tree > ul').attr('role', 'tree').find('ul').attr('role', 'group');
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
			
			/*
			 * 我自己部分
			 */
			var ftd = function(tt){
				var td = '<td>'+
						 	'<div class="dropdown">'+
									'<div class="dropdown-toggle" data-toggle="dropdown">'+tt+
								'</div>'+
								'</div>'+
						 '</td>';
				return td;
			};
			//我方兵力选择
			$(".dialog-btn:eq(0)").on("click",function(){
				if($("div ul li input[type=checkbox]:eq(0)").is(":checked")){
					$("tbody:eq(0)").find("tr:not(:first,:last)").empty();
					$(".tree:eq(0)").find("ul:eq(1)").find("li").each(function(i,v){
						var spantext = $(v).find("span").text();
						var inputval = $(v).find("input[type=hidden]").val();
						$("#wfdr").after('<tr id="tr'+i+'">'+ftd(spantext)+ftd(inputval)+ftd("")+ftd("")+ftd("")+ftd("")+'</tr>');
				    	// $(".wfdr").after($(".wfdr").next().clone());
					});
					$('.srcla-bar').perfectScrollbar();
				}else{
					$("tbody:eq(0)").find("tr:not(:first,:last)").empty();
					$('.srcla-bar').perfectScrollbar();
				}
			});
			
			//我方能力计算
			$("#wnljs").on("click",function(){
				if(zzjt.srkBoolean.sslMethod()){
					//我方允许损失率
					var b = Number($(".effect-9:eq(0)").val());
					var len = $("#wfdr").siblings("tr").length-1;
					
					//战斗潜力合计
					var zdqlCount = 0;
					//压制火炮标准数合计
					var y21 = 0;
					//压制弹药基数
					var y31 = 0;
					//反坦克兵器数量
					var y41 = 0;
					
					for(var i=0;i<len;i++){
						/*
						 * 战斗潜力
						 * 用到表 ： PFGH_PB_WFBDCS
						 * 公式: y = a*(1-b)*c;
						 * a = sl*pbcd;
						 * b = 我方允许损失率
						 * c = hsxs
						 */
						var a = param.wfbl.wsl[i] * param.wfbl.wpbcd[i];
						var c = param.wfbl.whsxs[i];
						var y1 = a*(1-b)*c;
						var y11 = y1.toFixed(3);
						$("#tr"+i).find("td").eq(2).html(y11);
						zdqlCount = zdqlCount + Number(y11);
						zdqlCount1 = zdqlCount.toFixed(3);
						
						var y2 = 0;
						var y3 = 0;
						var y4 = 0;
						var bdbh = param.wfbl.wbh[i];
						$.when(zzjt.getAjax(bdbh),zzjt.getAjax2(bdbh)).done(function(data,data2){
							for(var j=0;j<data.length;j++){
								/*
								 * 压制火炮标准数
								 * 用到表 ： PFGH_PB_WFBDCS,PFGH_PB_WFWQPZ
								 * 公式： y = a*b 
								 * a = c*(1-q)
								 * c = PFGH_PB_WFWQPZ 里的 WQSL
								 * q = 我方允许损失率
								 * b = PFGH_PB_WFWQPZ 里的 WQHS
								 */
								var c2 = data[j].WQSL;
								var q = b;
								var a2 = Math.floor(c2*(1-q));
								var b2 = data[j].WQHS;
								y2 = y2 + a2 * b2;
								//----------------------分界线-------------------------
								/*
								 * 压制弹药基数
								 * 用到表 ： PFGH_PB_WFBDCS,PFGH_PB_WFWQPZ
								 * 公式： y = a*b*c 
								 * a = d*(1-q)
								 * d = PFGH_PB_WFWQPZ 里的 WQSL
								 * q = 我方允许损失率
								 * b = PFGH_PB_WFWQPZ 里的 DYJS
								 * c = PFGH_PB_WFWQPZ 里的 DYHS
								 */
								var d = data[j].WQSL;
								var q3 = b;
								var a3 = Math.floor(d*(1-q3));
								var b3 =  data[j].DYJS;
								var c3 = data[j].DYHS;
								y3 = y3 + a3 * b3 * c3;
							}
							//----------------------分界线-------------------------
							/*
							 * 反坦克兵器数
							 * 用到表 ： PFGH_PB_WFBDCS,PFGH_PB_FTKCS
							 * 公式： y = bi*(1-q) (向下取整)
							 * b = PFGH_PB_FTKCS 里的 WQSL
							 * q = 我方允许损失率
							 */
							for(var k=0;k<data2.length;k++){
								var bi = data2[k];
								var q4 = b;
								y4 = y4 + bi * (1-q4);
							}
							
							//压制火炮标准数
							$("#tr"+i).find("td").eq(3).html(y2.toFixed(3));
							//压制弹药基数
							$("#tr"+i).find("td").eq(4).html(y3.toFixed(3)/1000);
							//反坦克兵器数量
							$("#tr"+i).find("td").eq(5).html(Math.floor(y4));
							//压制火炮标准数合计
							y21 = y21 + y2;
							//压制弹药基数合计
							y31 = y31 + y3;
							//反坦克兵器数量合计
							y41 = y41 + y4;
						});
					}
					//战斗潜力合计
					$("tbody").eq(0).find("tr").last().find("td").eq(2).html(zdqlCount1);
					//压制火炮标准数合计
					$("tbody").eq(0).find("tr").last().find("td").eq(3).html(y21.toFixed(3));
					//压制弹药基数合计
					$("tbody").eq(0).find("tr").last().find("td").eq(4).html(y31.toFixed(3)/1000);
					//反坦克兵器数量合计
					$("tbody").eq(0).find("tr").last().find("td").eq(5).html(Math.floor(y41));
				}else{
					alert("请填写标准的允许损失率（0-1）！");
				}
				
				
				
			});
			
			
			//敌方兵力选择
			$(".dialog-btn:eq(2)").on("click",function(){
				if($("div ul li input[type=checkbox]:eq(1)").is(":checked")){
					$("tbody:eq(1)").find("tr:not(:first,:last)").empty();
					$(".tree:eq(1)").find("ul:eq(1)").find("li").each(function(i,v){
						var spantext = $(v).find("span").text();
						var inputval = $(v).find("input[type=hidden]").val();
						$("#dfdr").after('<tr id="tr2'+i+'">'+ftd(spantext)+ftd(inputval)+ftd("")+ftd("")+ftd("")+'</tr>');  
				    	// $(".wfdr").after($(".wfdr").next().clone());
					});
					$('.srcla-bar2').perfectScrollbar();
				}else{
					$("tbody:eq(1)").find("tr:not(:first,:last)").empty();
					$('.srcla-bar2').perfectScrollbar();
				}
		   });
			//敌方能力计算
			$("#dnljs").on("click",function(){
				var len = $("#dfdr").siblings("tr").length-1;
				var dzdql = 0;
				var dkhnl = 0;
				var dzjll = 0;
				for(var i=0;i<len;i++){
					var dai = param.dfbl.dsl[i];
					var dbi = param.dfbl.dpbcd[i];
					var dci = param.dfbl.dqlhs[i];
					var y1 = dai*dbi*dci;
					var y11 = y1.toFixed(3);
					dzdql = dzdql + Number(y11);
					$("#tr2"+i).find("td").eq(2).html(y11);
					
					var dai2 = param.dfbl.dbcbl[i];
					var dbi2 = param.dfbl.dkhhs[i];
					var dci2 = dbi;
					var ddi2 = param.dfbl.djqxs[i];
					var y2 = dai2*dbi2*dci2*ddi2;
					var y21 = y2.toFixed(3)
					dkhnl = dkhnl + Number(y21);
					$("#tr2"+i).find("td").eq(3).html(y21);
					
					var dai3 = param.dfbl.dbcbl[i];
					var dbi3 = param.dfbl.dzjhs[i];
					var dci3 = param.dfbl.dpbcd[i];
					var y3 = dai3*dbi3*dci3;
					var y31 = y3.toFixed(3);
					dzjll = dzjll + Number(y31);
					$("#tr2"+i).find("td").eq(4).html(y31);
				}
				if(dzdql !=0 && dkhnl !=0 && dzjll !=0){
					$("tbody").eq(1).find("tr").last().find("td").eq(2).html(dzdql.toFixed(3));
					$("tbody").eq(1).find("tr").last().find("td").eq(3).html(dkhnl.toFixed(3));
					$("tbody").eq(1).find("tr").last().find("td").eq(4).html(dzjll.toFixed(3));
				}
				
				var wf = zdqlCount1;
				var df = dzdql;
				zzjt.circleDom.circleDom6(wf*100,df.toFixed(2)*100);
				x_lee = wf/df;
				$("#csb").val(x_lee.toFixed(2));
			});
			
			//计算所需毁伤程度
			$("#jshscd").on("click",function(){
				if(zzjt.srkBoolean.sslMethod() && Number($("#dyb").val())>=0 && Number($("#dyb").val())<=0.5){
					var p = Number($("#dyb").val())*100;
					var q = Number($(".effect-9:eq(0)").val())*100;
					$.when(zzjt.getAjax3(p,q)).done(function(data3){
						y_lee = Number(data3);
					});
					var z_lee = 1-x_lee/y_lee;
					$("#jshscd2").val(z_lee.toFixed(2)*100+"%");
				}else{
					alert("我方允许损失率或者敌隐蔽程度设置不合理！");
				}
			});
			
			//炮兵压制火力毁伤能力
			$("#pbdr").on("click",function(){
				$(".thtr").show();
			});
			//炮兵压制火力毁伤能力计算
			$("#pbjs").on("click",function(){
				if($("#zycb1").val() >= 0 && $("#zycb1").val() < 1){
					var len = $(".thtr").length;
					var y1 = 0;
					for(var i=0;i<len;i++){
						var pbi = param.pbnl.pdyhs[i];
						var pci = param.pbnl.pdysl[i];
						var pdi = param.pbnl.ppbcd[i];
						var y = pbi*Math.floor(pci*pdi*(1-$("#zycb1").val()));
						y1 = y1 + y;
						$(".thtr").eq(i).find("td").eq(3).html(y.toFixed(2));
					}
					$("#hj1").find("td").eq(3).html(y1.toFixed(3));
				}else{
					alert("请输入0-1之间的数（可以为0）！");
				}
			});
			
			//火箭军火力毁伤能力
			$("#hjjdr").on("click",function(){
				$(".thtr2").show();
			});
			//火箭军火力毁伤能力计算
			$("#hjjjs").on("click",function(){
				if($("#zycb2").val() >= 0 && $("#zycb2").val() < 1){
					var len = $(".thtr2").length;
					var y1 = 0;
					var hdi = 1;
					for(var i=0;i<len;i++){
						var hbi = param.hjjnl.hdyhs[i];
						var hci = param.hjjnl.hdysl[i];
						var y = hbi*Math.floor(hci*hdi*(1-$("#zycb2").val()));
						y1 = y1 + y;
						$(".thtr2").eq(i).find("td").eq(2).html(y.toFixed(2));
					}
					$("#hj2").find("td").eq(2).html(y1.toFixed(3));
				}else{
					alert("请输入0-1之间的数（可以为0）！");
				}
			});
			
			//航空兵火力毁伤能力
			$("#fkbdr").on("click",function(){
				$(".thtr3").show();
			});
			//航空兵火力毁伤能力计算
			$("#fkbjs").on("click",function(){
				if($("#zycb3").val() >= 0 && $("#zycb3").val() < 1){
					if($("#hkpbcd").val() >= 0 && $("#hkpbcd").val() < 1){
						var len = $(".thtr3").length;
						var y1 = 0;
						var hkci = $("#hkpbcd").val();
						for(var i=0;i<len;i++){
							var hkbi = param.hkbnl.hktjc[i];
							var hkdi = param.hkbnl.hkcdl[i];
							var y = hkbi*hkci*Math.floor(hkdi*(1-$("#zycb3").val()));
							y1 = y1 + y;
							$(".thtr3").eq(i).find("td").eq(2).html(y.toFixed(2));
						}
						$("#hj3").find("td").eq(2).html(y1.toFixed(2));
						var pbz = $("#hj1").find("td").eq(3).html();
						var hjjz = $("#hj2").find("td").eq(2).html();
						var fkbz = $("#hj3").find("td").eq(2).html();
						zzjt.circleDom.circleDom5(pbz,hjjz,fkbz);
					}else{
						alert("配备程度请输入0-1之间的数（可以为0）！");
					}
				}else{
					alert("战役储备百分比请输入0-1之间的数（可以为0）！");
				}
			});
		}
	}
};