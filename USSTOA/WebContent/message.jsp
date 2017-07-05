<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="dao.MessageDao"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="model.*,java.util.*,java.lang.*"%>
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
			<table border="1" cellspacing="0" width="50%">
				<tr align="center">
					<th>发送者</th>
					<th>发送时间</th>
					<th>查看</th>
					<th>删除</th>
				</tr>
	
				<c:forEach var="message" items='<%= new MessageDao().getAllMessage(((Integer)session.getAttribute("ID")).intValue()) %>'>
					<tr align="center">
						<td>${message.sendUser.UserName }</td>
						<td>${message.sendTime }</td>
						<td><a href="#">查看</a></td>
						<td><a href="messageDelete?messageID=${message.messageID }">删除</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
		</div>
</body>
</html>