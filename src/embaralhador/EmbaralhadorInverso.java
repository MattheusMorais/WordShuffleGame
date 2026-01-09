package embaralhador;

public class EmbaralhadorInverso implements Embaralhador {

	@Override
	public String embaralhar(String palavra) {
		StringBuilder invertida = new StringBuilder(); // Cria um objeto Mutável

		for (int i = palavra.length() - 1; i >= 0; i--) { // Algoritmo de Inversão da String
			char letra = palavra.charAt(i);
			invertida.append(letra);
		}
		return invertida.toString(); // Transforma o objeto em String
	}
}