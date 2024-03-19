package com.java.job;

public class Add {

	public static void main(String[] args) {
		/*int arr []=new int[50];
		int index=0;
		for(int i=1;i<=50;i++) {
			arr[index]=i;
			index++;
		}
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}*/
		
		int rrr[]= {1,5,8,3,2,5};
		int max=rrr[0];
		for(int i=1;i<rrr.length;i++) {
			if(max<rrr[i]) {
				max=rrr[i];
			}
		}
		System.out.println(max);
	}
}
