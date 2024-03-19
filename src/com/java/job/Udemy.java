package com.java.job;

public class Udemy {

	public static void main(String[] args) {
		
	
		new Udemy().user();
	}
	public static void course() {
		System.out.println("java");
	}
	public void user() {
		course();
		Udemy.course();
		this.course();
	}
}
