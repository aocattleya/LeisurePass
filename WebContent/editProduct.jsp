
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
	<div id="main">
​
		<div id="admin-contents">
			<div>
				<h1>商品編集画面</h1>
			</div>
<!-- 商品編集 -->
			<s:form action="AddProductConfirmAction"  method="post" enctype="multipart/form-data">
				商品ID：<s:textfield name="productId" placeholder="例：100"
						value="%{#session.editProductDTO.productId}" />
					<br>
				商品名：<s:textfield name="productName"
						value="%{#session.editProductDTO.productName}" />
					<br>
				商品かな：<s:textfield name="productNameKana"
						value="%{#session.editProductDTO.productNameKana}"  />
					<br>
				商品詳細：<s:textfield name="productDescription"
						value="%{#session.editProductDTO.productDescription}"  />
					<br>
				カテゴリ：<select name="categoryId">
						<option value="2" selected="selected">動物園</option>
						<option value="3">水族館</option>
						<option value="4">アスレチック</option>
						<option value="5">遊園地</option>
						<option value="6">美術館</option>
					</select>
					<br>
				場所：<select name="placeId">
						<option value="2" selected="selected">茨城県</option>
						<option value="3">栃木県</option>
						<option value="4">群馬県</option>
						<option value="5">千葉県</option>
						<option value="6">埼玉県</option>
						<option value="7">東京都</option>
						<option value="8">神奈川県</option>
					</select>
					<br>
				価格(円)：<s:textfield name="price" value="%{#session.editProductDTO.price}" />
					<br>
				画像ファイル選択：<s:file name="productImage" />
					<br>
				発売年月：<s:textfield name="releaseDate"
						value="%{#session.editProductDTO.releaseDateString}" />
					<br>
				発売会社：<s:textfield name="releaseCompany"
						value="%{#session.editProductDTO.releaseCompany}" />
					<br>
				所在地：<s:textfield name="location" value="%{#session.editProductDTO.location}" />
					<br>
				アクセス：<s:textfield name="access" value="%{#session.editProductDTO.access}" />
					<br>
				URL：<s:textfield name="url" value="%{#session.editProductDTO.url}"/>
					<br>
				開始日：<s:textfield name="startDate" value="%{#session.editProductDTO.startDateString}"/>
					<br>
				終了日：<s:textfield name="endDate" value="%{#session.editProductDTO.endDateString}"/>
					<br>
					<s:submit value="確認画面へ" />
				</s:form>
		</div>
		<div id="footer"></div>
	</div>
</body>
</html>
