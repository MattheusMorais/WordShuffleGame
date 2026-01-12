package mechanics;

import app.MenuOptions;
import app.GameResults;

public class ScoreBaseMechanic extends BaseMechanic {
	GameResults score = new GameResults();

	@Override
	public GameResults processAnswer(String input, String originalWord) {
		if (input.equals(originalWord)) {
			score.incrementHits(1); // +200 per hit
		} else {
			score.incrementMisses(1); // -100 per miss
		}
		return score;
	}

	@Override
	public String formattedResult(GameResults gameResults, MenuOptions playerName) {
		return "Jogador: " + playerName.getPlayerName() + "\n" + "Pontuação Final: " + gameResults.scoreResult();
	}
}
