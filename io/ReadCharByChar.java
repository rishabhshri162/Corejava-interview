package io;

import java.io.FileReader;
import java.io.FileWriter;

public class ReadCharByChar {

	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("D:\\io\\keyboard.txt");

		FileWriter wfile = new FileWriter("D:\\io\\output.txt");

		int ch = file.read();

		while (ch != -1) {
			System.out.println((char) ch);

			wfile.write(ch);

			ch = file.read();
		}
		wfile.close();
		file.close();
	}
}
