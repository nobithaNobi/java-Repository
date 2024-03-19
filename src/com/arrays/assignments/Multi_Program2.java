package com.arrays.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Multi_Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the row size of array 1");
		int rowSize1 = sc.nextInt();
		int[][]arr1 = new int[rowSize1][];
		for(int i = 0; i<rowSize1;i++) {
			System.out.println("enter the column size for "+i);
			int csize1 = sc.nextInt();
			arr1[i] = new int [csize1];
			System.out.println("enter the values for the column "+i);
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j] = sc.nextInt();
				
			}
		}
		
		System.out.println("please enter the row size of array 2");
		int rowSize2 = sc.nextInt();
		int[][]arr2 = new int[rowSize2][];
		for(int i = 0; i<rowSize2;i++) {
			System.out.println("enter the column size for "+i);
			int csize2 = sc.nextInt();
			arr2[i] = new int [csize2];
			System.out.println("enter the values for the column "+i);
			for(int j=0;j<arr2[i].length;j++) {
				arr2[i][j] = sc.nextInt();
				
			}
		}
		System.out.println("input1: ");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(Arrays.toString(arr1[i]));
		}
		
		System.out.println("input 2: ");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}
		int[][]arr3 = new int [arr1.length][];
		for(int i=0;i<arr1.length;i++) {
			arr3[i] = new int[arr1[i].length];
			for(int j=0;j<arr1[i].length;j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		System.out.println("output: ");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(Arrays.toString(arr3[i]));
		}
		
		
		sc.close();
	}

}
