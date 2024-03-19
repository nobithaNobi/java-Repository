package com.java.job;

public class SumOfElements {

	public static void main(String[] args) {
		int arr[] = {1,5,8,9,4,3};
		for(int i=0;i<=arr.length-1 ;i++) {
			int fact=1;
			for(int j=1;j<=arr[i];j++) {
				fact*=j;
			}
			System.out.println(fact);
		}
	}

}
