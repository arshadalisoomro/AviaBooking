<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
  <title>Booking Start Page</title>
</head>
<body>
<form:form action="/spring/booking/movie" modelAttribute="ticketForm">
  Movie ID : <form:input path="movieId"/>
  <input type="submit"/>
</form:form>
</body>
</html>