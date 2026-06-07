package exception;

public class TestAccount {

	public static void main(String[] args) {

		Account account = new Account();

		account.setBalance(10000);

		account.deposit(5000);

		try {

			account.withdrawal(150000);

		} catch (InsufficientBalance e) {
			System.out.println(e);
		}

	}
}
