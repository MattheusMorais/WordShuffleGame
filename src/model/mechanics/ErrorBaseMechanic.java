package model.mechanics;

import controller.GameResults;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ErrorBaseMechanic extends BaseMechanic {
    
	@Override
	protected GameResults processAnswer(String input, String originalWord) {

		if (input.equals(originalWord)) {
			hits++;
		} else {
			misses++;
		}
		return new GameResults(hits, misses);
	}

	@Override
	public String formattedResult(GameResults gameResults, String PLAYERNAME) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		return now.format(formatter) + "\n" + "Jogador: " + PLAYERNAME + "\n" + "Acertos: " + gameResults.getHits() + ", Erros: " + gameResults.getMisses();
	}
}
