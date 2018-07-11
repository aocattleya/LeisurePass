
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<jsp:include page="includeHead.jsp" />
<title>商品追加確認画面</title>
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
				<h1>商品追加確認画面</h1>
			</div>
			<!-- 商品追加 -->
			<s:form action="AddProductConfirmAction">
				商品ID：<s:property value="%{#session.addProductDTO.productId}"/>
				<br>
				商品名：<s:property value="%{#session.addProductDTO.productName}"/>
				<br>
				商品かな：<s:property value="%{#session.addProductDTO.productNameKana}"/>
				<br>
				商品詳細：<s:property value="%{#session.addProductDTO.productDescription}"/>
				<br>
				カテゴリ：<s:if test= "%{#session.addProductDTO.categoryId == 1}" >動物園</s:if>
					<s:elseif test= "%{#session.addProductDTO.categoryId == 2}" >水族館</s:elseif>
					<s:elseif test= "%{#session.addProductDTO.categoryId == 3}" >アスレチック</s:elseif>
					<s:elseif test= "%{#session.addProductDTO.categoryId == 4}" >遊園地</s:elseif>
					<s:elseif test= "%{#session.addProductDTO.categoryId == 5}" >美術館</s:elseif>
				<br>
				価格：<s:property value="%{#session.addProductDTO.price}"/>
				<br>
				画像ファイル選択（ボタン）<br>
				発売年月：<s:property value="%{#session.addProductDTO.releaseDate}"/>
				<br>
				発売会社：<s:property value="%{#session.addProductDTO.releaseCompany}"/>
				<br>
				場所：<s:property value="%{#session.addProductDTO.location}"/>
				<br>
				アクセス：<s:property value="%{#session.addProductDTO.access}"/>
				<br>
				URL：<s:property value="%{#session.addProductDTO.url}"/>
			</s:form>
​
			<!-- 商品追加を確定する -->
			<s:form action="AddProductCompleteAction">
				<s:submit value="決定" />
			</s:form>
			<!-- 商品管理画面に戻る -->
			<s:form action="AddProductAction">
				<s:submit value="修正" />
			</s:form>
		</div>
		<div id="footer"></div>
	</div>
</body>
</html>
