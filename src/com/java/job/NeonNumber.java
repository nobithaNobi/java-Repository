package com.java.job;

public class NeonNumber {

	public static void main(String[] args) {
		System.out.println(checkNeon(81));
	}
	public static int sqOfDigits(int a) {
		int sum=0;
		int square=1;
		for(int i=a;i>0;i/=10) {
			int rem=i%10;
			sum+=rem;
		}
		square=sum*sum;
		return square;
	}
	public static String checkNeon(int a) {
		int i=sqOfDigits(a);
		if(i==a) {
			return "neon number";
		}
		else
			return "not neon";
	}

}
