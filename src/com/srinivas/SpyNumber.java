package com.srinivas;

public class SpyNumber {

	public static void main(String[] args) {
		for(int i=1;i<=500;i++) {
			int a=i;
			int sum=0;
			int prod=1;
			int rem=0;
			while(a>0) {
				rem=a%10;
				sum+=rem;
				prod*=rem;
				a/=10;
			}
			if(sum==prod) {
				System.out.println(i);
			}

		}
	}

}
