<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>网站管理</title>
</head>
<body>
<table id="classChoose" class="table table-bordered">
		<tr>
			<th>姓名</th>
			<th>所属机构</th>
			<th>员工号</th>
			<th>密码</th>
		</tr>
		<%-- <c:forEach var="Admin" items="${ myTag:getAdmin()}">
			<tr>
				<td>${ Admin.AdminName }</td>
				<td>${ Admin.AdminPower }</td>
				<td>${ Admin.AdminID }</td>
				<td>${ Admin.AdminPassword }</td>
				<td><input type="radio" name="choose"
					value="${ Admin.Name }" /></td>
			</tr>
		</c:forEach> --%>
	</table>
</body>
</html>