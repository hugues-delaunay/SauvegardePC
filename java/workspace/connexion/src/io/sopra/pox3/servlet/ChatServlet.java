package io.sopra.pox3.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chat.html")
public class ChatServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Outils.vueChatRoom(req, resp);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String texte = req.getParameter(Constantes.NOM_PARAMETRE_MESSAGES);
		Date date = new Date();
		User user = Outils.getConnectedUser(req);
		if (user == null) {
			user = new User("Ano", "Nymous");
		}
		Message message = new Message(date, user, texte);
		Donnees.messages.add(message);

		Outils.vueChatRoom(req, resp);

	}

}
