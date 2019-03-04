<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Descriptografia de texto</title>
</head>
<body>

	<c:url value="/descriptografia" var="linkDescriptografia"/>
	<h3>Insira um texto para ser descriptografado</h3>
	<form action="${linkDescriptografia}" method="POST">
		Texto: <input type="text" name="descriptografarTexto"> <input type="submit">
	</form>
	<br>
	<a href="index.html">
		<button>Início</button>
	</a>
	<a href="criptografarTexto.jsp">
		<button>Criptografar</button>
	</a>

</body>
</html>