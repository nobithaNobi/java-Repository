package com.assignments;

import java.util.Scanner;

public class ForLoopAssignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the starting number");
		int num1 = sc.nextInt();
		System.out.println("enter the ending number");
		int num2 = sc.nextInt();
		int sum = 0;
		for(int a=num1;a<=num2;a++) {
			if(a%2==0)
				sum= sum + a;
			
		}
		System.out.println(sum);

		sc.close();

	}

}
