package com.strings.java;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the characters");
		String s1 = sc.nextLine();
		System.out.println("enter the target character:");
		char target = sc.next().charAt(0);
		System.out.println("Input "+s1);
		System.out.println("targetChar "+target);
		int count = 0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i) == target)
				count++;
		}
		System.out.println("Output "+count);
		
		
		
		
		sc.close();
	}

}
