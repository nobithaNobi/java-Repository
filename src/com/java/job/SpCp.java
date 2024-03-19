package com.java.job;

import java.util.Scanner;

public class SpCp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the selling price");
		int sp = sc.nextInt();
		System.out.println("enter the cost price");
		int cp = sc.nextInt();
		int profit ,loss;
		
		if(sp>cp)
		{
			profit = sp-cp;
			System.out.println("profit is: "+profit);
		}
		else if(sp<cp) {
			loss = cp-sp;
			System.out.println("loss is :"+loss);
		}
		else {
			System.out.println("invalid");
		}
		
		
		
		sc.close();
	}

}
