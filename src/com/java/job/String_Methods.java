package com.java.job;

public class String_Methods {

	public static void main(String[] args) {
		String s = "sgqearRTHTGRST    ";
		System.out.println(s);
		
		//to upper case
		String s1 = s.toUpperCase();
		System.out.println(s1);
		//length
		int s2 = s.length();
		System.out.println(s2);
		
		//is empty
		boolean b=s.isEmpty();
		
		System.out.println(b);
		
		//Char at
		
		char c =s.charAt(8);
		System.out.println(c);
		
	//indexof
		int p = s.lastIndexOf('R');
		System.out.println(p);
		
		// concatination
		String s3 = s.concat("Srinivas");
		
		System.out.println(s3);
	}
	
	

}
