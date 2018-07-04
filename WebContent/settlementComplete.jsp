<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
	<!-- ヘッダーを埋め込む -->
	<jsp:include page="header.jsp" />
	<div id="contents">
		<h1>決済完了画面</h1>
		<div class="success">決済が完了しました。</div>
	</div>
	<!-- フッターを埋め込む -->
	<s:include value="footer.jsp" />

</body>
</html>