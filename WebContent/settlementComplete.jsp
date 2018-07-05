<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">

<!-- 3秒後にHomeActionを実行して移動する -->
<meta http-equiv="refresh" content="3;URL='HomeAction'" />

<title>決済完了</title>
</head>

<body>
	<jsp:include page="header.jsp" />              <!-- ヘッダー -->
	<div id="main" class="cf">
		<jsp:include page="navigation.jsp" />      <!-- ナビゲーション -->

		<div id="contents">
			<h1>決済完了画面</h1>
			<div class="success">決済が完了しました。</div>
		</div>

	</div>
	<jsp:include page="footer.jsp" />              <!-- フッター -->
</body>
</html>