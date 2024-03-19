package com.strings.java;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the characters");
		String s1 = sc.nextLine();
		System.out.println("Input "+s1);
		String revString = "";
		for(int i=s1.length()-1;i>=0;i--) {
			revString = revString +s1. charAt(i);
		}
		System.out.println("Output "+revString);
		
		
		sc.close();
	}

	
	}



