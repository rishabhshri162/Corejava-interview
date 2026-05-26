package javabasic;

import java.lang.reflect.Constructor;

// Using Reflection (constructor.newinstance())
public class ObjectCreateUsingReflection {

	public void display() {
		System.out.println("Object created using Constructor.newInstance()");
	}

	public static void main(String[] args) {
		try {
			Constructor<ObjectCreateUsingReflection> constructor = ObjectCreateUsingReflection.class.getDeclaredConstructor();
			ObjectCreateUsingReflection example = constructor.newInstance();
			example.display();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
