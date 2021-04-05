package com.coforge.lamdemos;

public class Student {

	void printDetails(String name, String city, StudentDetails details, int... marks) {
		System.out.println("Name of Student : " + name);
		System.out.println("City : " + city);
		System.out.println(details.getAverage(marks));
	}

}
