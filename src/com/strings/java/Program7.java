package com.strings.java;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the characters");
		String s = sc.nextLine();
		System.out.println("Input "+s);
		String[] words = s.split(" ");
		String op ="";
		
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			if(i%2==0)
				op = op+word.toUpperCase();
			else
				op = op+getReverseString(word);
				
			
		}
		System.out.println("Output "+op);
	}

	private static String getReverseString(String s) {
		String revstring="";
		for(int j=s.length()-1;j>=0;j--) {
			revstring += s.charAt(j);
		}
		return revstring;
	}

}
