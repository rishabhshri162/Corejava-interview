package io;

import java.io.FileWriter;


public class TestFileWriter {

	public static void main(String[] args) throws Exception {
		
		FileWriter file = new FileWriter("D:\\io\\keyboard.txt", true);
		
		file.write(" Python");
		
		file.close();
	}
}
