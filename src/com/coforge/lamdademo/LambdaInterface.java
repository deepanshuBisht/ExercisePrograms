package com.coforge.lamdademo;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface {

	public static void main(String[] args) {
		Consumer<String> check = (String name) -> {
			System.out.println(name.toUpperCase());
		};
		check.accept("deepanshu");

		Consumer<Integer> che = (Integer num) -> {
			System.out.println(num * 2);
		};
		che.accept(10);

		BiConsumer<Integer, Integer> c1 = (x, y) -> System.out.println("Sum : " + (x + y));
		c1.accept(30, 30);

		Supplier<Integer> sup = () -> {
			return 10;
		};
		System.out.println(sup.get());

		Supplier<String> sup1 = () -> {
			return "deepanshu";
		};
		System.out.println(sup1.get());

		Predicate<String> pr = (name) -> name.length() > 6;
		System.out.println(pr.test("Hello"));

		BiPredicate<Integer, String> bipr = (num, name) -> {
			if (name.length() > 6 && num > 10)
				return true;
			return false;
		};
		System.out.println(bipr.test(18,"Hellooo"));

	}

}
