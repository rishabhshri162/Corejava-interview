package javabasic;

public class TestSwitchCase {

	public static void main(String[] args) {

		int num = 2;
		String day = null;

		switch (num) {
		case 1:
			day = "Monday";

			break;

		case 2:
			day = "tuesday";
			break;

		default:
			break;
		}
		System.out.println(day);
	}
}