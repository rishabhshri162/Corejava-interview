package io;

import java.io.File;
import java.util.Date;

public class FileInfo {
	public static void main(String[] args) {

		File f = new File("D:\\io\\keyboard.txt");

		if(f.exists()) {
			
			System.out.println("Name : "+ f.getName());
			System.out.println("Path : "+ f.getAbsolutePath());
			
			System.out.println("Writable : "+ f.canWrite());
			System.out.println("Readable : "+ f.canRead());
			
			System.out.println("Is File : "+ f.isFile());
			System.out.println("Is Dir : "+ f.isDirectory());
			
			Date d = new Date(f.lastModified());
			System.out.println("Modified Date : "+ d);
			
			System.out.println(f.length());
		}
	}
}
