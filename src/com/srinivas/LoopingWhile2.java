package com.srinivas;

import java.util.Scanner;

public class LoopingWhile2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int num1 = sc.nextInt();
		System.out.println("enter the second number");
		int num2 = sc.nextInt();
		int number = num1;
		while(number>=num2) {
			if(number%2==0)
			System.out.println(number);
			number--;
		}
		sc.close();

	}

}
