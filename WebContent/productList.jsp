<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/productList.css">

<jsp:include page="includeHead.jsp" />
<title>商品一覧</title>
</head>
<body>

	<jsp:include page="header.jsp" />
	<div id="main" class="cf">
		<jsp:include page="navigation.jsp" />
		<div id="contents">
			<h1>商品一覧</h1>
			<!-- 検索結果がない場合 -->
			<s:if test="productInfoDtoList==null">
				<div class="info">検索結果がありません。</div>
				<s:if test="!#session.keywordsErrorMessageList.isEmpty()">
					<s:iterator value="#session.keywordsErrorMessageList">
						<s:property /><br>
					</s:iterator>
				</s:if>
			</s:if>

			<!-- ある場合 -->
			<s:else>
				<!-- 商品一覧リスト（iteratorで回して複数件表示 -->
				<div id="product-list">
					<s:iterator value="#session.productInfoDtoList">
						<ul class="product-list-box">
							<li><a href='<s:url action="ProductDetailsAction">
											<s:param name="productId" value="%{productId}"/>
										</s:url>'>
										<img src='<s:property value="imageFilePath"/>/
										<s:property value="imageFileName"/>'
										class="item-image-box-200" />
								</a>
								<br>
								<div class="smallMoji"><s:property value="productNameKana"  /></div>
								<div class="largeMoji"><s:property value="productName"  /></div>
								<div class="largeMoji"><s:property value="price"  />円</div><br>
							</li>
						</ul>
					</s:iterator>
				</div>

				<!-- ページネーション -->
				<div class="pager">
					<s:iterator begin="1" end="#session.totalPageSize" status="pageNo">
						<s:if test="#session.currentPageNo == #pageNo.count">
							<s:property value="%{#pageNo.count}" />
						</s:if>
						<s:else>
							<a
								href="
								<s:url action='SearchItemAction'>
									<s:param name='pageNo' value='%{#pageNo.count}'/>
									<s:param name='categoryId' value='%{categoryId}'/>
									<s:param name='placeId' value='%{placeId}'/>
									<s:param name='targetDate' value='%{targetDate}'/>
								</s:url> ">
								<s:property value="%{#pageNo.count}" />
							</a>
						</s:else>
					</s:iterator>
				</div>
			</s:else>
		</div>
	</div>

	<jsp:include page="footer.jsp" />

</body>
</html>