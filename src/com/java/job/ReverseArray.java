package com.java.job;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {1,5,6,8,3};
		int arr1[]=new int[arr.length];
		int index=0;
		for(int i=arr.length-1;i>=0;i--) {
			arr1[index]=arr[i];
			index++;
		}
		for(int j=0;j<arr1.length;j++) {
			System.out.println(arr1[j]);
		}
	}

}
