package com.assignments;

import java.util.Scanner;

public class SwitchPizzaSize {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the pizza you want");
		String str =sc.nextLine();
		switch(str) {
		case "large":
			System.out.println("the price of large pizza is 500");
			break;
		case "medium":
			System.out.println("the price of medium pizza is 400");
			break;
		case "small":
			System.out.println("the price of small pizza is 200");
			break;
			default:
				System.out.println("sorry invalid size");
				break;

			
		}
		sc.close();
	}

}
