package com.coforge.threads;

class Student implements Runnable {
	String name;
	String question;
	Trainer trainer;

	public Student(String name, String question, Trainer trainer) {
		System.out.println("In cons " + name);
		this.name = name;
		this.question = question;
		this.trainer = trainer;
		Thread t1 = new Thread(this, name);
		t1.start();
	}

	@Override
	public void run() {
		synchronized (trainer) {
			System.out.println("in run " + name);
			trainer.answerQuery(name, question);
		}
	}

}

public class QueryRun {

	public static void main(String[] args) {
		Trainer trainer = new Trainer();
		Student s1 = new Student("Deepanshu", "what is inheritance ?", trainer);
		Student s2 = new Student("Shanti", "what is java ?", trainer);
		Student s3 = new Student("mansi", "what is compiler ?", trainer);
	}

}
