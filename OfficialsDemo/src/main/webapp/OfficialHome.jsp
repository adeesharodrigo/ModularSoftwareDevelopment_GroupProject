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



	<form action="publish" method="post">
		<input type="submit" name="Publish" value="Publish">
	</form>
	
	<form action="valiedResults" method="post">
		<input type="submit" name="VRResult" value="Valied Results">
	</form>
	
	<form action="inbox" method="post">
		<input type="submit" name="Inbox" value="Inbox">
	</form>
	
</body>
</html>


