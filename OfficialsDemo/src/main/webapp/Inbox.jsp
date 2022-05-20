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


<c:forEach var = "prl" items="${PResults}">


${prl.division}
<form action="view" method="get">
	<input type="submit" name="view" value="${prl.division}">
</form>
<br/>
<br/>


</c:forEach>


</body>
</html>