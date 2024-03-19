package com.strings.java;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the characters");
		String s1 = sc.nextLine();
		System.out.println("Input "+s1);
		System.out.println("Output "+s1.length());
		sc.close();
	}

}
