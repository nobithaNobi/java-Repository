package com.srinivas;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("enter the first integer value");
		double a=ab.nextDouble();
		System.out.println("enter the second value");
		double b = ab.nextDouble();
		System.out.print("subtraction of two numbers");
		System.out.println(a*b);
	}
	
}
