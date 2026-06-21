package oop.deep;

public class TestDeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Deep deep1 = new Deep();

		deep1.balance = 10;

		deep1.address = new Address();
		
		deep1.address.city = "Delhi";

		Deep deep2 = (Deep) deep1.clone();

		deep2.balance = 20;

		deep2.address.city = "Mumbai";

		System.out.println(deep1.balance);
		System.out.println(deep2.balance);

		System.out.println(deep1.address.city);
		System.out.println(deep2.address.city);
	}
}
