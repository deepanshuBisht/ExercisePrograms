package com.coforge.exception;

public class Validation {
	String[] names = new String[] { "Ram", "Deepanshu", "Mohan", "Shanti" };

	public boolean checkUser(String name) throws NameExistsException {
		for (String nam : names) {
			if (nam.equalsIgnoreCase(name))
				throw new NameExistsException("Name is already there");
		}
		return true;
	}

	public boolean checkPass(String pass) throws TooShortException, TooLongException {
		if (pass.length() < 5) {
			throw new TooShortException("your password is too short");
		} else if (pass.length() > 15) {
			throw new TooLongException("your password is too long");
		}
		return true;
	}

}
