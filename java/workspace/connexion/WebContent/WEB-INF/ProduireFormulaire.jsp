<%@page import="io.sopra.pox3.servlet.Outils"%>
<%@page import="io.sopra.pox3.servlet.Constantes"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

</head>
<body>
	<form action='connexion2.html' method='post'>
	${message}
		<div>Prénom</div>
		<input type='text' name='${Constantes.NOM_PARAMETRE_PRENOM }' />
		<div>Nom</div>
		<input type='text' name='${Constantes.NOM_PARAMETRE_NOM }' />
		<button type='submit'>ok</button>
	</form>
</body>
</html>