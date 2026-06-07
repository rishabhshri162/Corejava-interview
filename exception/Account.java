package exception;

public class Account {

	public int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int amount) {
		this.balance = this.balance + amount;
		System.out.println("After Deposit =" + getBalance());
	}

	public void withdrawal(int amount) throws InsufficientBalance {

		if (amount > balance) {
			throw new InsufficientBalance();

		} else {

			this.balance = this.balance - amount;
			System.out.println("After Withdrawal = " + getBalance());
		}
	}
}
