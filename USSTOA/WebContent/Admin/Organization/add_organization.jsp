<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加组织/机构信息</title>
</head>
<body>
	<h3>添加组织/机构信息</h3>
	</div>
	<div class="row">
		<div class="col-md-3"></div>
		<div class="col-md-6">
			<div class="form-horizontal">
				<div class="form-group">
					<label class="col-sm-2 control-label">组织/机构名称</label>
					<div class="col-sm-10">
						<input class="form-control" name="name" id="name"
							placeholder="请输入名称">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">组织/机构信息</label>
					<div class="col-sm-10">
						<input class="form-control" name="message" id="message"
							placeholder="请输入机构详细信息" style="width: 450px; height: 180px;">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">编号</label>
					<div class="col-sm-10">
						<input class="form-control" name="number" id="number"
							placeholder="请输入编号">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="button" class="btn btn-default"
							onclick="addOrganization()">添加</button>
					</div>
				</div>
			</div>
		</div>
</body>
</html>