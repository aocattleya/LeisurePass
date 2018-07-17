<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/productDetails.css">
<jsp:include page="includeHead.jsp" />
<title>商品詳細</title>


</head>
<body>

	<jsp:include page="header.jsp" />
	<div id="main" class="cf">
		<jsp:include page="navigation.jsp" />
		<div id="contents">
			<s:form action="AddCartAction">



							<img
								src='<s:property value="%{#session.imageFilePath}"/>/<s:property value="%{#session.imageFileName}"/>'
								class="item-image-box-320" /><br>

						<div class="left">
							<table class="vertical-list-table-mini">
								<tr>
									<td class="productNameKana"><s:property value="%{#session.productNameKana}" /></td>
								</tr>
								<tr><!-- 商品名 -->
									<td class="daimei"><s:property value="%{#session.productName}" /></td>
								</tr>
								<tr>
									<td class="naiyou"><s:property value="%{#session.productDescription}" /></td>
								</tr>
								<tr>
									<td class="releaseCompany"scope="row"><s:label value="発売会社名" />
									<s:property value="%{#session.releaseCompany}" /></td>
								</tr>
								<tr>
									<td class="releaseDate"scope="row"><s:label value="発売年月日" />
									<s:property value="%{#session.releaseDate}" /></td>
								</tr>
							</table>
							<!-- 追加項目 -->
							<br> <br>

							<p class="storeinfomation"><s:label value="店舗情報" /></p>
							<table class="store-information">
								<tr>
									<th class="local"><s:label value="所在地" /></th>
									<th class="local1"><s:property value="%{#session.location}" /></th>
								</tr>
								<tr>
									<th class="local"><s:label value="アクセス" /></th>
									<th class="local1"><s:property value="%{#session.access}" /></th>
								</tr>
								<tr>
									<th class="local"><s:label value="URL" /></th>
									<th class="local1"><s:property value="%{#session.url}" /></th>
								</tr>
							</table><br>
						</div>

					<s:hidden name="productId" value="%{#session.productId}" />
					<s:hidden name="productName" value="%{#session.productName}" />
					<s:hidden name="productNameKana"
						value="%{#session.productNameKana}" />
					<s:hidden name="imageFilePath" value="%{#session.imageFilePath}" />
					<s:hidden name="imageFileName" value="%{#session.imageFileName}" />
					<s:hidden name="price" value="%{#session.price}" />
					<s:hidden name="releaseCompany" value="%{#session.releaseCompany}" />
					<s:hidden name="releaseDate" value="%{#session.releaseDate}" />
					<s:hidden name="productDescription"
						value="%{#session.productDescription}" />


				<div class="submit_btn_box">
					<table class="a">
						<tr class="kosuu">
							<th>　購入個数　　　　
							<s:select name="productCount"
									list="%{#session.productCountList}" />個　</th>
						</tr>
						<tr>
							<th>　値段　　　　　　　<s:property
									value="%{#session.price}" />円</th>
						</tr>

					</table>
				<s:submit value="カートに追加" class="submit_btn" />
				</div>
			</s:form>
			<!-- おススメピックアップ -->
			<div class="box">

				<div class="product-details-recomｍend-box">
					<s:iterator value="#session.productInfoDtoList">
						<!-- 	<div class="product-list">
		<div class="product-list-box"> -->
						<div class="recommend-box">
							<div class="img">
								<a
									href='<s:url action="ProductDetailsAction">
		<s:param name="productId" value="%{productId}"/>
		</s:url>'>
									<img
									src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>'
									class="item-image-box-100" />
								</a>
							</div>
							<div class="productName"><s:property value="productName" /></div>
							<br>
						</div>
						<!-- 		</div>
	</div>
-->
					</s:iterator>
				</div>
			</div>
		</div>
	</div>
	<s:include value="footer.jsp" />
</body>
</html>