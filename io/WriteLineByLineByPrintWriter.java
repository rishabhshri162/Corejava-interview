package io;

import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteLineByLineByPrintWriter {

	public static void main(String[] args) throws Exception {

		FileWriter file = new FileWriter("D:\\io\\printw.txt");

		PrintWriter out = new PrintWriter(file);

		out.println("Hello Bhai");

		out.println("Good morning");

		file.close();
		out.close();

	}
}
