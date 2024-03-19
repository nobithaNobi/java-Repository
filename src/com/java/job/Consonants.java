package com.java.job;

import java.util.Scanner;

public class Consonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the alphabet");
		char c = sc.next().charAt(0);
		if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')) {
			System.out.println("consonants");
		}
		else {
		System.out.println("not consonants");
		}		
		
		
		
		
		
		sc.close();
	}

}
