package com.srinivas;

public class StrongFor {

	public static void main(String[] args) {
		int sum=0;
		int num=145;
		for(int i=num;i>0;i/=10) {
			int rem=i%10;
			int fact=1;
			for(int j=1;j<=rem;j++) {
				fact=fact*j;
				//sum=sum+fact;
			}
			sum=sum+fact;
			
		}
		if(num==sum) {
			System.out.println("strong");
		}
		else {
			System.out.println("not");
		}
	}

}
