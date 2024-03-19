package com.constructors.practice;

public class Student extends Person {
	double fee;
	String college;
	public Student(String name, int aadhar, double fee, String college) {
		super(name, aadhar);
		this.fee = fee;
		this.college = college;
	}
	public void displayCourse() {
		System.out.println("I am pursuing software testing course");
	}
	

}
