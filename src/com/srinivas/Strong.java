package com.srinivas;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		for(int i=a;i<=b;i++) {
			int sum=0;
			for(int j=i;j>0;j/=10) {
				int rem=j%10;
				int prod=1;
				for(int k=rem;k>0;k--) {
					prod*=k;
				}
				sum+=prod;
			}
			if(sum==i) {
				System.out.println(i);
			}
		}
	}

}
