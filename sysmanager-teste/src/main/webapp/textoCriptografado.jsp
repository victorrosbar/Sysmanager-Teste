<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="br.com.sysmanager.objects.Criptografia, java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Texto criptografado</title>
</head>
<body>

<h2>Pronto! Seu texto foi criptografado.</h2>
<h4>${textoCriptografado }</h4>

<br>

<a href="index.html">
		<button>Início</button>
	</a>
<a href="criptografarTexto.jsp">
		<button>Voltar</button>
	</a>
<a href="descriptografarTexto.jsp">
		<button>Descriptografar</button>
	</a>

</body>
</html>