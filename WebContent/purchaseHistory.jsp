<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<jsp:include page="includeHead.jsp" />
<title>商品購入履歴</title>
<style type="text/css">
body {
	width: 100%;
	font-family: 'メイリオ', sans-serif;
	font-size: 18px;
}

h2{
	text-align: center;
}

#bigBox{
	border-bottom: 2px solid #f7f7f7;
	display: inline-block;
	padding: 20px 0 20px 0;
	margin-left: 175px;
}

img{
	float: left;
}

.horizontal-list-table{
	display: inline-block;
	text-align: center;
	padding-left: 50px;
}

table th{
	text-align: right;
}

table td .productInfo{
	text-align: left;
}

#productNameKana{
	font-size: 12px;
}

.nameAndSubtotal{
	display: inline-block;
	font-size: 20px;
	border-bottom: 2px solid #ed7d22;
	padding: 0 10px 0 10px;
	font-weight: bold;
}

.productInfo{
	font-size: 18px;
}

#subtotal{
	font-size: 24px;
}

#contents-btn-set{
	padding: 1px;
	width: 100%;
	display: inline;
	text-align: center;
}

.submit_btn {
	width: 200px;
	height: 40px;
	font-size: 20px;
	background-color: #ed7d22;
	color: #FFF;
	border-radius: 20px;
	box-shadow: inset 0 2px 0 rgba(255, 255, 255, 0.2), inset 0 -2px 0 rgba(0, 0, 0, 0.05);
	border: solid 2px #d27d00;
}

.submit_btn {
	width: 200px;
	height: 40px;
	font-size: 20px;
	background-color: #ed7d22;
	color: #FFF;
	border-radius: 20px;
	box-shadow: inset 0 2px 0 rgba(255, 255, 255, 0.2), inset 0 -2px 0 rgba(0, 0, 0, 0.05);
	border: solid 2px #d27d00;
}

</style>
</head>
<body>

	<jsp:include page="header.jsp" />

	<div id="main" class="cf">

		<jsp:include page="navigation.jsp" />

		<div id="contents">
			<h2>購入履歴</h2>
			<s:if test="#session.purchaseHistoryInfoDtoList.size()>0">
				<s:iterator value="#session.purchaseHistoryInfoDtoList">
				<div id="bigBox">
					<img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>'
						width="326px" height="218px"/>
				<table class="horizontal-list-table">

					<tr>
						<td colspan="2"><div id="productNameKana"><s:property value="productNameKana" /></div></td>
					</tr>
					<tr>
						<td colspan="2"><div class="nameAndSubtotal"><s:property value="productName" /></div></td>
					</tr>
					<tr align="center">
						<th><div class="productInfo">料金：</div></th>
						<td><div class="productInfo"><s:property value="price"/>円</div></td>
					</tr>
					<tr align="center">
						<th><div class="productInfo">枚数：</div></th>
						<td><div class="productInfo"><s:property value="productCount"/>枚</div></td>
					</tr>
					<tr align="center">
						<th><div class="productInfo">発売会社：</div></th>
						<td><div class="productInfo"><s:property value="releaseCompany"/></div></td>
					</tr>
					<tr align="center">
					<th><div class="productInfo">発売日：</div></th>
						<td><div class="productInfo"><s:property value="releaseDateString" /></div></td>
					</tr>
					<tr>
						<td colspan="2"><div class="nameAndSubtotal">合計</div></td>
					</tr>
					<tr>
						<td colspan="2"><div id="subtotal"><s:property value="subtotal"/>円</div></td>
					</tr>
				</table>
				</div>
				</s:iterator>

				<div class="submit_btn_box">
					<div id="contents-btn-set">
						<s:form action="DeletePurchaseHistoryAction">
							<s:submit value="全件購入履歴削除" class="submit_btn" />
						</s:form>
					</div>
				</div>
			</s:if>
			<s:else>
				<div class="info">商品購入履歴情報はありません。</div>
			</s:else>
		</div>

	</div>

	<jsp:include page="footer.jsp" />
</body>
</html>