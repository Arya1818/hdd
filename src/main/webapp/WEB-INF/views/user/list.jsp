<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/common/common.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<h1>hdd의 유저리스트</h1>
<table class = "table table-hover">
<tr>
	<td>번호</td>
	<td>이름</td>
	<td>아이디</td>
	<td>가입일자</td>
</tr>	
	<c:forEach var="list" items="${users}">
	<tr>
		<td>${list.uiNum}</td>
		<td>${list.uiName}</td>
		<td>${list.uiId}</td>
		<td>${list.credat}</td>
	</tr>
	</c:forEach>
</table>
</div>
</body>
</html>