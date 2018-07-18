<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<link rel="stylesheet" href="./navigation.css">
<link rel="stylesheet" href="./css/style.css">
<style type="text/css">
.submit_btn:active {
	transform: translateY(2px);
	background-color: #f3a769;
	border: #ed7d22;
}

.submit_btn {
	font-size: 20px;
	clear: both;
	width: 200px;
	height: 40px;
	margin-left: 90px;
	color: #FFF;
	background: #ed7d22;
	border-radius: 20px;
	box-shadow: inset 0 2px 0 rgba(255, 255, 255, 0.2), inset 0 -2px 0
		rgba(0, 0, 0, 0.05);
	border: solid 2px #d27d00;
	text-align: center;
	outline: 0;
	cursor: pointer;
}
</style>

<div id="navigation">
	<div class="navigation-contents">
		<s:form action="SearchItemAction">
			<ul>
				<li>
					<div class="keywords">
						<s:textfield name="keywords" placeholder="何して遊ぶ？" />
					</div>
				</li>
				<li>
					<div class="placeId cp_sl01">
						<s:select name="placeId" list="#session.mPlaceDtoList"
							listValue="placeName" listKey="placeId" />
					</div>
				</li>
				<li>
					<div class="categoryId cp_sl01">
						<s:select name="categoryId" list="#session.mCategoryDtoList"
							listValue="categoryName" listKey="categoryId" />
					</div>
				</li>
				<li>
					<h3>日にちを選ぶ</h3>
				</li>
				<li>
					<div class="targetDate">
						<s:textfield id="date_val" name="targetDate"
							value="%{#session.targetDate}" readonly="true" placeholder="いつでも" />
						<div class="submit_btn">
							<input type=button value="日付を指定しない"
								onClick="this.form.targetDate.value = '' ">
						</div>
						<div id="datepicker" style="font-size: 20px;"></div>
					</div>
				</li>
				<li><s:submit value="検索" class="submit_btn" float="left" /></li>
			</ul>
		</s:form>
	</div>
</div>

