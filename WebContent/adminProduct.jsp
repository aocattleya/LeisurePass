
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/adminProduct.css">
<jsp:include page="includeHead.jsp" />
<title>商品管理画面</title>
</head>


<body>
	<jsp:include page="header.jsp" />

	<div id="main">

		<div id="admin-contents" class="center">
						<s:form action="AddProductAction">
							<s:submit value="商品追加" class="submit_btn" />
						</s:form>

				<h1>
					<img src="images/elephant.jpg"class="ele">
					商品一覧 <img src="images/fish.jpg" class="fish">
				</h1>
				<s:iterator value="%{productList}">
				<div class="admin-list-box">
						<img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' class="image_box"/>
						<br>
						<s:property value="productName" />
						<br>
						<s:property value="price" /><span>円</span>
						<br>
						<s:form action="DeleteProductConfirmAction">
							<s:hidden name="id" value="%{id}" />
							<s:submit value="削除" class="submit_btn_delete" />
						</s:form>
						<br><br>
				</div>
				</s:iterator>

		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>