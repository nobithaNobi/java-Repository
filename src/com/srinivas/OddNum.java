package com.srinivas;

public class OddNum {
	public static void main(String[] args) {
		int sum=0;
		//int product = 1;
		int a =6;
		for(int i=1;i<a;i++) {
			if(a%i==0) {
				
				sum+=i;
				
			}}
			if(sum==a) {
				System.out.println("perfect");
			}
			else {
				System.out.println("not perfect");
			}
		
	}

}
