<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<jsp:include page="includeHead.jsp" />
<title>宛先情報確認</title>
</head>
<body>
<jsp:include page="header.jsp" />

	<div id="main" class="cf">

		<jsp:include page="navigation.jsp" />

		<div id="contents">
		<h1>宛先情報確認画面</h1>
		<s:form action="CreateDestinationCompleteAction">
			<table class="vertical-list-table">
				<tr>
					<th scope="row"><s:label value="姓" /></th>
					<td><s:property value="familyName" />
						<s:hidden name="familyName" value="%{familyName}" /></td>
				</tr>

				<tr>
					<th scope="row"><s:label value="名" /></th>
					<td><s:property value="firstName" />
						<s:hidden name="firstName" value="%{firstName}" /></td>
				</tr>

				<tr>
					<th scope="row"><s:label value="姓ふりがな" /></th>
					<td><s:property value="familyNameKana" />
						<s:hidden name="familyNameKana" value="%{familyNameKana}" /></td>

				</tr>

				<tr>
					<th scope="row"><s:label value="名ふりがな" /></th>
					<td><s:property value="firstNameKana" />
						<s:hidden name="firstNameKana" value="%{firstNameKana}" /></td>
				</tr>

				<tr>
					<th scope="row"><s:label value="性別" /></th>
					<td><s:property value="sex" />
						<s:hidden name="sex" value="%{sex}" /></td>
				</tr>

				<tr>
					<th scope="row"><s:label value="住所" /></th>
					<td><s:property value="userAddress" />
						<s:hidden name="userAddress" value="%{userAddress}" /></td>
				</tr>

				<tr>
					<th scope="row"><s:label value="電話番号" /></th>
					<td><s:property value="telNumber" />
						<s:hidden name="telNumber" value="%{telNumber}" /></td>
				</tr>

				<tr>
					<th scope="row"><s:label value="メールアドレス" /></th>
					<td><s:property value="email" />
						<s:hidden name="email" value="%{email}" /></td>
				</tr>
			</table>
			<div class="submit_btn_box">
				<div id=".contents-btn-set">
					<s:submit value="宛先情報登録" class="submit_btn" />
				</div>
			</div>
		</s:form>
	</div>
	</div>



	<jsp:include page="footer.jsp" />
</body>
</html>