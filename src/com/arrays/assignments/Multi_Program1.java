package com.arrays.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Multi_Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the no of rows");
		int rowSize = sc.nextInt();
		int[][]arr = new int[rowSize][];
		for(int i = 0;i<rowSize;i++) {
			System.out.println("please enter the column size for" + i);
			int csize = sc.nextInt();
			arr[i] = new int[csize];
			System.out.println("enter the column values for the column"+ i);
			for(int j=0;j<csize;j++) {
				arr[i][j] = sc.nextInt();
				
			}
		}
		System.out.println("input:");
		for(int i = 0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i]));

		}
		int sum=0;
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				sum = sum+arr[i][j];
			}
		}
		System.out.println("output "+ sum);



		
		
		sc.close();
	}

}
