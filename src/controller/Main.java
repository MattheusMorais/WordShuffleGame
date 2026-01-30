package controller;

import model.mechanics.GameMechanicFactory;
import model.mechanics.GameMechanic;
import view.MenuUI;

public class Main {

	static void main() {
		MenuUI menuUI = new MenuUI();
		MenuSettings menuSettings = new MenuSettings();

		menuUI.showStartMenu();

		int menuSettingsOption = InputHandler.nextInt();
		while (menuSettingsOption != 1 && menuSettingsOption != 2) {
			System.out.println("Opção Inválida! Digite 1 ou 2.");
			menuSettingsOption = InputHandler.nextInt();
		}
		if (menuSettingsOption == 2) {
			System.out.println("Fechando o jogo...");
			return;
		} else {
			menuSettings.setOPTION(menuSettingsOption);
		}

		InputHandler.nextLine();
		if  (menuSettingsOption == 1) {
			System.out.println("Digite o nome do jogador: ");
			String PLAYERNAME = InputHandler.nextLine();
			menuSettings.setPLAYERNAME(PLAYERNAME);
		}

		menuUI.showDifficultyMenu();
		int difficultyOption = InputHandler.nextInt();
		while (difficultyOption != 1 && difficultyOption != 2) {
			System.out.println("Opção Inválida! Digite 1 ou 2.");
			difficultyOption = InputHandler.nextInt();
		}
		InputHandler.nextLine();
		menuSettings.setDIFFICULTY(difficultyOption);

		GameMechanic mechanic = GameMechanicFactory.createMechanic();
		GameResults gameResults = mechanic.play(menuSettings);

		String PLAYERNAME = menuSettings.getPLAYERNAME();
		String formattedResult = mechanic.formattedResult(gameResults, PLAYERNAME);
		GameResults.gameOver(formattedResult);

		InputHandler.closeScanner();
	}
}