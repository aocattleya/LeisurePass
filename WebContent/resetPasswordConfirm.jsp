<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<jsp:include page="includeHead.jsp" />

<title>パスワード再設定確認</title>
</head>
<body>
<jsp:include page="header.jsp" />

	<div id="main" class="cf">

		<jsp:include page="navigation.jsp" />

		<div id="contents">

		<h1>パスワード再設定確認画面</h1>
		<s:form action = "ResetPasswordCompleteAction">
		<s:property value="#session.loginId"/>
		<br>
		<s:property value="#session.concealedPassword"/>
		<br>
		<s:submit value="再設定" class="submit_btn"/>

		</s:form>

</div>

	</div>

	<jsp:include page="footer.jsp" />

</body>

</html>

<!-- 中山 7/4 -->