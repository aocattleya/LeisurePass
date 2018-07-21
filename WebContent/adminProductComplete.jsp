
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/adminProductComplete.css">
<jsp:include page="includeHead.jsp" />
<title>商品管理完了画面</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	​

		<div id="contents01">​
			<div class="info">商品管理が完了しました。</div>
			<br>
			<br>

			<!-- 商品管理画面に戻る -->
			<s:form action="AdminProductAction">
				<s:submit value="戻る" class="submit_btn" />
			</s:form>
		</div>

	<div id="footer"></div>

</body>
</html>
