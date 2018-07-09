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
</head>
<body>

	<jsp:include page="header.jsp" />

	<div id="main" class="cf">

		<jsp:include page="navigation.jsp" />

		<div id="contents">

			<h1>ログイン画面</h1>
			<s:form id="form" action="LoginAction">
			<p>ログインIDを入力してください。</p>
				<s:if test="!#session.loginFailedMessage.isEmpty()">
					<div class="error">
						<div class="error-message">
							<s:iterator value="#session.loginFailedMessage">
							<s:property />
							<br>
						</s:iterator>
						</div>
					</div>
				</s:if>
				<s:if test="!#session.loginIdErrorMessageList.isEmpty()">
					<div class="error">
						<div class="error-message">
							<s:iterator value="#session.loginIdErrorMessageList">
								<s:property />
								<br>
							</s:iterator>
						</div>
					</div>
				</s:if>
				<s:if test ="#session.savedLoginId == true">
					<s:textfield name="loginId" class="txt"
						placeholder="ログインID" value='%{#session.loginId}'
						autocomplete="off"/>
						<br>
				</s:if>
				<s:else>
					<s:textfield name="loginId" class="txt"
						placeholder="ログインID" autocomplete="off"/>
						<br>
				</s:else>

				<p>パスワードを入力してください。</p>
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
				<s:password name="password" class="txt"
								placeholder="パスワード" autocomplete="off" />
								<br>


				<!--
	SAVED:<s:property value="%{#session.savedLoginId}"/>
	LOGINID:<s:property value="%{#session.loginId}"/>
-->
				<div class="box">
					<s:if test="#session.savedLoginId==true">
						<s:checkbox name="savedLoginId" checked="checked" />
					</s:if>
					<s:else>
						<s:checkbox name="savedLoginId" />
					</s:else>
					<s:label value="ログインID保存" />
					<br>
				</div>
				<div class="submit_btn_box">
					<s:submit value="ログイン" class="submit_btn"
						onclick="goLoginAction();" />
				</div>
			</s:form>
			<br>
			<div class="submit_btn_box">
				<div id=".contents-btn-set">
					<s:form action="CreateUserAction">
						<s:submit value="新規ユーザー登録" class="submit_btn" />
					</s:form>
				</div>
			</div>
			<div class="submit_btn_box">
				<div id=".contents-btn-set">
					<s:form action="ResetPasswordAction">
						<s:submit value="パスワード再設定" class="submit_btn" />
					</s:form>
				</div>
			</div>
		</div>
	</div>


	<s:include value="footer.jsp" />
</body>
</html>