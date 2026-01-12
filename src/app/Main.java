package app;

import mechanics.GameMechanicFactory;
import mechanics.GameMechanic;

public class Main {

	static void main() {
		Menu menu = new Menu();
		MenuOptions menuResult = menu.startMenu();

		int difficulty = menu.difficultyMenu();

		GameMechanic mechanic = GameMechanicFactory.createMechanic();
		GameResults gameResults = mechanic.play(menuResult, difficulty);

		String formattedResult = mechanic.formattedResult(gameResults, menuResult);

		EndScreen.gameOver(formattedResult);

	}
}