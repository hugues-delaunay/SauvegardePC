package io.sopra.pox3.serveur;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		System.out.println("Ouverture");
		ServerSocket socketserver = new ServerSocket(9090);
		System.out.println("Connexion");
		Socket communicationAvecClient = socketserver.accept();

		InputStream is = communicationAvecClient.getInputStream();

		while (true) {
			int data = is.read();
			if (data == -1)
				break;
			System.out.print((char)(data & 0xff));
		}

		ObjectInputStream ois = new ObjectInputStream(is);
		int a = ois.readInt();
		System.out.println(a);
		int b = ois.readInt();
		System.out.println(b);

		int c = a + b;

		OutputStream osR = communicationAvecClient.getOutputStream();
		ObjectOutputStream oosR = new ObjectOutputStream(osR);
		oosR.writeInt(c);

		//Object s = ois.readObject();
		
		oosR.writeObject("qsdvc");

		oosR.flush();

		System.out.println("Fermeture");
		communicationAvecClient.close();

		System.out.println("Fin");

	}

}
