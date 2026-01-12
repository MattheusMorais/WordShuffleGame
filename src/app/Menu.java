package app;

import java.util.InputMismatchException;

import static utils.InputHandler.SC;

public class Menu {

	public MenuOptions startMenu() { // Do not pass scanner as parameter
		/**
		 *
		 *
		 */

		int option;
		String playerName = "";

		while (true) {
			System.out.println("-------------------- Advinhar Palavras ---------------");
			System.out.println("1. Jogar");
			System.out.println("2. Sair do Jogo");
			System.out.println("------------------------------------------------------");

			try {
				option = SC.nextInt();
				SC.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida! Por favor, digite um número.");
				SC.next(); // Clear buffer
				continue;
			}

			if (option == 2) {
				System.out.println("Fechando o jogo...");
				return new MenuOptions(option, "");
			}

			System.out.println("Digite o nome do Jogador: ");
			playerName = SC.nextLine();

			switch (option) {
			case 1:
				return new MenuOptions(option, playerName);
			default:
				System.out.println("Opção Inválida! Digite 1 ou 2.");
			}
		}
	}

	public int difficultyMenu() {
		int difficulty;

		while (true) {
			System.out.println("-> Escolha a dificuldade:");
			System.out.println("1. Fácil");
			System.out.println("2. Difícil");

			try {
				difficulty = SC.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida! Por favor, digite um número.");
				SC.next(); // Clear buffer
				continue;
			}
			SC.nextLine(); // Clear buffer

			switch (difficulty) {
			case 1:
			case 2:
				System.out.printf("Dificuldade %s escolhida!", difficulty);
				return difficulty;
			default:
				System.out.println("Opção Inválida! Digite 1 ou 2.");
			}
		}
	}
}
