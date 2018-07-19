<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<jsp:include page="includeHead.jsp" />
<title>管理者画面</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="main">

		<div id="admin-contents">
			<h1>管理者画面</h1>

		<!-- 商品管理画面へ。 -->
			<s:form action="AdminProductAction">
				<s:submit value="商品管理" />
			</s:form>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>



