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

	<c:forEach var="vrrl" items="${VRResults}">
	
	
	
	${vrrl.getDistrict()}<br/>
	${vrrl.party1}<br/>
	${vrrl.party2}<br/>
	${vrrl.party3}<br/>
	
	<br/>
	<br/>
	
	</c:forEach>
	
	<form action="#" method="post">
		<input type="submit" name="Publish" value="Publish Data">
	</form>
	
</body>
</html>