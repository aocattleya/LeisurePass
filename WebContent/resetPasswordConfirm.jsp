<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<jsp:include page="includeHead.jsp" />
<style type="text/css">
h1 {
	font-family: "メイリオ", sans-serif;
	font-size: 30px;
	text-align: center;
	color: #333
}

.table {
	font-family: "メイリオ", sans-serif;
	font-size: 18px;
	color: #333333;
	text-align: center;
	background-color: #f7f7f7;
	margin: 2em 0;
	padding: 2em;
	width: 600px;
	border-radius: 20px;
	margin: auto;
}

label {
	border-bottom: solid 3px #ffa623;
	font-weight: bold;
}

.submit_btn {
	width: 200px; /*ボタンの横の長さ*/
	height: 40px; /*ボタンの縦の長さ*/
	/* display: inline-block; 多分要らないかも*/
	font-size: 20px; /*ボタン文字サイズ*/
	background-color: #ed7d22; /*ボタンの色*/
	color: #FFF; /*ボタン文字の色*/
	border-radius: 20px; /*ボタンの角の丸み*/
	box-shadow: inset 0 2px 0 rgba(255, 255, 255, 0.2), inset 0 -2px 0
		rgba(0, 0, 0, 0.05); /*ボタンの影（立体感）*/
	border: solid 2px #d27d00; /*ボタンの立体感を出すため*/
	outline: 0; /*変な枠線を非表示に*/
	cursor: pointer; /*マウスを乗せたとき指マークにする*/
}

/*ボタンをクリックしたときのCSS*/
.submit_btn:active {
	transform: translateY(2px); /*下に動かす*/
	background-color: #f3a769; /*薄いオレンジ色にする*/
	border: #ed7d22; /*枠線の色変更*/
}

#contents{
margin-bottom: 80px;
text-align: center;
width: 600px;
}



</style>

<title>パスワード再設定確認</title>
</head>
<body>
	<jsp:include page="header.jsp" />

	<div id="main" class="cf">

		<jsp:include page="navigation.jsp" />



		<div id="contents">
			<h1>以下の内容で変更します。</h1>
			<div class=table>
				<s:form action="ResetPasswordCompleteAction">
					<tr>
						<th><s:label value="ログインID" /></th>
					</tr>
					<br>
		<s:property value="#session.loginId" />
					<br>
					<br>
					<tr>
						<th><s:label value="パスワード" /></th>
					</tr>
					<br>
					<s:property value="#session.concealedPassword" />
					<br>
					<br>

					<s:submit value="再設定" class="submit_btn" />

				</s:form>

			</div>

		</div>
	</div>

	<jsp:include page="footer.jsp" />

</body>

</html>

<!-- 中山 7/4 -->