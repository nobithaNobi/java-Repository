package com.java.job;

public class AddElements {

	public static void main(String[] args) {
		int arr [] =new int[50];
		for(int i=0;i<50;i++) {
			arr [i]=i+1;
		}
		for(int j=0;j<=arr.length-1;j++) {
			System.out.println(arr[j]);
		}
	}

}
