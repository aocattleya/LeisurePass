<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/addProduct.css">

<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script>
	$(function() {
		var setFileInput = $('.preview');

		setFileInput
				.each(function() {
					var selfFile = $(this), selfInput = $(this).find(
							'input[type=file]');

					selfInput
							.change(function() {
								var file = $(this).prop('files')[0], fileRdr = new FileReader(), selfImg = selfFile
										.find('.imgView');

								if (!this.files.length) {
									if (0 < selfImg.size()) {
										selfImg.remove();
										return;
									}
								} else {
									if (file.type.match('image.*')) {
										if (!(0 < selfImg.size())) {
											selfFile
													.append('<img alt="" class="imgView">');
										}
										var prevElm = selfFile.find('.imgView');
										fileRdr.onload = function() {
											prevElm.attr('src', fileRdr.result);
										}
										fileRdr.readAsDataURL(file);
									} else {
										if (0 < selfImg.size()) {
											selfImg.remove();
											return;
										}
									}
								}
							});
				});
	});
</script>
<jsp:include page="includeHead.jsp" />
<title>商品追加画面</title>

</head>
<body>
	<jsp:include page="header.jsp" />
	​
	<div id="main">
		​
		<div id="admin-contents">
			<div class="title">
				<h1>商品追加画面</h1>
			</div>

			<div class="AllBox">
				<!-- 商品追加 -->
				<!-- 修正ボタンで戻ってきた場合、前回入力内容を保持した状態で表示 -->
				<s:if test="#session.containsKey('addProductDTO')">
					<s:form action="AddProductConfirmAction" method="post"
						enctype="multipart/form-data">

						<div class="text-title">
							商品ID<br>
						</div>
						<s:textfield name="productId" placeholder="半角数字で入力"
							value="%{#session.addProductDTO.productId}" class="txt2" />
						<br>
						<s:if test="!#session.productIdErrorMessageList.isEmpty()">
							<div class="errormessage">
								<s:iterator value="#session.productIdErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</s:if>
						<br>
						<br>
						<div class="text-title">
							商品名<br>
						</div>
						<s:textfield name="productName"
							value="%{#session.addProductDTO.productName}" class="txt2" />
						<br>
						<s:if test="!#session.productNameErrorMessageList.isEmpty()">
							<div class="errormessage">
								<s:iterator value="#session.productNameErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</s:if>
						<br>
						<br>
						<div class="text-title">
							商品かな<br>
						</div>
						<s:textfield name="productNameKana"
							value="%{#session.addProductDTO.productNameKana}" class="txt2" />
						<br>
						<s:if test="!#session.productNameKanaErrorMessageList.isEmpty()">
							<div class="errormessage">
								<s:iterator value="#session.productNameKanaErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</s:if>
						<br>
						<br>
						<div class="text-title">
							カテゴリ<br>
						</div>
						<select name="categoryId">
							<s:if test="%{#session.addProductDTO.categoryId == 2}">
								<option value="2" selected="selected">動物園</option>
							</s:if>
							<s:else>
								<option value="2">動物園</option>
							</s:else>
							<s:if test="%{#session.addProductDTO.categoryId == 3}">
								<option value="3" selected="selected">水族館</option>
							</s:if>
							<s:else>
								<option value="3">水族館</option>
							</s:else>
							<s:if test="%{#session.addProductDTO.categoryId == 4}">
								<option value="4" selected="selected">アスレチック</option>
							</s:if>
							<s:else>
								<option value="4">アスレチック</option>
							</s:else>
							<s:if test="%{#session.addProductDTO.categoryId == 5}">
								<option value="5" selected="selected">遊園地</option>
							</s:if>
							<s:else>
								<option value="5">遊園地</option>
							</s:else>
							<s:if test="%{#session.addProductDTO.categoryId == 6}">
								<option value="6" selected="selected">美術館</option>
							</s:if>
							<s:else>
								<option value="6">美術館</option>
							</s:else>

						</select>
						<br>
						<br>
						<div class="text-title">
							場所<br>
						</div>
						<select name="placeId">
							<s:if test="%{#session.addProductDTO.placeId == 2}">
								<option value="2" selected="selected">茨城県</option>
							</s:if>
							<s:else>
								<option value="2">茨城県</option>
							</s:else>
							<s:if test="%{#session.addProductDTO.placeId == 3}">
								<option value="3" selected="selected">栃木県</option>
							</s:if>
							<s:else>
								<option value="3">栃木県</option>
							</s:else>
							<s:if test="%{#session.addProductDTO.placeId == 4}">
								<option value="4" selected="selected">群馬県</option>
							</s:if>
							<s:else>
								<option value="4">群馬県</option>
							</s:else>
							<s:if test="%{#session.addProductDTO.placeId == 5}">
								<option value="5" selected="selected">千葉県</option>
							</s:if>
							<s:else>
								<option value="5">千葉県</option>
							</s:else>
							<s:if test="%{#session.addProductDTO.placeId == 6}">
								<option value="6" selected="selected">埼玉県</option>
							</s:if>
							<s:else>
								<option value="6">埼玉県</option>
							</s:else>
							<s:if test="%{#session.addProductDTO.placeId == 7}">
								<option value="7" selected="selected">東京都</option>
							</s:if>
							<s:else>
								<option value="7">東京都</option>
							</s:else>
							<s:if test="%{#session.addProductDTO.placeId == 8}">
								<option value="8" selected="selected">神奈川県</option>
							</s:if>
							<s:else>
								<option value="8">神奈川県</option>
							</s:else>
						</select>
						<br>
						<br>
						<div class="text-title">
							価格(円)<br>
						</div>
						<s:textfield name="price" value="%{#session.addProductDTO.price}"
							class="txt2" />
						<br>
						<s:if test="!#session.priceErrorMessageList.isEmpty()">
							<div class="errormessage">
								<s:iterator value="#session.priceErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</s:if>
						<br>
						<br>
						<div class="text-title">
							画像ファイル選択<br>
						</div>
						<div class="preview">
							<%-- <img id="image_path" src="<s:property value="image_file_path"/>"width="100"height="100"/> --%>
							<s:file name="productImage" />
						</div>
						<br>
						<s:if test="!#session.productImageErrorMessageList.isEmpty()">
							<div class="errormessage">
								<s:iterator value="#session.productImageErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</s:if>
						<br>
						<br>
						<div class="text-title">
							発売年月<br>
						</div>
						<s:textfield name="releaseDate"
							value="%{#session.addProductDTO.releaseDateString}" class="txt2" />
						<br>
						<s:if test="!#session.releaseDateErrorMessageList.isEmpty()">
							<div class="errormessage">
								<s:iterator value="#session.releaseDateErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</s:if>
						<br>
						<br>
						<div class="text-title">
							発売会社<br>
						</div>
						<s:textfield name="releaseCompany"
							value="%{#session.addProductDTO.releaseCompany}" class="txt2" />
						<br>
						<s:if test="!#session.releaseCompanyErrorMessageList.isEmpty()">
							<div class="errormessage">
								<s:iterator value="#session.releaseCompanyErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</s:if>
						<br>
						<br>
						<div class="text-title">
							所在地<br>
						</div>
						<s:textfield name="location"
							value="%{#session.addProductDTO.location}" class="txt2" />
						<br>
						<s:if test="!#session.locationErrorMessageList.isEmpty()">
							<div class="errormessage">
								<s:iterator value="#session.locationErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</s:if>
						<br>
						<br>
						<div class="text-title">
							アクセス<br>
						</div>
						<s:textfield name="access"
							value="%{#session.addProductDTO.access}" class="txt2" />
						<br>
						<s:if test="!#session.accessErrorMessageList.isEmpty()">
							<div class="errormessage">
								<s:iterator value="#session.accessErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</s:if>
						<br>
						<br>
						<div class="text-title">
							URL<br>
						</div>
						<s:textfield name="url" value="%{#session.addProductDTO.url}"
							class="txt2" />
						<br>
						<s:if test="!#session.urlErrorMessageList.isEmpty()">
							<div class="errormessage">
								<s:iterator value="#session.urlErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</s:if>
						<br>
						<br>
						<div class="text-title">
							開始日<br>
						</div>
						<s:textfield name="startDate"
							value="%{#session.addProductDTO.startDateString}" class="txt2" />
						<br>
						<s:if test="!#session.startDateErrorMessageList.isEmpty()">
							<div class="errormessage">
								<s:iterator value="#session.startDateErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</s:if>
						<br>
						<br>
						<div class="text-title">
							終了日<br>
						</div>
						<s:textfield name="endDate"
							value="%{#session.addProductDTO.endDateString}" class="txt2" />
						<br>
						<s:if test="!#session.endDateErrorMessageList.isEmpty()">
							<div class="errormessage">
								<s:iterator value="#session.endDateErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</s:if>
						<br>
						<br>
						<div class="text-title">
							商品詳細<br>
						</div>
						<s:textfield name="productDescription"
							value="%{#session.addProductDTO.productDescription}"
							class="productDescription" />
						<br>
						<s:if
							test="!#session.productDescriptionErrorMessageList.isEmpty()">
							<div class="errormessage">
								<s:iterator value="#session.productDescriptionErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</s:if>
						<br>
						<br>
						<s:submit value="確認画面へ" class="submit_btn" />

					</s:form>
				</s:if>
				<!-- 新規入力 -->
				<s:else>
					<div class="textbox">
						<s:form action="AddProductConfirmAction" method="post"
							enctype="multipart/form-data">
							<div class="text-title">
								<b>商品ID</b><br>
							</div>
							<s:textfield name="productId" placeholder="半角数字で入力" class="txt3" />
							<br>
							<br>
							<div class="text-title">
								<b>商品名</b><br>
							</div>
							<s:textfield name="productName" class="txt3" />
							<br>
							<br>
							<div class="text-title">
								<b>商品かな</b><br>
							</div>
							<s:textfield name="productNameKana" placeholder="ひらがなで入力してね"
								class="txt3" />
							<br>
							<br>

							<div class="text-title">
								<b>カテゴリ</b><br>
							</div>
							<select name="categoryId" class="txt">
								<option value="2" selected="selected">動物園</option>
								<option value="3">水族館</option>
								<option value="4">アスレチック</option>
								<option value="5">遊園地</option>
								<option value="6">美術館</option>
							</select>
							<br>
							<br>
							<div class="text-title">
								<b>場所</b><br>
							</div>
							<select name="placeId" class="txt">
								<option value="2" selected="selected">茨城県</option>
								<option value="3">栃木県</option>
								<option value="4">群馬県</option>
								<option value="5">千葉県</option>
								<option value="6">埼玉県</option>
								<option value="7">東京都</option>
								<option value="8">神奈川県</option>
							</select>
							<br>
							<br>
							<div class="text-title">
								<b>価格(円)</b><br>
							</div>
							<s:textfield name="price" placeholder="半角数字で入力" class="txt3" />
							<br>
							<br>
							<div class="text-title">
								<b>画像ファイル選択</b><br>
							</div>
							<div class="preview">
								<s:file name="productImage" />
							</div>
							<br>
							<br>
							<div class="text-title">
								<b>発売年月</b><br>
							</div>
							<s:textfield name="releaseDate"
								placeholder="yyyy-MM-dd もしくは yyyy年MM月dd日" class="txt3" />
							<br>
							<br>
							<div class="text-title">
								<b>発売会社</b><br>
							</div>
							<s:textfield name="releaseCompany" class="txt3" />
							<br>
							<br>
							<div class="text-title">
								<b>所在地</b><br>
							</div>
							<s:textfield name="location" class="txt3" />
							<br>
							<br>
							<div class="text-title">
								<b>アクセス</b><br>
							</div>
							<s:textfield name="access" class="txt3" />
							<br>
							<br>
							<div class="text-title">
								<b>URL</b><br>
							</div>
							<s:textfield name="url" placeholder="半角英数字で入力して" class="txt3" />
							<br>
							<br>
							<div class="text-title">
								<b>開始日</b><br>
							</div>
							<s:textfield name="startDate"
								placeholder="yyyy-MM-dd もしくは yyyy年MM月dd日" class="txt3" />
							<br>
							<br>
							<div class="text-title">
								<b>終了日</b><br>
							</div>
							<s:textfield name="endDate"
								placeholder="yyyy-MM-dd もしくは yyyy年MM月dd日" class="txt3" />
							<br>
							<br>
							<div class="text-title">
								<b>商品詳細</b><br>
							</div>
							<s:textfield name="productDescription" class="txt3" />
							<br>
							<br>
							<s:submit value="確認画面へ" class="submit_btn" />
						</s:form>
					</div>
				</s:else>

				​
				<!-- 商品管理画面に戻る -->
				<a href="http://localhost:8080/leisurepass/AdminProductAction"
					id="correction">戻る</a>
			</div>
		</div>
		<div id="footer"></div>
	</div>
</body>
</html>
