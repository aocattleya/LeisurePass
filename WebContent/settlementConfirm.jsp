<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<style type="text/css">
#contents {
		   margin: 0;
		  padding: 0;
	  line-height: 1.6;
   letter-spacing: 1px;
	  padding-top: 10px;
	  font-family: メイリオ ", sans-serif;
		font-size: 18px;
	   text-align: center;
	   margin: 0 :auto;
}
.noMassage {
		font-size: 30px;
	  font-weight: bold;
	   margin-top: 80px;
	margin-bottom: 10px;
	 padding-left: 35px;
}
.submit_btn {
			width: 200px;				/*ボタンの横の長さ*/
		   height: 40px;				/*ボタンの縦の長さ*/
		font-size: 20px; 				/*ボタン文字サイズ*/
 background-color: #ed7d22; 			/*ボタンの色*/
			color: #FFF; 				/*ボタン文字の色*/
	border-radius: 20px;				/*ボタンの角の丸み*/
	   box-shadow: inset 0 2px 0 rgba(255, 255, 255, 0.2), inset 0 -2px 0
	rgba(0, 0, 0, 0.05); 				/*ボタンの影（立体感）*/
		   border: solid 2px #d27d00;	/*ボタンの立体感を出すため*/
		  outline: 0;					/*変な枠線を非表示に*/
		   cursor: pointer; 			/*マウスを乗せたとき指マークにする*/
}
.submit_btn:active {
		transform: translateY(2px);		/*下に動かす*/
 background-color: #f3a769;				/*薄いオレンジ色にする*/
		   border: #ed7d22;				/*枠線の色変更*/
}
.horizontal-list-table {
		   margin: 2em 0;
		  padding: 2em;
			width: 700px;
	border-radius: 20px;
		   margin: auto;
		 position: relative;
 background-color: #f7f7f7;
}
.orangeBorder {
	border-bottom: solid 3px #ffa623;
		  display: inline-block;
		  padding: 0 15px 0 15px;
}
.clickRadio label {
	  line-height: 28px;
		  display: inline-block;
		   cursor: pointer;
		 position: relative;
			  top: 110px;
}
.clickRadio input[type=radio]{
		transform: scale(2,2);
}
.clickRadio input[type="radio"]:checked {
		  content: '';
			width: 14px;	/* マークの横幅 */
		   height: 14px;	/* マークの縦幅 */
}
</style>
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
				</s:if>
				<s:else>
					<div class="info"><h2>宛先を選択してください</h2></div><br>
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
							<th><div class="orangeBorder">ふりがな</div></th>
						</tr>
						<tr>
							<td>
								<s:property value="familyNameKana" />
								<span></span>
								<s:property value="firstNameKana" />
							</td>
						</tr>
						<tr>
							<th><div class="orangeBorder">住所</div></th>
						</tr>
						<tr>
							<td><s:property value="userAddress" /></td>
						</tr>
						<tr>
							<th><div class="orangeBorder">電話番号</div></th>
						</tr>
						<tr>
							<td><s:property value="telNumber" /></td>
						</tr>
						<tr>
							<th><div class="orangeBorder">メール</div></th>
						<tr>
							<td><s:property value="email" /><br><br></td>
						</tr>
						<tr>
							<td>
								<s:if test="#st.index == 0">
									<div class="clickRadio"><input type="radio" name="id" checked="checked" value="<s:property value='id'/>" /></div>
								</s:if>
								<s:else>
									<div class="clickRadio"><input type="radio" name="id" value="<s:property value='id'/>" /></div>
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
					</div><br>
				</s:if>
			</s:form>
			<div class="submit_btn_box">
				<div id=".contents-btn-set">
					<s:form action="CreateDestinationAction">
						<s:submit value="宛先新規追加" class="submit_btn" />
					</s:form><br>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>