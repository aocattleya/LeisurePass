
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<jsp:include page="includeHead.jsp" />
<title>商品管理画面</title>
</head>
<body>
	<jsp:include page="header.jsp" />

	<div id="main" class="cf">

		<jsp:include page="navigation.jsp" />

		<div id="contents">
			<div>
				<h1>商品管理画面</h1>
			</div>
			<table class="product-table">
				<!-- 表示項目は、設計書の商品詳細画面に倣った -->
				<tr>
					<th>商品名</th>
					<th>商品名ふりがな</th>
					<th>商品画像</th>
					<th>値段</th>
					<!-- <th>在庫</th> -->
					<th>発売会社名</th>
					<th>発売年月日</th>
					<th>商品詳細情報</th>
				</tr>
				<s:iterator value="%{productList}">
					<tr>
						<td><s:property value="productName" /></td>
						<td><s:property value="productNameKana" /></td>
						<td><s:property value="" />画像表示</td>
						<td><s:property value="price" /></td>
						<td><s:property value="releaseCompany" /></td>
						<td><s:property value="releaseDate" /></td>
						<td><s:property value="productDescription" /></td>
						<td><s:form action="EditProductAction">
								<s:hidden name="productId" value="%{productId}" />
								<s:submit class="table-button" value="編集" />
							</s:form></td>
					</tr>
				</s:iterator>
				<tr>
					<td><s:form action="AddProductAction">
							<s:submit class="table-button" type="button" value="追加" />
						</s:form></td>
				</tr>
			</table>

		</div>
		<div id="footer"></div>
	</div>
</body>
</html>