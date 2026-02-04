package model.bank;

import controller.handlers.RandomHandler;
import utils.FileManager;
import java.util.List;

public class WordBank {
	List<String> wordList;

	public WordBank() {
		readWordFromBank();
	}

	public void readWordFromBank() {
		FileManager.readWordBank();
		wordList = FileManager.readWordBank();
	}

	public String returnWord() {
		int index = RandomHandler.nextInt(wordList.size());
		return wordList.get(index);
	}
}
