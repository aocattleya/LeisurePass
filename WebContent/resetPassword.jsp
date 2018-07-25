<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/resetPassword.css">
<jsp:include page="includeHead.jsp" />


<title>パスワード再設定</title>
</head>
<body>
	<jsp:include page="header.jsp" />

	<div id="main" class="cf">

		<jsp:include page="navigation.jsp" />

		<div id="contents">


			<h1>パスワード再設定</h1>


			<s:form action="ResetPasswordConfirmAction">
				<table class="vertical-list-table">


					<tr>
						<th scope="row"><s:label value="ログインID" /></th>
					</tr>
					<tr>
						<td><s:textfield name="loginId" placeholder="ログインIDを入力"
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
						<td><s:password name="password" placeholder="現在のパスワードを入力"
								class="txt" /></td>
					</tr>
					<tr>
						<td>
							<!--パスワードエラーメッセージ一覧。--> <s:if
								test="!#session.passwordErrorMessageList.isEmpty()">
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
							<!-- パスワードが間違っているエラーメッセージ。--> <s:if
								test="!#session.passwordIncorrectErrorMessageList.isEmpty()">
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
						<td><s:password name="newPassword" placeholder="新しいパスワードを入力"
								class="txt" /></td>
					</tr>

					<tr>
						<td>
							<!-- 新しいパスワードエラーメッセージ。 --> <s:if
								test="!#session.newPasswordErrorMessageList.isEmpty()">
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
						<th scope="row"><s:label value="再確認用" /></th>
					</tr>
					<tr>
						<td><s:password name="reConfirmationPassword"
								placeholder="新しいパスワード(再確認用)を入力" class="txt" /></td>

					</tr>

					<tr>
						<td>
							<!-- パスワードエラーメッセージ再確認してください。 --> <s:if
								test="%{#session.containsKey('reConfirmationNewPasswordErrorMessage')}">
								<div class="error">
									<div class="error-message">
										<s:property
											value="%{#session.reConfirmationNewPasswordErrorMessage}" />
									</div>
								</div>
							</s:if>
						</td>

					</tr>


					<tr>
						<td>
							<!-- 新しいパスワードを間違ったエラーメッセージ。--> <s:if
								test="!#session.newPasswordIncorrectErrorMessageList.isEmpty()">
								<div class="error">
									<div class="error-message">
										<s:iterator
											value="#session.newPasswordIncorrectErrorMessageList">
											<s:property />
											<br>
										</s:iterator>
									</div>
								</div>
							</s:if>
						</td>
					</tr>




				</table>
				<br>

				<s:submit value="確認" class="submit_btn" />
			</s:form>
		</div>

	</div>

	<jsp:include page="footer.jsp" />

</body>
</html>






