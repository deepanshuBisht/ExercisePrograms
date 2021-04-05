package com.coforge.lamdademo;

public class RunGreeter {

	public static void main(String[] args) {

		Greeter gt = (message) -> {
			System.out.println("Have a Great Day " + message);
		};

		Greeter gt1 = (message) -> {
			System.out.println("Welcome to Thread " + message);
		};

		Greeter gt2 = (message) -> {
			System.out.println("Goodbye " + message);
		};

		gt.greetMessage("Deepanshu");
		gt1.greetMessage("Deepanshu");
		gt2.greetMessage("Deepanshu");

	}

}
