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
	<c:url value="/fibonacci" var="linkFibonacci"/>
	<h3>Insira o valor máximo para que seja gerada a sequência de Fibonacci</h3>
	<form action="${linkFibonacci}" method="POST">
		Valor: <input type="number" name="numeroFinal" style="width:100px;font-size: 13px" > <input type="submit">
	</form>
	<br>
	<a href="index.html">
		<button>Início</button>
	</a>

</body>
</html>