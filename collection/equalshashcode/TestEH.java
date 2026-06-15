package  collection.equalshashcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestEH {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Ram", 5000);

		Employee e2 = new Employee(2, "Ajay", 8000);

		Employee e4 = new Employee(1, "Ram", 5000);
		
		Employee e3 = null;
		
		String s = "Ram";
		String s1 = "Ram";

		System.out.println(s.equals(s1));

		System.out.println(e1.equals(e3));

		System.out.println(e1.hashCode() == e4.hashCode());

		System.out.println(e1.hashCode());
		
		System.out.println(e2.hashCode());

		System.out.println(e1.equals(e4));
		
		System.out.println(e1);
		

//		List list = new ArrayList();
//
//		list.add(e1);
//		list.add(e2);
//		
//		Employee e = new Employee(1, "Ram", 5000);
//
//		System.out.println(list.remove(e));
//
//		
//		Set s = new HashSet();
//		
//		s.add(e1);
//		s.add(e2);
//		s.add(e4);
//		
//		
//		System.out.println(s);
//		
		

		

	}
}
