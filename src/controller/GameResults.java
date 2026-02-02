package controller;

import utils.FileManager;

public class GameResults {
	private int hits;
	private int misses;
	private final int HITSCORE = 200;
	private final int MISSESCORE = -100;

	public GameResults() {
		this.hits = 0;
		this.misses = 0;
	}

	public GameResults(int hits, int misses) {
		this.hits = hits;
		this.misses = misses;
	}

	public int getHits() {
		return hits;
	}

	public void incrementHits(int hits) {
		this.hits += hits;
	}

	public int getMisses() { return misses; }

	public void incrementMisses(int misses) {
		this.misses += misses;
	}

	public int scoreResult() {
		return (HITSCORE * hits) + (MISSESCORE * misses);
	}

	public static void gameOver(String formattedResult) {
		System.out.println("Resultado do jogo: "); // USAR toString();
		FileManager.createResultsFile();
		FileManager.writeResults(formattedResult);
		FileManager.readResults();
	}
}
