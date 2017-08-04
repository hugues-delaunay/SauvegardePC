<%@page import="io.sopra.pox3.servlet.Outils"%>
<%@page import="io.sopra.pox3.servlet.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="toto.jsp" ></jsp:include>

Salut c'est moi, au faite un plus un égale
<%=1+1%>

<%
String monRefer = request.getParameter("toto");
out.print(monRefer);
%>

<%
User user = Outils.getConnectedUser(request);
if(user != null){
	%>
	<div>
	Salut <%=user.getNom()%><%=user.getPrenom() %>
	</div>
	<%
}
%>

<br/> Ton referer c'est 
<%= monRefer%>


</body>
</html>