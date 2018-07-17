<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<jsp:include page="includeHead.jsp" />
<title>商品削除確認画面</title>
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
				<h1>商品削除確認画面</h1>
			</div>

				商品ID：<s:property value="%{#session.deleteProductDTO.productId}" />
					<br>
				商品名：<s:property value="%{#session.deleteProductDTO.productName}" />
					<br>
				商品かな：<s:property value="%{#session.deleteProductDTO.productNameKana}"  />
					<br>
				商品詳細：<s:property value="%{#session.deleteProductDTO.productDescription}"  />
					<br>
				カテゴリ：<s:if test= "%{#session.deleteProductDTO.categoryId == 2}" >動物園</s:if>
					<s:elseif test= "%{#session.deleteProductDTO.categoryId == 3}" >水族館</s:elseif>
					<s:elseif test= "%{#session.deleteProductDTO.categoryId == 4}" >アスレチック</s:elseif>
					<s:elseif test= "%{#session.deleteProductDTO.categoryId == 5}" >遊園地</s:elseif>
					<s:elseif test= "%{#session.deleteProductDTO.categoryId == 6}" >美術館</s:elseif>
				<br>
				場所：<s:if test= "%{#session.deleteProductDTO.placeId == 2}" >茨城県</s:if>
					<s:elseif test= "%{#session.deleteProductDTO.placeId == 3}" >栃木県</s:elseif>
					<s:elseif test= "%{#session.deleteProductDTO.placeId == 4}" >群馬県</s:elseif>
					<s:elseif test= "%{#session.deleteProductDTO.placeId == 5}" >千葉県</s:elseif>
					<s:elseif test= "%{#session.deleteProductDTO.placeId == 6}" >埼玉県</s:elseif>
					<s:elseif test= "%{#session.deleteProductDTO.placeId == 7}" >東京都</s:elseif>
					<s:elseif test= "%{#session.deleteProductDTO.placeId == 8}" >神奈川県</s:elseif>
				<br>
				価格(円)：<s:property value="%{#session.deleteProductDTO.price}" />
					<br>
				画像ファイル選択：<s:file name="productImage" />
					<br>
				発売年月：<s:property value="%{#session.deleteProductDTO.releaseDate}" />
					<br>
				発売会社：<s:property value="%{#session.deleteProductDTO.releaseCompany}" />
					<br>
				所在地：<s:property value="%{#session.deleteProductDTO.location}" />
					<br>
				アクセス：<s:property value="%{#session.deleteProductDTO.access}" />
					<br>
				URL：<s:property value="%{#session.deleteProductDTO.url}"/>
					<br>
				開始日：<s:property value="%{#session.deleteProductDTO.startDate}"/>
					<br>
				終了日：<s:property value="%{#session.deleteProductDTO.endDate}"/>
					<br>

			<!-- 商品削除を確定する -->
			<s:form action="DeleteProductCompleteAction">
				<s:submit value="決定" />
			</s:form>
			<!-- 商品管理画面に戻る -->
			<s:form action="AdminProductAction">
				<s:submit value="戻る" />
			</s:form>
		</div>
		<div id="footer"></div>
	</div>
</body>
</html>
