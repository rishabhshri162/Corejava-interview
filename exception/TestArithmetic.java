package exception;

public class TestArithmetic {

	public static void main(String[] args) {

		int a = 10;

		try {

			System.out.println(a / 0);
		} catch (ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
			System.exit(0);
		} finally {
			System.out.println("rishabh");
		}
	}
}
