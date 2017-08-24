<%@page pageEncoding="utf-8" 
contentType="text/html;charset=utf-8" %>
<html>
	<head>
		<script type="text/javascript" 
		src="js/jquery-1.4.3.js">			
		</script>
		<script type="text/javascript">
		$(fn);
		function fn(){
			$('a#s1').toggle(function(){
				var flight = $(this).parent().siblings().eq(0).text();
				$(this).next().load('getPrice.do','flight=' + flight);
			},function(){
				$(this).next().empty();
			});
		}
		</script>
	</head>
	<body style="font-size:30px;">
		<table border="1" width="60%" cellpadding="0" cellspacing="0">
			<tr>
				<td>航班号</td>
				<td>机型</td>
				<td>经济舱价格</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>CA1000</td>
				<td><a href="#">波音747</a></td>
				<td>￥1200</td>
				<td>
				<a href="javascript:;" id="s1">查看所有票价</a>
				<div></div>
				</td>
			</tr>
			<tr>
				<td>MU2000</td>
				<td><a href="#">空客330</a></td>
				<td>￥800</td>
				<td>
				<a href="javascript:;" id="s1">查看所有票价</a>
				<div></div>
				</td>
			</tr>
		</table>
	</body>
</html>