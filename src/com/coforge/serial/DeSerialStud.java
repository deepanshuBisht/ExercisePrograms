package com.coforge.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialStud {

	public static void main(String[] args) {

		try (FileInputStream fin = new FileInputStream("Student.ser");
				ObjectInputStream os = new ObjectInputStream(fin);) {
			Student st = (Student) os.readObject();
			System.out.println(st);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
