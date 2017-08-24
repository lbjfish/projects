var bbfa = {
	//URL地址部分
	URL : {
		
	},
	/*
	 * 求下拉列表值
	 */
	getAjax : function(fanm){
		var defer = $.Deferred();
		$.ajax({
			url : "pfgh_ty_bbfaAction!*findSelect?fanm="+fanm,
			async : false,
			success : function(data){
				defer.resolve(data);
			}
		})
		return defer.promise();
	},
	/*
	 * 保卫目标值
	 */
	getAjax2 : function(xdms){
		var defer = $.Deferred();
		$.ajax({
			url : "pfgh_ty_bbfaAction!*findBwmb?xdms="+xdms,
			async : false,
			success : function(data){
				defer.resolve(data);
			}
		})
		return defer.promise();
	},
	/*
	 * 部队部署值
	 */
	getAjax3 : function(fanm){
		var defer = $.Deferred();
		$.ajax({
			url : "pfgh_ty_bbfaAction!*findBdbs?fanm="+fanm,
			async : false,
			success : function(data){
				defer.resolve(data);
			}
		})
		return defer.promise();
	},
	/*
	 * 雷达配属值
	 */
	getAjax4 : function(fanm){
		var defer = $.Deferred();
		$.ajax({
			url : "pfgh_ty_bbfaAction!*findLdps?fanm="+fanm,
			async : false,
			success : function(data){
				defer.resolve(data);
			}
		})
		return defer.promise();
	},
	/*
	 * 部队配属值2
	 */
	getAjax5 : function(bzsjbdnm,fanm){
		var defer = $.Deferred();
		$.ajax({
			url : "pfgh_ty_bbfaAction!*findBdbs2",
			data : {'bzsjbdnm':bzsjbdnm,'fanm':fanm},
			async : false,
			success : function(data){
				defer.resolve(data);
			}
		})
		return defer.promise();
	},
	detail : {
		init : function(param) {
			/*
			 * 方案选择行动
			 */
			$(".dropdown-menu").find("li").on("click",function(){
				
				var fanm = $(this).find("input[type=hidden]").val();
				$.when(bbfa.getAjax(fanm)).done(function(data){
					$("#xdlb").empty();
					if(data != ""){
						for(var i=0;i<data.length;i++){
							var xd = '<li class="parent_li" role="treeitem">'+
	                     	'<span class="fl zi"><i class="fa fa-lg fa-minus-circle"></i>'+data[i].xdmc+'</span>'+
	                     	'<input type="hidden" value="'+data[i].xdms+'"/>'+
	                     	'<div class="clearfix"></div>'+
	                     	'</li>';
							var xdlb = $("#xdlb").append(xd);
						}
					}
				});
				
				$(".zi").on("click",function(){
					$(".bt1").remove();
					$(".bt2").remove();
					$(".bt3").remove();
					/*
					 * 保卫目标
					 */
					var xdms = $(this).parent().find("input[type=hidden]").val();
					$.when(bbfa.getAjax2(xdms)).done(function(data){
						if(data != null){
							for(var i=0;i<data.length;i++){
								var bwmb = '<tr class="bt1">'+
									'<td>'+(i+1)+'</td>'+	
	                                '<td>'+data[i].mc+'</td>'+
	                                '<td>'+data[i].xz+'</td>'+
	                                '<td>'+data[i].zxjd+'</td>'+
	                                '<td>'+data[i].zxwd+'</td>'+
	                                '</tr>';
								$("#tab1").append(bwmb);
							}
						}else{
							alert("保卫目标数据为空！！！");
						}
					});
					
					/*
					 * 部队部署
					 */
					$.when(bbfa.getAjax3(fanm)).done(function(data){
						if(data != null){
							for(var i=0;i<data.length;i++){
								var bdbs = '<tr class="bt2">'+
									'<td>'+(i+1)+'</td>'+	
	                                '<td data-modal="#tips-value-3"  data-modal-init>'+data[i].BDMC+'</td>'+
	                                '<td>'+data[i].BDJB+'</td>'+
	                                '<td>'+data[i].JD+'</td>'+
	                                '<td>'+data[i].WD+'</td>'+
	                                '<input type="hidden" class="bdps" value="'+data[i].BDNM+'"/>'
	                                '</tr>';
								$("#tab2").append(bdbs);
							}
						}else{
							alert("部队配属数据为空！！！");
						}
					});
					
					/*
					 * 雷达配属
					 */
					$.when(bbfa.getAjax4(fanm)).done(function(data){
						if(data != null){
							var ldps = '<tr class="bt3">'+
								'<td>'+1+'</td>'+	
                                '<td>'+data.mc+'</td>'+
                                '<td>'+data.lx+'</td>'+
                                '<td>'+data.jd+'</td>'+
                                '<td>'+data.wd+'</td>'+
                                '</tr>';
							$("#tab3").append(ldps);
						}else{
							alert("雷达配属数据为空！！！");
						}
					});
					
					$(".bt2").on("click",function(){
						$(".bt4").remove();
						var bzsjbdnm = $(this).find("input[type=hidden]").val();
						/*
						 *  部队配属2
						 */
						$.when(bbfa.getAjax5(bzsjbdnm,fanm)).done(function(data){
							if(data != null){
								for(var i=0;i<data.length;i++){
									var bdbs2 = '<tr class="bt4">'+
									'<td>'+(i+1)+'</td>'+	
	                                '<td>'+data[i].bdjdbc.bdjc+'</td>'+
	                                '<td>'+data[i].zblx+'</td>'+
	                                '<td>'+data[i].zzbs.jd+'</td>'+
	                                '<td>'+data[i].zzbs.wd+'</td>'+
	                                '</tr>';
									$("#tab4").append(bdbs2);
								}
							}else{
								alert("雷达配属数据为空！！！");
							}
						});
					});
				});
			});
			
		}
	}
}