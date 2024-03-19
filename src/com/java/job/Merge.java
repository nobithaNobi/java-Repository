package com.java.job;

public class Merge {

	public static int lastDigit(int num) {
		int rev=0;
		for(int i=num;i>0;) {
			int rem = i%10;
			rev=(rev*10)+rem;
			break;
			
		}
		return rev;
	}
	public static int firstDigit(int num) {
		int rev1=0;
		int res=0;
		for(int i=num;i>0;i/=10) {
			int rem=i%10;
			rev1=(rev1*10)+rem;
		}
		for(int j=rev1;j>0;) {
			int temp=j%10;
			res=(res*10)+temp;
			break;
		}
		return res;
	
	}
	public static void main(String[] args) {
		int b=firstDigit(523234);

		int a=lastDigit(523234);
		System.out.println(b+""+a);
	}
}
