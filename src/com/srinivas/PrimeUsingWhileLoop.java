package com.srinivas;

public class PrimeUsingWhileLoop {

	public static void main(String[] args) {
		/*int i=0;
		while(i<=100) {
			int j=1;
			int count=0;
			while(j<=i) {
				if(i%j==0) {
					count++;
				}
				j++;
			}
			if(count==2) {
				System.out.println(i);
			}
			i++;
		}*/
		
		for(int i=1;i<=100;i++) {
			int j=1;
			int count=0;
			while(j<=i) {
				if(i%j==0) {
					count++;
				}
				j++;
			}
			if(count==2) {
				System.out.println(i);
			}
		}
		
	}

}
