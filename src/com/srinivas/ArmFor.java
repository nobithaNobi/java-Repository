package com.srinivas;

public class ArmFor {

	public static void main(String[] args) {
		System.out.println(isArmStrong(154));
	}
	public static int countOfDigits(int num) {
		int count=0;
		for(int i=num;i>0;i/=10) {
			count++;
		}
		return count;
	}
	public static int armStrong(int num) {
		int c=countOfDigits(num);
		int sum=0;
		for(int i=num;i>0;i/=10) {
			int temp=i%10;
			int fact=1;
			for(int j=1;j<=c;j++) {
				fact=fact*temp;
			}
			sum=sum+fact;
		}
		return sum;
	}
	
	public static boolean isArmStrong(int num) {
		int sum=armStrong(num);
		if(sum==num) {
			return true;
		}
		return false;
	}

}
