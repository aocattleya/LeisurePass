<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<jsp:include page="includeHead.jsp" />

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
<link rel="stylesheet" href="./css/home.css">

<script
	src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js">

</script>

<script>
	$(document).ready(function() {

		$('.slider').bxSlider({
			// 自動再生。trueで自動再生される。
			auto : true,
			//画像フェードアウト
			mode : 'fade',
			// 自動再生で切り替えをする時間
			speed : 2000
		});
	});
</script>

<title>ホーム</title>
</head>
<body>

	<jsp:include page="header.jsp" />

	<div id="main" class="cf">

		<jsp:include page="navigation.jsp" />

		<div id="contents">
			<div class="slider">
				<div>
					<a
						href='<s:url action="SearchItemAction">
		<s:param name="categoryId" value="2"/>
		</s:url>'>
						<img src="./images/ueno_zoo5.jpg">
					</a>
				</div>

				<div>
					<a
						href='<s:url action="SearchItemAction">
		<s:param name="categoryId" value="5"/>
		</s:url>'>
						<img src="./images/tokyo_dome_city.jpg">
					</a>
				</div>

				<div>
				<a
						href='<s:url action="SearchItemAction">
		<s:param name="categoryId" value="6"/>
		</s:url>'>
					<img src="./images/digital_art_m6.jpg">
					</a>
				</div>

				<div>
				<a
						href='<s:url action="SearchItemAction">
		<s:param name="categoryId" value="3"/>
		</s:url>'>
					<img src="./images/kamogawa_sea_world7.jpg">
					</a>
				</div>

				<div>
				<a
						href='<s:url action="SearchItemAction">
		<s:param name="categoryId" value="4"/>
		</s:url>'>
					<img src="./images/parcabout5.jpg">
					</a>
				</div>
			</div>

			<p>おすすめピックアップ</p>

			<div class="box">
				<%-- <ul>
					<s:iterator value="recommendProducts">
						<li>
							<a href='<s:url action="ProductDetailsAction"><s:param name="productId" value="%{productId}"/></s:url>'>
								<img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' />
								<div class="text">
									<s:property value="productName" />
								</div>
							</a>

						</li>
					</s:iterator>
				</ul> --%>

				<ul>
					<li><a
						href='<s:url action="ProductDetailsAction">
		<s:param name="productId" value="7"/>
		</s:url>'>
							<img src="./images/ichikawa_city_zoo4.jpg">
							<div class="text">市川植物園</div>
					</a></li>
					<li><a
						href='<s:url action="ProductDetailsAction">
		<s:param name="productId" value="38"/>
		</s:url>'>
							<img src="./images/toshimaen2.jpg">
							<div class="text">としまえん</div>
					</a></li>

					<li><a
						href='<s:url action="ProductDetailsAction">
		<s:param name="productId" value="13"/>
		</s:url>'>
							<img src="./images/sunshine_aquarium5.jpg">
							<div class="text">サンシャイン水族館</div>
					</a></li>

					<li><a
						href='<s:url action="ProductDetailsAction">
		<s:param name="productId" value="45"/>
		</s:url>'>
							<img src="./images/ghibli_ｍ4.jpg">
							<div class="text">三鷹の森ジブリ美術館</div>
					</a></li>
				</ul>
			</div>

		</div>
	</div>






	<jsp:include page="footer.jsp" />

</body>
</html>