package com.srinivas;

public class MaxOfFiveNumbers {

	public static void main(String[] args) {
		int a=8,b=9,c=211,d=65,e=1414;
		
		if(a>b) {
			if(a>c) {
				if(a>d) {
					if(a>e) {
						System.out.println("a is max");
					}
					else {
						System.out.println("e is max");
					}
				}
				else {
					if(d>e) {
						System.out.println("d is max");
					}
					else {
						System.out.println("e is max");
					}
				}}
				else {
					if(c>d) {
						if(c>e) {
							System.out.println("c is max");
						}
						else {
							System.out.println("e is max");
						}
				}
					else {
						if(d>e) {
							System.out.println("d is max");
						}
						else {
							System.out.println("e is max");
						}
					}
				
			}
		}
		else {
			if(b>c) {
				if(b>d) {
					if(b>e) {
						System.out.println("b is max");
					}
					else {
						System.out.println("e is max");
					}
				}
				else {
					if(d>e) {
						System.out.println("d is max");
					}
					else {
						System.out.println("e is max");
					}
				}
			}
			else {
				if(c>d) {
					if(c>e) {
						System.out.println("c is max");
					}
					else {
						System.out.println("e is max");
					}
				}
				else {
					if(d>e) {
						System.out.println("d is max");
					}
					else {
						System.out.println("e is max");
					}
				}
			}
		}
	}

}
