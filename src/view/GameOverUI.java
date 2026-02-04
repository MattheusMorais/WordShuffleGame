package view;

import utils.FileManager;

public class GameOverUI {

    public static void gameOver(String formattedResult) {
        System.out.println("Resultado do jogo: "); // USAR toString();
        FileManager.createResultsFile();
        FileManager.writeResults(formattedResult);
        FileManager.readResults();
    }
}
