<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="dao.FileDao"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="model.File,java.util.*,java.lang.*"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">


    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/simple-sidebar.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

	<link rel="stylesheet" href="//apps.bdimg.com/libs/jqueryui/1.10.4/css/jquery-ui.min.css">
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

    <div id="wrapper">

        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="#">
                        OA FOR USST
                    </a>
                </li>
                <li>
                    <a href="http://www.raychien.site">日程</a>
                </li>
                <li>
                    <a href="#">文件</a>
                </li>
                <li>
                    <a href="#">消息</a>
                </li>
                <li>
                    <a href="#">考勤</a>
                </li>     
                <li>
                    <a href="#">个人中心</a>
                </li>
                <li>
                    <a href="#">安全退出</a>
                </li>
            </ul>
        </div>
        <!-- /#sidebar-wrapper -->

        <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                    <a href="#menu-toggle" class="btn btn-default" id="menu-toggle">控制面板</a>
                    	<div id="tabs">
		<ul>
			<li><a href="#fragment-1"><span>文档上传</span> </a>
			</li>
			<li><a href="#fragment-2"><span>文档查看</span> </a>
			</li>
			<li><a href="#fragment-3"><span>文档搜索</span> </a>
			</li>
			<li><a href="#fragment-4"><span>回收站</span> </a>
			</li>
		</ul>
		<div id="fragment-1">
			<form action="fileUpload" method="post" enctype="multipart/form-data">
				文档名：<input type="text" name="fileName" required><br /> 
				类 型：<select name="fileType" required>
					  	<option value="文本">文本</option>
						<option value="图片">图片</option>
					  </select> <br /> 
				选 择：<input type="file" name="fileSrc" required><br />
				<input type="submit" value="提交"> <input type="reset"><br />
			</form>
		</div>
		<div id="fragment-2">
			<table border="1" cellspacing="0" width="50%">
				<tr align="center">
					<th>文件名</th>
					<th>文件类型</th>
					<th>上传时间</th>
					<th>文件大小</th>
					<th>下载</th>
					<th>操作</th>
				</tr>
	
				<c:forEach var="file" items='<%= new FileDao().getAllFiles(((Integer)session.getAttribute("ID")).intValue()) %>'>
					<tr align="center">
						<td>${file.fileName }</td>
						<td>${file.fileType }</td>
						<td>${file.fileDate }</td>
						<td>${file.fileSize }</td>
						<td><a href="${file.fileAddress }">下载地址</a></td>
						<td><a href="fileUpdate.jsp?fileID=${file.fileID }">修改</a>&nbsp;&nbsp;<a href="fileDelete?fileID=${file.fileID }">删除</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<div id="fragment-3">
			<form action="fileSearch" method="post">
				<input type="text" name="fileName" required>
				<input type="submit" value="搜索"><br/>
			</form>
			
			</div>
			<div id="fragment-4">
			<table border="1" cellspacing="0" width="50%">
				<table border="1" cellspacing="0" width="50%">
				<tr align="center">
					<th>文件名</th>
					<th>文件类型</th>
					<th>上传时间</th>
					<th>文件大小</th>
					<th>操作</th>
				</tr>
	
				<c:forEach var="file" items='<%= new FileDao().getFilesFromGarbage(((Integer)session.getAttribute("ID")).intValue()) %>'>
					<tr align="center">
						<td>${file.fileName }</td>
						<td>${file.fileType }</td>
						<td>${file.fileDate }</td>
						<td>${file.fileSize }</td>
						<td><a href="fileRecovery?fileID=${file.fileID }">回收</a>&nbsp;&nbsp;<a href="fileThoroughDelete?fileID=${file.fileID }">彻底删除</a></td>
					</tr>
				</c:forEach>
			</table>
			</div>
	</div>
                    </div>
                </div>
            </div>
        </div>
        <!-- /#page-content-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Menu Toggle Script -->
    <script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
    </script>

</body>

</html>
