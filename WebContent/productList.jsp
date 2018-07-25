<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/productList.css">
<!-- アイコン -->
<link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css"
	rel="stylesheet">
<!-- アイコン動き -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome-animation/0.0.10/font-awesome-animation.css"
	type="text/css" media="all" />

<jsp:include page="includeHead.jsp" />
<title>商品一覧</title>

</head>
<body>
	<div id=top>
		<jsp:include page="header.jsp" />
	</div>
	<div id="main" class="cf">
		<jsp:include page="navigation.jsp" />
		<div id="contents">

			<audio id="Elephant" preload="auto">
				<source src="audio/elephant1.mp3" type="audio/mp3">
			</audio>
			<audio id="Fish" preload="auto">
				<source src="audio/water01.mp3" type="audio/mp3">
			</audio>

			<s:if test="!(productInfoDtoList==null)">
				<h1>
					<img class="ele" src="images/elephant.jpg">
					&nbsp;商品一覧&nbsp; <img class="fish" src="images/fish.jpg">
				</h1>
			</s:if>


			<!-- 検索結果がない場合 -->
			<s:if test="productInfoDtoList==null">
				<div class="info">検索結果がありません。</div>
				<s:if test="!#session.keywordsErrorMessageList.isEmpty()">
					<s:iterator value="#session.keywordsErrorMessageList">
						<s:property /><br>
					</s:iterator>
				</s:if>

				<s:form action="HomeAction">
					<s:submit value="HOME" class="submit_btn" id="HomeAction" />
				</s:form>

			</s:if>


			<!-- ある場合 -->
			<s:else>
				<!-- 商品一覧リスト（iteratorで回して複数件表示 -->
				<div id="product-list">
					<s:iterator value="#session.productInfoDtoList">

<!-- 商品単体 -->
						<div class="product-list-box">
							<a
								href='<s:url action="ProductDetailsAction">
											<s:param name="productId" value="%{productId}"/>
										</s:url>'>
								<img
								src='<s:property value="imageFilePath"/>/
										<s:property value="imageFileName"/>'
								class="item-image-box-200" />
							</a> <br>
							<div class="smallMoji">
								<s:property value="productNameKana" />
							</div>
							<div class="largeMoji">
								<s:property value="productName" />
							</div>
							<div class="largeMoji">
								<s:property value="price" />
								円
							</div>
							<br>

						</div>


					</s:iterator>
				</div><br>

				<!-- ページネーション -->
				<div class="pager">

					<!-- ------------------------------一つ前のページへ---------------------------------- -->
					<s:if test="!(#session.currentPageNo == 1)">
						<a
							href="<s:url action='SearchItemAction'>
						<s:param name='pageNo' value='#session.currentPageNo -1' />
						<s:param name='keywords' value='%{keywords}'/>
						<s:param name='categoryId' value='%{categoryId}'/>
						<s:param name='placeId' value='%{placeId}'/>
						<s:param name='targetDate' value='%{targetDate}'/>
						</s:url>"
							id="Numbers" class="zengo">&lt;</a>
					</s:if>
					<s:else>
						<a
							href="<s:url>
						</s:url>" class="no-zengo">&lt;</a>
					</s:else>


					<!-- ------------------------------ページ番号表示----------------------------------- -->
					<s:iterator begin="1" end="#session.totalPageSize" status="pageNo"
						id="pager_btn">


						<!-- -------------------------------現在のページ------------------------------------ -->

						<s:if test="#session.currentPageNo == #pageNo.count">

							<a href="/" id="Numbers" class="disabled"> <s:property
									value="%{#pageNo.count}" /></a>
						</s:if>

						<!-- ----------------------------リンクするページ----------------------------------- -->

						<s:else>
							<a
								href="
								<s:url action='SearchItemAction'>
									<s:param name='pageNo' value='%{#pageNo.count}'/>
									<s:param name='keywords' value='%{keywords}'/>
									<s:param name='categoryId' value='%{categoryId}'/>
									<s:param name='placeId' value='%{placeId}'/>
									<s:param name='targetDate' value='%{targetDate}'/>
								</s:url> "
								id="Numbers" class="page_num"> <s:property
									value="%{#pageNo.count}" />
							</a>
						</s:else>



					</s:iterator>
					<!-- ----------------------------一つ次のページへ------------------------------------ -->
					<s:if test="!(#session.currentPageNo == #session.totalPageSize)">

						<a
							href="<s:url action='SearchItemAction'>
						<s:param name='pageNo' value='#session.currentPageNo +1' />
						<s:param name='keywords' value='%{keywords}'/>
						<s:param name='categoryId' value='%{categoryId}'/>
						<s:param name='placeId' value='%{placeId}'/>
						<s:param name='targetDate' value='%{targetDate}'/>
						</s:url>"
							id="Numbers" class="zengo">&gt;</a>
					</s:if>
					<s:else>
						<a
							href="<s:url>
						</s:url>" class="no-zengo">&gt;</a>
					</s:else>
				</div>
			</s:else>
			<br>


			<s:if test="!(productInfoDtoList==null)">
				<a href=#top><i
					class="fas fa-chevron-circle-up faa-bounce animated-hover page_up"></i></a>
			</s:if>
		</div>
	</div>


	<jsp:include page="footer.jsp" />

</body>
</html>