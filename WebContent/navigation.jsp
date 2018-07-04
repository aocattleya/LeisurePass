<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div id="navigation">
	<ul>
		<li>
			<s:textfield name="freeword" placeholder="フリーワード" />
		</li>
		<li>
			<select name="place">
				<option value="1">全て</option>
				<option value="2">茨城県</option>
				<option value="3">栃木県</option>
				<option value="4">群馬県</option>
				<option value="5">埼玉県</option>
				<option value="6">千葉県</option>
				<option value="7">東京都</option>
				<option value="8">神奈川県</option>
			</select>
		</li>
		<li>
			<select name="category">
				<option value="1">全てのカテゴリー</option>
				<option value="2">動物園</option>
				<option value="3">水族館</option>
				<option value="4">アスレチックパーク</option>
				<option value="5">遊園地</option>
				<option value="6">美術館・博物館</option>
			</select>
		</li>
		<li>
			<a href="#">カレンダー</a>

		</li>
		<li>
			<s:submit value="検索" />
		</li>
	</ul>
</div>