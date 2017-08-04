package io.sopra.pox3.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Donnees extends HttpServlet{
	
	
	public static List<ChatRoom> chatRooms = new ArrayList<>();
	public static List<Message> messages = new ArrayList<>();


	
}
