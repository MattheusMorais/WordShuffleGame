package app;

import mechanics.GameMechanicFactory;
import mechanics.GameMechanic;

public class Main {

	static void main() {
		MenuUI menuUI = new MenuUI();
		menuUI.showStartMenu();

		menuUI.showDifficultyMenu();

		GameMechanic mechanic = GameMechanicFactory.createMechanic();

		MenuSettings settings = new MenuSettings();
		GameResults gameResults = mechanic.play(settings);

		String formattedResult = mechanic.formattedResult(gameResults, settings.getPLAYERNAME());

		GameResults.gameOver(formattedResult);

	}
}