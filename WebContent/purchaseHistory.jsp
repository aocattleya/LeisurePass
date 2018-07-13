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
.submit_btn {
	width: 200px;
	height: 40px;
	font-size: 20px;
	background-color: #ed7d22;
	color: #ffffff;
	border-style: none;
	border-radius: 20px;
}

img{
	float: left;
}

#productNameKana{
	font-size: 12px;
}

.productName{
	font-size: 20px;
	border-bottom: 2px solid #ed7d22;
}

.productInfo{
	font-size: 18px;
}

#subtotal{
	font-size: 24px;
}

.horizontal-list-table{
	border-bottom: 2px solid #f7f7f7;
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
					<img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>'
						width="326px" height="218px"/>
				<table class="horizontal-list-table">
					<tr>
						<td><div id="productNameKana"><s:property value="productNameKana" /></div></td>
					</tr>
					<tr>
						<th><div class="productName"><s:property value="productName" /></div></th>
					</tr>
					<tr>
						<td><div class="productInfo">料金：<s:property value="price"/>円</div></td>
					</tr>
					<tr>
						<td><div class="productInfo">枚数：<s:property value="productCount"/>枚</div></td>
					</tr>
					<tr>
						<td><div class="productInfo">発売会社：<s:property value="releaseCompany"/></div></td>
					</tr>
					<tr>
						<td><div class="productInfo">発売日：<s:property value="releaseDateString" /></div></td>
					</tr>
					<tr>
						<th><div class="productName">合計</div></th>
					</tr>
					<tr>
						<td><div id="subtotal"><s:property value="subtotal"/>円</div></td>
					</tr>
				</table>
				</s:iterator>

				<div class="submit_btn_box">
					<div id=".contents-btn-set">
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