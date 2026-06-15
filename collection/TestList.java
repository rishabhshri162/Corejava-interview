package collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add('a');
		list.add('b');
		list.add('c');

		List list2 = new ArrayList();

		list2.add('d');
		list2.add('e');

		System.out.println(list);

		System.out.println(list.subList(1, 2));

		System.out.println(list.get(2));

		System.out.println(list.contains('a'));
		System.out.println(list.addAll(list2));
		System.out.println(list.containsAll(list2));
		System.out.println(list.remove(2));
		list.clear();
		System.out.println(list);

	}
}
