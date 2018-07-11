<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Clock</title>
</head>
<body>

	<c:if test="${not empty error && fn:length(error) >= 5}">
		<p>
			Error:
			<c:out value="${error}" />
		</p>
	</c:if>
	<c:if test="${not empty result}">
		<p>
			Result:
			<c:out value="${result}" />
		</p>
	</c:if>
	<form action="calculator" method="post">
		<h1>Calculator</h1>
		<table>
			<tr>
				<td>Value 1</td>
				<td><input type="text" name="value1" value="0" /></td>
			</tr>
			<tr>
				<td>Value 2</td>
				<td><input type="text" name="value2" value="0" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>

				<td><button type="submit" name="operation"
						value="multiplication">Multiplication</button></td>
				<td><button type="submit" name="operation" value="sum">Sum</button></td>
			</tr>
		</table>
	</form>
</body>
</html>

