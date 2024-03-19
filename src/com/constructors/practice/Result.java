package com.constructors.practice;

public class Result {

	public static void main(String[] args) {
		Employee e1=new Employee("ramu", 86456821, 45000.00, "TCS");
		e1.details();
		e1.designation();
		
		System.out.println("-------------------");
		Student s1=new Student("mukesh", 48568741, 30000.00, "Qspiders");
		s1.details();
		s1.displayCourse();
		
	}

}
