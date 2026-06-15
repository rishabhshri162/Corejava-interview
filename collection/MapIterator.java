package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapIterator {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<Integer, String>();

		m.put(1, "java");
		m.put(2, "oop");
		m.put(3, "collection");

		System.out.println(m);

		for (Object o : m.entrySet()) {
			System.out.println(o);
		}

		for (Object o : m.values()) {
			System.out.println(o);
		}

		for (Object o : m.keySet()) {
			System.out.println(o);
		}

//		TreeMap t = new TreeMap();
//		t.put(1, "Ram");
//		t.put(3, "Shyam");
//		t.put(2, "Lakhan");
//		t.put(4, null);
//
//		for (Object o : t.keySet()) {
//			System.out.println(o);
//		}
	}
}
