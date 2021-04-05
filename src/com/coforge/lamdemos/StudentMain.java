package com.coforge.lamdemos;

//import java.util.Scanner;

class StudentImpl implements StudentDetails{

	@Override
	public Double getAverage(int... marks) {
		int sum = 0;
		double avg = 0;
		for(int val : marks) {
			sum += val;
		}
		avg = (sum/marks.length);
		return avg;
	}
	
}

public class StudentMain {

	public static void main(String[] args) {
		
		Student student = new Student();
		StudentDetails details = new StudentImpl();
		student.printDetails("Deepanshu", "Delhi", details, 20,10,30);
		student.printDetails("Deepanshu", "Delhi", details, 20,10,30);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Number of Enteries you want");
//		int count = sc.nextInt();
//		for(int i= 0 ; i<count ;i++) {
//			System.out.println("Enter Student name");
//			String name = sc.next();
//			System.out.println("Enter Student city");
//			String city = sc.next();
//			Student student = new Student(name,city);
			
//		}
	}

}
