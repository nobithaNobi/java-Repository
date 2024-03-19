package com.arrays.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  array size:");
		int arrSize = sc.nextInt();
		int[] arr = new int[arrSize];
		System.out.println("enter the  array values :");
		for(int i = 0;i<arrSize;i++) {
			arr[i] = sc.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
		int largestNumber = arr[1];
		int index = 1;
		for(int i = 0;i<arr.length;i++) {
			if(largestNumber<arr[i]) {
				largestNumber = arr[i];
				index = i;
			}
			
		}
		System.out.println(largestNumber);
		System.out.println(index);
		sc.close();

	}

}
