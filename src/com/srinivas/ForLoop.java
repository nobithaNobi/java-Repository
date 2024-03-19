package com.srinivas;

public class ForLoop {

	public static void main(String[] args) {
		
		int a = 123;
		int b= a%10;
		int c = (a%100)/10;
		int d = b+c;
		int count=0;
		for(int i=1;i<=d;i++) {
			if(d%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	}}
	


