package com.java.job;

public class PrimeElements {

	public static void main(String[] args) {
		int arr[] = {1,5,8,9,4,3};
		for(int i=0;i<=arr.length-1 ;i++) {
			int count=0;
			for(int j=1;j<=arr[i];j++) {
				if(arr[i]%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(arr[i]);
			}
		}
	}

}
