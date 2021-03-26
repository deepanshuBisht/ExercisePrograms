package com.coforge.inheritance;

public class Saving extends Account {

	public Saving(double balance) {
		super(balance);
		System.out.println("You Choose Savings Account");
	}

	@Override
	public void withdraw(int amount) {
		balance = balance - amount;
	}

	@Override
	public void deposit(int amount) {
		balance = balance + amount;
	}
}
