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
			<h1>商品管理画面</h1>

		<!-- 商品編集画面へ。 -->
			<s:form action="EditItemAction">
				<s:submit value="編集" />
			</s:form>


		<!-- 商品追加画面へ。 -->
			<s:form action="AddItemAction">
				<s:submit value="追加" />
			</s:form>
		<!-- 商品削除確認画面へ。 -->
			<s:form action="DeleteConfirmAction">
				<s:submit value="削除" />
			</s:form>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>



