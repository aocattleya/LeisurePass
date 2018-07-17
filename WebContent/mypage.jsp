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
	margin: 0;
	padding: 0;
	line-height: 1.6;
	letter-spacing: 1px;
	font-family: メイリオ ", sans-serif;
	font-size: 18px;
	text-align: center;
}


.submit_btn {
	width: 200px;
	height:40px;
	position : relative;
	display: inline-block;
	padding: 0.25em 0.5em;
	text-decoration: none;
	font-size: 20px;
	color: #ffffff;
	background: #ed7d22; /*色*/
	border-radius: 20px; /*角の丸み*/
	box-shadow: inset 0 2px 0 rgba(255, 255, 255, 0.2), inset 0 -2px 0 rgba(0, 0, 0, 0.05);
	/* font-weight: bold; */
	border: solid 2px #d27d00;
	position: relative; /*線色*/
}


.vertical-list-table {
	background-color: #f7f7f7;
	margin: 2em 0;
	padding: 2em;
	width: 600px;
	border-radius: 20px;
	margin: auto;
	font-size:18px;
}

label{
	 border-bottom: solid 3px #ffa623;
}


</style>
<jsp:include page="includeHead.jsp" />
<title>マイページ</title>

</head>
<body>

	<jsp:include page="header.jsp" />
	<div id="main" class="cf">
		<jsp:include page="navigation.jsp" />
		<div id="contents">
			<h1>マイページ</h1>
			<s:form action="PurchaseHistoryAction">


				<table class="vertical-list-table">

					<tr>
						<th scope="row"><s:label value="　名前　" /></th>
					</tr>
					<tr>
						<td><s:property value="#session.familyName" /><span></span>
							<s:property value="#session.firstName" />
						</td>
					</tr>

					<tr>
						<th scope="row"><s:label value="　なまえ　" /></th>
					</tr>
					<tr>
						<td><s:property value="#session.familyNameKana" /><span>
						</span> <s:property value="#session.firstNameKana" /></td>
					</tr>

					<tr>
						<th scope="row"><s:label value="　性別　" /></th>
					</tr>
					<tr>
						<td><s:if test="#session.sex==0">男性</s:if> <s:if
								test="#session.sex==1">女性</s:if></td>
					</tr>

					<tr>
						<th scope="row"><s:label value="　メールアドレス　" /></th>
					</tr>
					<tr>
						<td><s:property value="#session.email" /></td>
					</tr>

				</table>

				<div class="submit_btn_box">
					<s:submit value="購入履歴" class="submit_btn" />
				</div>

			</s:form>
		</div>

	</div>

	<jsp:include page="footer.jsp" />

</body>
</html>