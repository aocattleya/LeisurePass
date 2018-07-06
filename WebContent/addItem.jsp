
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>商品追加画面</title>
</head>
<body>
	<jsp:include page="header.jsp" />

	<div id="main" class="cf">

		<jsp:include page="navigation.jsp" />

		<div id="contents">
			<div>
				<h1>商品追加画面</h1>
			</div>
			<!-- 商品追加 -->
			<s:form action="AddItemConfirmAction">
				<s:textfield name="productId" label="商品ID"/><br>
				<s:textfield name="productName" label="商品名"/><br>
				<s:textfield name="productNameKana" label="商品かな"/><br>
				<s:textfield name="productDescription" label="商品詳細" /><br>
				カテゴリID(ドロップダウンリスト)<br>
				<s:textfield name="price" label="価格" /><br>
				画像ファイル選択（ボタン）<br>
				<s:textfield name="releaseDate" label="発売年月" /><br>
				<s:textfield name="releaseCompany" label="発売会社" /><br>
				<s:submit value ="確認画面へ"/><br>
			</s:form>

			<!-- 商品管理画面に戻る -->
			<s:form action="GoAdminAction">
				<s:submit value ="戻る"/>
			</s:form>
		</div>
		<div id="footer">
		</div>
	</div>
</body>
</html>