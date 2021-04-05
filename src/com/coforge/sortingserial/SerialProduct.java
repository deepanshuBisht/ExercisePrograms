package com.coforge.sortingserial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerialProduct {

	public static void main(String[] args) {
		Product product1 = new Product("Note Series", "Mobile", 16500.50, "Samsung");
		Product product2 = new Product("Frame", "Television", 75000.50, "Samsung");
		Product product3 = new Product("X1000", "Head Phones", 1500.50, "Sony");
		Product product4 = new Product("BTX100", "Washing Machine", 16500.50, "LG");
		Product product5 = new Product("Experia", "Television", 16500.50, "Sony");

		ArrayList<Product> list = new ArrayList<>();
		list.add(product1);
		list.add(product2);
		list.add(product3);
		list.add(product4);
		list.add(product5);

		for (Product pro : list) {
			System.out.println(pro);
		}

		try (FileOutputStream fs = new FileOutputStream("Product.ser");
				ObjectOutputStream os = new ObjectOutputStream(fs)) {
			os.writeObject(list);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
