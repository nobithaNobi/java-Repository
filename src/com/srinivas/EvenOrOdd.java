package com.srinivas;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please type the number");
		int a =sc.nextInt();
		if(a %2==0) {
			System.out.println("Given number is even");
		}
		else {
			System.out.println("Given number is odd");
		}
		sc.close();
	}

}
