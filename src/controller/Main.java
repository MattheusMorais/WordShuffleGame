package controller;

import controller.exceptions.ValidationException;
import model.mechanics.GameMechanicFactory;
import model.mechanics.GameMechanic;
import view.MenuUI;

import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		boolean running = true;
		MenuUI menuUI = new MenuUI();

		while (running) {
			menuUI.showStartMenu();

			int mainOption;
			try {
				mainOption = InputHandler.nextInt();
				InputHandler.nextLine();
				MenuSettings.isOptionValid(mainOption);

			} catch (InputMismatchException e) {
				System.out.println("Erro: Digite um número válido.");
				InputHandler.nextLine();
				continue;
			} catch (ValidationException e) {
				System.out.println(e.getMessage());
				continue;
			}

			if (mainOption == 2) {
				System.out.println("Fechando o jogo...");
				running = false;
				continue;
			}

			String playerName;
			while (true) {

				try {
					System.out.println("Digite o nome do jogador: ");
					playerName = InputHandler.nextLine();
					MenuSettings.isPlayerNameValid(playerName);
					break;
				} catch (ValidationException e) {
					System.out.println(e.getMessage());
					System.out.println("Por favor, tente novamente.");
				}
			}

			int difficultyOption;
			while (true) {
				menuUI.showDifficultyMenu();

				try {
					difficultyOption = InputHandler.nextInt();
					InputHandler.nextLine();
					MenuSettings.isDifficultyValid(difficultyOption);
					break;
				} catch (InputMismatchException e1) {
					InputHandler.nextLine();
					System.out.println("Por favor, tente novamente.");
				} catch (ValidationException e1) {
					System.out.println(e1.getMessage());
					System.out.println("Por favor, tente novamente.");
				}
			}

			MenuSettings menuSettings = new MenuSettings(mainOption, playerName, difficultyOption);

			GameMechanic mechanic = GameMechanicFactory.createMechanic();
			GameResults gameResults = mechanic.play(menuSettings);

			String formattedResult = mechanic.formattedResult(gameResults, playerName);
			GameResults.gameOver(formattedResult);

		}
		InputHandler.closeScanner();
	}
}
