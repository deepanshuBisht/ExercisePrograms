package com.coforge.inheritance;

public class Account {
	double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}

	public void deposit(int amount) {
		balance = balance + amount;
	}

	public void getBalance() {
		System.out.println("Your Current Balance : " + balance);
	}

}
