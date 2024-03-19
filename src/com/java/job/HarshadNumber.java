package com.java.job;

public class HarshadNumber {

	public static void main(String[] args) {
		System.out.println(checkHarshad(153));
	}
	public static int sum(int num) {
		int sum=0;
		for(int i=num;i>0;i/=10) {
			int rem=i%10;
			sum+=rem;
		}
		return sum;
	}
	public static String checkHarshad(int num) {
		int i=sum(num);
		if(num%i==0) {
			return "harshad number";
		}
		else {
			return "not harshad number";

		}
	}

}
