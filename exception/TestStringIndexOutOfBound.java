package exception;

public class TestStringIndexOutOfBound {

	public static void main(String[] args) {

		String name = "abc";

		try {

			System.out.println(name.charAt(3));

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
//			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
	}
}