package collection.equalshashcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestEH {
//	public static void main(String[] args) {
//
//		Employee e1 = new Employee(1, "Rishabh", 5000);
//
//		Employee e2 = new Employee(2, "Atul", 8000);
//
//		Employee e4 = new Employee(1, "Rishabh", 5000);
//
//		Employee e3 = null;
//
////		String s = "Ram";
////		String s1 = "Ram";
//
////		System.out.println(s.equals(s1));
//
//		System.out.println(e1.equals(e3));    
//
//		System.out.println(e1.hashCode() == e4.hashCode());
//
//		System.out.println(e1.equals(e4));
//		
//		System.out.println(e1.hashCode());
//
//		System.out.println(e2.hashCode());
//
//		System.out.println(e1.equals(e4));
//
//		
//		
//		System.out.println("=====list=====");
//
//		List list = new ArrayList();
//
//		list.add(e1);
//		list.add(e2);
//		
//		
//		
//		System.out.println("-----------------e-------------");
//		
//		Employee e = new Employee(1, "Rishabh", 5000);
//
//		System.out.println(list.remove(e));
//		
//		System.out.println(list);
//		
//		System.out.println(list.size());
//		
//		
//		System.out.println("------------------------");
//
//		Set ss = new HashSet();
//
//		ss.add(e1);
//		ss.add(e2);
//		ss.add(e4);
//
//		System.out.println(ss);
//
//	}

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "abc", 100);

		Employee e2 = new Employee(1, "abc", 100);

		System.out.println(e1.equals(e2));

		System.out.println(e1.equals("abc"));

		System.out.println(e1.hashCode());

		System.out.println(e2.hashCode());

		System.out.println("------------Set------------");

		Set set = new HashSet();

		set.add(e1);

		set.add(e2);

		System.out.println(set.size());

		System.out.println("set: " + set);

		System.out.println("------------List------------");

		List list = new ArrayList();

		list.add(e1);

		list.add(e2);

		System.out.println("list: " + list);

		System.out.println("list: " + list.remove(new Employee(1, "abc", 100)));

		System.out.println("list: " + list);

		System.out.println("---------Map-----------");

		Map map = new HashMap();

		map.put(e1, "one");
		map.put(e2, "two");

		System.out.println("map: " + map);
		System.out.println("size: " + map.size());
	}

}
