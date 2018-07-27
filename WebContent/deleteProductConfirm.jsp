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
<div class="BIGBOX">
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
			<s:property value="%{#session.deleteProductDTOCategory}" />
		<br>
		<div class="info-title">場所</div><br>
			<s:property value="%{#session.deleteProductDTOPlace}" />
		<br>
		<div class="info-title">価格</div><br><s:property value="%{#session.deleteProductDTO.price}" /><span>円</span>
			<br>
		<div class="info-title">画像</div><br>
			<img src='<s:property value="%{session.deleteProductDTO.imageFilePath}"/>/<s:property value="%{session.deleteProductDTO.imageFileName}"/>'	width="320px" height="240px" />
			<br>
		<div class="info-title">発売年月</div><br><s:property value="%{#session.deleteProductDTO.releaseDateString}" />
			<br>
		<div class="info-title">発売会社</div><br><s:property value="%{#session.deleteProductDTO.releaseCompany}" />
			<br>
		<div class="info-title">所在地</div><br><s:property value="%{#session.deleteProductDTO.location}" />
			<br>
		<div class="info-title">アクセス</div><br><s:property value="%{#session.deleteProductDTO.access}" />
			<br>
		<div class="info-title">URL</div><br><s:property value="%{#session.deleteProductDTO.url}"/>
			<br>
		<div class="info-title">開始日</div><br><s:property value="%{#session.deleteProductDTO.startDateString}"/>
			<br>
		<div class="info-title">終了日</div><br><s:property value="%{#session.deleteProductDTO.endDateString}"/>
			<br>
		</div>
	</div>
	</div>
	<div class="center">
		<!-- 商品削除を確定する -->
		<s:form action="DeleteProductCompleteAction">
			<s:submit value="決定" class="submit_btn"/>
		</s:form>

	<!-- 商品管理画面に戻る -->
		<a href="AdminProductAction">戻る</a>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>
