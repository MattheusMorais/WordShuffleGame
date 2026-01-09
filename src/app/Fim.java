package app;

import util.FileManager;

public class Fim {

	public static void fimJogo(String resultadoFormatado) {
		System.out.println("Resultado do jogo: ");
		FileManager.createFile();
		FileManager.writeFile(resultadoFormatado);
		FileManager.readFile();
	}
}