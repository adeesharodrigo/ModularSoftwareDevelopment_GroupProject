<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:forEach var="cus" items="${cus}">
	<input type="hidden" name="district" value="${cus.get(0)}">
</c:forEach>

	<c:forEach var="drl" items="${DResults}">
	
	
	
	${drl.getDistrict()}<br/>
	Party1 : ${drl.party1}<br/>
	Party2 : ${drl.party2}<br/>
	Party3 : ${drl.party3}<br/>
	
	<br/>
	<br/>
	
	</c:forEach>


</body>
</html>