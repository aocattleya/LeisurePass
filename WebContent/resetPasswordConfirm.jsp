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

.submit_btn {			/*ボタン*/
	 width: 200px;
	height:40px;
	font-family: 'メイリオ', sans-serif;
	font-size: 20px;
	position : relative;
	display: inline-block;
	padding: 0.25em 0.5em;
	text-decoration: none;
	color: #FFF;
	background: #ed7d22; /*色*/
	border-radius: 20px; /*角の丸み*/
	box-shadow: inset 0 2px 0 rgba(255, 255, 255, 0.2), inset 0 -2px 0 rgba(0, 0, 0, 0.05);
	font-weight: bold;
	border: solid 2px #d27d00;
	position: relative; /*線色*/

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