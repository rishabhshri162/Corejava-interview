package collection.comparator;

import java.util.Comparator;

public class EmployeeSortIDNameSalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		if (o1.getId() == o2.getId() || o1.getName() == o2.getName()) {
			return o1.getsalary() - o2.getsalary();

		} else if (o1.getsalary() == o2.getsalary()) {
			return o1.getName().compareTo(o2.getName());
		}
		return o1.getId() - o2.getId();

	}

}
