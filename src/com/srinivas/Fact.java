package com.srinivas;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b= sc.nextInt();
		for(int i=a;i<=b;i++) {
			int count=0;
			for(int j=i;j>0;j/=10) {
				count++;
			}
			int sum=0;
			for(int k=i;k>0;k/=10) {
				int rem=k%10;
				int prod=1;
				for(int pow=count;pow>0;pow--) {
					prod*=rem;
				}
				
				sum+=prod;		
			}
			if(sum==i) {
				System.out.println(i);
			}
		}

		sc.close();
		
				
		
	}

}
