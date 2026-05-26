package string;

public class TypeCasting {

	public static void main(String[] args) {

//		Interger to String

		int num = 100;

		String str = Integer.toString(num);
		System.out.println(str);

		String str1 = String.valueOf(num);
		System.out.println(str);

		System.out.println("---------------------");

//		String to Integer

		String name = "200";

		int integer = Integer.parseInt(name);
		System.out.println(integer);
		
		int integer1 = Integer.valueOf(name);
		System.out.println(integer1);

	}

}
