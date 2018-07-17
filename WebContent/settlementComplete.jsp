<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<style type="text/css">
#contents {
	text-align: center;
	font-family: メイリオ ", sans-serif;
}

.success {
	padding-top: 200px;
	font-family: Meiryo ", sans-serif;
	font-size: 90px;
	font-weight: boid;
}

.topretun {
	width: 200px;
	height: 40px;
	display: inline-block;
	padding: 0.25em 0.5em;
	text-decoration: none;
	color: #FFF;
	background: #ed7d22; /*色*/
	border-radius: 20px; /*角の丸み*/
	box-shadow: inset 0 2px 0 rgba(255, 255, 255, 0.2), inset 0 -2px 0 rgba(0, 0, 0, 0.05);
	font-weight: bold;
	border: solid 2px #d27d00;
}
</style>
<jsp:include page="includeHead.jsp" />
<meta http-equiv="refresh" content="2;URL='HomeAction'"/>
<title>決済完了</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="main" class="cf">
		<jsp:include page="navigation.jsp" />
		<div id="contents">
			<div class="success">
				<h1>決済が完了しました。</h1>
				<br>
				<p>2秒後に自動でホームへ戻ります。</p>
				<br>
			</div>
		</div>
	</div>
	<br>
	<br>
	<br>
	<br>
	<jsp:include page="footer.jsp" />
</body>
</html>