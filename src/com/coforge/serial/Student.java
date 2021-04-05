package com.coforge.serial;

import java.io.Serializable;

public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	String name;
	int id;
	String hobbies;

	public Student(String name, int id, String hobbies) {
		super();
		this.name = name;
		this.id = id;
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", hobbies=" + hobbies + "]";
	}

}
