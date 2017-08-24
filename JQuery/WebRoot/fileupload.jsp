<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8" %>
<html>
	<head>
	</head>
	<body style="font-size:30px;">
		<form action="fileupload.do" method="post" enctype="multipart/form-data">
			username:<input type="text" name="username"/><br/>
			phone:<input type="file" name="file1"/><br/>
			<input type="submit" value="提交"/>
		</form>
	</body>
</html>