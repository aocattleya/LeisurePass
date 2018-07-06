<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>登録内容確認</title>
</head>
<body>
	<!--  <jsp:include page="header.jsp"/> -->
	<div id="contents">
		<h1>登録内容画面</h1>
		<s:form action="CreateUserCompleteAction">
			<table class="vertical-list-table" accesskey="">
				<tr>
					<th scope="row"><s:label value="姓" /></th>
					<td><s:property value="familyName" /></td>
				</tr>
				<tr>
					<th scope="row"><s:label value="名" /></th>
					<td><s:property value="firstName" /></td>
				</tr>
				<tr>
					<th scope="row"><s:label value="姓ふりがな" /></th>
					<td><s:property value="familyNameKana" /></td>
				</tr>
				<tr>
					<th scope="row"><s:label value="名ふりがな" /></th>
					<td><s:property value="firstNameKana" /></td>
				</tr>
				<tr>
					<th scope="row"><s:label value="性別" /></th>
					<td><s:property value="sex" /></td>
				</tr>
				<tr>
					<th scope="row"><s:label value="メールアドレス" /></th>
					<td><s:property value="email" /></td>
				</tr>
				<tr>
					<th scope="row"><s:label value="ログインID" /></th>
					<td><s:property value="loginId" /></td>
				</tr>
				<tr>
					<th scope="row"><s:label value="パスワード" /></th>
					<td><s:property value="password" /></td>
				</tr>
			</table>
			<div class="submit_btn_box">
				<div id=".cobntents_btn_set">
					<s:submit value="登録" class="submit_btn" />
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
			<s:if test='sex.equals("男性")'>;
<s:hidden name="sex" value="0" />
			</s:if>
			<s:if test='sex.equals("女性")'>;
<s:hidden name="sex" value="1" />
			</s:if>
		</s:form>
	</div>

	<div id="footer">
		<s:include value="footer.jsp" />
	</div>

</body>
</html>