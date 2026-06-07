package exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class TestNoSuchElement {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("a");
		list.add("b");

		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		try {
			System.out.println(it.next());
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}finally {
			System.out.println("Final");
		}
		

	}

}
