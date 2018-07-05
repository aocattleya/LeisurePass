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
				<%-- <s:select name="placeId" list="#session.mPlaceDtoList" listValue="placeName" listKey="placeId" /> --%>
			</li>
			<li>
				<%-- <s:select name="categoryId" list="#session.mCategoryDtoList" listValue="categoryName" listKey="categoryId" /> --%>
			</li>
			<li>
				<a href="#">カレンダー</a>
			</li>
			<li>
				<s:submit value="検索" />
			</li>
		</ul>
	</s:form>
</div>