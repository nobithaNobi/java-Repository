package com.assignments;

import java.util.Scanner;

public class IfElseProblems {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println("the largest number is " +a);
		}
		else if(b>a && b>c){
			System.out.println("the largest number is "+b);
			
		}
		else {
			System.out.println("the largest number is "+c);
		}
		sc.close();
				
	}
}
