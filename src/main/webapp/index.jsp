<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Countries</title>
	</head>
	<body>
		<form>
			<p><button formaction="/1">1) Countries that speak Slovene</button></p>
			<p><button formaction="/2">2) Total number of cities by country</button></p>
			<p><button formaction="/3">3) Mexican cities greater than 500k</button></p>
			<p><button formaction="/4">4) Languages greater than 89%</button></p>
			<p><button formaction="/5">5) Surface Area < 501 Population > 100K</button></p>
			<p><button formaction="/6">6) Con Mon Surface Area > 200 LifeExp > 75</button></p>
			<p><button formaction="/7">7) Cities in Buenos Aires Pop > 500k</button></p>
			<p><button formaction="/8">8) Countries by Region</button></p>
		</form>
	</body>
</html>