<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div id="navigation">
	<s:form action="SearchItemAction">
		<ul>
			<li>
				<s:textfield name="keywords" placeholder="検索ワード" />
			</li>
			<li>
				<s:select name="placeId" list="#session.mPlaceDtoList" listValue="placeName" listKey="placeId" />
			</li>
			<li>
				<s:select name="categoryId" list="#session.mCategoryDtoList" listValue="categoryName" listKey="categoryId" />
			</li>
			<li>
				<s:textfield id="date_val" name="targetDate" value="%{#session.targetDate}" readonly="true" placeholder="日付の選択がない場合は全日程の商品を表示します" size="45"/>
				<div id="datepicker" style="font-size: 12px;"></div>

				<button type="submit" class="reset">日付未選択</button>
			</li>
			<li>
				<s:submit value="検索" />
			</li>
		</ul>
	</s:form>
</div>


