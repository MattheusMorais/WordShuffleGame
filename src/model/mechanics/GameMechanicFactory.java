package model.mechanics;

import controller.handlers.RandomHandler;

public class GameMechanicFactory {

	public static GameMechanic createMechanic() {

		if (RandomHandler.nextBoolean()) {
			return new ErrorBaseMechanic();
		} else {
			return new ScoreBaseMechanic();
		}
	}
}
