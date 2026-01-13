package mechanics;

import app.MenuSettings;
import app.GameResults;

public interface GameMechanic {
	GameResults play(MenuSettings settings);
	String formattedResult(GameResults gameResults, String PLAYERNAME);
}