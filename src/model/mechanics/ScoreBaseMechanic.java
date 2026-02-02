package model.mechanics;

import controller.GameResults;
import controller.LocalDateTimeHandler;

public class ScoreBaseMechanic extends BaseMechanic {

	@Override
	public final void processAnswer(String input, String originalWord) {
		if (input.equals(originalWord)) {
			currentGameResults.incrementHits(1); // +200 per hit
		} else {
			currentGameResults.incrementMisses(1); // -100 per miss
		}
	}

	@Override
	public final String formattedResult(GameResults gameResults, String PLAYERNAME) {
		return LocalDateTimeHandler.getNow() + "\n" + "Jogador: " + PLAYERNAME + "\n" + "Pontuação Final: " + gameResults.scoreResult();
	}
}
