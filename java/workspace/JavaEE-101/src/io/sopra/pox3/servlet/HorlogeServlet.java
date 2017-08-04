package io.sopra.pox3.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HorlogeServlet extends HttpServlet {

	Date d = new Date();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String p1 = req.getParameter("param1");
		String p2 = req.getParameter("param2");
		
		resp.setContentType("text/html");
		resp.getWriter().println("<html><head><style>body{background-color : gold;"
				+ "font-size : 32;}</style></head><body><div>Il est "+d+": j'ai FAIM!!!!!!!!!</div><div> "+p1+" "+p2+"</div</body></html>");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String p1 = req.getParameter("param1");
		String p2 = req.getParameter("param2");
		
		resp.setContentType("text/html");
		resp.getWriter().println("<html><head><style>body{background-color : gold;"
				+ "font-size : 32;}</style></head><body><div>Il est "+d+": j'ai FAIM!!!!!!!!!</div><div> "+p1+" "+p2+"</div</body></html>");
	}
	

}
