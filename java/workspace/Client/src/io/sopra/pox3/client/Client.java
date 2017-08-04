package io.sopra.pox3.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		System.out.println("Tentative de connexion");

		Socket socket = new Socket("10.31.0.44", 9090);
		System.out.println("Connecté");

		OutputStream os = socket.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeInt(5);
		oos.writeInt(7);

		oos.flush();

		InputStream osR = socket.getInputStream();

		ObjectInputStream oosR = new ObjectInputStream(osR);
		int a = oosR.readInt();
		System.out.println(a);

		oos.writeObject("＼（〇_ｏ）／＼（〇_ｏ）／");

		Object s = oosR.readObject();
		System.out.println(s);

		socket.close();
		System.out.println("Déconnecté");

	}

}
