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
	color: #FFF;
	background: #ed7d22; /*色*/
	border-radius: 20px; /*角の丸み*/
	box-shadow: inset 0 2px 0 rgba(255, 255, 255, 0.2), inset 0 -2px 0 rgba(0, 0, 0, 0.05);
	font-weight: bold;
	border: solid 2px #d27d00;
	position: relative; /*線色*/
}


.horizontal-list-table {
	background-color: #f7f7f7;
	margin: 2em 0;
	padding: 2em;
	width: 700px;
	border-radius: 20px;
	margin: auto;
}

label{
	 border-bottom: solid 3px #ffa623;
}


</style>

<jsp:include page="includeHead.jsp" />
<title>決済確認</title>
</head>

<body>
	<jsp:include page="header.jsp" />
	<div id="main" class="cf">
		<jsp:include page="navigation.jsp" />
		<div id="contents">

			<s:form id="form" action="SettlementCompleteAction">

				<s:if test="!(noDestinationMassage == null)">
					<s:property value="noDestinationMassage" />
				</s:if>
				<s:else>
					<div class="info">
						<h2>
							<br>
							<br>宛先を選択してください
						</h2>
					</div>
					<br>
				</s:else>

				<s:iterator value="#session.destinationInfoDtoList" status="st">
					<table class="horizontal-list-table">


						<tr>
							<th><s:label value="　名前　" /></th>
						</tr>

						<tr>
							<td>
								<!-- 名前：苗字 --> <s:property value="familyName" /> <span></span>
								<!-- 名前：名 --> <s:property value="firstName" />
							</td>
						</tr>

						<tr>
							<th><s:label value="　ふりがな　" /></th>
						</tr>

						<tr>
							<td>
								<!-- なまえ：みょう --> <s:property value="familyNameKana" /> <span></span>
								<!-- なまえ：めい --> <s:property value="firstNameKana" />
							</td>
						</tr>

						<tr>
							<th><s:label value="　住所　" /></th>
						</tr>
						<!-- 住所 -->
						<tr>
							<td><s:property value="userAddress" /></td>
						</tr>

						<tr>
							<th><s:label value="　電話番号　" /></th>
						</tr>

						<!-- 電話番号 -->
						<tr>
							<td><s:property value="telNumber" /></td>
						</tr>

						<tr>
							<!-- メール -->
							<th><s:label value="　メール　" /></th>
						<tr>
							<td><s:property value="email" /></td>
						</tr>

						<!-- 1つ目をチェックしておく -->
						<tr>
							<td><s:if test="#st.index == 0">
									<input type="radio" name="id" checked="checked"
										value="<s:property value='id'/>" />
								</s:if> <!-- それ以外はNOチェック --> <s:else>
									<input type="radio" name="id" value="<s:property value='id'/>" />
								</s:else></td>
						</tr>


					</table><br>

				</s:iterator>
				<br>
				<!-- 決済ボタン -->
				<div class="submit_btn_box">
					<div id=".contents-btn-set">
						<s:submit value="決済" class="submit_btn" />
					</div>
				</div>

			</s:form>
			<br>
			<!-- 新規登録ボタン↓ -->
			<div class="submit_btn_box">
				<div id=".contents-btn-set">
					<!-- 実行：CreateDestinationAction -->
					<s:form action="CreateDestinationAction">

						<s:submit value="新規登録" class="submit_btn" />
					</s:form>
					<br> <br>
				</div>
			</div>
		</div>
	</div>
	<br><br><br><br>
	<jsp:include page="footer.jsp" />
</body>
</html>