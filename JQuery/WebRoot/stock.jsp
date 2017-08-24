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
				font-style:italic;
				font-size:24px;
			}
		</style>
		<script type="text/javascript" src="js/jquery-1.4.3.js"></script>
		<script type="text/javascript">
			$(function(){
			//每隔5秒刷新一次页面（属于重复刷新）  getTime只刷新一次
				setInterval(getPriceInfo,5000);
			});
			function getPriceInfo(){
				$.post('quoto.do',function(data){  //data已经被转换成了js对象
					//如果返回的是json字符串，该函数会自动将json字符串转换成js对象。	
					$('#tb1').empty();  //不清空就会超过div   
					for(i = 0;i < data.length;i ++){
						var s = data[i];
						$('#tb1').append(
						'<tr><td>' + s.code + '</td><td>' + s.name 
						+ '</td><td>' + s.price + '</td></tr>');
					}
				},'json');
			}
		</script>
	</head>
	<body style="font-size:30px;" >
		<div id="d1">
			<div id="d2">股票报价</div>
			<div id="d3">
				<table width="100%"  cellpadding="0" 
				cellspacing="0">
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