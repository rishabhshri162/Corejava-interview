package oop.shallow;

public class TestShallow {

	public static void main(String[] args) throws CloneNotSupportedException {

		Shallow shallow1 = new Shallow(10);

//		shallow1.balance = 10;
//		
//		shallow1.address = new Address();
		
//		shallow1.address.city= "indore";

		Shallow shallow2 = (Shallow) shallow1.clone();

		shallow2.balance = 20;
		
//		shallow2.address.city= "mumbai";

		System.out.println(shallow1.balance);
		System.out.println(shallow2.balance);
//		System.out.println(shallow1.address.city);
//		System.out.println(shallow2.address.city);

	}
}
