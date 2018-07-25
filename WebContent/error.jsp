<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>エラー画面</title>
		<s:if test="%{#session.userInfo.status == 0}">
			<meta http-equiv="refresh" content="3; URL='HomeAction'"/>
		</s:if>
		<s:else>
			<meta http-equiv="refresh" content="3; URL='GoAdminAction'"/>
		</s:else>
	</head>
	<body>
		<div class="error">
			エラーが発生しました。
		</div>
	</body>
</html>