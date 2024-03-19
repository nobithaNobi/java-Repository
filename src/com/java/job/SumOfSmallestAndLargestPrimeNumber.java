package com.java.job;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfSmallestAndLargestPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the smallest number");
		int smallNum=sc.nextInt();
		System.out.println("enter the largest number");
		
		int largeNum=sc.nextInt();
		ArrayList<Integer>ar=new ArrayList<>();

		
		for (int i = smallNum; i <= largeNum; i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				ar.add(i);
				
				
				
			}
		}
		int sum=ar.get(0)+ar.get(ar.size()-1);
		System.out.println(sum);
		
		
		sc.close();
	}

}
