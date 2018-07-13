
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<jsp:include page="includeHead.jsp" />
<title>商品編集画面</title>
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
				<h1>商品編集画面</h1>
			</div>
			<!-- 商品編集 -->

				商品ID：<s:textfield name=“productId” placeholder=“例：100”
						value=“%{#session.editProductDTO.productId}” />
					<br>
				商品名：<s:textfield name=“productName”
						value=“%{#session.editProductDTO.productName}” />
					<br>
				商品かな：<s:textfield name=“productNameKana”
						value=“%{#session.editProductDTO.productNameKana}”  />
					<br>
				商品詳細：<s:textfield name=“productDescription”
						value=“%{#session.editProductDTO.productDescription}”  />
					<br>
				カテゴリ：<select name=“categoryId”>
						<option value=“1" selected=“selected”>動物園</option>
						<option value=“2">水族館</option>
						<option value=“3”>アスレチック</option>
						<option value=“4">遊園地</option>
						<option value=“5”>美術館</option>
					</select>
					<br>
				価格(円)：<s:textfield name=“price” value=“%{#session.editProductDTO.price}” />
					<br>
				画像ファイル選択（ボタン）<br>
				発売年月：<s:textfield name=“releaseDate”
						value=“%{#session.editProductDTO.releaseDate}” />
					<br>
				発売会社：<s:textfield name=“releaseCompany”
						value=“%{#session.editProductDTO.releaseCompany}” />
					<br>
				場所：<s:textfield name=“location” value=“%{#session.editProductDTO.location}” />
					<br>
				アクセス：<s:textfield name=“access” value=“%{#session.editProductDTO.access}” />
					<br>
				URL：<s:textfield name=“url” value=“%{#session.editProductDTO.url}“/>
					<br>
				開始年月：<s:textfield name=“startDate”/>
					<br>
				終了年月：<s:textfield name=“endDate”/>
					<br>
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
