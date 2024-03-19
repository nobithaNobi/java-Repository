package com.java.job;

public class StrongNumber {

	public static void main(String[] args) {
		System.out.println(checkStrong(145));
	}
	public static String checkStrong(int num) {
		int i=lastDigit(num);
		if(i==num) {
			return "strong number";
		}
		else
			return "not strong";
	}
	public static int lastDigit(int num) {
		int sum=0;
		for(int i=num;i>0;i/=10) {
		int	rem=i%10;
			int fact=1;
			for(int j=rem;j>0;j--) {
				fact*=j;
			}
			sum+=fact;
			
		}
		return sum;
		
	}
	
}
