package banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BancoDePalavras {
	private List<String> lista = new ArrayList<String>(); // Classe List é melhor pois permite flexibilidade ao alterar a ED depois.
	private Random random = new Random();

	public BancoDePalavras() { // Construtor que inicializa os dois métodos automaticamente ao ser instanciado algum objeto dele.
		inicializarBanco();
		transformarEmMinusculo();
	}

	public void inicializarBanco() {
		lista.add("Gato");
		lista.add("Cachorro");
		lista.add("Elefante");
		lista.add("Cangurú");
		lista.add("Pombo");
		lista.add("Galinha");
		lista.add("Tigre");
		lista.add("Leão");
		lista.add("Girafa");
		lista.add("Cavalo");
		lista.add("Coelho");
		lista.add("Urso");
		lista.add("Lobo");
		lista.add("Águia");
		lista.add("Jacaré");
		lista.add("Zebra");
		lista.add("Golfinho");
		lista.add("Tartaruga");
		lista.add("Coruja");
		lista.add("Rinoceronte");
		lista.add("Camaleão");
		lista.add("Pinguim");
	}

	public void transformarEmMinusculo() {
		for (int i = 0; i < lista.size(); i++) {
			lista.set(i, lista.get(i).toLowerCase());
		}
	}

	public String retornarPalavra() {
		int indice = random.nextInt(lista.size());
		return lista.get(indice);
	}
}
