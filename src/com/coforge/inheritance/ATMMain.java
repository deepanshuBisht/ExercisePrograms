package com.coforge.inheritance;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		System.out.println("Choose your Account type, press 1 for Savings, presss 2 for Current");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1:

			Account account = new Saving(5000);
			Saving sav = (Saving) account;
			account.getBalance();
			System.out.println("Choose you transaction, press 1 for deposit, press 2 for withdraw ");
			int opt = sc.nextInt();

			switch (opt) {
			case 1:
				System.out.println("Enter your Deposit Ammount..");
				int amt = sc.nextInt();
				sav.deposit(amt);
				account.getBalance();
				break;
			case 2:
				System.out.println("Enter your Withdraw Ammount..");
				int amt1 = sc.nextInt();
				sav.withdraw(amt1);
				account.getBalance();
				break;
			default:
				System.out.println("Input Mismatch...");
			}

			break;
		case 2:
			Account account1 = new Current(10000);
			Current cur = (Current) account1;
			account1.getBalance();
			System.out.println("Choose you transaction, press 1 for deposit, press 2 for withdraw ");
			int opt1 = sc.nextInt();

			switch (opt1) {
			case 1:
				System.out.println("Enter your Deposit Ammount..");
				int amt = sc.nextInt();
				cur.deposit(amt);
				account1.getBalance();
				break;
			case 2:
				System.out.println("Enter your Withdraw Ammount..");
				int amt1 = sc.nextInt();
				cur.withdraw(amt1);
				account1.getBalance();
				break;
			default:
				System.out.println("Input Mismatch...");
			}

			break;
		default:
			System.out.println("Wrong choice, Give input again..");
		}
		sc.close();
	}

}
