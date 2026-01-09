package mecanica;

import java.util.Scanner;

import app.MenuInitialResult;
import app.Resultado;

public interface MecanicaDoJogo {
	Resultado jogar(MenuInitialResult opcao, int dificuldade);
	String formatarResultado(Resultado resultado, MenuInitialResult nomeJogador);
}