<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>マイページ</title>

<%-- <script type="text/javascript">
	// ========================================
	// 効果音を鳴らす（★今回のメインはこれ★）
	// ========================================
	function ring() {
		document.getElementById("Sound").play();
	}
</script>
 --%>

</head>
<body>

	<jsp:include page="header.jsp" />
	<div id="main" class="cf">
		<jsp:include page="navigation.jsp" />
		<div id="contents">
			<h1>マイページ</h1>
			<s:form action="PurchaseHistoryAction">

<%--
				<audio id="Sound" preload="auto">
					<source src="audio/dog1a.mp3" type="audio/mp3">
				</audio>
 --%>
<!--
		これ		<p class="SoundButton">
					<input type="button" onclick="ring()" value="ワン"/>
				</p>
 -->

<!-- 			<p class="button">
					<input type="button"
						onclick="ring(); ShowKuji( 'KujiRes', 'KujiCom' );"
						value="おみくじを引く" />
				</p>
 -->


				<table class="vertical-list-table">

					<tr>
						<th scope="row"><s:label value="姓" /></th>
						<td><s:property value="#session.familyName" /></td>
					</tr>

					<tr>
						<th scope="row"><s:label value="名" /></th>
						<td><s:property value="#session.firstName" /></td>
					</tr>

					<tr>
						<th scope="row"><s:label value="ふりがな" /></th>
						<td><s:property value="#session.familyNameKana" /><span>
						</span> <s:property value="#session.firstNameKana" /></td>
					</tr>

					<tr>
						<th scope="row"><s:label value="性別" /></th>
						<td><s:if test="#session.sex==0">男性</s:if> <s:if
								test="#session.sex==1">女性</s:if></td>
					</tr>

					<tr>
						<th scope="row"><s:label value="メールアドレス" /></th>
						<td><s:property value="#session.email" /></td>
					</tr>

				</table>

				<div class="submit_btn_box">
					<s:submit value="購入履歴" class="submit_btn" />
				</div>




<%--
				<audio controls>
					<source src="audio/dog1a.mp3" type="audio/mp3">
				</audio>
 --%>
			</s:form>
		</div>

	</div>

	<jsp:include page="footer.jsp" />

</body>
</html>