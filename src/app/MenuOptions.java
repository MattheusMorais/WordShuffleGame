package app;

public class MenuOptions {
	public int option;
	public String playerName;

	public MenuOptions(int option, String playerName) {
		this.option = option;
		this.playerName = playerName;
	}

	public int getOption() {
		return option;
	}

	public String getPlayerName() {
		return playerName;
	}

}
