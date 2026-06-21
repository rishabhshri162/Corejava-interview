package oop;

public class Account {

	private double balance;

	public double getbalance() {
		return balance;
	}

	public void setbalance(double balance) {
		this.balance = balance;

	}

//	 deposit method
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("total balance after deposit:- " + getbalance());
	}

//	 withdrawal method
	public void withdrawal(double amount) {
		if (amount > balance) {
			System.out.println("Insufficient fund transfer ");

		} else {
			balance = balance - amount;

			System.out.println("Total balance after withdrawal " + getbalance());
		}

	}

}
