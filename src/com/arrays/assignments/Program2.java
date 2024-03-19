package com.arrays.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size:");
		int arrSize = sc.nextInt();
		int[]arr = new int[arrSize];
		System.out.println("enter the values");
		for (int i = 0;i<arrSize;i++) {
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println(Arrays.toString(arr));
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum/arr.length);
		sc.close();
		
	}
	

}
