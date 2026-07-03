package oop.shallow;

public class Shallow implements Cloneable {

	public int balance;
	public Address address;
	

    public Shallow(int balance) {
        this.balance = balance;
    }

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
