<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<meta http-equiv="refresh" content="2;URL='HomeAction'" />
<jsp:include page="includeHead.jsp" />
<style type="text/css">

#main {
	font-family: "メイリオ", sans-serif;
	text-align: center;
	color: #333;
}

#contents{
margin-top: 80px;
text-align: center;
width: 600px;
}
}



h1 {
	font-size: 30px;
	vertical-align: middle;
}

p {
	font-size: 18px;
}
</style>

<title>パスワード再設定完了</title>
</head>
<body>
	<jsp:include page="header.jsp" />

	<div id="main" class="cf">

		<jsp:include page="navigation.jsp" />

		<div id="contents">

			<h1>パスワード再設定が完了しました。</h1>

			<p>2秒後に自動でホームに戻ります。</p>




		</div>

	</div>

	<jsp:include page="footer.jsp" />

</body>
</html>
<!-- 中山 -->