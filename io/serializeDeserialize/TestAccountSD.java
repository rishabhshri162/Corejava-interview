package io.serializeDeserialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccountSD {

	public static void main(String[] args) throws Exception {

		Account a = new Account("1", 500);

        System.out.println("Before Serialization : " + a);

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\io\\Account.txt"));

		// Convert Account class object into byte stream: serialization
		out.writeObject(a);

		out.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\io\\Account.txt"));

		// Convert byte stream into Account class object: deserialization
		System.out.println(in.readObject());

		in.close();
	}
}
