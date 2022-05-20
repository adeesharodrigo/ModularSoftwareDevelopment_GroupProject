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
 <h1>You are a division head in ${cus.name} .Submitting is failed.Try again </h1> 
	<form action="update" method="post">
		ID <input type="text" name="id" value="${cus.id}" readonly ><br>
		Division <input type="text" name="division" value="${cus.name}" readonly ><br>
		Distric  <input type="text" name="distric" value="${cus.distric}" readonly><br>
		Party 1 <input type="text" name="party1" placeholder="value"><br>
		Party 2 <input type="text" name="party2" placeholder="value"><br>
		Party 3 <input type="text" name="party3" placeholder="value"><br>
		<input type="submit" name="submit" value="Submit">
	</form>
 </c:forEach>
 <form method="POST" action="Homepage.jsp">
      <input type="submit" value="Home"/>
    </form>
 
</body>
</html>