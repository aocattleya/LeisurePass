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

<h2><s:label value="カート合計金額 :"/><s:property value="#session.totalPrice"/>円</h2><br>

</body>
</html>