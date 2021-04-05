package com.coforge.threads;

public class Trainer {
	
	String answerQuery(String name, String question) {
		System.out.println("In Trainer");
		String que = name+" "+question;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(que);
		return que;

	}
		
}
