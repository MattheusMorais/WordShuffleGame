package embaralhador;

public class FabricaEmbaralhadores {

	public static Embaralhador criarEmbaralhador(int dificuldade) {
		switch (dificuldade) {
		case 1:
			return new EmbaralhadorInverso();
		case 2:
			return new EmbaralhadorPermutar();
		default:
			return new EmbaralhadorInverso();
		}
	}
}
