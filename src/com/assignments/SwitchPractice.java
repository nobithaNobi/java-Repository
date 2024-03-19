package com.assignments;

import java.util.Scanner;

public class SwitchPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the colour");
		String colour = sc.nextLine();
		switch(colour) {
		case "red":
			System.out.println("1");
			break;
		case "blue":
			System.out.println("2");
			break;
		case "black":
			System.out.println("3");
			break;
			default:
				System.out.println("invalid input");
				break;
			
		}
		sc.close();
				
	}

}
