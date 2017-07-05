<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加日程</title>
</head>
<body>
 <p><font size="+4">添加日程</font></p>
 <s:form name="scheduleForm" action="ScheduleAdd" method="post">
    	<s:textfield label="姓名" name="schedule.name"/>
    	<s:textfield label="标题" name="schedule.scheduletitle"/>
    	<s:textfield label="内容" name="schedule.schedulecontent"/>
    	<sx:datetimepicker name="schedule.scheduletime" label="时间" displayFormat="yyyy-MM-dd" />
    	<s:submit value="添加"/>
    </s:form>
</body>
</html>