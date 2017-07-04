<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="dao.FileDao"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="model.File,java.util.*,java.lang.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>搜索结果</title>
</head>
<body>
<table border="1" cellspacing="0" width="50%">
				<tr align="center">
					<th>文件名</th>
					<th>文件类型</th>
					<th>上传时间</th>
					<th>文件大小</th>
					<th>下载</th>
					<th>操作</th>
				</tr>

				<c:forEach var="file" items="${requestScope.searchFilesList}" >
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
</body>
</html>