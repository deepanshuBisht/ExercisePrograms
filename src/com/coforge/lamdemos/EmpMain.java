package com.coforge.lamdemos;

public class EmpMain {

	public static void main(String[] args) {
		
		EmpDetails empDetails = new EmpDetails();
		
		empDetails.showBonus("Deepanshu", "Developer", 2000.5, (amount)->{System.out.println("Developer Bonus Amount");
		return (amount*3);});
		System.out.println();
		empDetails.showBonus("Mansi", "Manager", 1500.5, (amount)->{System.out.println("Manager Bonus Amount");
		return (amount*5);});
		System.out.println();
		empDetails.showBonus("Shanti", "Admin", 5000.5, (amount)->{System.out.println("Admin Bonus Amount");
		return (amount*2);});

	}

}
