<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no" />

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
			<!-- <div id="contents-box"> -->

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


				<div id="details_area">
					<!-- 	<div class="left-column"> -->
					<div class="details_box">
						<ul>
							<li>
								<div class="productNameKana">
									<s:property value="%{#session.productNameKana}" />
								</div>
							</li>
							<li>
								<!-- 商品名 -->
								<div class="daimei">
									<s:property value="%{#session.productName}" />
								</div>
							</li>
							<li>
								<div class="naiyou">
									<s:property value="%{#session.productDescription}" />
								</div>
							</li>
							<li>
								<div class="releaseCompany">
									<s:label value="発売会社名" />
									<s:property value="%{#session.releaseCompany}" />
								</div>
							</li>
							<li>
								<div class="releaseDate">
									<s:label value="発売年月日" />
									<s:property value="%{#session.releaseDateString}" />
								</div>
							</li>
						</ul>

					</div>

					<!-- 	<div class="right-column"> -->

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

					<!-- 			</div> -->

					<br> <br>
				</div>
				<div class="store_info_area">
					<table class="store_info_box">

						<tr>
							<th class="storeinfomation"><s:label value="店舗情報" /></th>
						</tr>


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
				</div>
				<!-- 	</div> -->


				<s:hidden name="productId" value="%{#session.productId}" />
				<s:hidden name="productName" value="%{#session.productName}" />
				<s:hidden name="productNameKana" value="%{#session.productNameKana}" />
				<s:hidden name="imageFilePath" value="%{#session.imageFilePath}" />
				<s:hidden name="imageFileName" value="%{#session.imageFileName}" />
				<s:hidden name="price" value="%{#session.price}" />
				<s:hidden name="releaseCompany" value="%{#session.releaseCompany}" />
				<s:hidden name="releaseDate" value="%{#session.releaseDateString}" />
				<s:hidden name="productDescription"
					value="%{#session.productDescription}" />

			</s:form>

			<!-- おススメピックアップ -->


			<div id="pickUp">
				<div class="pickup_title">
					<br> おすすめピックアップ
				</div>

				<s:iterator value="#session.productInfoDtoList">

					<div class="recommend-box">
						<div class="pickup_img">
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
					<!-- おすすめ3商品帯ここまで -->
				</s:iterator>
			</div>
			<!-- ピックアップここまで -->

		</div>
		<!-- コンテンツここまで -->
	</div>
	<!-- #メインここまで -->
	<s:include value="footer.jsp" />
</body>
</html>