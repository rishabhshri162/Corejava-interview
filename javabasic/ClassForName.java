package javabasic;

public class ClassForName {
	
	public void display() {
		System.out.println("Object created using Class.forName() and newInstance()");
	}

	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName("javabasic.ClassForName");
			
			ClassForName example = (ClassForName) clazz.getDeclaredConstructor().newInstance();
			
			example.display();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
