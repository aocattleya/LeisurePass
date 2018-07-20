<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/settlementConfirm.css">
<jsp:include page="includeHead.jsp" />
<title>決済確認</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="main" class="cf">
		<jsp:include page="navigation.jsp" />
		<div id="contents">
			<s:form id="form" action="SettlementCompleteAction">
				<s:if test="#session.destinationInfoDtoList == null">
					<div class="noMassage">宛先を登録してください</div>
					<br>
				</s:if>
				<s:else>
					<div class="info">
						<h2>宛先を選択してください</h2>
					</div><br>
				</s:else>
				<s:iterator value="#session.destinationInfoDtoList" status="st">
					<table class="horizontal-list-table">
						<tr>
							<th><div class="orangeBorder">名前</div></th>
						</tr>
						<tr>
							<td>
								<s:property value="familyName" />
								<span></span>
								<s:property value="firstName" />
							</td>
						</tr>
						<tr>
							<th>
								<div class="orangeBorder">ふりがな</div>
							</th>
						</tr>
						<tr>
							<td>
								<s:property value="familyNameKana" />
								<span></span>
								<s:property value="firstNameKana" />
							</td>
						</tr>
						<tr>
							<th>
								<div class="orangeBorder">住所</div>
							</th>
						</tr>
						<tr>
							<td>
								<s:property value="userAddress" />
							</td>
						</tr>
						<tr>
							<th>
								<div class="orangeBorder">電話番号</div>
							</th>
						</tr>
						<tr>
							<td>
								<s:property value="telNumber" />
							</td>
						</tr>
						<tr>
							<th>
								<div class="orangeBorder">メール</div>
							</th>
						<tr>
							<td>
								<s:property value="email" />
								<br><br>
							</td>
						</tr>
						<tr>
							<td>
								<s:if test="#st.index == 0">
									<div class="clickRadio">
										<input type="radio" name="id" checked="checked" value="<s:property value='id'/>" />
									</div>
								</s:if>
								<s:else>
									<div class="clickRadio">
										<input type="radio" name="id" value="<s:property value='id'/>" />
									</div>
								</s:else>
							</td>
						</tr>
					</table>
					<br>
				</s:iterator>
				<s:if test="!(#session.destinationInfoDtoList == null)">
					<div class="submit_btn_box">
						<div id=".contents-btn-set">
							<s:submit value="決済" class="submit_btn" />
						</div>
					</div>
					<br>
				</s:if>
			</s:form>
			<div class="submit_btn_box">
				<div id=".contents-btn-set">
					<s:form action="CreateDestinationAction">
						<s:submit value="宛先新規登録" class="submit_btn" />
					</s:form>
					<br>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>