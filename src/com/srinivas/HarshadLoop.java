package com.srinivas;

public class HarshadLoop {

	public static void main(String[] args) {
		for(int i=1;i<=500;i++) {
			int c=i;
			int sum=0;
			int rem=0;
			while(c>0) {
				rem=c%10;
				sum+=rem;
				c/=10;
				
			}
			if(i%sum==0) {
				System.out.println(i);
			}
		}
	}

}
