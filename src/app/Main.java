package app;

import mecanica.FabricaMecanicaDoJogo;
import mecanica.MecanicaDoJogo;

public class Main {

	static void main() {
		Menu menu = new Menu();
		MenuInitialResult menuResult = menu.menuInicial();

		int dificuldade = menu.menuDificuldade();

		MecanicaDoJogo mecanica = FabricaMecanicaDoJogo.criarMecanica();
		Resultado resultado = mecanica.jogar(menuResult, dificuldade);

		String resultadoFormatado = mecanica.formatarResultado(resultado, menuResult);

		Fim.fimJogo(resultadoFormatado);

	}
}