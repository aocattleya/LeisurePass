<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<jsp:include page="includeHead.jsp" />
<title>カート</title>

<%--<script type="text/javascript">
	function goDeleteCartAction() {
		document.getElementById("form").action = 'DeleteCartAction';
	}
</script> --%>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="main" class="cf">
		<jsp:include page="navigation.jsp" />
		<div id="contents">
			<h1>カート画面</h1>

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
					<table class="horizontal-list-table">
						<thead>
							<tr>
								<th><s:label value="#" /></th>
								<th><s:label value="商品名" /></th>
								<th><s:label value="ふりがな" /></th>
								<th><s:label value="商品画像" /></th>
								<th><s:label value="値段" /></th>
								<th><s:label value="発売会社名" /></th>
								<th><s:label value="発売年月日" /></th>
								<th><s:label value="購入個数" /></th>
								<th><s:label value="合計金額" /></th>
							</tr>
						</thead>
						<tbody>
							<s:iterator value="#session.cartInfoDtoList">
								<tr>
									<td><s:checkbox name="checkList" value="checked"
											fieldValue="%{id}" /></td>
									<s:hidden name="productId" value="%{productId}" />
									<td><s:property value="productName" /></td>
									<td><s:property value="productNameKana" /></td>
									<td><img
										src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>'
										width="50px" height="50px" /></td>
									<td><s:property value="price" />円</td>
									<td><s:property value="releaseCompany" /></td>
									<td><s:property value="releaseDate" /></td>
									<td><s:property value="productCount" /></td>
									<td><s:property value="subtotal" />円</td>
								</tr>
								<s:hidden name="productName" value="%{productName}" />
								<s:hidden name="productNameKana" value="%{productNameKana}" />
								<s:hidden name="imageFilePath" value="%{imageFilePath}" />
								<s:hidden name="imageFileName" value="%{imageFileName}" />
								<s:hidden name="price" value="%{price}" />
								<s:hidden name="releaseCompany" value="%{releaseCompany}" />
								<s:hidden name="releaseDate" value="%{releaseDate}" />
								<s:hidden name="productCount" value="%{productCount}" />
								<s:hidden name="subtotal" value="%{subtotal}" />
							</s:iterator>
						</tbody>
					</table>
					<h2>
						<s:label value="カート合計金額 :" />
						<s:property value="#session.totalPrice" />
						円
					</h2>
					<br>
					<div class="submit_btn_box">
						<div id=".contents-btn-set">
							<s:submit value="決済" class="submit_btn" />
						</div>
					</div>

					<div class="submit_btn_box">
						<div id=".contents-btn-set">

							<s:submit value="チェックした商品の削除" class="submit_btn"
								onclick="this.form.action='DeleteCartAction';" />
						</div>
					</div>

				</s:form>
			</s:if>
			<s:else>
				<div class="info">カート情報はありません。</div>
			</s:else>
		</div>
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
	<s:include value="footer.jsp" />
</body>
</html>