package shufflers;

import app.Menu;

public class ShufflerFactory {

	public static Shuffler createShuffler() {
		Menu difficulty = new Menu();
        return switch (difficulty.getDifficulty()) { // Difficulty does not change during the game, getDifficulty is better than passing parameters
            case 1 -> new ReverseShuffler();
            case 2 -> new PermutationShuffler();
            default -> new ReverseShuffler();
        };
	}
}
