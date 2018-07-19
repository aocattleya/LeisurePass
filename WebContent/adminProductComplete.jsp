
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<jsp:include page="includeHead.jsp" />
<title>商品管理完了画面</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	​
	<div id="main">
		​
		<div id="admin-contents">
			<div>
				<h1>商品管理完了画面</h1>
			</div>

		<!-- 商品管理画面に戻る -->
			<s:form action="GoAdminAction">
				<s:submit value="戻る" />
			</s:form>
		</div>
		<div id="footer"></div>
	</div>
</body>
</html>
