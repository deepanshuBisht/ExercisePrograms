package com.coforge.oops;

public class EmployeeBonus {
	String name;
	String designation;

	public EmployeeBonus(String name, String designation) {
		this.name = name;
		this.designation = designation;
	}

	double calcBonus(double basicAllowance) {
		return basicAllowance * 2;
	}
	
	double calcBonus(double basicAllowance, int carAllowance) {
		return basicAllowance+carAllowance;
	}
	
	double calcBonus(double basicAllowance, int carAllowance, double houseAllowance) {
		return basicAllowance+carAllowance+houseAllowance;
	}

}
