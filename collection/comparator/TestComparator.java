package collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestComparator {
	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Employee(1, "Rishabh", 5000));
		list.add(new Employee(3, "Rishabh", 3300));
		list.add(new Employee(2, "Ajay", 4000));
		list.add(new Employee(4, "Aditya", 5000));

		EmployeeSortByName byName = new EmployeeSortByName();

		Collections.sort(list, byName);

//		Iterator it = list.iterator();
//
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		for (Object o : list) {
			System.out.println("byName: " + o);
			
		}

		EmployeeSortByIdName byIdName = new EmployeeSortByIdName();

		Collections.sort(list, byIdName);

//		Iterator it = list.iterator();
//		
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		for (Object o : list) {
			System.out.println("byidname: " + o);
			
		}
		

		EmployeeSortIDNameSalary byAll = new EmployeeSortIDNameSalary();

		Collections.sort(list, byAll);

//		Iterator it = list.iterator();
//
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		for (Object o : list) {
			System.out.println("byidnameSalary: " + o);
			
		}
	}
}
