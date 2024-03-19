package com.arrays.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 1st array size:");
		int arrSize1 = sc.nextInt();
		String[] arr1 = new String[arrSize1];
		System.out.println("enter the 1st array values :");
		for(int i = 0;i<arrSize1;i++) {
			arr1[i] = sc.next();
			
		}
		System.out.println("enter the 2nd array size:");
		int arrSize2 = sc.nextInt();
		String[] arr2 = new String[arrSize2];
		System.out.println("enter the 2nd array values :");
		for(int i = 0;i<arrSize2;i++) {
			arr2[i] = sc.next();
			
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		String[] arr3 = new String[arr1.length+arr2.length];
		for(int i = 0;i<arr1.length;i++) {
			arr3[i] = arr1[i];
			
		}
		for(int i = 0;i<arr2.length;i++) {
			arr3[i+arr1.length] = arr2[i];
			
			
		}
		
		System.out.println(Arrays.toString(arr3));

	}
	

}
