<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="cus" items="${cus}">
 <h1>Accept the result in ${cus.get(3)} </h1>
 <form action="des_update" method="post">
 	 <input type="hidden" name="id" value="${cus.get(5)}">
 		<input type="hidden" name="division" value="${cus.get(3)}">
 		<input type="hidden" name="distric" value="${cus.get(4)}">
 		 <input type="hidden" name="party1" value="${cus.get(0)}">
 		<input type="hidden" name="party2" value="${cus.get(1)}">
 		<input type="hidden" name="party3" value="${cus.get(2)}">
 	
	<p>Division : ${cus.get(3)}<br>
 	Distric :  ${cus.get(4)}<br>
 	Party1 : ${cus.get(0)}<br>
 	Party2 :  ${cus.get(1)}<br>
 	Party3 : ${cus.get(2)}</p>
 	
 	
		Accept result :
      <input type="submit" value="Accept"/>
    </form>
    
 	  
	
 </c:forEach>
 	<form method="POST" action="Homepage.jsp">
      <input type="submit" value="Home"/>
    </form>
 	 <form method="POST" action="login_designate.jsp">
      <input type="submit" value="Reject"/>
    </form>
</body>
</html>