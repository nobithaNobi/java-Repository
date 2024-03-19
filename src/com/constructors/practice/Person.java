package com.constructors.practice;

public class Person {
	String name;
	int aadhar;
	public Person(String name, int aadhar) {
		this.name = name;
		this.aadhar = aadhar;
	}
	public void details() {
		System.out.println("my name is :"+name);
		System.out.println("my aadhar number is: "+aadhar);
	}
	
}
