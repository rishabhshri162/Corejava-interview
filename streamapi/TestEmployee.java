package streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmployee {
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Alice", 50000));
		employees.add(new Employee("Bob", 70000));
		employees.add(new Employee("Charlie", 60000));
		employees.add(new Employee("David", 80000));
		employees.add(new Employee("David", 80000));

		// firsthighest
		employees.stream().map(e -> e.getSalary()).distinct().sorted(Comparator.reverseOrder()).limit(1)
				.forEach(System.out::println);

		// second highest salary
		employees.stream().map(e -> e.getSalary()).distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1)
				.forEach(System.out::println);

		employees.stream().filter(employee -> employee.getSalary() > 20000)
				.collect(Collectors.toCollection(ArrayList::new));

		employees.forEach(e -> System.out.println(e.getName() + " - Salary: " + e.getSalary()));

		// ascending order
		employees.stream().map(e -> e.getSalary()).distinct().sorted().forEach(System.out::println);

	}
}