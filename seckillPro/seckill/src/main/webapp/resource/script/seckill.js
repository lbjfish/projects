//存放主要交互逻辑js代码
//javascript 模块化
var seckill = {
	//封装秒杀相关ajax的url
	URL : {
		
	},
	//验证手机号
	validatePhone : function(phone){
		if(phone && phone.length == 11 && !isNaN(phone)){
			return true;
		}else{
			return false;
		}
	},
	//详情页秒杀逻辑
	detail : {
		//详情页初始化
		init : function(params){
			//手机验证和登录,计时交互
			//规划我们的交互流程
			//在cookie中查找手机号
			var killPhone = $.cookie('killPhone');
			var startTime = params['startTime']; 
			var endTime = params['endTime'];
			var seckillId = params['seckillId'];
			//验证手机号
			if(!seckill.validatePhone(killPhone)){
				//绑定phone
				//控制输出
				var killPhoneModal = $('#killPhoneModal');
				//bootstrap属性
				killPhoneModal.modal({
					show : true,  //显示弹出层 (jsp里写的是class="modal fade"隐藏)
					backdrop : 'static',  //禁止位置关闭 (鼠标点别的区域 弹出框会消失,所以要禁止)
					keyboard : false //关闭键盘事件 (键盘点击也会关闭弹出框,所以也要禁止)
				});
				
				$("#killPhoneBtn").on("click",function(){
					var inputPhone = $('#killPhoneKey').val();
					if(seckill.validatePhone(inputPhone)){
						//电话写入cookie (cookie有效期7天，在/seckill路径下有效)
						$.cookie('killPhone',inputPhone, {expires:7,path:'/seckill'});
						//刷新页面
						window.location.reload();
					}else{
						$("#killPhoneMessage").hide().html('<label class="label-danger">手机号错误！</label>').show(300);
					}
				});
			}
			
			//已经登录
		}
	}
		
}