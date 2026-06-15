package collection.comparator;

import java.util.Comparator;

public class EmployeeSortByName implements Comparator<Employee> {

//	@Override
//	public int compare(Employee o1, Employee o2) {
//
//		return o1.getName().compareTo(o2.getName());
//	}

	@Override
	public int compare(Employee o1, Employee o2) {

		if (o1.getName().equals(o2.getName())) {
			return 0;
			
		} else if (o1.getName().compareTo(o2.getName()) < 0) {
			return 1;
			
		} else {
			return -1;
		}
	}
}
