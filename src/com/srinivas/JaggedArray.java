package com.srinivas;

public class JaggedArray {

	public static void main(String[] args) {
		int[][] arr = {
				{1,2},
				{5,6},
				{8,9,8,5,6,2},
				
		};
		
		
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ "  ");
				
			}
			System.out.println();

		}
	}

}
