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
				<div><a href="#">スライドショー</a></div>
				<div><a href="#">おすすめ1</a></div>
				<div><a href="#">おすすめ2</a></div>
				<div><a href="#">おすすめ3</a></div>
			</div>

			<!--  テスト用  -->
			<s:form action="CreateDestinationAction">
				<s:submit value="CreateDestinationAction" />
			</s:form>
			<s:form action="ResetPasswordAction">
				<s:submit value="ResetPasswordAction" />
			</s:form>

		</div>

		<jsp:include page="footer.jsp" />

	</body>
</html>