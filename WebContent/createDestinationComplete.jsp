<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%--未使用？ <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<jsp:include page="includeHead.jsp" />
<title>宛先情報完了</title>
<meta http-equiv="refresh" content="2;URL='SettlementConfirmAction'"/>
<style type="text/css">
#contents {
	margin: 0 auto;
	padding-top: 50px;/*文字の位置設定*/
	font-family: "メイリオ ", sans-serif;
	text-align: center;

}
h1{
font-size: 30px;
color: #333333;
}
</style>

</head>

<body>

	<jsp:include page="header.jsp" />

	<div id="main" class="cf">

		<jsp:include page="navigation.jsp" />

		<div id="contents">


			<div class="success"><h1>宛先情報の登録が完了しました。</h1></div>
			<p>2秒後に自動で決済確認画面に戻ります。</p>


		</div>

	</div>

	<jsp:include page="footer.jsp" />

</body>
</html>