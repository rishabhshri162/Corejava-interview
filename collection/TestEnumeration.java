package collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);

		Enumeration e = v.elements();

		while (e.hasMoreElements()) {

			System.out.println(e.nextElement());
		}
	}
}
