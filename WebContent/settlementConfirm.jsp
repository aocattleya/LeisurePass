<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>決済確認</title>
</head>

<body>
	<jsp:include page="header.jsp" />
	<div id="main" class="cf">
		<jsp:include page="navigation.jsp" />
		<div id="contents">
			<h1>決済確認画面</h1>
			<div class="info">送り先情報を選択してください</div>

			<s:form id="form" action="SettlementCompleteAction">                    <!-- ここから決済ボタンまでの要素 -->

				<table class="horizontal-list-table">                               <!-- リストテーブルの作成↓ -->
					<thead>                                                         <!-- ヘッダーラベル↓ -->
						<tr>
							<th><s:label value="#" /></th>
							<th><s:label value="名前" /></th>
							<th><s:label value="ふりがな" /></th>
							<th><s:label value="住所" /></th>
							<th><s:label value="電話番号" /></th>
							<th><s:label value="メールアドレス" /></th>
						</tr>
					</thead>                                                        <!-- ヘッダーラベル↑ -->

					<tbody>                                                         <!-- ボディラベル↓ -->
						<s:iterator value="#session.destinationInfoDtoList" status="st">
							<tr>
								<td>
									<s:if test="#st.index == 0">
										<input type="radio" name="id" checked="checked" value="<s:property value='id'/>" />
									</s:if>
									<s:else>
										<input type="radio" name="id" value="<s:property value='id'/>" />
									</s:else>
								</td>

								<td>
									<s:property value="familyName" /><span></span>
									<s:property value="firstName" /><br>
								</td>

								<td>
									<s:property value="familyNameKana" /><span></span>
									<s:property value="firstNameKana" /><br>
								</td>

								<td><s:property value="userAddress" /></td>
								<td><s:property value="telNumber" /></td>
								<td><s:property value="email" /></td>
						</s:iterator>

					</tbody>                                                        <!-- ボディラベル↑ -->
				</table>                                                            <!-- リストテーブルの作成↑ -->

				<div class="submit_btn_box">                               <!-- 決済ボタン↓ -->
					<div id=".contents-btn-set">
						<s:submit value="決済" class="submit_btn" />
					</div>
				</div>                                                     <!-- 決済ボタン↑ -->

			</s:form>                                                               <!-- ここまで決済ボタンまでの要素 -->

			<div class="submit_btn_box">                                   <!-- 新規登録ボタン↓ -->
				<div id=".contents-btn-set">
					<s:form action="CreateDestinationAction">              <!-- 実行：CreateDestinationAction -->
						<s:submit value="新規登録" class="submit_btn" />
					</s:form>
				</div>
			</div>                                                         <!-- 新規登録ボタン↑ -->

		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>