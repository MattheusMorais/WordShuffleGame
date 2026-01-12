package shufflers;

public class ShufflerFactory {

	public static Shuffler createShuffler(int difficulty) {
		switch (difficulty) {
		case 1:
			return new ReverseShuffler();
		case 2:
			return new PermutationShuffler();
		default:
			return new ReverseShuffler();
		}
	}
}
