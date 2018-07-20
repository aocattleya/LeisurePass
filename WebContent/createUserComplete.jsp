<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/createUserComplete.css">
<meta http-equiv="refresh" content="3;URL='HomeAction'" />
<jsp:include page="includeHead.jsp" />
<title>登録完了</title>
</head>
<body>



	<jsp:include page="header.jsp" />

	<div id="main" class="cf">

		<jsp:include page="navigation.jsp" />

		<div id="contents">

			<div id="contents">
				<h1>ユーザー登録が完了しました。</h1>
				<div class="success">2秒後に自動でホームに戻ります。</div>
			</div>
			<div id="footer">

			</div>

		</div>

	</div>

	<jsp:include page="footer.jsp" />













</body>
</html>