<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="./css/style.css">
		<link rel="stylesheet" href="./css/home.css">
		<jsp:include page="includeHead.jsp" />
		<title>ホーム</title>
	</head>
	<body>

		<jsp:include page="header.jsp" />

		<div id="main" class="cf">
			<div class="navi">
			<jsp:include page="navigation.jsp" />
			</div>
			<div id="contents">
				<div><a href="#">スライドショー</a></div>
				<div><a href="#">おすすめ1</a></div>
				<div><a href="#">おすすめ2</a></div>
				<div><a href="#">おすすめ3</a></div>
			</div>
		</div>

		<jsp:include page="footer.jsp" />

	</body>
</html>