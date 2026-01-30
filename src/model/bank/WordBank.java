package model.bank;

import controller.RandomHandler;

import java.util.ArrayList;
import java.util.List;

public class WordBank {
	private final List<String> wordList = new ArrayList<>();

	public WordBank() {
		bankInitializer();
		bankToLowerCase();
	}

	public void bankInitializer() {
		wordList.add("Gato");
		wordList.add("Cachorro");
		wordList.add("Elefante");
		wordList.add("Cangurú");
		wordList.add("Pombo");
		wordList.add("Galinha");
		wordList.add("Tigre");
		wordList.add("Leão");
		wordList.add("Girafa");
		wordList.add("Cavalo");
		wordList.add("Coelho");
		wordList.add("Urso");
		wordList.add("Lobo");
		wordList.add("Águia");
		wordList.add("Jacaré");
		wordList.add("Zebra");
		wordList.add("Golfinho");
		wordList.add("Tartaruga");
		wordList.add("Coruja");
		wordList.add("Rinoceronte");
		wordList.add("Camaleão");
		wordList.add("Pinguim");
	}

	public void bankToLowerCase() {
		for (int i = 0; i < wordList.size(); i++) {
			wordList.set(i, wordList.get(i).toLowerCase());
		}
	}

	public String returnWord() {
		int index = RandomHandler.nextInt(wordList.size());
		return wordList.get(index);
	}
}
