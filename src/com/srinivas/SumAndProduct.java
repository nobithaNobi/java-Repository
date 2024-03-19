package com.srinivas;

import java.util.Scanner;

public class SumAndProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num1=sc.nextInt();
		System.out.println("enter the second number");
		int num2=sc.nextInt();
		int sum=0;
		int prod=1;
		for(int i=num1;i<=num2;i++) {
			if(i%2==0) {
				sum=sum+i;
				prod=prod*i;
			}
		}
		System.out.println(sum);
		System.out.println(prod);
		
		sc.close();
	}

}
