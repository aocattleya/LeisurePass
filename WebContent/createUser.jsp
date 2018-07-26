<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/createUser.css">
<jsp:include page="includeHead.jsp" />
<title>ユーザー情報入力</title>
<link rel="stylesheet" type="text/css" href="./css/createUser.css">
</head>
<body>

	<jsp:include page="header.jsp" />

	<div id="main" class="cf">

		<jsp:include page="navigation.jsp" />

		<div id="contents">

			<h1>ユーザー情報入力</h1>

			<s:form action="CreateUserConfirmAction">
				<div class="createUsercontents">
					<table class="vertical-list-table">

						<tr>
							<th colspan="2">名前</th>
						</tr>
						<tr>
							<td><s:textfield placeholder="姓を入力" name="familyName"
									class="txt" value="%{session.familyName}" /></td>
							<td><s:textfield placeholder="名を入力" name="firstName"
									class="txt" value="%{session.firstName}" /></td>
						</tr>
						<tr>
							<td><s:if
									test="!#session.familyNameErrorMessageList.isEmpty()">
									<div class="error">
										<div class="error-message">

											<s:iterator value="#session.familyNameErrorMessageList">
												<s:property />
												<br>
											</s:iterator>
										</div>
									</div>
								</s:if></td>
							<td><s:if
									test="!#session.firstNameErrorMessageList.isEmpty()">
									<div class="error">
										<div class="error-message">
											<s:iterator value="#session.firstNameErrorMessageList">
												<s:property />
												<br>
											</s:iterator>
										</div>
									</div>
								</s:if></td>
						</tr>










						<tr>
							<th colspan="2">なまえ</th>
						</tr>
						<tr>
							<td><s:textfield placeholder="姓(ふりがな)を入力"
									name="familyNameKana" class="txt"
									value="%{session.familyNameKana}" /></td>
							<td><s:textfield placeholder="名(ふりがな)を入力"
									name="firstNameKana" class="txt"
									value="%{session.firstNameKana}" /></td>
						</tr>
						<tr>
							<td><s:if
									test="!#session.familyNameKanaErrorMessageList.isEmpty()">
									<div class="error">
										<div class="error-message">
											<s:iterator value="#session.familyNameKanaErrorMessageList">
												<s:property />
												<br>
											</s:iterator>
										</div>
									</div>
								</s:if></td>
							<td><s:if
									test="!#session.firstNameKanaErrorMessageList.isEmpty()">
									<div class="error">
										<div class="error-message">
											<s:iterator value="#session.firstNameKanaErrorMessageList">
												<s:property />
												<br>
											</s:iterator>
										</div>
									</div>
								</s:if></td>

						</tr>










						<tr>
							<th colspan="2">性別</th>
						</tr>
						<tr>
							<td colspan="2"><s:radio list="%{#session.sexList}"
									name="sex" value="%{#session.sex}" label="性別" placeholder="性別" /></td>
						</tr>











						<tr>
							<th colspan="2">メールアドレス</th>
						</tr>
						<tr>
							<td colspan="2"><s:textfield name="email"
									value="%{session.email}" lebel="メールアドレス"
									placeholder="メールアドレスを入力" class="txt2" /></td>

						</tr>
						<tr>

							<td colspan="2"><s:if
									test="!#session.emailErrorMessageList.isEmpty()">
									<div class="error">
										<div class="error-message">
											<s:iterator value="#session.emailErrorMessageList">
												<s:property />
												<br>
											</s:iterator>
										</div>
									</div>
								</s:if></td>
						</tr>










						<tr>
							<th colspan="2">ログインID</th>
						</tr>
						<tr>
							<td colspan="2"><s:textfield name="loginId"
									value="%{session.loginId}" lebel="ログインID"
									placeholder="ログインIDを入力" class="txt2" /></td>
						</tr>
						<tr>

							<td colspan="2"><s:if
									test="!#session.loginIdErrorMessageList.isEmpty()">
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

							<td colspan="2"><s:if
									test="#session.containsKey('existLoginIdErrorMessage')">
									<div class="error">
										<div class="error-message">
											<s:property value="#session.existLoginIdErrorMessage" />
											<br>
										</div>
									</div>
								</s:if></td>



						</tr>









						<tr>
							<th colspan="2">パスワード</th>
						</tr>
						<tr>
							<td colspan="2"><s:password name="password"
									value="%{session.password}" lebel="パスワード"
									placeholder="パスワードを入力" class="txt2" /></td>
						</tr>
						<tr>


							<td colspan="2"><s:if
									test="!#session.passwordErrorMessageList.isEmpty()">
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


					</table>
					<div class="submit_btn_box">
						<div class=".contents-btn-set">
							<s:submit value="内容確認" class="submit_btn" />
						</div>
					</div>
				</div>
			</s:form>
		</div>
	</div>

	<jsp:include page="footer.jsp" />

</body>
</html>