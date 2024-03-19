package com.srinivas;

import java.util.Scanner;

public class DaysSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the day");
		String s = sc.nextLine();
		switch(s) {
		case "monday":
		case "tuesday":
		case "wednesday":
		case "thursday":
		case "friday":
			System.out.println("its weekday");
			break;
		case "saturday":
		case "sunday":
			System.out.println("its weekend");
			break;
			default:{
				System.out.println("input is invalid");
				break;
			}
		}
	}

}
