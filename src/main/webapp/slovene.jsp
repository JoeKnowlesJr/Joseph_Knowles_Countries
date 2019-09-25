<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Slovene</title>
	</head>
	<body>
		<table>
			<thead>
				<tr>
					<th>Country</th>
					<th>Language</th>
					<th>Percentge</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${results}" var="r">
					<tr>
						<td>${r[0]}</td>
						<td>${r[1]}</td>
						<td>${r[2]}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>