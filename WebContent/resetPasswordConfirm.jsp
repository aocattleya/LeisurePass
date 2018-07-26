<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/resetPasswordConfirm.css">
<jsp:include page="includeHead.jsp" />


<title>パスワード再設定確認</title>
</head>
<body>
	<jsp:include page="header.jsp" />

	<div id="main" class="cf">

		<jsp:include page="navigation.jsp" />



		<div id="contents">
			<h1>以下の内容で変更します。</h1>
			<s:form action="ResetPasswordCompleteAction">
				<div class="table">



					<ul>
						<li><s:label value="ログインID" /></li>
						<li><s:property value="#session.loginId" /></li>
						<li><s:label value="パスワード" /></li>
						<li><s:property value="#session.concealedPassword" /></li>
					</ul>
				</div>

				<s:submit value="再設定" class="submit_btn" />

			</s:form>



		</div>
	</div>

	<jsp:include page="footer.jsp" />

</body>

</html>

