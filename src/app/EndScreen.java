package app;

import utils.FileManager;

public class EndScreen {

	public static void gameOver(String formattedResult) {
		System.out.println("Resultado do jogo: ");
		FileManager.createFile();
		FileManager.writeFile(formattedResult);
		FileManager.readFile();
	}
}