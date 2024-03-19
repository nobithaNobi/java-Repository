package com.constructors.practice;

public class Employee extends Person {
	double salary;
	String company;
	public Employee(String name, int aadhar,double salary, String company) {
		super(name,aadhar);
		this.salary = salary;
		this.company = company;
	}
	public void designation() {
		System.out.println("my job is QA Tester");
	}
	
}
