package com.srinivas;

public class TwoDarray {

	public static void main(String[] args) {
		int[][] arr = {{1,2},{3,4},{5,6}};
		int size = 0;
		for(int i = 0;i<arr.length;i++) {
			size += arr[i].length;
		}
		System.out.println(size);
			
		}
				
	}


