package model.game.mechanics;

import model.game.results.GameResults;
import utils.handlers.LocalDateTimeHandler;

public class ErrorBaseMechanic extends BaseMechanic {
    
	@Override
	public final void processAnswer(String input, String originalWord) {
		if (input.equals(originalWord)) {
            currentGameResults.incrementHits(1);
		} else {
			currentGameResults.incrementMisses(1);
		}
	}

	@Override
	public final String formattedResult(GameResults gameResults, String PLAYERNAME) {
		return LocalDateTimeHandler.getNow() + "\n" + "Jogador: " + PLAYERNAME + "\n" + "Acertos: " + gameResults.getHits() + ", Erros: " + gameResults.getMisses();
	}
}
