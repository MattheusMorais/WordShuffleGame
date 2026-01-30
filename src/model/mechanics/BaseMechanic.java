package model.mechanics;

import controller.GameResults;
import controller.InputHandler;
import controller.MenuSettings;
import model.bank.WordBank;
import model.shufflers.Shuffler;
import model.shufflers.ShufflerFactory;

public abstract class BaseMechanic implements GameMechanic {
	protected int hits = 0;
	protected int misses = 0;

	@Override
	public GameResults play(final MenuSettings settings) {
		WordBank bank = new WordBank();
		GameResults currentGameResults = new GameResults();

		System.out.println("*** OBS: Digite 0 a qualquer momento para Finalizar o Jogo. ***");
		while (true) {
			String originalWord = bank.returnWord();
			Shuffler shuffler = ShufflerFactory.createShuffler(settings);

			String scrambledWord = shuffler.shuffler(originalWord);
			System.out.println("Palavra embaralhada: " + scrambledWord);
			System.out.println("Advinhe a palavra: ");

			String guess = InputHandler.nextLine();
			if (guess.equals("0")) {
				break;
			}

			GameResults partialGameResult = processAnswer(guess, originalWord);
			currentGameResults.incrementHits(partialGameResult.getHits());
			currentGameResults.incrementMisses(partialGameResult.getMisses());
		}
		return currentGameResults;
	}
	protected abstract GameResults processAnswer(String input, String originalWord);
}
