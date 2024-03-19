package com.strings.java;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the characters");
		String s1 = sc.nextLine();
		System.out.println("Input "+s1);
		String[] words = s1.split(" ");
		
		String opString = "";
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			String revString = "";
			for(int j=word.length()-1;j>=0;j--) {
				revString = revString+word.charAt(j);
			}
			if(i!= words.length-1)
				
			opString +=revString+" ";
			else
				opString +=revString;
		}
		System.out.println("Output "+opString);
		
		
		sc.close();
	}

	
	}



