<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<jsp:include page="includeHead.jsp" />

<title>パスワード再設定</title>
</head>
<body>
	<jsp:include page="header.jsp" />

	<div id="main" class="cf">

		<jsp:include page="navigation.jsp" />

		<div id="contents">

	<h1>パスワード再設定画面</h1>

	<!-- ログインIDエラーメッセージ -->

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

	<!--パスワードエラーメッセージ一覧。 空です -->

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

	<!-- パスワードが間違っているエラーメッセージ。空です -->

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

	<!-- 新しいパスワードエラーメッセージ。空です -->

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

	<!-- パスワードエラーメッセージ再確認してください。空です。 -->

	<s:if test="!#session.reConfirmPasswordErrorMessageList.isEmpty()">
		<div class="error">
			<div class="error-message">
				<s:iterator value="#session.reConfirmPasswordErrorMessageList">
					<s:property />
					<br>
				</s:iterator>
			</div>
		</div>
	</s:if>

	<!-- 新しいパスワードを間違ったエラーメッセージ。 空です -->

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





	<s:form action="ResetPasswordConfirmAction">
		<table class="vertical-list-table">
			<tr>
				<th scope="row"><s:label value="ログインID" /></th>
				<td><s:textfield name="loginId" placeholder="ログインID"
						class="txt" /></td>
			</tr>
			<tr>
				<th scope="row"><s:label value="現在のパスワード" /></th>
				<td><s:password name="password" placeholder="現在のパスワード"
						class="txt" /></td>
			</tr>
			<tr>
				<th scope="row"><s:label value="新しいパスワード" /></th>
				<td><s:password name="newPassword" placeholder="新しいパスワード"
						class="txt" /></td>
			<tr>
				<th scope="row"><s:label value="(再確認用)" /></th>
				<td><s:password name="reConfirmationPassword"
						placeholder="新しいパスワード(再確認用)" class="txt" /></td>

			</tr>
		</table>

		<s:submit value="パスワード再設定" class="submit_btn" />
	</s:form>
</div>

	</div>

	<jsp:include page="footer.jsp" />

</body>
</html>

<!-- 中山 7/4 -->