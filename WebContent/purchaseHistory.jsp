<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/purchaseHistory.css">
<jsp:include page="includeHead.jsp" />
<title>商品購入履歴</title>
</head>
<body>

	<jsp:include page="header.jsp" />

	<div id="main" class="cf">

		<jsp:include page="navigation.jsp" />

		<div id="contents">
			<s:if test="#session.purchaseHistoryInfoDtoList.size()>0">
				<h2>購入履歴</h2>
				<s:iterator value="#session.purchaseHistoryInfoDtoList">
					<div id="bigBox">
						<img id="productImage"
							src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>'
							width="326px" height="218px" />
						<table class="horizontal-list-table">

							<tr>
								<td colspan="2"><div id="productNameKana">
										<s:property value="productNameKana" />
									</div></td>
							</tr>
							<tr>
								<td colspan="2"><div class="nameAndSubtotal">
										<s:property value="productName" />
									</div></td>
							</tr>
							<tr align="center">
								<th><div class="productInfo">
										<span> 料金：</span>
									</div></th>
								<td><div class="productInfo">
										<s:property value="price" />
										円
									</div></td>
							</tr>
							<tr align="center">
								<th><div class="productInfo">
										<span> 枚数：</span>
									</div></th>
								<td><div class="productInfo">
										<s:property value="productCount" />
										枚
									</div></td>
							</tr>
							<tr align="center">
								<th><div class="productInfo">発売会社：</div></th>
								<td><div class="productInfo">
										<s:property value="releaseCompany" />
									</div></td>
							</tr>
							<tr align="center">
								<th><div class="productInfo">
										<span> 発売日：</span>
									</div></th>
								<td><div class="productInfo">
										<s:property value="releaseDateString" />
									</div></td>
							</tr>
							<tr>
								<td colspan="2"><div class="nameAndSubtotal">合計</div></td>
							</tr>
							<tr>
								<td colspan="2"><div id="subtotal">
										<s:property value="subtotal" />
										円
									</div></td>
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
				<div class="info">商品購入履歴情報はありません</div>
				<s:form action="HomeAction">
					<s:submit value="HOME" class="submit_btn" id="HomeAction" />
				</s:form>
			</s:else>
		</div>

	</div>

	<jsp:include page="footer.jsp" />
</body>
</html>