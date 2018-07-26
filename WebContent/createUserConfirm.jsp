<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/createUserConfirm.css">
<jsp:include page="includeHead.jsp" />

<title>登録確認画面</title>

</head>
<body>

	<jsp:include page="header.jsp" />


	<div id="main" class="cf">

		<jsp:include page="navigation.jsp" />

		<div id="contents">

			<h1>
				以下の内容で登録します。<br>よろしければ、登録ボタンを押してください。
			</h1>
			<s:form action="CreateUserCompleteAction">
				<div class="frame">
					<table class="vertical-list-table" accesskey="">
						<tr>
							<th><s:label value="名前" /></th>
						</tr>
						<tr>
							<td><s:property value="familyName" /> <s:property
									value="firstName" /></td>
						</tr>


						<tr>
							<th><s:label value="なまえ" /></th>
						</tr>
						<tr>
							<td><s:property value="familyNameKana" /> <s:property
									value="firstNameKana" /></td>
						</tr>


						<tr>
							<th><s:label value="性別" /></th>
						</tr>
						<tr>
							<td><s:property value="sex" /></td>
						</tr>


						<tr>
							<th colspan="2"><s:label value="メールアドレス" /></th>
						</tr>
						<tr>
							<td colspan="2"><s:property value="email" /></td>
						</tr>


						<tr>
							<th colspan="2"><s:label value="ログインID" /></th>
						</tr>
						<tr>
							<td colspan="2"><s:property value="loginId" /></td>
						</tr>


						<tr>
							<th colspan="2"><s:label value="パスワード" /></th>
						</tr>
						<tr>
							<td colspan="2"><s:property value="password" /></td>
						</tr>
					</table>
				</div>
				<div class="submit_btn_box">
					<div id=".cobntents_btn_set">
						<s:submit value="登録" class="submit_btn" name="success" />
					</div>
				</div>


				<!--   %{●●●}は前ページの情報をそのまま持っていきたい時に使う -->

				<s:hidden name="loginId" value="%{loginId}" />
				<s:hidden name="password" value="%{password}" />
				<s:hidden name="familyName" value="%{familyName}" />
				<s:hidden name="familyNameKana" value="%{familyNameKana}" />
				<s:hidden name="firstName" value="%{firstName}" />
				<s:hidden name="firstNameKana" value="%{firstNameKana}" />
				<s:hidden name="email" value="%{email}" />
				<s:if test='sex.equals("男性")'>
					<s:hidden name="sex" value="0" />
				</s:if>
				<s:if test='sex.equals("女性")'>
					<s:hidden name="sex" value="1" />
				</s:if>
			</s:form>
		</div>

	</div>

	<jsp:include page="footer.jsp" />

</body>
</html>