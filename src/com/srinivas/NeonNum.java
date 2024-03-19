package com.srinivas;

public class NeonNum {

	public static void main(String[] args) {
		int num=9;
		int dup=num;
		int sum=0;
		int sq=1;
		while(num>0) {
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		sq=sum*sum;
		if(dup==sq) {
			System.out.println("neon");
		}
		else {
			System.out.println("not neon");
		}
	}

}
