<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/productDetails.css">
<jsp:include page="includeHead.jsp" />
<title>商品詳細</title>


</head>
<body>

	<jsp:include page="header.jsp" />
	<div id="main" class="cf">
		<jsp:include page="navigation.jsp" />
		<div id="contents">
			<div id="contents-box">

				<s:if test="%{#session.containsKey('overErrorMessage')}">
					<s:property value="%{#session.overErrorMessage}" />
				</s:if>
				<s:if test="%{#session.containsKey('shortageErrorMessage')}">
					<s:iterator value="%{#session.shortageErrorMessage}" />
					<s:property />
				</s:if>
				<s:if test="%{#session.containsKey('noCountErrorMessage')}">
					<s:iterator value="%{#session.noCountErrorMessage}" />
					<s:property />
				</s:if>
				<s:if test="%{#session.containsKey('errorMessage')}">
					<s:iterator value="%{#session.errorMessage}" />
					<s:property />
				</s:if>


				<s:form action="AddCartAction">
					<div class="big-picture">
						<img
							src='<s:property value="%{#session.imageFilePath}"/>/<s:property value="%{#session.imageFileName}"/>'
							class="item-image-box-back" /> <img
							src='<s:property value="%{#session.imageFilePath}"/>/<s:property value="%{#session.imageFileName}"/>'
							class="item-image-box-320" /> <br>
					</div>
					<br>
					<br>

					<div class="left-column">
						<table class="vertical-list-table-mini">
							<tr>
								<td class="productNameKana"><s:property
										value="%{#session.productNameKana}" /></td>
							</tr>
							<tr>
								<!-- 商品名 -->
								<td class="daimei"><s:property
										value="%{#session.productName}" /></td>
							</tr>
							<tr>
								<td class="naiyou"><s:property
										value="%{#session.productDescription}" /></td>
							</tr>
							<tr>
								<td class="releaseCompany" scope="row"><s:label
										value="発売会社名" /> <s:property
										value="%{#session.releaseCompany}" /></td>
							</tr>
							<tr>
								<td class="releaseDate" scope="row"><s:label value="発売年月日" />
									<s:property value="%{#session.releaseDateString}" /></td>
							</tr>

						</table>
						<!-- 追加項目 -->
						<br> <br>

						<p class="storeinfomation">
							<s:label value="店舗情報" />
						</p>
						<table class="store-information">
							<tr>
								<th class="local"><s:label value="所在地" /></th>
								<th class="local1"><s:property value="%{#session.location}" /></th>
							</tr>
							<tr>
								<th class="local"><s:label value="アクセス" /></th>
								<th class="local1"><s:property value="%{#session.access}" /></th>
							</tr>
							<tr>
								<th class="local"><s:label value="URL" /></th>
								<th class="local1"><s:property value="%{#session.url}" /></th>
							</tr>
						</table>
						<br>
					</div>

					<s:hidden name="productId" value="%{#session.productId}" />
					<s:hidden name="productName" value="%{#session.productName}" />
					<s:hidden name="productNameKana"
						value="%{#session.productNameKana}" />
					<s:hidden name="imageFilePath" value="%{#session.imageFilePath}" />
					<s:hidden name="imageFileName" value="%{#session.imageFileName}" />
					<s:hidden name="price" value="%{#session.price}" />
					<s:hidden name="releaseCompany" value="%{#session.releaseCompany}" />
					<s:hidden name="releaseDate" value="%{#session.releaseDateString}" />
					<s:hidden name="productDescription"
						value="%{#session.productDescription}" />


					<div id="cart_in_box">

						<ul>
							<li>
								<div class="byCount">
									<s:select name="productCount"
										list="%{#session.productCountList}" class="pulldown">
										<span class="mai">枚数</span>
									</s:select>


								</div> <br>
							</li>
							<li>
								<div class="byPrice">
									価格 <span class="yen"><s:property
											value="%{#session.price}" /> 円</span><span class="s-mai">&nbsp;/枚</span>
								</div> <br>
							</li>
							<li><s:submit value="カートに追加" class="cart_submit_btn" /></li>
						</ul>

					</div>
				</s:form>
				<!-- おススメピックアップ -->

				<div id=pickUp>
					<div class="pickup_title">
						<br> おすすめピックアップ
					</div>
					<br>

					<s:iterator value="#session.productInfoDtoList">

						<div class="recommend-box">
							<div class="pickup">
								<a
									href='<s:url action="ProductDetailsAction">
		<s:param name="productId" value="%{productId}"/>
		</s:url>'>
									<img
									src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>'
									class="item-image-box-100" />
								</a>
							</div>
							<div class="pickup-Name">
								<s:property value="productName" />
							</div>
						</div>
					</s:iterator>
				</div>

			</div>
		</div>
	</div>
	<s:include value="footer.jsp" />
</body>
</html>