<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>查看机构信息</title>
</head>
<body>
	<table id="classChoose" class="table table-bordered">
		<tr>
			<th>机构名称</th>
			<th>机构信息</th>
			<th>编号</th>
			<th>管理员</th>
		</tr>
		<c:forEach var="Organization" items="${ myTag:getOrganization()}">
			<tr>
				<td>${ Organization.OrganizationName }</td>
				<td>${ Organization.OrganizationMessage }</td>
				<td>${ Organization.OrganizationID }</td>
				<td>${ Organization.OrganizationAdminID }</td>
				<td><input type="radio" name="choose"
					value="${ Organization.Name }" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>