package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileMerger {

	public static void main(String[] args) throws Exception {

		FileReader file1 = new FileReader("C:\\Users\\Lenovo\\Desktop\\io\\file1.txt");

		FileReader file2 = new FileReader("C:\\Users\\Lenovo\\Desktop\\io\\file2.txt");

		BufferedReader br = new BufferedReader(file1);

		PrintWriter out = new PrintWriter("C:\\Users\\Lenovo\\Desktop\\io\\file3.txt");

		String line = br.readLine();

		while (line != null) {
			out.write(line);
			line = br.readLine();
		}

		br = new BufferedReader(file2);

		line = br.readLine();

		while (line != null) {
			out.println(line);
			line = br.readLine();
		}

		br.close();
		out.close();
		System.out.println("Check your folder");

	}

}
