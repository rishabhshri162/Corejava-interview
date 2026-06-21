package exception;

public class TestClassNotFound {

	public static void main(String[] args) {

		try {

			Class.forName("exception.Accunt");
			System.out.println("class mil gayi");

		} catch (ClassNotFoundException e) {

			System.out.println("class nahi mili " + e);
			e.printStackTrace();

		}
	}
}
