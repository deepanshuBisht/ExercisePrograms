package com.coforge.exception;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name to Register");
		try {
			String name = sc.next();
			Validation validate = new Validation();
			boolean status = validate.checkUser(name);
			if (status) {
				System.out.println("Enter you password");
				String pass = sc.next();
				validate.checkPass(pass);
				System.out.println("You are registered..");

			}
		} catch (NameExistsException |TooShortException |TooLongException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
