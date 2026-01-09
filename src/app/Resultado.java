package app;

public class Resultado {
	private int acertos;
	private int erros;
	private int pontuacaoAcertos = 200;
	private int pontuacaoErros = -100;

	public Resultado() {
		this.acertos = 0;
		this.erros = 0;
	}

	public Resultado(int acertos, int erros) {
		this.acertos = acertos;
		this.erros = erros;
	}

	public int getAcertos() {
		return acertos;
	}

	public void setAcertos(int acertos) {
		this.acertos = acertos;
	}

	public int getErros() {
		return erros;
	}

	public void setErros(int erros) {
		this.erros = erros;
	}

	public void incrementAcertos(int acertos) {
		this.acertos += acertos;
	}

	public void incrementErros(int erros) {
		this.erros += erros;
	}

	public int calculatePontuacao() {
		return (pontuacaoAcertos * acertos) + (pontuacaoErros * erros);
	}
}