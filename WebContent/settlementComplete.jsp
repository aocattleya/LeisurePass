<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/settlementComplete.css">
<jsp:include page="includeHead.jsp" />
<meta http-equiv="refresh" content="2;URL='HomeAction'" />
<title>決済完了</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="main" class="cf">
		<jsp:include page="navigation.jsp" />
		<div id="contents">
			<div class="success"><h1>　決済が完了しました。</h1></div>
			<p>2秒後に自動でホームへ戻ります。</p>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>