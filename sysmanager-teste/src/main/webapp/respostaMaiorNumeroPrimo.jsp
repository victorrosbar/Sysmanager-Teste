<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="br.com.sysmanager.objects.NumerosPrimos, java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resposta maior n�mero primo</title>
</head>
<body>
	<h2>Resposta:</h2>
	<h4>O maior n�mero primo entre os n�meros inseridos � ${resposta}.</h4>
	
	<a href="index.html">
		<button>In�cio</button>
	</a>
	<a href="formMaiorNumeroPrimo.jsp">
		<button>Voltar</button>
	</a>
</body>
</html>