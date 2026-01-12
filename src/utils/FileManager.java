package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

	public static void createFile() {
		try {
			File myObj = new File("recursos/Resultados.txt");
			if (myObj.createNewFile()) {
				System.out.println("Arquivo criado: " + myObj.getName());
			} else {
				System.out.println("Arquivo já existente: " + myObj.getName());
			}

		} catch (IOException e) {
			System.out.println("An Error occurred");
			e.printStackTrace();
		}
	}

	public static void writeFile(String formattedResult) {
		try (BufferedWriter myWriter = new BufferedWriter(new FileWriter("recursos/Resultados.txt", true))) {
			myWriter.write(formattedResult);
			myWriter.newLine();
			myWriter.newLine();

		} catch (IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}

	public static void readFile() {
		try (BufferedReader myReader = new BufferedReader(new FileReader("recursos/Resultados.txt"))) {
			String line;
			while ((line = myReader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}
}
