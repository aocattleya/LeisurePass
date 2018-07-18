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
	margin:0:auto;
}
.submit_btn {
	width: 200px; /*ボタンの横の長さ*/
	height: 40px; /*ボタンの縦の長さ*/
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
.submit_btn:active {
	transform: translateY(2px); /*下に動かす*/
	background-color: #f3a769; /*薄いオレンジ色にする*/
	border: #ed7d22; /*枠線の色変更*/
}
.horizontal-list-table {
	background-color: #f7f7f7;
	margin: 2em 0;
	padding: 2em;
	width: 700px;
	border-radius: 20px;
	margin: auto;
	position: relative;
}
.orangeBorder {
	border-bottom: solid 3px #ffa623;
	display: inline-block;
	padding: 0 15px 0 15px;
	}
.aiueo label {
	line-height: 28px;
	display: inline-block;
	cursor:	pointer;
	position: relative;
	top:110px;
}
.aiueo input[type=radio]{
	transform:scale(2,2);
}
.aiueo input[type="radio"]:checked {
	content: '';
	width: 15px;		/* マークの横幅 */
	height: 15px;		/* マークの縦幅 */
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
							<br> <br>宛先を選択してください
						</h2>
					</div>
					<br>
				</s:else>

				<s:iterator value="#session.destinationInfoDtoList" status="st">
					<table class="horizontal-list-table">


						<tr>
							<th><div class="orangeBorder">名前</div></th>
						</tr>

						<tr>
							<td>
								<!-- 名前：苗字 --> <s:property value="familyName" /> <span></span>
								<!-- 名前：名 --> <s:property value="firstName" />
							</td>
						</tr>

						<tr>
							<th><div class="orangeBorder">ふりがな</div></th>
						</tr>

						<tr>
							<td>
								<!-- なまえ：みょう --> <s:property value="familyNameKana" /> <span></span>
								<!-- なまえ：めい --> <s:property value="firstNameKana" />
							</td>
						</tr>

						<tr>
							<th><div class="orangeBorder">住所</div></th>
						</tr>
						<!-- 住所 -->
						<tr>
							<td><s:property value="userAddress" /></td>
						</tr>

						<tr>
							<th><div class="orangeBorder">電話番号</div></th>
						</tr>

						<!-- 電話番号 -->
						<tr>
							<td><s:property value="telNumber" /></td>
						</tr>

						<tr>
							<!-- メール -->
							<th><div class="orangeBorder">メール</div></th>
						<tr>
							<td><s:property value="email" /><br><br></td>
						</tr>

						<!-- 1つ目をチェックしておく -->
						<tr>
							<td>
								<s:if test="#st.index == 0">
									<div class="aiueo"><input type="radio" name="id" checked="checked" value="<s:property value='id'/>" /></div>
								</s:if>

								<!-- それ以外はNOチェック -->
								<s:else>
									<div class="aiueo"><input type="radio" name="id" value="<s:property value='id'/>" /></div>
								</s:else>
							</td>
						</tr>

					</table>
					<br>

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
	<br>
	<br>
	<br>
	<br>
	<jsp:include page="footer.jsp" />
</body>
</html>