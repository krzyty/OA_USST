<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>管理员日程管理页面</title>
</head>
<body>
 <p><font size="+4">日程管理主页面（管理员）</font></p>
<a href="ScheduleSearch.jsp">查询</a>
<br/>
<table border="1px">
	<tr>
		<td>ID</td>
		<td>姓名</td>
		<td>标题</td>
		<td>内容</td>
		<td>时间</td>
		<td>操作</td>
	</tr>
	<s:iterator value="schedules" var="p">
	<tr>
		<td>
			<s:property value="#p.id"/>
		</td>
		<td>	
			<s:property value="#p.name"/>
		</td>
		<td>
			<s:property value="#p.scheduletitle"/>
		</td>
		<td>
			<s:property value="#p.schedulecontent"/>
		</td>
		<td>
			<s:property value="#p.scheduletime"/>
		</td>
		<td>
			<a href="ScheduleDelete?id=<s:property value="#p.id"/>">删除</a>
		</td>
	</tr>
	</s:iterator>
</table> 
</body>
</html>