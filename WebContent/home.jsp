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
			  auto: true,
			  //画像フェードアウト
			  mode: 'fade',
			  // 自動再生で切り替えをする時間
			  speed: 1000,
			  /* sliderWidth: 1346 */
		});
	});
</script>

<style type="text/css">

/* #contents{
background-color: red;
}

.slider{
background-color: blue;
}

.box{
background-color: yellow;
} */


.slider img {
	width: 1344px;
	height: 500px;
	object-fit: cover;
	object-fit: cover;
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


/* .box {
	clear: left;
	padding-top: 10px;
	margin: 0 auto;
	height: auto;

} */

.box p{
font-size: 18px;
text-align: center;
font-weight: bold;
font-family: 'メイリオ', sans-serif;

}

.box ul {
	list-style-type: none;
	margin: 0 auto;
	width: 1300px;
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
	margin: 0;
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
		<s:param name="productId" value="3"/>
		</s:url>'>
						<img src="./images/gunma_safari_park3.png">
					</a>
				</div>

				<div>
					<img src="./images/tokyo_dome_city.jpg">
				</div>
				<div>
					<img src="./images/digital_art_m1.jpg">
				</div>
				<div>
					<img src="./images/disneyland1.jpg">
				</div>
				<div>
					<img src="./images/sanrio_puroland4.jpg">
				</div>
			</div>

			<div class="box">

			<p>おすすめピックアップ</p>

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