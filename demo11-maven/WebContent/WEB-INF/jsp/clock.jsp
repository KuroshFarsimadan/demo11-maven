<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Clock</title>
</head>
<body>

	<!-- <c:if test="${not empty param.time }">
	</c:if> -->
	<p>
		Test:
		<c:out value="${test}" />
	</p>
	<p>
		Time:
		<c:out value="${time}" />
	</p>
	<p>
		Date:
		<c:out value="${date}" />
	</p>


</body>
</html>

