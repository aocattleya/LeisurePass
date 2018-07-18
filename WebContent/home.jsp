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
<%-- <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js">

</script> --%>
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
			speed : 1000
		});
	});
</script>

<style type="text/css">


.slider img {
	width: 1344px;
	height: 500px;
	display: flex;
	justify-content: center;
}

/*スライダー*/
/*. bx-wrapper .bx-pager.bx-default-pager  {
  position: absolute;
  bottom: 0;
  left: 0;
  background: #666;
  background: rgba(150, 150, 150, 0.75);
  width: 100%;
} */

 /* 画像センターに */





 p {
	font-size: 18px;
	text-align: center;
	font-weight: bold;
	font-family: 'メイリオ', sans-serif;
}

.box ul {
	list-style-type: none;
	margin: 0 auto;
	width: 1300px;
	padding-left: 0;
	display: flex;
	justify-content: center;	/* 中央よせ */
}

.box li {
	float: left;
}

.box li a {
	padding: 16px;
	color: #333;
	font-size: 15px;
	font-family: 'メイリオ', sans-serif;
	text-decoration: none;
}

.box img {
	width: 240px;
	height: 220px;
	border-radius: 5px;
	object-fit: cover;
	margin: 24px;
}

.box .text {
	font-size: 15px;
	text-align: center;
}
</style>

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
						href='<s:url action="ProductDetailsAction">
		<s:param name="productId" value="8"/>
		</s:url>'>
						<img src="./images/ueno_zoo5.jpg">
					</a>
				</div>

				<div>
					<a
						href='<s:url action="ProductDetailsAction">
		<s:param name="productId" value="35"/>
		</s:url>'>
						<img src="./images/tokyo_dome_city.jpg">
					</a>
				</div>

				<div>
				<a
						href='<s:url action="ProductDetailsAction">
		<s:param name="productId" value="44"/>
		</s:url>'>
					<img src="./images/digital_art_m6.jpg">
					</a>
				</div>

				<div>
				<a
						href='<s:url action="ProductDetailsAction">
		<s:param name="productId" value="12"/>
		</s:url>'>
					<img src="./images/kamogawa_sea_world6.jpg">
					</a>
				</div>

				<div>
				<a
						href='<s:url action="ProductDetailsAction">
		<s:param name="productId" value="30"/>
		</s:url>'>
					<img src="./images/parcabout5.jpg">
					</a>
				</div>
			</div>

			<p>おすすめピックアップ</p>

			<div class="box">

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