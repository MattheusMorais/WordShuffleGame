package mecanica;

import app.MenuInitialResult;
import app.Resultado;

public class MecanicaPontuacao extends MecanicaBase {
	Resultado pontuacao = new Resultado();

	@Override
	public Resultado processarResposta(String entrada, String palavraOriginal) {
		if (entrada.equals(palavraOriginal)) {
			pontuacao.incrementAcertos(1); // +200 a cada acerto
		} else {
			pontuacao.incrementErros(1); // -100 a cada erro
		}
		return pontuacao;
	}

	@Override
	public String formatarResultado(Resultado resultado, MenuInitialResult nomeJogador) {
		return "Jogador: " + nomeJogador.getNomeJogador() + "\n" + "Pontuação Final: " + resultado.calculatePontuacao();
	}
}
