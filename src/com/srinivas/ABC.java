package com.srinivas;


public class ABC {
	
	public static int sum(int num) {
		int sum=0;
		for(int i=num;i>0;i/=10) {
			int rem=i%10;
			sum=sum+rem;
			prod(num);
		}
		return sum;
	}
	
	public static int prod(int num) {
		int prod=1;
		for(int i=num;i>0;i/=10) {
			int rem=i%10;
			prod*=rem;
		}
		return prod;
	}
	
	public static String checkSpy(int num) {
		int s=sum(num);
		int p=prod(num);
		if(s==p) {
			return "spy number";
		}
		else {
			return "not spy";
		}
		
		
	}
	public static void main(String[] args) {
		System.out.println(checkSpy(123));
	}
}