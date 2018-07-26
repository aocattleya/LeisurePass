<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/login.css">
<jsp:include page="includeHead.jsp" />
<title>ログイン画面</title>
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
								<s:password name="dummypass" style="visibility: hidden; width: 0px;"/>
								<s:textfield name="loginId" class="txt" placeholder="ログインIDを入力"
									value='%{#session.keepLoginId}' autocomplete="off" size="30" />
								<br>
							</s:if> <s:else>
								<s:password name="dummypass" style="visibility: hidden; width: 0px;"/>
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
								placeholder="パスワードを入力" autocomplete="off" size="30" /><br></td>
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