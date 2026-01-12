package mechanics;

import app.MenuOptions;
import app.GameResults;
import bank.WordBank;
import shufflers.Shuffler;
import shufflers.ShufflerFactory;
import static utils.InputHandler.SC;

public abstract class BaseMechanic implements GameMechanic {
	protected int difficulty;
	int hits = 0;
	int misses = 0;

	@Override
	public GameResults play(final MenuOptions option, final int difficulty) {
		WordBank bank = new WordBank();

		GameResults currentGameResults = new GameResults();
		MenuOptions startMenu = option;

		System.out.println("*** OBS: Digite 0 a qualquer momento para Finalizar o Jogo. ***");
		while (true) {
			if (startMenu.getOption() != 1) {
				break;
			}

			String originalWord = bank.returnWord();
			Shuffler shuffler;
			shuffler = ShufflerFactory.createShuffler(difficulty);


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
