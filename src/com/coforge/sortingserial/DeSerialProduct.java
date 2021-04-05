package com.coforge.sortingserial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

public class DeSerialProduct {

	public static void main(String[] args) {

		try (FileInputStream fin = new FileInputStream("Product.ser");
				ObjectInputStream os = new ObjectInputStream(fin);) {

			ArrayList<Product> proList = (ArrayList) os.readObject();
			ArrayList<Product> newList = new ArrayList<>();

			for (Product pr : proList) {
				System.out.println(pr);
			}

			System.out.println();

			for (Product pr : proList) {
				if (pr.getCategory().equalsIgnoreCase("Television"))
					newList.add(pr);
			}
			
			System.out.println();

			Collections.sort(newList, (p1, p2) -> {
				return p1.getBrand().compareTo(p2.getBrand());
			});
			
			for (Product sortList : newList) {
				System.out.println(sortList);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
