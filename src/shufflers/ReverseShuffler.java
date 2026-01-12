package shufflers;

public class ReverseShuffler implements Shuffler {

	@Override
	public String shuffler(String word) {
		StringBuilder reversed = new StringBuilder(); // Create a mutable object

		for (int i = word.length() - 1; i >= 0; i--) { // Algorithm that reverses the string
			char letter = word.charAt(i);
			reversed.append(letter);
		}
		return reversed.toString(); // Converts the StringBuilder to a String
	}
}