package fichier.sopra.pox3.parcoursrepertoire;

import java.io.File;

public class ParcoursRepertoire {

	public static void main(String[] args) {

		new ParcoursRepertoire().parcoursRep("C:\\code\\tools");
	}

	public void parcoursRep(String path) {

		System.out.println(path);
		File file = new File(path);
		file.getAbsolutePath();

		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File file1 : files) {
				parcoursRep(file1.getAbsolutePath());
			}
		}

	}

}
