<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

</head>
<body>
<font color="red">${errorMessage}</font>
<form action="login" method="post">
<label for="email">Email:</label><br>
  <input type="text" id="email" name="email"><br>
  <label for="Password">Password:</label><br>
  <input type="text" id="password" name="password"><br>
  <br>
  <input type="submit" value="Submit">

</form>
</body>
</html>