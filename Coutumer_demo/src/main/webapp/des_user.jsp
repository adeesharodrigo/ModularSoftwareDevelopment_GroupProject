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
 <h1>Submit result in ${cus.name} division </h1>
 	
	
 	
 	<form action="des_show" method="post">
 		<input type="hidden" name="division" value="${cus.name}">
 		<input type="hidden" name="distric" value="${cus.distric}">
 		<input type="hidden" name="id" value="${cus.id}">
 		
 		
 		Party 1 <input type="text" name="party1" placeholder="value"><br>
		Party 2 <input type="text" name="party2" placeholder="value"><br>
		Party 3 <input type="text" name="party3" placeholder="value"><br>
		
	 Submit result :
      <input type="submit" value="Submit"/>
    </form>
    <form method="POST" action="Homepage.jsp">
      <input type="submit" value="Home"/>
    </form>
 	  
	
 </c:forEach>
</body>
</html>