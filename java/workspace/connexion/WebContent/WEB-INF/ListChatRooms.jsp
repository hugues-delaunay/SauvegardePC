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
	<%
	for (int i = 0; i < 5 ; i++) {

	%>
	<a href='chat.html?no=<%=i%> %>'><button type='submit'>Chatroom<%=i%></button> </a>	

	<%
		}
	%>
	
		<form method='post'>
	${chatRoom}
		<div>Nom room</div>
		<input type='text' name='${name.chatroom}' />

		<button type='submit'>Ajouter</button>
	</form>


	<a href='index.html'>accueil</a>

	<form action='deconnexion.html'>
		<button type='submit'>deconnexion</button>
	</form>


</body>
</html>