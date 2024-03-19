package com.srinivas;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("what is your name?");
		String name = sc.nextLine();
		System.out.println("hey " + name  + " how are you?");
		String answer = sc.nextLine();
		System.out.println("what is your problem");
		String problem = sc.nextLine();
		System.out.println("what is your age?");
		int age = sc.nextInt();
		System.out.println("thankyou for the information");
		sc.close();
				
	}

}
