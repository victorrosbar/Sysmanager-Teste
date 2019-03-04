<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="br.com.sysmanager.objects.NumerosPrimos, java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resposta maior número primo</title>
</head>
<body>
	<h2>Resposta:</h2>
	<h4>O maior número primo entre os números inseridos é ${resposta}.</h4>
	
	<a href="index.html">
		<button>Início</button>
	</a>
	<a href="formMaiorNumeroPrimo.jsp">
		<button>Voltar</button>
	</a>
</body>
</html>