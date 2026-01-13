package mechanics;

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
	public String formattedResult(GameResults gameResults, String PLAYERNAME) {
		return "Jogador: " + "\n" + "Acertos: " + gameResults.getHits() + ", Erros: " + gameResults.getMisses();
	}
}
