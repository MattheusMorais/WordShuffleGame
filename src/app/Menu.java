package app;

import java.util.InputMismatchException;

import static util.Input.SC;

public class Menu {

	public MenuInitialResult menuInicial() { // NÃO PASSAR scanner como parametro
		/**
		 *
		 *
		 */

		int opcao;
		String nomeJogador = "";

		while (true) {
			System.out.println("-------------------- Advinhar Palavras ---------------");
			System.out.println("1. Jogar");
			System.out.println("2. Sair do Jogo");
			System.out.println("------------------------------------------------------");

			try {
				opcao = SC.nextInt();
				SC.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida! Por favor, digite um número.");
				SC.next(); // descarta a entrada inválida
				continue;
			}

			if (opcao == 2) {
				System.out.println("Fechando o jogo...");
				return new MenuInitialResult(opcao, "");
			}

			System.out.println("Digite o nome do Jogador: ");
			nomeJogador = SC.nextLine();

			switch (opcao) {
			case 1:
				return new MenuInitialResult(opcao, nomeJogador);
			default:
				System.out.println("Opção Inválida! Digite 1 ou 2.");
				continue;
			}
		}
	}

	public int menuDificuldade() {
		int dificuldade;

		while (true) {
			System.out.println("-> Escolha a dificuldade:");
			System.out.println("1. Fácil");
			System.out.println("2. Difícil");

			try {
				dificuldade = SC.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida! Por favor, digite um número.");
				SC.next(); // descarta a entrada inválida
				continue;
			}
			SC.nextLine(); // Consome o enter do buffer

			switch (dificuldade) {
			case 1:
			case 2:
				System.out.printf("Dificuldade %s escolhida!", dificuldade);
				return dificuldade;
			default:
				System.out.println("Opção Inválida! Digite 1 ou 2.");
				continue;
			}
		}
	}
}
