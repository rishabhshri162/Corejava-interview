package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineByLine {
	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("D:\\io\\linebyline.txt");

		BufferedReader reader = new BufferedReader(file);

		String line = reader.readLine();

		while (line != null) {

			System.out.println(line);

			line = reader.readLine();
		}

		file.close();
		reader.close();
	}
}
