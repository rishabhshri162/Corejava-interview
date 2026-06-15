package collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Employee(1, "Rishabh", 1000));
		list.add(new Employee(2, "Rishabh", 2000));
		list.add(new Employee(3, "Aditya", 3000));
		list.add(new Employee(4, "Ajay", 4000));

		Collections.sort(list);
//		Collections.shuffle(list);

		for (Object o : list) {

			System.out.println(o);
		}
	}
}
