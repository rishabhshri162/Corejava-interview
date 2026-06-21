package exception;

public class tryWIthMultiCatch {

	public static void main(String[] args) {

		int a = 10;

		String name = null;

		try {

			int c = a / 0;
			System.out.println("Division = " + c);

			System.out.println(name.length());

		} catch (ArithmeticException e) {

			System.out.println(e);

		} catch (NullPointerException e) {

			System.out.println(e);
			System.out.println(e.getMessage());
//			e.printStackTrace();

		} catch (Exception e) {

			System.out.println(e);
			System.out.println(e.getMessage());
//			e.printStackTrace();

		}

	}

}
