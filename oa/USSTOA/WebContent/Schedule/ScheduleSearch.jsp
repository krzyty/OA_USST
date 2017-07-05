<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>日程查询页面</title>
</head>
<body>
 <p><font size="+4">查询日程</font></p>
<table border="1px" style="width: 402px;">
<tr>
<td>姓名:<input type="text" id="name" name="name" /></td>
<td>标题:<input type="text" id="scheduletitle" name="scheduletitle" /></td>
</tr>
<tr>
<td>内容:<input type="text" id="schedulecontent" name="schedulecontent" /></td>
<td>入职时间:<sx:datetimepicker id="scheduletime" name="scheduletime" displayFormat="yyyy-MM-dd" /></td>
</tr>
<tr>
<td>
	<input type="submit" value="查询" />
</td>
</tr>
</table>
</body>
</html>