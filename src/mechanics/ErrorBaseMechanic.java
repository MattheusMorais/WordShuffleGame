package mechanics;

import app.MenuOptions;
import app.GameResults;

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
	public String formattedResult(GameResults gameResults, MenuOptions playerName) {
		return "Jogador: " + playerName.getPlayerName() + "\n" + "Acertos: " + gameResults.getHits() + ", Erros: " + gameResults.getMisses();
	}
}
