package com.srinivas;

public class MaxOfFourNumbers2 {

	public static void main(String[] args) {
		int a = 5,b=6,c=8,d=10;
		if(a>b)
		{
			if(a>c) {
				if(a>d) {
					System.out.println("a is max");
				}
				else {
					System.out.println("d is max");
				}
			}
			else {
				if(c>d) {
					System.out.println("c is max");
				}
				else {
					System.out.println("d is max");
				}
			}
		}
		else {
			if(b>c) {
				if(b>d) {
					System.out.println("b is max");
				}
				else {
					System.out.println("d is max");
				}
			}
			else {
				if(c>d) {
					System.out.println("c is max");
				}
				else {
					System.out.println("d is max");
				}
			}
		}
		
	}

}
