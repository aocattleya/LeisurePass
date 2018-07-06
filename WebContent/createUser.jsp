<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">

<title>ユーザー情報入力</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>





	<div id="contents">
		<h1>ユーザー情報入力画面</h1>

		<s:if test="!#session.familyNameErrorMessageList.isEmpty()">
			<div class="error">
				<div class="error-message">
					<s:iterator value="#session.familyNameKanaErrorMessageList">
						<s:property />
						<br>
					</s:iterator>
				</div>
			</div>
		</s:if>


		<s:if test="!#session.firstNameErrorMessageList.isEmpty()">
			<div class="error">
				<div class="error-message">
					<s:iterator value="#session.firstNameKanaErrorMessageList">
						<s:property />
						<br>
					</s:iterator>
				</div>
			</div>
		</s:if>

		<s:if test="!#session.familyNameKanaErrorMessageList.isEmpty()">
			<div class="error">
				<div class="error-message">
					<s:iterator value="#session.firstNameKanaErrorMessageList">
						<s:property />
						<br>
					</s:iterator>
				</div>
			</div>
		</s:if>

		<s:if test="!#session.firstNameKanaErrorMessageList.isEmpty()">
			<div class="error">
				<div class="error-message">
					<s:iterator value="#session.firstNameKanaErrorMessageList">
						<s:property />
						<br>
					</s:iterator>
				</div>
			</div>
		</s:if>

		<s:if test="!#session.emailErrorMessageList.isEmpty()">
			<div class="error">
				<div class="error-message">
					<s:iterator value="#session.emailErrorMessageList">
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

		<s:form action="CreateUserConfirmAction">

			<table class="vertical-list-table">

				<tr>
					<th scope="row">姓</th>
					<td><s:textfield name="familyName"
							value="%{session.familyName}" lebel="姓" placeholder="姓"
							class="txt" /></td>
				</tr>

				<tr>
					<th scope="row">名</th>
					<td><s:textfield name="firstName"
							value="%{session.familyName}" lebel="名" placeholder="名"
							class="txt" /></td>
				</tr>

				<tr>
					<th scope="row">姓ふりがな</th>
					<td><s:textfield name="familyNameKana"
							value="%{session.familyNameKana}" lebel="姓ふりがな"
							placeholder="姓ふりがな" class="txt" /></td>
				</tr>

				<tr>
					<th scope="row">名ふりがな</th>
					<td><s:textfield name="firstNameKana"
							value="%{session.familyNameKana}" lebel="名ふりがな"
							placeholder="名ふりがな" class="txt" /></td>
				</tr>

				<tr>
					<th scope="row">性別</th>
					<td><s:radio list="%{#session.sexList}" name="sex"
							value="%{#session.sex}" label="性別" placeholder="性別" /></td>
				</tr>

				<tr>
					<th scope="row">メールアドレス</th>
					<td><s:textfield name="email" value="%{session.email}"
							lebel="メールアドレス" placeholder="メールアドレス" class="txt" /></td>
				</tr>

				<tr>
					<th scope="row">ログインID</th>
					<td><s:textfield name="loginId" value="%{session.loginId}"
							lebel="ログインID" placeholder="ログインID" class="txt" /></td>
				</tr>

				<tr>
					<th scope="row">パスワード</th>
					<td><s:textfield name="password" value="%{session.password}"
							lebel="パスワード" placeholder="パスワード" class="txt" /></td>
				</tr>
			</table>
			<div class="submit_btn_box">
				<div class=".contents-btn-set">
					<s:submit value="登録" class="submit_btn" />
				</div>
			</div>
		</s:form>
	</div>
	<div id="footer">
		<s:include value="footer.jsp" />
	</div>

</body>
</html>