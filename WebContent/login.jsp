<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<jsp:include page="includeHead.jsp" />
<title>ログイン画面</title>
<style type="text/css">

body {
	width: 100%;
	font-family: 'メイリオ', sans-serif;
	font-size: 18px;
}

#contents {
	text-align: center;
	float: left;
	width: 1344px;
}

/*ボタンのCSS*/
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

#createUser {
	color: #ed7d22;
	letter-spacing: 2px;
}

#resetPassword {
	color: #aaaaaa;
}

.vertical-list-table {
	display: inline;
}

.txt {
	width: 450px;
	height: 40px;
	font-size: 18px;
	background-color: #f7f7f7;
	border-radius: 5px;
}

.txt::-webkit-input-placeholder {
	color: #aaaaaa;
}

.txt::-moz-placeholder {
	color: #aaaaaa;
}

.txt:-ms-input-placeholder {
	color: #aaaaaa;
}

.box {
	padding-right: 400px;
}

.error {
	text-align: left;
}

.error-message {
	color: #ed7d22;
	font-size: 14px;
}
</style>
</head>
<body>

	<jsp:include page="header.jsp" />

	<div id="main" class="cf">

		<jsp:include page="navigation.jsp" />

		<div id="contents">

			<s:form id="form" action="LoginAction">
				<table class="vertical-list-table">
					<tr>
						<th>ログインID</th>
					</tr>
					<tr>
						<td><s:if test="#session.savedLoginId == true">
								<s:textfield name="loginId" class="txt" placeholder="ログインIDを入力"
									value='%{#session.keepLoginId}' autocomplete="off" size="30" />
								<br>
							</s:if> <s:else>
								<s:textfield name="loginId" class="txt" placeholder="ログインIDを入力"
									autocomplete="off" size="30" />
								<br>
							</s:else></td>
					</tr>
					<tr>
						<td><s:if test="!#session.loginFailedMessage.isEmpty()">
								<div class="error">
									<div class="error-message">
										<s:iterator value="#session.loginFailedMessage">
											<s:property />
											<br>
										</s:iterator>
									</div>
								</div>
							</s:if></td>
					</tr>
					<tr>
						<td><s:if test="!#session.loginIdErrorMessageList.isEmpty()">
								<div class="error">
									<div class="error-message">
										<s:iterator value="#session.loginIdErrorMessageList">
											<s:property />
											<br>
										</s:iterator>
									</div>
								</div>
							</s:if></td>
					</tr>
					<tr>
						<td><p></p></td>
					</tr>
					<tr>
						<th>パスワード</th>
					</tr>
					<tr>
						<td><s:password name="password" class="txt"
								placeholder="パスワードを入力（8文字以上）" autocomplete="off" size="30" /><br></td>
					</tr>
					<tr>
						<td><s:if test="!#session.passwordErrorMessageList.isEmpty()">
								<div class="error">
									<div class="error-message">
										<s:iterator value="#session.passwordErrorMessageList">
											<s:property />
											<br>
										</s:iterator>
									</div>
								</div>
							</s:if></td>
					</tr>
					<tr>
						<td><p></p></td>
					</tr>
				</table>


				<!--
	SAVED:<s:property value="%{#session.savedLoginId}"/>
	LOGINID:<s:property value="%{#session.loginId}"/>
-->
				<div class="box">
					<s:if test="#session.savedLoginId==true">
						<label><s:checkbox name="savedLoginId" checked="checked" />ID保存</label>
					</s:if>
					<s:else>
						<label><s:checkbox name="savedLoginId" />ID保存</label>
					</s:else>
				</div>
				<div class="submit_btn_box">
					<p>
						<s:submit value="ログイン" class="submit_btn" />
					</p>
				</div>
			</s:form>
			<p>
				<a href='<s:url action="CreateUserAction"/>' id="createUser">新規登録</a>
			</p>
			<p>
				<a href='<s:url action="ResetPasswordAction"/>' id="resetPassword">パスワードの再設定</a>
			</p>
		</div>
	</div>


	<s:include value="footer.jsp" />
</body>
</html>