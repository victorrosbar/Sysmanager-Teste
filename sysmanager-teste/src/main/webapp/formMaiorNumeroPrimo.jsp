<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Maior número primos</title>
</head>
<body>
	<c:url value="/numerosPrimos" var="linkNumerosPrimos"/>
	<h3>Descubra o maior número primo entre os inseridos</h3>
	<form action="${linkNumerosPrimos}" method="POST">
		Números: <input type="number" name="numero1" style="width:50px;font-size: 13px" > <input type="number" name="numero2" style="width:50px;font-size: 13px" > <input type="submit">
	</form>
	<br>
	<a href="index.html">
		<button>Início</button>
	</a>

</body>
</html>
