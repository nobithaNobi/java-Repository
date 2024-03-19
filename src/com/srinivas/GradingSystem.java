package com.srinivas;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the percentage");
		float a = sc.nextFloat();
		if(a>=90) {
			System.out.println("your grade is A");
		}
		else if (a>=80) {
			System.out.println("your grade is B");
		}
		else if (a>=70) {
			System.out.println("your grade is C");

		}
		else if (a>=60) {
			System.out.println("your grade is D");

		}
		else {
			System.out.println("your grade is FAIL");
		}
		sc.close();
	}
}
