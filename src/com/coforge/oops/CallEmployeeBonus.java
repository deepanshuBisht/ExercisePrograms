package com.coforge.oops;

import java.util.Scanner;

public class CallEmployeeBonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name...");
		String name = sc.next();
		System.out.println("Enter your designation...");
		String designation = sc.next();
		sc.close();
		EmployeeBonus employeeBonus1 = new EmployeeBonus(name, designation);
//		EmployeeBonus employee1 = new EmployeeBonus("deepanshu", "manager");
//		EmployeeBonus employee2 = new EmployeeBonus("mansi", "programmer");
//		EmployeeBonus employee3 = new EmployeeBonus("deepanshu", "director");
		if (designation.equals("programmer")) {
			System.out.println(employeeBonus1.calcBonus(23000.50));
		} else if (designation.equals("manager")) {
			System.out.println(employeeBonus1.calcBonus(23000.50, 30000));
		} else if (designation.equals("director")) {
			System.out.println(employeeBonus1.calcBonus(23000.50, 30000, 5000.50));
		}

	}

}
