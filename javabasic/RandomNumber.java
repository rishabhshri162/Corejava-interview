package javabasic;;

public class RandomNumber {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			int a = (int) (Math.random() *10);
			System.out.println(a);
		}
		
	}
}
