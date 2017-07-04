<%@page import="dao.FileDao,model.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改文件信息</title>
</head>
<body>
<%
	File file=new FileDao().getFilesByFileID(((Integer)session.getAttribute("ID")).intValue(), Integer.parseInt(request.getParameter("fileID")));
	request.setAttribute("file", file);
 %>
 <br/>
 <div align="left">
 	<form action="fileUpdate?fileID=<%=request.getParameter("fileID")%>" method="post">
		<table border="0" cellspacing="0" align="center">
		<tr>
			<td>文  件  名：</td>
			<td><input type="text" name="fileName" value="${file.fileName }" required></td>
		</tr>
		<tr>
			<td>文件类型：</td>
			<td><select name="fileType" required>
					  	<option value="文本">文本</option>
						<option value="图片">图片</option>
				</select> 
			</td>
		</tr>
		<tr>
			<td>上传时间：</td>
			<td><input type="text" value="${file.fileDate }" required readonly></td>
		</tr>
		<tr>
			<td>文件大小：</td>
			<td><input type="text" value="${file.fileSize }" required readonly></td>	
		</tr>
		<tr>
			<td><input type="submit" value="提交"></td>
			<td><input type="reset"></td>	
		</tr>
		 <
	</table>
	</form>
	
 </div>
	
</body>
</html>