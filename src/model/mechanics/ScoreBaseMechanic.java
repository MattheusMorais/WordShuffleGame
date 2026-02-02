package model.mechanics;

import controller.GameResults;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
	public String formattedResult(GameResults gameResults, String PLAYERNAME) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		return now.format(formatter) + "\n" + "Jogador: " + PLAYERNAME + "\n" + "Pontuação Final: " + gameResults.scoreResult();
	}
}
