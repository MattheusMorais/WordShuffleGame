package mechanics;

import app.GameResults;
import app.MenuSettings;
import bank.WordBank;
import shufflers.Shuffler;
import shufflers.ShufflerFactory;
import static utils.InputHandler.SC;

public abstract class BaseMechanic implements GameMechanic {
	int hits = 0;
	int misses = 0;

	@Override
	public GameResults play(final MenuSettings settings) {
		WordBank bank = new WordBank();
		GameResults currentGameResults = new GameResults();

		System.out.println("*** OBS: Digite 0 a qualquer momento para Finalizar o Jogo. ***");
		while (true) {
			if (settings.getOPTION() != 1) {
				break;
			}
			String originalWord = bank.returnWord();
			Shuffler shuffler = ShufflerFactory.createShuffler(settings);

			String scrambledWord = shuffler.shuffler(originalWord);
			System.out.println("Palavra embaralhada: " + scrambledWord);
			System.out.println("Advinhe a palavra: ");

			String input = SC.nextLine();
			if (input.equals("0")) {
				break;
			}

			GameResults partialGameResult = processAnswer(input, originalWord);
			currentGameResults.incrementHits(partialGameResult.getHits());
			currentGameResults.incrementMisses(partialGameResult.getMisses());
		}
		return currentGameResults;
	}
	protected abstract GameResults processAnswer(String input, String originalWord);
}
