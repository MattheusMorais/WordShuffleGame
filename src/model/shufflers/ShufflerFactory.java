package model.shufflers;

import controller.MenuSettings;

public class ShufflerFactory {

	public static Shuffler createShuffler(MenuSettings settings) {
        return switch (settings.getDIFFICULTY()) {
            case 1 -> new ReverseShuffler();
            case 2 -> new PermutationShuffler();
            default -> new ReverseShuffler();
        };
	}
}
