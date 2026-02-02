package model.mechanics;

import controller.MenuSettings;
import controller.GameResults;

public interface GameMechanic {
	GameResults play(MenuSettings settings);
	String formattedResult(GameResults gameResults, String PLAYERNAME);
}
