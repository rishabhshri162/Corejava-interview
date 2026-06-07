package exception;

public class TestLoginException {

	public static void main(String[] args) {

		String name = "admi";

		try {

			if (name.equals("admin")) {
				System.out.println("Valid User");
			} else {

				throw new LoginException();

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
