package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class FailFast {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("one");
		list.add("two");
		list.add("three");

		System.out.println(list);

		Iterator it = list.iterator();
		
		list.add("four");
	

		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
}
