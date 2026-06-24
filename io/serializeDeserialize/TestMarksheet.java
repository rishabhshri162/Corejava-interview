package io.serializeDeserialize;

import java.io.*;

public class TestMarksheet {
    public static void main(String[] args) throws Exception {


        Marksheet m = new Marksheet();

        m.id = 1;
        m.name = "Rishabh";
        m.maths = 90;
        m.physics = 85;
        m.chemistry = 80;

        m.total = m.maths + m.physics + m.chemistry;

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://IO//Marksheet.txt"));
        out.writeObject(m);
        out.close();

        System.out.println("Object write successfully....!!!");
        System.out.println("total = " + m.total);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://IO//Marksheet.txt"));

        Marksheet m1 = (Marksheet) in.readObject();

        System.out.println(m1.id);
        System.out.println(m1.name);
        System.out.println(m1.maths);
        System.out.println(m1.physics);
        System.out.println(m1.chemistry);
        System.out.println("total: " + m1.total);

        in.close();





    }
}
