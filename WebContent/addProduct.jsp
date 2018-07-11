
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<jsp:include page="includeHead.jsp" />
<title>商品追加画面</title>
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
				<h1>商品追加画面</h1>
			</div>
			<!-- 商品追加 -->
			<!-- 修正ボタンで戻ってきた場合、前回入力内容を保持した状態で表示 -->
			<s:if test="#session.containsKey('addProductDTO')">
				<s:form action="AddProductConfirmAction">
				商品ID：<s:textfield name="productId" placeholder="例：100"
						value="%{#session.addProductDTO.productId}" />
					<br>
				商品名：<s:textfield name="productName"
						value="%{#session.addProductDTO.productName}" />
					<br>
				商品かな：<s:textfield name="productNameKana"
						value="%{#session.addProductDTO.productNameKana}"  />
					<br>
				商品詳細：<s:textfield name="productDescription"
						value="%{#session.addProductDTO.productDescription}"  />
					<br>
				カテゴリ：<select name="categoryId">
						<option value="1" selected="selected">動物園</option>
						<option value="2">水族館</option>
						<option value="3">アスレチック</option>
						<option value="4">遊園地</option>
						<option value="5">美術館</option>
					</select>
					<br>
				価格(円)：<s:textfield name="price" value="%{#session.addProductDTO.price}" />
					<br>
				画像ファイル選択（ボタン）<br>
				発売年月：<s:textfield name="releaseDate"
						value="%{#session.addProductDTO.releaseDate}" />
					<br>
				発売会社：<s:textfield name="releaseCompany"
						value="%{#session.addProductDTO.releaseCompany}" />
					<br>
				場所：<s:textfield name="location" value="%{#session.addProductDTO.location}" />
					<br>
				アクセス：<s:textfield name="access" value="%{#session.addProductDTO.access}" />
					<br>
				URL:<s:textfield name="url" value="%{#session.addProductDTO.url}"/>
					<br>
					<s:submit value="確認画面へ" />
				</s:form>
			</s:if>

			<!-- 新規入力 -->
			<s:else>
				<s:form action="AddProductConfirmAction">
				商品ID：<s:textfield name="productId" placeholder="例：100" />
					<br>
				商品名：<s:textfield name="productName" />
					<br>
				商品かな：<s:textfield name="productNameKana"/>
					<br>
				商品詳細：<s:textfield name="productDescription" />
					<br>
				カテゴリ：<select name="categoryId">
						<option value="1" selected="selected">動物園</option>
						<option value="2">水族館</option>
						<option value="3">アスレチック</option>
						<option value="4">遊園地</option>
						<option value="5">美術館</option>
					</select>
					<br>
				価格(円)：<s:textfield name="price"/>
					<br>
				画像ファイル選択：<s:form action="FileUploadAction" method="post"
						enctype="multipart/form-data">
						<s:file name="image"/>
							<s:submit value="アップロード" />
					</s:form>
					<br>
				発売年月：<s:textfield name="releaseDate"/>
					<br>
				発売会社：<s:textfield name="releaseCompany" />
					<br>
				場所：<s:textfield name="location" />
					<br>
				アクセス：<s:textfield name="access" />
					<br>
				URL:<s:textfield name="url" />
					<br>
					<s:submit value="確認画面へ" />
				</s:form>
			</s:else>
			​
			<!-- 商品管理画面に戻る -->
			<s:form action="GoAdminAction">
				<s:submit value="戻る" />
			</s:form>
		</div>
		<div id="footer"></div>
	</div>
</body>
</html>
