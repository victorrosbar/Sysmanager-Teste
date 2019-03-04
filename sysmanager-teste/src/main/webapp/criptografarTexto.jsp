<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Criptografia de texto</title>
</head>
<body>

	<c:url value="/criptografia" var="linkCriptografia"/>
	<h3>Insira um texto para ser criptografado</h3>
	<form action="${linkCriptografia}" method="POST">
		Texto: <input type="text" name="criptografarTexto"> <input type="submit">
	</form>
	<br>
	<a href="index.html">
		<button>Início</button>
	</a>
	<a href="descriptografarTexto.jsp">
		<button>Descriptografar</button>
	</a>

</body>
</html>