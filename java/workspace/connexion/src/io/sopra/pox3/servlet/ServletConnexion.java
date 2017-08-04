package io.sopra.pox3.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConnexion extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Outils.vueProduireFormulaire(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String prenom = req.getParameter(Constantes.NOM_PARAMETRE_PRENOM);
		String nom = req.getParameter(Constantes.NOM_PARAMETRE_NOM);
		

		if (nom == null || nom.isEmpty() || prenom == null || prenom.isEmpty()) {
			Outils.vueProduireFormulaireErreur(req,resp,"Entrer nom et prenom");
			return;
		}

		User user = new User(nom, prenom);
		Outils.setConnectedUser(user, req);

		Outils.vueConnected(user, req, resp);
		

	}
}
