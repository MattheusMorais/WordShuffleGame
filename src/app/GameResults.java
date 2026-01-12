package app;

public class GameResults {
	private int hits;
	private int misses;
	private int hitsScore = 200;
	private int missesScore = -100;

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

	public void setHits(int hits) {
		this.hits = hits;
	}

	public int getMisses() {
		return misses;
	}

	public void setErros(int misses) {
		this.misses = misses;
	}

	public void incrementHits(int hits) {
		this.hits += hits;
	}

	public void incrementMisses(int misses) {
		this.misses += misses;
	}

	public int scoreResult() {
		return (hitsScore * hits) + (missesScore * misses);
	}
}