<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>管理者画面</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="main" class="cf">

		<jsp:include page="navigation.jsp" />

		<div id="contents">
			<h1>管理者画面</h1>
		<!-- 商品管理画面へ。 -->
			<s:form action="AdminItemAction">
				<s:submit value="商品管理" />
			</s:form>
		<!-- カテゴリ管理画面へ。 -->
			<s:form action="AdminCategoryAction">
				<s:submit value="カテゴリ管理" />
			</s:form>
		<!-- 場所管理画面へ。 -->
			<s:form action="AdminPlaceAction">
				<s:submit value="場所管理" />
			</s:form>
		<!-- ユーザー管理画面へ。 -->
			<s:form action="AdminUserAction">
				<s:submit value="ユーザー管理" />
			</s:form>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>



