<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>カート画面</title>
</head>
<body>
<jsp:include page="header.jsp" />
	<div id="main" class="cf">
		<jsp:include page="navigation.jsp" />
		<div id="contents">

<h1>カート画面</h1>

<s:if test="#session.ErrorMessageList !=null">
	<s:iterator value="#session.ErrorMessageList" />
</s:if>


 <s:if test="#session.cartinfoDTOlist !=null">
 <s:form>
 <table>
<thead>
	<tr>
	<th><s:label value="#"/></th>
	<th><s:label value="商品名"/></th>
	<th><s:label value="ふりがな"/></th>
	<th><s:label value="商品画像"/></th>
	<th><s:label value="値段"/></th>
	<th><s:label value="発売会社名"/></th>
	<th><s:label value="発売年月日"/></th>
	<th><s:label value="購入個数"/></th>
	<th><s:label value="合計金額"/></th>
	</tr>
</thead>

<tbody>
	<s:iterator value="#session.cartinfoDTOlist">
<tr>
	<td><s:checkbox name="checkList" value="checked" fieldValue="%{id}"/></td>
	<s:hidden name="productId" value="%{productId}"/>
	<td><s:property value="productName"/></td>
	<td><s:property value="productNameKana"/></td>
	<td><img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' width="50px" height="50px" /></td>
	<td><s:property value="price"/>円</td>
	<td><s:property value="releaseCompany"/></td>
	<td><s:property value="releaseDate"/></td>
	<td><s:property value="productCount"/></td>
	<td><s:property value="subtotal"/>円</td>
</tr>
	<s:hidden name="productName" value="%{productName}"/>
	<s:hidden name="productNameKana" value="%{productNameKana}"/>
	<s:hidden name="imageFilePath" value="%{imageFilePath}"/>
	<s:hidden name="imageFileName" value="%{imageFileName}"/>
	<s:hidden name="price" value="%{price}"/>
	<s:hidden name="releaseCompany" value="%{releaseCompany}"/>
	<s:hidden name="releaseDate" value="%{releaseDate}"/>
	<s:hidden name="productCount" value="%{productCount}"/>
	<s:hidden name="subtotal" value="%{subtotal}"/>
</s:iterator>


</tbody>
</table>
<h2><s:label value="カート合計金額 :"/><s:property value="#session.totalPrice"/>円</h2><br>



<s:submit value="決済" />
<s:submit value="削除" onclick="action='DeleteCartAction';"/>

</s:form>
</s:if>
<s:else>
	カート情報はありません
</s:else>

</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</body>
</html>