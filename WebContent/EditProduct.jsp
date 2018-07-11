
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<jsp:include page="includeHead.jsp" />
<title>商品編集・削除画面</title>
</head>
<body>
	<jsp:include page="header.jsp" />
​
	<div id="main" class="cf">
​
		<jsp:include page="navigation.jsp" />
​
		<div id="contents">
			<div>
				<h1>商品編集・削除画面</h1>
			</div>
			<!-- 商品編集 -->
			<!-- 修正ボタンで戻ってきた場合、前回入力内容を保持した状態で表示 -->

			<!-- 新規入力 -->
			商品ID：<s:textfield name="productId" placeholder="例：100" label="商品ID" />
				<br>
​			<!-- 商品削除 -->
			<s:form action="DeleteProductConfirmAction">
				<s:submit value="削除" />
			</s:form>
			<!-- 商品管理画面に戻る -->
			<s:form action="GoAdminAction">
				<s:submit value="戻る" />
			</s:form>
		</div>
		<div id="footer"></div>
	</div>
</body>
</html>
