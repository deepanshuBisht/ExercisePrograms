package com.coforge.inheritance;

public class Current extends Account {

	public Current(double balance) {
		super(balance);
		System.out.println("You Choose Current Account");
	}

	@Override
	public void withdraw(int amount) {
		balance = balance - amount - 100;
	}

	@Override
	public void deposit(int amount) {
		balance = balance + amount + 100;
	}

}