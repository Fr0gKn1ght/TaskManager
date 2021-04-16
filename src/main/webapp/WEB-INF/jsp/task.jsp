<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Task</title>
</head>
<body>

<table border="1">
<tr>
<th>Task Name</th>
<th>Start Date</th>
<th>End Date</th> 
<th>Severity</th> 
</tr>

<c:forEach var = "task" items = "${user.taskList}">
<tr>  
<td>${task.name}</td>
<td>${task.startDate}</td>
<td>${task.endDate}</td>
<td>${task.severity}</td>

</tr>
</c:forEach>

</table>  

</body>
</html>