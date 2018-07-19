
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
<style type="text/css">
body {
	width: 100%;
	font-family: 'メイリオ', sans-serif;
	font-size: 18px;
}

.submit_btn {
	width: 200px;
	height: 40px;
	font-size: 20px;
	background-color: #ed7d22; /* オレンジ */
	color: #ffffff;
	border-style: none;
	border-radius: 20px;
}

.submit_btn_delete {
	width: 110px;
	height: 30px;
	font-size: 13px;
	background-color: #aaaaaa; /* オレンジ */
	color: #ffffff;
	border-style: none;
	border-radius: 20px;
}
</style>
</head>


<body>
	<jsp:include page="header.jsp" />

	<div id="main">

		<div id="admin-contents">
			<table class="product-table">
				<tr>
					<td>
						<s:form action="AddProductAction">
							<s:submit value="商品追加" class="submit_btn" />
						</s:form>
					</td>
				</tr>
				<h1>商品一覧</h1>
				<!-- 表示項目は、設計書の商品詳細画面に倣った -->
				<tr>
					<th>商品ID</th>
					<th>商品名</th>
					<!-- <th>商品名ふりがな</th> -->
					<th>商品画像</th>
					<th>価格（円）</th>
					<!-- <th>発売会社名</th>
					<th>発売年月日</th>
					<th>商品詳細情報</th> -->
				</tr>
				<s:iterator value="%{productList}">
					<tr>
						<td><s:property value="productId" /></td>
						<td><s:property value="productName" /></td>
						<%-- <td><s:property value="productNameKana" /></td> --%>
						<td><img width="100px" height="100px" src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' class="item-image-box-200" /></td>
						<td><s:property value="price" /></td>
						<%-- <td><s:property value="releaseCompany" /></td>
						<td><s:property value="releaseDate" /></td>
						<td><s:property value="productDescription" /></td> --%>
						<td>
							<s:form action="DeleteProductConfirmAction">
								<s:hidden name="id" value="%{id}" />
								<s:submit value="削除" class="submit_btn_delete" />
							</s:form>
						</td>
						<%-- <td>
							<s:form action="EditProductAction">
								<s:hidden name="id" value="%{id}" />
								<s:submit value="商品情報変更" />
							</s:form>
						</td> --%>
					</tr>
				</s:iterator>
			</table>

		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>