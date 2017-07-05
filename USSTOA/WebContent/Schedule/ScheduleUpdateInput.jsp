<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改日程页面</title>
</head>
<body>
 <p><font size="+4">修改日程</font></p>
     <s:form name="scheduleForm" action="ScheduleUpdate" method="post">
     	<input type="hidden" name="schedule.id" value="<s:property value='schedule.id'/>" />
	   	<s:textfield label="姓名" name="schedule.name" />
	   	<s:textfield label="标题" name="schedule.scheduletitle" />
	   	<s:textfield label="内容" name="schedule.schedulecontent" />
	   	<sx:datetimepicker name="schedule.scheduletime" label="时间" displayFormat="yyyy-MM-dd" />
	   	<s:submit value="修改"/>
    </s:form>
</body>
</html>