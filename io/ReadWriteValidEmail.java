package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteValidEmail {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader("D:\\io\\Email.txt"));

		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\io\\ValidEmail.txt"));

		String email = br.readLine();

		while (email != null) {

			if (email.matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
				System.out.println(email);

				bw.write(email);
				bw.newLine();
			}
			email = br.readLine();
		}
		br.close();
		bw.close();
	}

}
