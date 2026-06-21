package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileSplit {

	public static void main(String[] args) throws Exception{

		File file = new File("D:\\io\\SplitFile.txt");

		BufferedReader fileToCount = new BufferedReader(new FileReader(file));

		int count = 0;
		String s = fileToCount.readLine();

		while (s != null) {
			count++;
			s = fileToCount.readLine();

		}
		System.out.println("Total Line : " + count);

		BufferedReader br = new BufferedReader(new FileReader(file));

		for (int i = 1; i <= count; i++) {

			String line = br.readLine();

			System.out.println("createFile" + i + " " + line);

			BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\io\\Split" + i + ".txt"));

			bw.write(line);
			bw.close();
		}

		br.close();
		fileToCount.close();
	}
}
