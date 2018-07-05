<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>商品管理確認画面</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="contents">
		<h1>商品管理確認画面</h1>
		<p>以下の内容でよろしいですか？</p>
		<!-- どの○○Item.jspから遷移してきたか？によって、どの○○ItemCompleteActionを呼ぶかを決める。 -->
		<s:form action="AddItemAction">
			<s:submit value="決定"/>
		</s:form>
		<!-- どの○○Item.jspから遷移してきたか？によって、どの○○Item.jspに戻るかを決める。(GoItemConfirmActionが必要？) -->
		<s:form action="DeleteItemAction">
			<s:submit value="戻る"/>
		</s:form>
	</div>
	<s:include value="footer.jsp" />
</body>
</html>