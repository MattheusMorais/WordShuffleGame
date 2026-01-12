package mechanics;

import java.util.Random;

public class GameMechanicFactory {

	public static GameMechanic createMechanic() {
		Random random = new Random();

		if (random.nextBoolean()) {
			return new ErrorBaseMechanic();
		} else {
			return new ScoreBaseMechanic();
		}
	}
}
