package com.java.job;

import java.util.Scanner;

public class MaxOfSixNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st number");
		int a = sc.nextInt();
		System.out.println("enter 2st number");
		int b = sc.nextInt();
		System.out.println("enter 3rd number");
		int c = sc.nextInt();
		System.out.println("enter 4th number");
		int d = sc.nextInt();
		System.out.println("enter 5th number");
		int e = sc.nextInt();
		System.out.println("enter 6th number");
		int f = sc.nextInt();
		
		if(a>b) {
			if(a>c) {
				if(a>d) {
					if(a>e) {
						if(a>f) {
							System.out.println("a is max");
						}
						else {
								System.out.println("f is max");
							}
						}
					else {
						if(e>f) {
							System.out.println("e is max");
						}
						else {
							System.out.println("f is max");
						}
					}
					}
				else {
					if(d>e) {
						if(d>f) {
							System.out.println("d is max");
						}
						else {
							System.out.println("f is max");
						}
					}
					else {
						if(e>f) {
							System.out.println("e is max");
						}
						else {
							System.out.println("f is max");
						}
					}
				}
				}
			else {
				if(c>d) {
					if(c>e) {
						if(c>f) {
							System.out.println("c is max");
						}
						else {
							System.out.println("f is max");
						}
					}
					else {
						if(e>f) {
							System.out.println("e is max");
						}
						else {
							System.out.println("f is max");
						}
					}
				}
				else {
					if(d>e) {
						if(d>f) {
							System.out.println("d is max");
						}
						else {
							System.out.println("f is max");
						}
					}
					else {
						if(e>f) {
							System.out.println("e is max");
						}
						else {
							System.out.println("f is max");
						}
					}
						
					
				}
			}
			}
		else {
			if(b>c) {
				if(b>d) {
					if(b>e) {
						if(b>f) {
							System.out.println("b is max");
						}
						else {
							System.out.println("f is max");
						}
					}
					else {
						if(e>f) {
							System.out.println("e is max");
						}
						else {
							System.out.println("f is max");
						}
					}
				}
				else {
					if(d>e) {
						if(d>f) {
							System.out.println("d is max");
						}
						else {
							System.out.println("f is max");
						}
					}
					else {
						if(e>f) {
							System.out.println("e is max");
						}
						else {
							System.out.println("f is max");
						}
				}
			}
		}
			else {
				if(c>d) {
					if(c>e) {
						if(c>f) {
							System.out.println("c is max");
						}
						else {
							System.out.println("f is max");
						}
					}
					else {
						if(e>f) {
							System.out.println("e is max");
						}
						else {
							System.out.println("f is max");
						}
					}
				}
				else {
					if(d>e) {
						if(d>f) {
							System.out.println("d is max");
						}
						else {
							System.out.println("f is max");
						}
					}
			}



		sc.close();
	}

}}}
