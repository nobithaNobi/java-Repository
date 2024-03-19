package com.java.job;

public class SumOfElementss {

	public static void main(String[] args) {
		int arr[]= {1,5,3,2,5,2,6,8,9};
		int sum=0;
		sum+=arr[0];
		sum+=arr[arr.length/2];
		sum+=arr[arr.length-2];
		System.out.println(sum);
	}

}
