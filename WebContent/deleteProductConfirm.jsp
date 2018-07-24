<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/deleteProductonfirm.css">
<jsp:include page="includeHead.jsp" />
<title>商品削除確認画面</title>
</head>
<body>
	<jsp:include page="header.jsp" />
​
<div id="main">
	<h1>商品削除確認画面</h1>
	<div class="infoBox">
		<div class="info-title">商品ID</div><br><s:property value="%{#session.deleteProductDTO.productId}" />
			<br>
		<div class="info-title">商品名</div><br><s:property value="%{#session.deleteProductDTO.productName}" />
			<br>
		<div class="info-title">商品かな</div><br><s:property value="%{#session.deleteProductDTO.productNameKana}"  />
			<br>
		<div class="info-title">商品詳細</div><br><s:property value="%{#session.deleteProductDTO.productDescription}"  />
			<br>
		<div class="info-title">カテゴリ</div><br>
			<s:if test= "%{#session.deleteProductDTO.categoryId == 2}" >動物園</s:if>
			<s:elseif test= "%{#session.deleteProductDTO.categoryId == 3}" >水族館</s:elseif>
			<s:elseif test= "%{#session.deleteProductDTO.categoryId == 4}" >アスレチック</s:elseif>
			<s:elseif test= "%{#session.deleteProductDTO.categoryId == 5}" >遊園地</s:elseif>
			<s:elseif test= "%{#session.deleteProductDTO.categoryId == 6}" >美術館</s:elseif>
		<br>
		<div class="info-title">場所</div><br>
			<s:if test= "%{#session.deleteProductDTO.placeId == 2}" >茨城県</s:if>
			<s:elseif test= "%{#session.deleteProductDTO.placeId == 3}" >栃木県</s:elseif>
			<s:elseif test= "%{#session.deleteProductDTO.placeId == 4}" >群馬県</s:elseif>
			<s:elseif test= "%{#session.deleteProductDTO.placeId == 5}" >千葉県</s:elseif>
			<s:elseif test= "%{#session.deleteProductDTO.placeId == 6}" >埼玉県</s:elseif>
			<s:elseif test= "%{#session.deleteProductDTO.placeId == 7}" >東京都</s:elseif>
			<s:elseif test= "%{#session.deleteProductDTO.placeId == 8}" >神奈川県</s:elseif>
		<br>
		<div class="info-title">価格</div><br><s:property value="%{#session.deleteProductDTO.price}" /><span>円</span>
			<br>
		<div class="info-title">画像</div><br>
			<img src='<s:property value="%{session.deleteProductDTO.imageFilePath}"/>/<s:property value="%{session.deleteProductDTO.imageFileName}"/>'	width="320px" height="240px" />
			<br>
		<div class="info-title">発売年月</div><br><s:property value="%{#session.deleteProductDTO.releaseDate}" />
			<br>
		<div class="info-title">発売会社</div><br><s:property value="%{#session.deleteProductDTO.releaseCompany}" />
			<br>
		<div class="info-title">所在地</div><br><s:property value="%{#session.deleteProductDTO.location}" />
			<br>
		<div class="info-title">アクセス</div><br><s:property value="%{#session.deleteProductDTO.access}" />
			<br>
		<div class="info-title">URL</div><br><s:property value="%{#session.deleteProductDTO.url}"/>
			<br>
		<div class="info-title">開始日</div><br><s:property value="%{#session.deleteProductDTO.startDate}"/>
			<br>
		<div class="info-title">終了日</div><br><s:property value="%{#session.deleteProductDTO.endDateString}"/>
			<br>
		</div>
	</div>
	<div class="center">
		<!-- 商品削除を確定する -->
		<s:form action="DeleteProductCompleteAction">
			<s:submit value="決定" class="submit_btn"/>
		</s:form>

	<!-- 商品管理画面に戻る -->
		<a href="http://localhost:8080/leisurepass/AdminProductAction">戻る</a>
	</div>
</body>
</html>
