
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>商品追加完了画面</title>
</head>
<body>
	<jsp:include page="header.jsp" />

	<div id="main" class="cf">

		<jsp:include page="navigation.jsp" />

		<div id="contents">
			<p>商品の追加が完了しました。</p>

			<s:form action="GoAdminAction">
				<s:submit value ="商品管理画面に戻る"/>
			</s:form>

		</div>
		<div id="footer">
		</div>
	</div>
</body>
</html>