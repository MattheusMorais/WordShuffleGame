package app;

public class MenuInitialResult {
	public int opcao;
	public String nomeJogador;

	public MenuInitialResult(int opcao, String nomeJogador) {
		this.opcao = opcao;
		this.nomeJogador = nomeJogador;
	}

	public int getOpcao() {
		return opcao;
	}

	public String getNomeJogador() {
		return nomeJogador;
	}

}
