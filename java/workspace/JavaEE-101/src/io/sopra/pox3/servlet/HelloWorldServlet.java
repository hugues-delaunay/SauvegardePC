package io.sopra.pox3.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		resp.getWriter().println("<html><head><style>body{background-color : red;"
				+ "font-size : 32; color: blue;}</style></head><body>WAZAAAAAAAAAAAAAAAAAAAAA!!!!!!!!</body></html>");
	}

}
