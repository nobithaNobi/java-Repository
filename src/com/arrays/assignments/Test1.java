package com.arrays.assignments;

public class Test1 {

	public static void main(String[] args) {
		int arr[]= {5,10,2,7,9,1};
		
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=1;j<=arr[i];j++) {
				if(arr[i]%j==0) {
					count++;
					
				}
				
			}
			if(count==2) {
				System.out.println(arr[i]);
			}
		}
	}

}
