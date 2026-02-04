package app;

import controller.GameController;
import utils.handlers.InputHandler;

public class Main {

	public static void main(String[] args) {
		runGame();
	}

	private static void runGame() {
		GameController gameController = new GameController();
		gameController.startGame();
		InputHandler.closeScanner();

	}
}
