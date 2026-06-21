package oop;

public abstract class AbstractClass {

	public String name;

	public AbstractClass() {
                 
	}

	public AbstractClass(String name) {
		this.name = name;

	}

	public abstract void show();

	public static void simple() {
		System.out.println("hii");
	}

}
