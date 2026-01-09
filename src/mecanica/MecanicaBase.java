package mecanica;

import app.MenuInitialResult;
import app.Resultado;
import banco.BancoDePalavras;
import embaralhador.Embaralhador;
import embaralhador.FabricaEmbaralhadores;
import static util.Input.SC;

public abstract class MecanicaBase implements MecanicaDoJogo {
	protected int dificuldade;
	int acertos = 0;
	int erros = 0;

	@Override
	public Resultado jogar(final MenuInitialResult opcao, final int dificuldade) {
		BancoDePalavras banco = new BancoDePalavras();

		Resultado ResultadoAtual = new Resultado();
		MenuInitialResult menuInitial = opcao;

		System.out.println("*** OBS: Digite 0 a qualquer momento para Finalizar o Jogo. ***");
		while (true) {
			if (menuInitial.opcao != 1) {
				break;
			}

			String palavraOriginal = banco.retornarPalavra();
			Embaralhador embaralhador;
			// try {
			embaralhador = FabricaEmbaralhadores.criarEmbaralhador(dificuldade);
			// } catch (InvalidKeyException e) {
			// throw new JogoException(e, "opção invalida");
			// }

			String palavraEmbaralhada = embaralhador.embaralhar(palavraOriginal);
			System.out.println("Palavra embaralhada: " + palavraEmbaralhada);
			System.out.println("Advinhe a palavra: ");

			String entrada = SC.nextLine();
			if (entrada.equals("0")) {
				break;
			}

			Resultado resultadoParcial = processarResposta(entrada, palavraOriginal);
			ResultadoAtual.incrementAcertos(resultadoParcial.getAcertos());
			ResultadoAtual.incrementErros(resultadoParcial.getErros());
		}
		return ResultadoAtual;
	}
	protected abstract Resultado processarResposta(String entrada, String palavraOriginal);
}
