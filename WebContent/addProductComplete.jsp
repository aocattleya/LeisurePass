
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<jsp:include page="includeHead.jsp" />
<title>商品追加完了画面</title>
</head>
<body>
	<jsp:include page="header.jsp" />
​
	<div id="main">
​​
		<div id="admin-contents">
			<div>
				<h1>商品追加完了画面</h1>
			</div>
			<!-- 商品追加 -->
			<s:form action="AddProductConfirmAction">
				商品ID：<s:property value="%{#session.addProductDTO.productId}"/>
				<br>
				商品名：<s:property value="%{#session.addProductDTO.productName}"/>
				<br>
				商品かな：<s:property value="%{#session.addProductDTO.productNameKana}"/>
				<br>
				商品詳細：<s:property value="%{#session.addProductDTO.productDescription"/>
				<br>
				<%-- カテゴリ：<s:property value=""/>
					<option value="1" selected="selected">動物園</option>
					<option value="2">水族館</option>
					<option value="3">アスレチック</option>
					<option value="4">遊園地</option>
					<option value="5">美術館</option>
				</select>
				<br> --%>
				価格：<s:property value="%{#session.addProductDTO.price}"/>
				<br>
				画像ファイル選択（ボタン）<br>
				発売年月：<s:property value="%{#session.addProductDTO.releaseDate}"/>
				<br>
				発売会社：<s:property value="%{#session.addProductDTO.releaseCompany}"/>
				<br>
			</s:form>
​
			<!-- 商品管理画面に戻る -->
			<s:form action="AdminProductAction">
				<s:submit value="商品管理画面に戻る" />
			</s:form>
		</div>
		<div id="footer"></div>
	</div>
</body>
</html>
