/*-- 时间 月 日 时 start --*/
	function AmShowTime(){
		var amTime = new Date();
		var amTimeMonth = amTime.getMonth()+1;
		var amTimeDate = amTime.getDate();
		var amTimeHours = amTime.getHours();
		var amTimeMinutes = amTime.getMinutes();
		var amTimeSeconds = amTime.getSeconds();
		amTimeHours = addZero(amTimeHours);
		amTimeMinutes = addZero(amTimeMinutes);
		amTimeSeconds = addZero(amTimeSeconds);
		$('#amtopTime').html('');
		$('#amtopTime').html(amTimeMonth+"月"+amTimeDate+"日  "+amTimeHours+":"+amTimeMinutes+":"+amTimeSeconds);
	}
	function AmShowTime2(){
		var amTime = new Date();
		var amTimeYear = amTime.getYear()+1909; //...
		var amTimeMonth = amTime.getMonth()+1;
		var amTimeDate = amTime.getDate();
		var amTimeHours = amTime.getHours();
		var amTimeMinutes = amTime.getMinutes();
		var amTimeSeconds = amTime.getSeconds();
		amTimeHours = addZero(amTimeHours);
		amTimeMinutes = addZero(amTimeMinutes);
		amTimeSeconds = addZero(amTimeSeconds);
		$('#amtopTime-add').html('');
		$('#amtopTime-add').html('作战时间：'+amTimeYear+'年'+amTimeMonth+"月"+amTimeDate+"日  "+amTimeHours+":"+amTimeMinutes+":"+amTimeSeconds);
	}
	function AmShowTime3(){
		var amTime = new Date();
		var amTimeYear = amTime.getYear()+1900; //...
		var amTimeMonth = amTime.getMonth()+1;
		var amTimeDate = amTime.getDate();
		var amTimeHours = amTime.getHours();
		var amTimeMinutes = amTime.getMinutes();
		var amTimeSeconds = amTime.getSeconds();
		amTimeHours = addZero(amTimeHours);
		amTimeMinutes = addZero(amTimeMinutes);
		amTimeSeconds = addZero(amTimeSeconds);
		$('#amtopTime-add2').html('');
		$('#amtopTime-add2').html('天文时间：'+amTimeYear+'年'+amTimeMonth+"月"+amTimeDate+"日  "+amTimeHours+":"+amTimeMinutes+":"+amTimeSeconds);
	}
	function addtime(){
		setInterval("AmShowTime()",1000);
	}
	function addtime2(){
		setInterval("AmShowTime2()",50);
	}
	function addtime3(){
		setInterval("AmShowTime3()",50);
	}
	function addZero(x){
		if(x<10){
			return "0"+ x;
		}else{
			return x;
		}
	}
/*-- 时间 月 日 时 end --*/
$(function(){

	addtime();  //显示时间
	addtime2();  //显示时间
	addtime3();  //显示时间

	$('.src-bar').perfectScrollbar();  //滚动条模拟插件

	$('body').awesomodals(); //模拟弹框插件

	$('.toptime-ico').on('click',function(){
		$(this).parents('.am-top-nav').find('ul').toggle();
	})  //顶部临时菜单

	$('.am-logo img').on('click',function(){
		$(this).toggleClass("fa-spin");
	}); //临时logo转圈

	$('#amCheckAll').on('click',function(){
		var allCheckbox = $(this).parents('.am-box-content').find('tbody input:checkbox');
		if(this.checked){
			allCheckbox.each(function(){
				this.checked=true;
			})
		}else{
			allCheckbox.each(function(){
				this.checked=false;
			})
		}
	});
	$('.amCheckAll').on('click',function(){
		var allCheckbox = $(this).parents('.amCheckAllBox').find('tbody input:checkbox');
		if(this.checked){
			allCheckbox.each(function(){
				this.checked=true;
			})
		}else{
			allCheckbox.each(function(){
				this.checked=false;
			})
		}
	})
	/*
	$('.dialog-2').find('tbody input:checkbox').on('click',function(){
		if(this.checked){
			$(this).parents('tr').addClass('am-table-hover-active');
		}else{
			$(this).parents('tr').removeClass('am-table-hover-active');
		}
	}); //左右移动选择内容*/
	$('.am-table-click').find('tbody tr').on('click',function(){
		$(this).addClass('am-table-hover-active');
		$(this).siblings('tr').removeClass('am-table-hover-active');
	});
	$('.table').find('tbody input:checkbox').on('click',function(){
		if(!this.checked){
			$('#amCheckAll').each(function(){
				this.checked=false;
			})
		}
	}); //全选，多选模拟 ，未完待续

	if ($("[rel=tooltip]").length) {
		$("[rel=tooltip]").tooltip();
	}   //模拟提示框

	$('.dropdown-menu a').on('click',function(){
		var Dtxt = $(this).text();
		$(this).parent('li').parent(".dropdown-menu").siblings('.dropdown-toggle').find('span').text(Dtxt);
	}); //下拉菜单  &&  赋值

	//滑块  start
	/*
	$('.slider').slider({onChange:function(value){
		var selector = $(this).attr("for");
		$(selector).val(value[0]);
	}});*/
	$('.slider').slider({onChange:function(value){
		var selector = $(this).parents('.showTips').find("input");
		$(selector).val(value[0]);
	}});
	$('.slider-num').slider({onChange:function(value){
		var selector = $(this).parents('.showTips').find(".progress-bar");
		$(selector).css('width',value[0]*10+'%');
		$(selector).text(value[0]);
		if( value[0] <=2){
			$(selector).attr('class','');
			$(selector).addClass('progress-bar').addClass('bg-color-blue');
		}else if( value[0] >=3 && value[0] <=4){
			$(selector).attr('class','');
			$(selector).addClass('progress-bar').addClass('bg-color-green');
		}else if( value[0] >=5 && value[0] <=6){
			$(selector).attr('class','');
			$(selector).addClass('progress-bar').addClass('bg-color-orange');
		}else if( value[0] >=7 && value[0] <=8){
			$(selector).attr('class','');
			$(selector).addClass('progress-bar').addClass('bg-color-redLight');
		}
		else if( value[0] >=9){
			$(selector).attr('class','');
			$(selector).addClass('progress-bar').addClass('bg-color-red');
		}
	}});
	$('.slider-min').slider({onChange:function(value){
		var selector = $(this).attr("for");
		$(selector).val(value[0]);
		$(".js-min-num").each(function(){
			var num = $(this).val()*0.1;
			$(this).val(Math.round(num*100)/100);
		})
	}});
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
	$('.slider-num-3').slider({onChange:function(value){
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
		$("#highPao").text((100-value[0])/100).css('width',100-value[0]+'%').attr('aria-valuenow',100-value[0]);
	}});
	$('.slider-num-4').slider({onChange:function(value){
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

	$('.slider-num-point').slider({
		value : 0,
		onChange:function(value){
		var selector = $(this).parents('.showTips').find(".progress-bar");
		$(selector).css('width',value[0]*10+'%');
		$(selector).text(value[0]/10);
		if( value[0] <=2){
			$(selector).attr('class','');
			$(selector).addClass('progress-bar').addClass('bg-color-blue');
		}else if( value[0] >=3 && value[0] <=4){
			$(selector).attr('class','');
			$(selector).addClass('progress-bar').addClass('bg-color-green');
		}else if( value[0] >=5 && value[0] <=6){
			$(selector).attr('class','');
			$(selector).addClass('progress-bar').addClass('bg-color-orange');
		}else if( value[0] >=7 && value[0] <=8){
			$(selector).attr('class','');
			$(selector).addClass('progress-bar').addClass('bg-color-redLight');
		}
		else if( value[0] >=9){
			$(selector).attr('class','');
			$(selector).addClass('progress-bar').addClass('bg-color-red');
		}
	}});
	
	//滑块  end
	
	//弹框 start
	$('.tips,.table-Show-slider').on('click',function(e){
		$('.tips').hide();
		$(this).find('.tips').show();
		e.stopPropagation();
	});
	$(document).on('click',function(e){
		$('.tips').hide();
		e.stopPropagation();
	});
	$('.showTips').on('click',function(){
		$(this).find('.tips').fadeIn();
	});
	$('.showTips .form-control,.table-Show-slider input').focusout(function(){
		$(this).parents('.showTips').find('.tips').hide();
	});  //输入框焦点事件
	$('.showTips .form-control,.table-Show-slider input').focusout(function(){
		$(this).parents('.showTips').find('.tips').hide();
	}); 
	$('.ui-choose').ui_choose();  //模拟UL多选插件
	$('.ui-choose li').on('click',function(){
		var txt = $(this).text();
		$(this).parents('.dialog-input-right').find('.form-control').val(txt);
	});
	$('#ascrail2001').hide();     //隐藏滚动条  bug  待解决
	$('#ascrail2009').hide();     //隐藏滚动条  bug  待解决
	$('#ascrail2002').hide();     //隐藏滚动条  bug  待解决
	$('#ascrail2003').hide();     //隐藏滚动条  bug  待解决
	$('#ascrail2004').hide();	  //隐藏滚动条  bug  待解决
	$('.js-am-title-notice .p,.js-am-title-notice b').on('click',function(){
		//$('.sort-box').toggle();
		$('.js-am-title-notice').removeClass('am-title-notice-active');
		$(this).parent('.js-am-title-notice').toggleClass('am-title-notice-active');
		$(this).parent('.js-am-title-notice').find('.sort-box').toggle();
		//$('.dialog-overlay').css('visibility','none');
		$('.dialog-overlay-1').addClass('dialog-overlay-active');
	});  //下拉菜单  改进中
	$('.dialog-overlay-1').on('click',function(){
		$(this).removeClass('dialog-overlay-active');
		$('.sort-box').hide();
		$('.js-am-title-notice').removeClass('am-title-notice-active');
	});  //点中遮罩层
	//弹框  end

	$('.js-save-ok').on('click',function(){
		var thisa =$(this);
		setTimeout(function(){
			thisa.find('.save-word').text('完成！');
			thisa.find('.progress-bar').attr('style','width: 100%');
			thisa.find('.progress-bar').text('100%');
			//$('#saveBarOk').removeClass('bg-color-redLight');
			//$('#saveBarOk').addClass('bg-color-green');
		},800)
		setTimeout(function(){
			thisa.find('.sort-box').hide();
		},2000)
	});  //模拟保存成功  临时脚本

	//input-tag start
	$('.input-tag b,.input-tag-lg b').on('click',function(){
		$(this).parent().fadeOut(150);
	});
	//input-tag end

	//tab-box start
	$('.tab-box .tab-box-title a').on('click',function(){
		var index = $(this).index();
		var tabBox= $(this).parents('.tab-box').find('.tab-box-content');
		$(this).addClass('active')
		$(this).siblings('a').removeClass('active')
		tabBox.eq(index).fadeIn(100);
		tabBox.eq(index).siblings('.tab-box-content').hide();
	});
	$('.tab-box-2 .tab-box-title-2 a').on('click',function(){
		var index = $(this).index();
		var tabBox= $(this).parents('.tab-box-2').find('.tab-box-content-2');
		$(this).addClass('active')
		$(this).siblings('a').removeClass('active')
		tabBox.eq(index).fadeIn(100);
		tabBox.eq(index).siblings('.tab-box-content-2').hide();
	});
	//tab-box end

	//select-active start
	$('.normal-un').on('click',function(){
		$(this).addClass('active');
		$(this).siblings('.normal-un').removeClass('active');
	});
	//select-active end
	/**/
	$('.dialog-close-add').on('click',function(){
		$(this).parents('.dialog-add').removeClass('show');
	});
	$('.tips-add-target').on('click',function(){
		$('#tips-add-target').addClass('show');
	});
	$('.renwu-tips .fa-pencil').on('click',function(){
		$('#tips-repair-target').addClass('show');
	});
})