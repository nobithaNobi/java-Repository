package com.java.job;

public class ArmStrong {

	public static void main(String[] args) {
		System.out.println(checkArmStrong(153));
	}
	public static String checkArmStrong(int num) {
		int p=power(num);
		if(p==num) {
			return "armstrong number";
		}
		else
			return "not armstrong number";
   
	}
	public static int count(int num) {
		int count=0;
		for(int i=num;i>0;i/=10) {
			count++;
		}
		
		return count;
	}
	public static int power(int num) {
		int c=count(num);
		int sum=0;
		for(int i=num;i>0;i/=10) {
			int rem=i%10;
			int fact=1;
			for(int j=c;j>0;j--) {
				fact*=rem ;
			}
			sum+=fact;
		}
		return sum;
	}

}
