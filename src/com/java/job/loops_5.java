package com.java.job;

public class loops_5 {

	public static void main(String[] args) {
		//pattern_2(6);
		pattern_3(7);
		
	}
	
	public static void pattern_1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
				
				
			}
			System.out.println();
		}
	}
	
	public static void pattern_2(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pattern_3(int b) {
		for(int i=1;i<=b;i++) {
			for(int j=1;j<=(b+1)-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
