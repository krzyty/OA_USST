<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文档管理</title>
<link rel="stylesheet"
	href="//apps.bdimg.com/libs/jqueryui/1.10.4/css/jquery-ui.min.css">
<script src="//apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="//apps.bdimg.com/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>

<link rel="stylesheet" href="/css/style.css">
<script>
	$(function() {
		$("#tabs").tabs();
	});
</script>
</head>
<body>
	<div id="tabs">
		<ul>
			<li><a href="#fragment-1"><span>文档上传</span> </a></li>
			<li><a href="#fragment-2"><span>文档查看</span> </a></li>
			<li><a href="#fragment-3"><span>回收站</span> </a></li>
		</ul>
		<div id="fragment-1">
			<form action="" method="post" enctype="multipart/form-data">
				文档名：<input type="text" name="fileName" required><br /> 
				类　型：<input type="text" name="fileType" required><br /> 
				选　择：<input type="file" name="fileSrc" required><br /> 
				<input type="submit" value="提交">
				<input type="reset"><br />
			</form>
		</div>
		<div id="fragment-2">Lorem ipsum dolor sit amet, consectetuer
			adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
			dolore magna aliquam erat volutpat. Lorem ipsum dolor sit amet,
			consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt
			ut laoreet dolore magna aliquam erat volutpat.</div>
		<div id="fragment-3">Lorem ipsum dolor sit amet, consectetuer
			adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet
			dolore magna aliquam erat volutpat. Lorem ipsum dolor sit amet,
			consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt
			ut laoreet dolore magna aliquam erat volutpat. Lorem ipsum dolor sit
			amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod
			tincidunt ut laoreet dolore magna aliquam erat volutpat.</div>
	</div>

</body>
</html>