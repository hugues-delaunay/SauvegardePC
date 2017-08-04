package io.sopra.pox3.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ListChatRooms.html")
public class ListChatRoomServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Outils.vueListChatRooms(Donnees.chatRooms,req, resp);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		User user = (User) req.getSession().getAttribute(Constantes.CLE_SESSION_USER);
		
		ChatRoom chatRoom= new ChatRoom(name, user);
		Donnees.chatRooms.add(chatRoom);
		Outils.vueListChatRooms(Donnees.chatRooms, req, resp);
	}
	
	

}
