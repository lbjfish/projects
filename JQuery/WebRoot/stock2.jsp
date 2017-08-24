<%@page pageEncoding="utf-8" 
contentType="text/html;charset=utf-8" %>
<html>
	<head>
		<style>
			#d1{
				width:500px;
				height:300px;
				background-color:black;
				margin-top:40px;
				margin-left:300px;
			}
			#d2{
				height:35px;
				color:white;
				background-color:red;
			}
			table{
				color:yellow;
				font-size:24px;
				font-style:italic;
			}
		</style>
		<script type="text/javascript" 
		src="js/jquery-1.4.3.js"></script>
		<script type="text/javascript">
			$(function(){
				setInterval(getPriceInfo,5000);
			});
			function getPriceInfo(){
				$.ajax({
					'url':'quoto.do',
					'type':'post',
					'dataType':'json',
					'async':true,
					'success':function(data){
						//data是服务器返回的数据,
						//已经被自动转换成了相应的js对象
						$('#tb1').empty();   //清空节点
						for(i = 0;i < data.length;i ++){
							var s = data[i];
							$('#tb1').append(
							'<tr><td>' + s.code + '</td><td>' + s.name 
							+ '</td><td>' + s.price + '</td></tr>');
						}
					},'error':function(){
						//服务器处理出错
						alert('获得股票价格失败');
					}
				});
			}
		</script>
	</head>
	<body style="font-size:30px;" >
		<div id="d1">
			<div id="d2">股票报价</div>
			<div id="d3">
				<table width="100%"  cellpadding="0" cellspacing="0">
					<thead>
						<tr><td>代码</td><td>名称</td><td>价格</td></tr>
					</thead>
					<tbody id="tb1">
					</tbody>
				</table>
			</div>
		</div>
	</body>
</html>