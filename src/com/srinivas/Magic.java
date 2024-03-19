package com.srinivas;

import java.util.Scanner;

public class Magic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		System.out.println("enter the operation");
		char c=sc.next().charAt(0);
		switch(c) {
		case '+':
			int res1=a-b;
			System.out.println(res1);
			break;
		case '-':
			int res2=a*b;
			System.out.println(res2);

			break;
		case '*':
			int res3=a+b;
			System.out.println(res3);

			break;
		default:
			System.out.println("invalid operator");
		}
		
	}

}
