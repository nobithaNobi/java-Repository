package com.srinivas;

import java.util.Scanner;

public class Weeks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the day");
		String str = sc.nextLine();
		if(str.equals("monday")||str.equals("tuesday")||str.equals("wednesday")||str.equals("thursday")||str.equals("friday")) {
			System.out.println("its weekday");
	}
		else if(str.equals("saturday")||str.equals("sunday")) {
			System.out.println("its weekend");
			
		}
		sc.close();

}
}
