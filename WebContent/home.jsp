<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="./css/style.css">
		<title>ホーム</title>
	</head>
	<body>

		<jsp:include page="header.jsp" />

		<div id="main" class="cf">

			<jsp:include page="navigation.jsp" />

			<div id="contents">
				<h1>ホーム画面</h1>
			</div>

		</div>

		<s:include value="footer.jsp" />

	</body>
</html>