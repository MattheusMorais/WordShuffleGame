package mechanics;

import app.MenuOptions;
import app.GameResults;

public interface GameMechanic {
	GameResults play(MenuOptions option, int difficulty);
	String formattedResult(GameResults gameResults, MenuOptions playerName);
}