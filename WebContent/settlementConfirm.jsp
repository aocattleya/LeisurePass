<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<jsp:include page="includeHead.jsp" />
<title>決済確認</title>
</head>

<body>
	<jsp:include page="header.jsp" />
	<div id="main" class="cf">
		<jsp:include page="navigation.jsp" />
		<div id="contents">
			<h1>決済確認画面</h1>

			<s:if test="!(noDestinationMassage == null)">
				<s:property value="noDestinationMassage" />
			</s:if>

			<s:else>
				<div class="info">送り先情報 を選択してください</div>
			</s:else>

			<!-- ここから決済ボタンまでの要素 -->
			<s:form id="form" action="SettlementCompleteAction">

				<!-- リストテーブルの作成↓ -->
				<table class="horizontal-list-table">

					<!-- ヘッダーラベル -->
					<thead>
						<tr>
							<th><s:label value="#" /></th>
							<th><s:label value="名前" /></th>
							<th><s:label value="ふりがな" /></th>
							<th><s:label value="住所" /></th>
							<th><s:label value="電話番号" /></th>
							<th><s:label value="メールアドレス" /></th>
						</tr>
					</thead>

					<!-- ボディラベル -->
					<tbody>
						<s:iterator value="#session.destinationInfoDtoList" status="st">
							<tr>
								<!-- 1つ目をチェックしておく -->
								<td>
									<s:if test="#st.index == 0">
										<input type="radio" name="id" checked="checked" value="<s:property value='id'/>" />
									</s:if>

									<s:else>
										<input type="radio" name="id" value="<s:property value='id'/>" />
									</s:else> <!-- それ以外はNOチェック -->
								</td>

								<td>
									<!-- 名前：苗字 -->
									<s:property value="familyName" />
									<span></span>
									<!-- 名前：名 -->
									<s:property value="firstName" /><br>
								</td>

								<td>
									<!-- なまえ：みょう -->
									<s:property value="familyNameKana" />
									<span></span>
									<!-- なまえ：めい -->
									<s:property value="firstNameKana" />
									<br>
								</td>

								<!-- 住所 -->
								<td><s:property value="userAddress" /></td>

								<!-- 電話番号 -->
								<td><s:property value="telNumber" /></td>

								<!-- メール -->
								<td><s:property value="email" /></td>
						</s:iterator>
					</tbody>
				</table>	<!-- ここまでリストテーブルの作成↑ -->


				<!-- 決済ボタン -->
				<div class="submit_btn_box">
					<div id=".contents-btn-set">
						<s:submit value="決済" class="submit_btn" />
					</div>
				</div>

			</s:form>	<!-- ここまで決済ボタンまでの要素 -->


			<!-- 新規登録ボタン↓ -->
			<div class="submit_btn_box">
				<div id=".contents-btn-set">
					<!-- 実行：CreateDestinationAction -->
					<s:form action="CreateDestinationAction">

						<s:submit value="新規登録" class="submit_btn" />
					</s:form>
				</div>
			</div>

		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>