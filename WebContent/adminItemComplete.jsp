<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>商品管理完了画面</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="contents">
		<h1>商品管理完了画面</h1>
		<!-- どの（追加・編集・削除）動作が完了したか、を○○に入れる。 -->
		<p>商品○○が完了しました。</p>
		<!-- //管理者画面に戻る。 -->
		<s:form action="GoAdminAction">
			<s:submit value="管理者画面へ"/>
		</s:form>
	</div>
	<s:include value="footer.jsp" />
</body>
</html>