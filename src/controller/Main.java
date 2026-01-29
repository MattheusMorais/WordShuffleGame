package controller;

import model.mechanics.GameMechanicFactory;
import model.mechanics.GameMechanic;
import view.MenuUI;

import static controller.InputHandler.SC;

public class Main {

	static void main() {
		MenuUI menuUI = new MenuUI();
		MenuSettings menuSettings = new MenuSettings();

		menuUI.showStartMenu();

		int menuSettingsOption = SC.nextInt();
		while (menuSettingsOption != 1 && menuSettingsOption != 2) {
			System.out.println("Opção Inválida! Digite 1 ou 2.");
			menuSettingsOption = SC.nextInt();;
		}
		if (menuSettingsOption == 2) {
			System.out.println("Fechando o jogo...");
			return;
		} else {
			menuSettings.setOPTION(menuSettingsOption);
		}

		SC.nextLine();
		if  (menuSettingsOption == 1) {
			System.out.println("Digite o nome do jogador: ");
			String PLAYERNAME = SC.nextLine();
			menuSettings.setPLAYERNAME(PLAYERNAME);
		}

		menuUI.showDifficultyMenu();
		int difficultyOption = SC.nextInt();
		while (difficultyOption != 1 && difficultyOption != 2) {
			System.out.println("Opção Inválida! Digite 1 ou 2.");
			difficultyOption = SC.nextInt();
		}
		SC.nextLine();
		menuSettings.setDIFFICULTY(difficultyOption);

		GameMechanic mechanic = GameMechanicFactory.createMechanic();
		GameResults gameResults = mechanic.play(menuSettings);

		String PLAYERNAME = menuSettings.getPLAYERNAME();
		String formattedResult = mechanic.formattedResult(gameResults, PLAYERNAME);
		GameResults.gameOver(formattedResult);

	}
}