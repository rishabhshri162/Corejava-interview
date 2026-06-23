package io.serializeDeserialize;

import java.io.Serializable;

public class Account implements Serializable {

	public String accountNo;
	public transient int balance;

	public Account(String a, int b) {
		this.accountNo = a;
		this.balance = b;
	}

	@Override
	public String toString() {
		return accountNo + " " + balance;
	}
}
