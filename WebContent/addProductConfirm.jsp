
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
				カテゴリ：<s:if test= "%{#session.addProductDTO.categoryId == 2}" >動物園</s:if>
					<s:elseif test= "%{#session.addProductDTO.categoryId == 3}" >水族館</s:elseif>
					<s:elseif test= "%{#session.addProductDTO.categoryId == 4}" >アスレチック</s:elseif>
					<s:elseif test= "%{#session.addProductDTO.categoryId == 5}" >遊園地</s:elseif>
					<s:elseif test= "%{#session.addProductDTO.categoryId == 6}" >美術館</s:elseif>
				<br>
				場所：<s:if test= "%{#session.addProductDTO.placeId == 2}" >茨城県</s:if>
					<s:elseif test= "%{#session.addProductDTO.placeId == 3}" >栃木県</s:elseif>
					<s:elseif test= "%{#session.addProductDTO.placeId == 4}" >群馬県</s:elseif>
					<s:elseif test= "%{#session.addProductDTO.placeId == 5}" >千葉県</s:elseif>
					<s:elseif test= "%{#session.addProductDTO.placeId == 6}" >埼玉県</s:elseif>
					<s:elseif test= "%{#session.addProductDTO.placeId == 7}" >東京都</s:elseif>
					<s:elseif test= "%{#session.addProductDTO.placeId == 8}" >神奈川県</s:elseif>
				<br>
				価格：<s:property value="%{#session.addProductDTO.price}"/>
				<br>
				画像ファイル：<img src='<s:property value="%{#session.addProductDTO.imageFilePath}"/>/<s:property value="%{#session.addProductDTO.imageFileName}"/>'/>
				<br>
				発売年月：<s:property value="%{#session.addProductDTO.releaseDate}"/>
				<br>
				発売会社：<s:property value="%{#session.addProductDTO.releaseCompany}"/>
				<br>
				所在地：<s:property value="%{#session.addProductDTO.location}"/>
				<br>
				アクセス：<s:property value="%{#session.addProductDTO.access}"/>
				<br>
				URL：<s:property value="%{#session.addProductDTO.url}"/>
				<br>
				発売日：<s:property value="%{#session.addProductDTO.startDate}"/>
				<br>
				終了日：<s:property value="%{#session.addProductDTO.endDate}"/>
			</s:form>
​
			<!-- 商品追加を確定する -->
			<s:form action="AddProductCompleteAction" method="post" enctype="multipart/form-data">
				<s:submit value="決定" />
			</s:form>
			<!-- 商品管理画面に戻る（入力内容は保持） -->
			<s:form action="AddProductAction">
				<s:submit value="修正" />
			</s:form>
		</div>
		<div id="footer"></div>
	</div>
</body>
</html>
