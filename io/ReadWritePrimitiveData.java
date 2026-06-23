package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWritePrimitiveData {
	
	public static void main(String[] args) throws Exception {

		DataOutputStream out = new DataOutputStream(new FileOutputStream("D:\\io\\primitive.txt"));

		out.writeInt(1);
		out.writeDouble(1.1);
		out.writeBoolean(true);
		out.writeChar('A');

		out.close();
	

		DataInputStream in = new DataInputStream(new FileInputStream("D:\\io\\primitive.txt"));
		
		System.out.println(in.readInt());
		System.out.println(in.readDouble());
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());
		
		in.close();
	}	

}
