package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
	private static final File results = new File("resources/Scores/results.txt");
	private static final File words = new File("resources/WordBank/animals.txt");

	public static void createResultsFile() {

        try {
			if (!results.getParentFile().exists()) {
				results.getParentFile().mkdirs();
			}

			if (!results.exists()) {
				results.createNewFile();
			}
        } catch (IOException e) {
            throw new RuntimeException("Erro ao criar o arquivo: " + e.getMessage());
        }
    }

	public static void readResults() {
		try (BufferedReader myReader = new BufferedReader(new FileReader(results))){
			String line = myReader.readLine();
			while (line != null) {
				System.out.println(line);
				line = myReader.readLine();
			}
		} catch (IOException e) {
            throw new RuntimeException("Erro ao ler do arquivo: " + e.getMessage());
        }
    }

	public static void writeResults(String formattedResult) {
		try (BufferedWriter myWriter = new BufferedWriter(new FileWriter(results,true))) {
			for (String line: formattedResult.split("\n")) {
				myWriter.write(line);
				myWriter.newLine();
			}
			myWriter.newLine();
        } catch (IOException e) {
            throw new RuntimeException("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

	public static List<String> readWordBank() {
		try (BufferedReader myWords = new BufferedReader(new FileReader(words))) {
			List<String> wordList = new ArrayList<>();

			String word = "";
			while((word = myWords.readLine()) != null) {
				wordList.add(word.trim().toLowerCase());
			}
			return wordList;
		} catch (IOException e) {
            throw new RuntimeException("Erro ao ler do arquivo: " + e.getMessage());
        }
    }

}
