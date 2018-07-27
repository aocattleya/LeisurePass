<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%-- 未使用？<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/createDestination.css">
<jsp:include page="includeHead.jsp" />

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
								value="%{sex}" label="性別" placeholder="性別" /></td>
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
						<s:submit value="確認" class="submit_btn" />
					</div>
				</div>
			</s:form>
		</div>
	</div>

	<jsp:include page="footer.jsp" />
</body>
</html>