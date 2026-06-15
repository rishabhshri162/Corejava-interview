package collection.comparator;

import java.util.Comparator;

public class EmployeeSortByIdName implements Comparator<Employee> {

	@Override
	public int compare
	(Employee o1, Employee o2) {

		if (o1.getId() == o2.getId()) {
			return o1.getName().compareTo(o2.getName());
		}

		return o1.getId() - o2.getId();
	}

}
