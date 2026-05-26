package javabasic;;

public class TestIncDecOperator {

	public static void main(String[] args) {

		int i = 1;

// int sum = i++ + i + ++i + --i;

//	int sum = i++ + i++ + i++ + i++ + i++;

//		int sum = --i + --i + --i + --i;
		

		int sum = i-- + i + ++i + i++ + i + --i;
		
//		int sum = i-- + i + ++i + i++ + i  + --i;

//	int sum = i++ + ++i + i-- + i--;

		System.out.println("sum: " + sum);
	}
}
