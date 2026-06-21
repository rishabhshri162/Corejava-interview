package io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadWriteByKeyboard {

	public static void main(String[] args) throws Exception {
		
		InputStreamReader isReader = new InputStreamReader(System.in);

		BufferedReader reader = new BufferedReader(isReader);

		PrintWriter out = new PrintWriter(new FileWriter("D:\\io\\rishabh.txt", true));
		
		System.out.println("Enter Here.......");

		String line = reader.readLine();

		while (!(line.equals("stop"))) {

			out.println(line);

			line = reader.readLine();

		}

		out.close();
		reader.close();

	}
}
