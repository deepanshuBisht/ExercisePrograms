package com.coforge.serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialStud {

	public static void main(String[] args) {
		Student st = new Student("Deepanshu", 10, "Coding");
		System.out.println(st);

		try (FileOutputStream fs = new FileOutputStream("Student.ser");
				ObjectOutputStream os = new ObjectOutputStream(fs)) {
			os.writeObject(st);
		} catch (IOException e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}

	}

}
