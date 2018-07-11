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
				<!-- <input type="text" id="date_val" name="targetDate" value="%{#session.targetDate}"/>
				<div id="datepicker" style="font-size: 12px;"></div> -->


				<!-- <input type="button" id="dp" name="targetDate" value="#session.targetDate" /> -->

				<s:if test="#session.targetDate==''">
					<s:textfield id="dp" name="targetDate" value="いつでも" readonly="true" />
				</s:if>
				<s:else>
					<s:textfield id="dp" name="targetDate" value="%{#session.targetDate}" readonly="true" />
				</s:else>
			</li>
			<li>
				<s:submit value="検索" name="searchConditions" />
			</li>
		</ul>
	</s:form>
</div>