<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/cart.css">
<jsp:include page="includeHead.jsp" />
<title>カート</title>


</head>
<body>
	<jsp:include page="header.jsp" />
	<jsp:include page="navigation.jsp" />
	<div id="contents">
		<h1>商品カート</h1>

		<s:if test="#session.checkListErrorMessageList!=null">
			<div class="error">
				<div class="error-message">
					<s:iterator value="#session.checkListErrorMessageList">
						<s:property />
					</s:iterator>
				</div>
			</div>
		</s:if>

		<s:if test="#session.cartInfoDtoList.size()>0">
			<s:form id="form" action="SettlementConfirmAction">

				<s:iterator value="#session.cartInfoDtoList">
						<div class="checkbox">
							<s:checkbox name="checkList" value="checked" fieldValue="%{productId}"
								id="checkbox" />
						</div>

						<img
							src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>'
							width="326px" height="218px" />
						<div class="Side-by-side">
							<table class="horizontal-list-table">

								<tr>
									<td class="productNameKana"><s:property
											value="productNameKana" /></td>
								</tr>
								<tr>
									<td class="productName"><s:property value="productName" /></td>
								</tr>
								<tr>
									<td class="list"><span class="fat-text">料金：</span> <s:property
											value="price" />円</td>
								</tr>
								<tr>
									<td class="list"><span class="fat-text">枚数：</span> <s:property
											value="productCount" />枚</td>
								</tr>
								<tr>
									<td class="list"><span class="fat-text">発売会社：</span> <s:property
											value="releaseCompany" /></td>
								</tr>
								<tr>
									<td class="list"><span class="fat-text">発売日：</span> <s:property
											value="releaseDateString" /></td>
								</tr>

								<tr>
									<td class="subtotal">小計</td>
								</tr>
								<tr>
									<td class="syoukei"><s:property value="subtotal" />円</td>
								</tr>

							</table>

						<s:hidden name="productId" value="%{productId}" />

						<s:hidden name="productName" value="%{productName}" />
						<s:hidden name="productNameKana" value="%{productNameKana}" />
						<s:hidden name="imageFilePath" value="%{imageFilePath}" />
						<s:hidden name="imageFileName" value="%{imageFileName}" />
						<s:hidden name="price" value="%{price}" />
						<s:hidden name="releaseCompany" value="%{releaseCompany}" />
						<s:hidden name="releaseDate" value="%{releaseDate}" />
						<s:hidden name="productCount" value="%{productCount}" />
						<s:hidden name="subtotal" value="%{subtotal}" />
					</div>

				</s:iterator>
				<br>
				<h2>
					<s:label value="商品合計 :" /><span class="totalPrice">
					<s:property value="#session.totalPrice" />
					円
					</span>
				</h2>
				<br>
				<div class="submit_btn_box">
					<div id=".contents-btn-set">
						<s:submit value="決済" class="submit_btn" />
					</div>
				</div>

				<div class="submit_btn_box">
					<div id=".contents-btn-set">
						<s:submit value="〆した商品を削除" class="submit_btn"
							onclick="this.form.action='DeleteCartAction';" />
					</div>
				</div>

			</s:form>
		</s:if>
		<s:else>
			<div class="info">カート情報はありません。</div>
			<s:form action="HomeAction">
			<s:submit value="HOME" class="submit_btn" />
			</s:form>
		</s:else>

		<s:if test="#session.overErrorMessage != null">
			<s:iterator value="#session.overErrorMessage" />
		</s:if>
		<s:if test="#session.shortageErrorMessage != null">
			<s:iterator value="#session.shortageErrorMessage" />
		</s:if>
		<s:if test="#session.noCountErrorMessage != null">
			<s:iterator value="#session.noCountErrorMessage" />
		</s:if>
		<s:if test="#session.errorMessage != null">
			<s:iterator value="#session.errorMessage" />
		</s:if>
	</div>
	<div id="footer">
		<s:include value="footer.jsp" />
	</div>
</body>
</html>