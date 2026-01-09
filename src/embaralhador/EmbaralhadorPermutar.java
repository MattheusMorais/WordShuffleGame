package embaralhador;

import java.util.Random;

public class EmbaralhadorPermutar implements Embaralhador {

	@Override
	public String embaralhar(String palavra) {
		Random random = new Random();
		char[] escolhida = palavra.toCharArray();

		for (int i = escolhida.length - 1; i > 0; i--) { // Algoritmo que troca as posisões dos chars
			int j = random.nextInt(i + 1);
			char temp = escolhida[i];
			escolhida[i] = escolhida[j];
			escolhida[j] = temp;
		}
		return new String(escolhida);
	}
}