<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%-- 未使用？<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<jsp:include page="includeHead.jsp" />
<style type="text/css">


h1 {
color: #333333;
}
th {
color: #333333;
}

#contents {
	margin: 0 auto;
	/* padding: 0; */
	line-height: 1.6;
	letter-spacing: 1px;
	font-family: "メイリオ", sans-serif;
	font-size: 18px;
	text-align: center;
}

 .vertical-list-table {
margin: auto;
}

.error-message{
color: #ed7d22;
font-size:12px;
}

/*入力欄の中の文字色（入力すると消えるヒント）指定（webkit＝GoogleChrome、Safariのみ対応）*/
.txt::-webkit-input-placeholder {
	color: #aaaaaa;
}
.txt2::-webkit-input-placeholder {
	color: #aaaaaa;
}

input.txt{
height:40px;
width: 225px;
background-color: #f7f7f7;
border-radius: 5px; /*角の丸み*/
font-size: 18px;


}
/*入力欄CSS*/
input.txt2{
height:40px;/*入力欄の縦の長さ*/
width: 450px;/*入力欄の横の長さ*/
background-color: #f7f7f7;/*入力欄の中の色*/
border-radius: 5px; /*入力欄の角の丸み*/
font-size: 18px;/*入力欄の文字サイズ*/
}


/*ボタンのCSS*/
.submit_btn {
	width: 200px;/*ボタンの横の長さ*/
	height:40px;/*ボタンの縦の長さ*/
	/* display: inline-block; 多分要らないかも*/
	font-size:20px;/*ボタン文字サイズ*/
	color: #FFF;/*ボタン文字の色*/
	background: #ed7d22; /*ボタンの色*/
	border-radius: 20px; /*ボタンの角の丸み*/
	box-shadow: inset 0 2px 0 rgba(255, 255, 255, 0.2), inset 0 -2px 0 rgba(0, 0, 0, 0.05);/*ボタンの影（立体感）*/
	border: solid 2px #d27d00;/*ボタンの立体感を出すため*/
}

</style>
<title>お届け先の登録</title>
</head>
<body>
	<jsp:include page="header.jsp" />

	<div id="main" class="cf">

		<jsp:include page="navigation.jsp" />

		<div id="contents">
			<h1>お届け先の登録</h1>
			<s:form action="CreateDestinationConfirmAction">
				<table class="vertical-list-table">


					<tr><!-- 名前入力ボックス -->
					<th colspan="2">名前</th>
					</tr>
					<tr>
						<td><s:textfield placeholder="姓を入力" name="familyName" class="txt" /></td>
						<td><s:textfield placeholder="名を入力" name="firstName" class="txt" /></td>
					</tr>
					<tr>
						<td><s:if test="!#session.familyNameErrorMessageList.isEmpty()">
								<div class="error">
									<div class="error-message">
										<s:iterator value="#session.familyNameErrorMessageList">
											<s:property />
											<br>
										</s:iterator>
									</div>
								</div>
							</s:if></td>

							<td><s:if test="!#session.firstNameErrorMessageList.isEmpty()">
								<div class="error">
									<div class="error-message">
										<s:iterator value="#session.firstNameErrorMessageList">
											<s:property />
											<br>
										</s:iterator>
									</div>
								</div>
							</s:if></td>
					</tr>

					<tr><!-- ふりがなボックス -->
					<th colspan="2">なまえ(ふりがな)</th>
					</tr>
					<tr>
						<td><s:textfield placeholder="姓(ふりがな)を入力" name="familyNameKana" class="txt" /></td>
						<td><s:textfield placeholder="名(ふりがな)を入力" name="firstNameKana" class="txt" /></td>
					</tr>
					<tr>
						<td><s:if test="!#session.familyNameKanaErrorMessageList.isEmpty()">
								<div class="error">
									<div class="error-message">
										<s:iterator value="#session.familyNameKanaErrorMessageList">
											<s:property />
											<br>
										</s:iterator>
									</div>
								</div>
							</s:if></td>

						<td><s:if test="!#session.firstNameKanaErrorMessageList.isEmpty()">
								<div class="error">
									<div class="error-message">
										<s:iterator value="#session.firstNameKanaErrorMessageList">
											<s:property />
											<br>
										</s:iterator>
									</div>
								</div>
							</s:if></td>

					<tr><!-- 性別ボックス -->
					<th colspan="2">性別</th>
					</tr>
					<tr>
						<td colspan="2"><s:radio name="sex" list="sexList"
								value="defaultSexValue" label="性別" placeholder="性別" /></td>
					</tr>

					<tr>
					<th colspan="2">住所</th>
					</tr>
					<tr>
						<td colspan="2"><s:textfield placeholder="住所を入力" name="userAddress" class="txt2" /></td>
					</tr>
					<tr>
						<td colspan="2"><s:if test="!#session.userAddressErrorMessageList.isEmpty()">
								<div class="error">
									<div class="error-message">
										<s:iterator value="#session.userAddressErrorMessageList">
											<s:property />
											<br>
										</s:iterator>
									</div>
								</div>
							</s:if></td>
					</tr>


					<tr><!-- 電話番号ボックス -->
					<th colspan="2">電話番号</th>
					</tr>
					<tr>
						<td colspan="2"><s:textfield placeholder="電話番号を入力" name="telNumber" class="txt2" /></td>
					</tr>
					<tr>
						<td colspan="2"><s:if test="!#session.telNumberErrorMessageList.isEmpty()">
								<div class="error">
									<div class="error-message">
										<s:iterator value="#session.telNumberErrorMessageList">
											<s:property />
											<br>
										</s:iterator>
									</div>
								</div>
							</s:if></td>
					</tr>

					<tr><!-- メールアドレスボックス -->
					<th colspan="2">メールアドレス</th>
					</tr>
					<tr>
						<td colspan="2"><s:textfield placeholder="メールアドレスを入力" name="email" class="txt2" /></td>
					</tr>
					<tr>
						<td colspan="2"><s:if test="!#session.emailErrorMessageList.isEmpty()">
								<div class="error">
									<div class="error-message">
										<s:iterator value="#session.emailErrorMessageList">
											<s:property />
											<br>
										</s:iterator>
									</div>
								</div>
							</s:if></td>
					</tr>

				</table><br>

				<div class="submit_btn_box">
					<div class=".contents-btn-set">
						<s:submit value="宛先情報確認" class="submit_btn" />
					</div>
				</div>
			</s:form>
		</div>
	</div>

	<jsp:include page="footer.jsp" />
</body>
</html>