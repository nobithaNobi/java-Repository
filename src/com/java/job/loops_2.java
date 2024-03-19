package com.java.job;

import java.util.Scanner;

public class loops_2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int sum =0;
		/*while(sum<10) {
			System.out.println("enter the number");
			sum = sum + sc.nextInt();
		}
		System.out.println("done its " + sum);*/
		
		
		
		
		while(true) {
			System.out.print("enter the number :");
			sum = sum+sc.nextInt();
			
			if(sum>100) 
				
			break;
			
		}
		System.out.println("done: "+sum);
		
	}
	

}
