<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<jsp:include page="includeHead.jsp" />
<title>商品追加画面</title>
<style type="text/css">

body {
	width: 100%;
	font-family: 'メイリオ', sans-serif;
	font-size: 18px;
	color: #333333;　/* 黒 */
}

input.txt2{
height:40px;/*入力欄の縦の長さ*/
width: 450px;/*入力欄の横の長さ*/
background-color: #f7f7f7;/*入力欄の中の色*/
border-radius: 5px; /*入力欄の角の丸み*/
font-size: 18px;/*入力欄の文字サイズ*/
}

#contents{
	text-align: center;
}

</style>
</head>
<body>
	<jsp:include page="header.jsp" />
	​
	<div id="main" class="cf">
		​
		<jsp:include page="navigation.jsp" />
		​
		<div id="contents">
			<div>
				<h1>商品追加画面</h1>
			</div>
			<!-- 商品追加 -->
			<!-- 修正ボタンで戻ってきた場合、前回入力内容を保持した状態で表示 -->
			<s:if test="#session.containsKey('addProductDTO')">
				<s:form action="AddProductConfirmAction"  method="post" enctype="multipart/form-data">
				商品ID<br><s:textfield name="productId" placeholder="例：100"
						value="%{#session.addProductDTO.productId}" class="txt2"/>
					<br><br>
				商品名<br><s:textfield name="productName"
						value="%{#session.addProductDTO.productName}" class="txt2" />
					<br><br>
				商品かな<br><s:textfield name="productNameKana"
						value="%{#session.addProductDTO.productNameKana}" class="txt2" />
					<br><br>
				商品詳細<br><s:textfield name="productDescription"
						value="%{#session.addProductDTO.productDescription}" class="txt2" />
					<br><br>
				カテゴリ<br><select name="categoryId">
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
					<br><br>
				場所<br><select name="placeId">
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
					<br><br>
				価格(円)<br><s:textfield name="price" value="%{#session.addProductDTO.price}" class="txt2"/>
					<br><br>
				画像ファイル選択<br><img id="image_path" src="<s:property value="image_file_path"/>"width="100"height="100"/>
					<s:file name="productImage" />
					<br><br>
				発売年月<br><s:textfield name="releaseDate"
						value="%{#session.addProductDTO.releaseDate}" class="txt2"/>
					<br><br>
				発売会社<br><s:textfield name="releaseCompany"
						value="%{#session.addProductDTO.releaseCompany}" class="txt2"/>
					<br><br>
				所在地<br><s:textfield name="location" value="%{#session.addProductDTO.location}" class="txt2"/>
					<br><br>
				アクセス<br><s:textfield name="access" value="%{#session.addProductDTO.access}" class="txt2"/>
					<br><br>
				URL<br><s:textfield name="url" value="%{#session.addProductDTO.url}" class="txt2"/>
					<br><br>
				開始日<br><s:textfield name="startDate" value="%{#session.addProductDTO.startDate}" class="txt2"/>
					<br><br>
				終了日<br><s:textfield name="endDate" value="%{#session.addProductDTO.endDate}" class="txt2"/>
					<br><br>
					<s:submit value="確認画面へ" />
				</s:form>
			</s:if>

			<!-- 新規入力 -->
			<s:else>
				<s:form action="AddProductConfirmAction" method="post" enctype="multipart/form-data">
				商品ID<br><s:textfield name="productId" placeholder="例：100" class="txt2"/>
					<br><br>
				商品名<br><s:textfield name="productName" class="txt2"/>
					<br><br>
				商品かな<br><s:textfield name="productNameKana" class="txt2"/>
					<br><br>
				商品詳細<br><s:textarea name="productDescription" class="txt2"/>
					<br><br>
				カテゴリ<br><select name="categoryId">
						<option value="2" selected="selected">動物園</option>
						<option value="3">水族館</option>
						<option value="4">アスレチック</option>
						<option value="5">遊園地</option>
						<option value="6">美術館</option>
					</select>
					<br><br>
				場所<br><select name="placeId">
						<option value="2" selected="selected">茨城県</option>
						<option value="3">栃木県</option>
						<option value="4">群馬県</option>
						<option value="5">千葉県</option>
						<option value="6">埼玉県</option>
						<option value="7">東京都</option>
						<option value="8">神奈川県</option>
					</select>
					<br><br>
				価格(円)<br><s:textfield name="price" class="txt2"/>
					<br><br>
				画像ファイル選択<br><s:file name="productImage" />
					<br><br>
				発売年月<br><s:textfield name="releaseDate" class="txt2"/>
					<br><br>
				発売会社<br><s:textfield name="releaseCompany" class="txt2"/>
					<br><br>
				所在地<br><s:textfield name="location" class="txt2"/>
					<br><br>
				アクセス<br><s:textfield name="access" class="txt2"/>
					<br><br>
				URL<br><s:textfield name="url" class="txt2"/>
					<br><br>
				開始日<br><s:textfield name="startDate" class="txt2"/>
					<br><br>
				終了日<br><s:textfield name="endDate" class="txt2"/>
					<br><br>
					<s:submit value="確認画面へ" />
				</s:form>
			</s:else>
			​
			<!-- 商品管理画面に戻る -->
			<s:form action="GoAdminAction">
				<s:submit value="戻る" />
			</s:form>
		</div>
		<div id="footer"></div>
	</div>
</body>
</html>
