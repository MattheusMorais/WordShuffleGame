package mecanica;

import java.util.Random;

public class FabricaMecanicaDoJogo {

	public static MecanicaDoJogo criarMecanica() {
		Random random = new Random();

		if (random.nextBoolean()) {
			return new MecanicaErros();
		} else {
			return new MecanicaPontuacao();
		}
	}
}
