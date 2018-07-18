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

body {
	width: 100%;
	font-family: 'メイリオ', sans-serif;
	font-size: 18px;
	color: #333333;
}

#contents{
	text-align: center;
	width: 600px;
}

h1 {
	font-size: 30px;

}

.txt{
	width: 469px;
	height: 40px;
	font-size: 18px;
	background-color: #f7f7f7;
	border-style: none;
	border-radius: 5px; 	/*角を丸く*/

}


/*placeholder 色変更*/

.txt::-webkit-input-placeholder {
	color: #aaaaaa;
}

.txt::-moz-placeholder {
	color: #aaaaaa;
}

.txt:-ms-input-placeholder {
	color: #aaaaaa;
}




.vertical-list-table {
	margin: auto;
}

.error-message {		/*エラーメッセージ*/
	font-size: 12px;
	color: #ed7d22;
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

	margin-bottom: 80px;
	margin-top: 32px;
}

/*ボタンをクリックしたときのCSS*/
.submit_btn:active {
	transform: translateY(2px); /*下に動かす*/
	background-color: #f3a769; /*薄いオレンジ色にする*/
	border: #ed7d22; /*枠線の色変更*/
}

</style>

<title>パスワード再設定</title>
</head>
<body>
	<jsp:include page="header.jsp" />

	<div id="main" class="cf">

		<jsp:include page="navigation.jsp" />

		<div id="contents">


			<h1>パスワード再設定画面</h1>


			<s:form action="ResetPasswordConfirmAction">
				<table class="vertical-list-table">


					<tr>
						<th scope="row"><s:label value="ログインID" /></th>
					</tr>
					<tr>
						<td><s:textfield name="loginId" placeholder="ログインID"
								class="txt" /></td>
					</tr>
					<tr>
						<td>
							<!-- ログインIDエラーメッセージ --> <s:if
								test="!#session.loginIdErrorMessageList.isEmpty()">
								<div class="error">
									<div class="error-message">
										<s:iterator value="#session.loginIdErrorMessageList">
											<s:property />
											<br>
										</s:iterator>
									</div>
								</div>
							</s:if>
						</td>
					</tr>





					<tr>
						<th scope="row"><s:label value="現在のパスワード" /></th>
					</tr>
					<tr>
						<td><s:password name="password" placeholder="現在のパスワード"
								class="txt" /></td>
					</tr>
					<tr>
						<td>
							<!--パスワードエラーメッセージ一覧。-->
							<s:if test="!#session.passwordErrorMessageList.isEmpty()">
								<div class="error">
									<div class="error-message">
										<s:iterator value="#session.passwordErrorMessageList">
											<s:property />
											<br>
										</s:iterator>
									</div>
								</div>
							</s:if>
						</td>
					</tr>

					<tr>
						<td>
							<!-- パスワードが間違っているエラーメッセージ。-->
							<s:if test="!#session.passwordIncorrectErrorMessageList.isEmpty()">
								<div class="error">
									<div class="error-message">
										<s:iterator value="#session.passwordIncorrectErrorMessageList">
											<s:property />
											<br>
										</s:iterator>
									</div>
								</div>
							</s:if>
						</td>
					</tr>


					<tr>
						<th scope="row"><s:label value="新しいパスワード" /></th>
					</tr>
					<tr>
						<td><s:password name="newPassword" placeholder="新しいパスワード"
								class="txt" /></td>
					</tr>

					<tr>
						<td>
							<!-- 新しいパスワードエラーメッセージ。 -->
							<s:if test="!#session.newPasswordErrorMessageList.isEmpty()">
								<div class="error">
									<div class="error-message">
										<s:iterator value="#session.newPasswordErrorMessageList">
											<s:property />
											<br>
										</s:iterator>
									</div>
								</div>
							</s:if>
						</td>
					</tr>





					<tr>
						<th scope="row"><s:label value="(再確認用)" /></th>
					</tr>
					<tr>
						<td><s:password name="reConfirmationPassword"
								placeholder="新しいパスワード(再確認用)" class="txt" /></td>

					</tr>

					<tr>
						<td>
							<!-- パスワードエラーメッセージ再確認してください。 -->
							<s:if test="!#session.reConfirmationNewPasswordErrorMessageList.isEmpty()">
								<div class="error">
									<div class="error-message">
										<s:iterator value="#session.reConfirmationNewPasswordErrorMessageList">
											<s:property />
											<br>
										</s:iterator>
									</div>
								</div>
							</s:if>
						</td>

					</tr>


					<tr>
						<td>
							<!-- 新しいパスワードを間違ったエラーメッセージ。-->
							<s:if test="!#session.newPasswordIncorrectErrorMessageList.isEmpty()">
								<div class="error">
									<div class="error-message">
										<s:iterator value="#session.newPasswordIncorrectErrorMessageList">
											<s:property />
											<br>
										</s:iterator>
									</div>
								</div>
							</s:if>
						</td>
					</tr>




				</table>

				<s:submit value="パスワード再設定" class="submit_btn" />
			</s:form>
		</div>

	</div>

	<jsp:include page="footer.jsp" />

</body>
</html>






