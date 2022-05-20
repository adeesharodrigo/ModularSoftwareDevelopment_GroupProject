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



<c:forEach var="vrrl" items="${Results}">
	
	
	
	${vrrl.division}<br/>
	${vrrl.method}<br/><br/>
	Party1 : ${vrrl.party1}<br/>
	Party2 : ${vrrl.party2}<br/>
	Party3 : ${vrrl.party3}<br/>
	
	<br/>
	<br/>
	
</c:forEach>

<form action="view" method="get">
	<input type="submit" name="view" value="Approve">
</form><br/><br/>

<form action="view" method="get">
	<input type="submit" name="view" value="Reject">
</form>


</body>
</html>