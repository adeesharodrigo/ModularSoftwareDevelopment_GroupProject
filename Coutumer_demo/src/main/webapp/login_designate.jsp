<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login as designated staff</h1>
Enter the division you want to add result and relevant password of the division
	<form action="log_des" method="post">
		Division  <input type="text" name="division" placeholder="Enter your division name"><br>
		Password <input type="password" name="password" placeholder="Enter your password"><br>
		<input type="submit" name="submit" value="Login">
	</form>
	<form method="POST" action="Homepage.jsp">
      <input type="submit" value="Home"/>
    </form>
	
</body>
</html>