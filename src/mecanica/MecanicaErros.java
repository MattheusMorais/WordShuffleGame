package mecanica;

import app.MenuInitialResult;
import app.Resultado;

public class MecanicaErros extends MecanicaBase {
    
	@Override
	protected Resultado processarResposta(String entrada, String palavraOriginal) {

		if (entrada.equals(palavraOriginal)) {
			acertos++;
		} else {
			erros++;
		}
		return new Resultado ( acertos, erros );
	}

	@Override
	public String formatarResultado(Resultado resultado, MenuInitialResult nomeJogador) {
		return "Jogador: " + nomeJogador.getNomeJogador() + "\n" + "Acertos: " + resultado.getAcertos() + ", Erros: " + resultado.getErros();
	}
}
