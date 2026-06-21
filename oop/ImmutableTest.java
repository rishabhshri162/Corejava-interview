package oop;

public class ImmutableTest {

	public static void main(String[] args) {

		// jab hum object bnate hai to constructor call hota hai this.name = "rishabh"

		Immutable t = new Immutable("Rishabh");
		System.out.println(t.getName());

	}

}
