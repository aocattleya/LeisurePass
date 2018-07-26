
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/addProductConfirm.css">
<jsp:include page="includeHead.jsp" />
<title>商品追加確認画面</title>
</head>
<body>
	<jsp:include page="header.jsp" />
​
	<div id="main" class="cf">

		<div id="admin-contents">
			<div>
				<h1>以下の内容で登録します。</h1>
			</div>
			<!-- 商品追加 -->
			<s:form action="AddProductConfirmAction">
			<table class="vertical-list-table">
				<tr>
					<th><s:label value="商品ID" /></th>
				</tr>
				<tr>
					<td><s:property value="%{#session.addProductDTO.productId}"/></td>
				</tr>
				<tr>
					<th><s:label value="商品名" /></th>
				</tr>
				<tr>
					<td><s:property value="%{#session.addProductDTO.productName}"/></td>
				</tr>
				<tr>
					<th><s:label value="商品かな" /></th>
				</tr>
				<tr>
					<td><s:property value="%{#session.addProductDTO.productNameKana}"/></td>
				</tr>
				<tr>
					<th><s:label value="カテゴリ" /></th>
				</tr>
				<tr>
					<td><s:property value="%{#session.addProductDTOCategory}" /></td>
				</tr>
				<tr>
					<th><s:label value="場所" /></th>
				</tr>
				<tr>
					<td><s:property value="%{#session.addProductDTOPlace}" /></td>
				</tr>
				<tr>
					<th><s:label value="価格" /></th>
				</tr>
				<tr>
					<td><s:property value="%{#session.addProductDTO.price}"/>円</td>
				</tr>
				<tr>
					<th><s:label value="画像" /></th>
				</tr>
				<tr>
					<td><img width="100px" height="100px" src='<s:property value="%{#session.addProductDTO.imageFilePath}"/>/<s:property value="%{#session.addProductDTO.imageFileName}"/>'/></td>
				</tr>
				<tr>
					<th><s:label value="発売年月" /><th>
				</tr>
				<tr>
					<td><s:property value="%{#session.addProductDTO.releaseDateString}"/></td>
				</tr>
				<tr>
					<th><s:label value="発売会社" /></th>
				</tr>
				<tr>
					<td><s:property value="%{#session.addProductDTO.releaseCompany}"/></td>
				</tr>
				<tr>
					<th><s:label value="所在地" /></th>
				</tr>
				<tr>
					<td><s:property value="%{#session.addProductDTO.location}"/></td>
				</tr>
				<tr>
					<th><s:label value="アクセス" /></th>
				</tr>
				<tr>
					<td><s:property value="%{#session.addProductDTO.access}"/></td>
				</tr>
				<tr>
					<th><s:label value="URL" /></th>
				</tr>
				<tr>
					<td><s:property value="%{#session.addProductDTO.url}"/></td>
				</tr>
				<tr>
					<th><s:label value="発売日" /></th>
				</tr>
				<tr>
					<td><s:property value="%{#session.addProductDTO.startDateString}"/></td>
				</tr>
				<tr>
					<th><s:label value="終了日" /></th>
				</tr>
				<tr>
					<td><s:property value="%{#session.addProductDTO.endDateString}"/></td>
				</tr>
				<tr>
					<th><s:label value="商品詳細" /></th>
				</tr>
				<tr>
					<td><s:property value="%{#session.addProductDTO.productDescription}"/></td>
				</tr>
				</table>
			</s:form>
			<!-- 商品追加を確定する -->
			<div class="submit_btn_box">
				<div id=".contents-btn-set">
					<s:form action="AddProductCompleteAction" method="post" enctype="multipart/form-data">
						<p><s:submit value="決定" class="submit_btn"/></p>
					</s:form>
				</div>
			<!-- 商品管理画面に戻る（入力内容は保持） -->
			<%-- <p><a href='<s:url action="AddProductAction"/>' id="#correction">修正</a></p> --%>
			<s:form action="AddProductAction" method="post" enctype="multipart/form-data">
				<s:hidden name="productId" value="%{productId}" />
				<s:hidden name="productName" value="%{productName}" />
				<s:hidden name="productNameKana" value="%{productNameKana}" />
				<s:hidden name="categoryId" value="%{categoryId}" />
				<s:hidden name="placeId" value="%{placeId}" />
				<s:hidden name="price" value="%{price}" />
				<s:hidden name="productDescription" value="%{productDescription}" />
				<%-- <s:hidden name="endDateString" value="%{}" /> --%>
				<s:hidden name="releaseDate" value="%{releaseDate}" />
				<s:hidden name="releaseCompany" value="%{releaseCompany}" />
				<s:hidden name="location" value="%{location}" />
				<s:hidden name="access" value="%{access}" />
				<s:hidden name="url" value="%{url}" />
				<s:hidden name="startDate" value="%{startDate}" />
				<s:hidden name="endDate" value="%{endDate}" />
				<p><s:submit value="修正" class="submit_btn"/></p>
			</s:form>

			</div>
		</div>
​


</div>
		<jsp:include page="footer.jsp" />
</body>
</html>
