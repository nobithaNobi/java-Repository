package com.srinivas;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int count=0;
		int num=153;
		int sum=0;
		int dup=num;
		int dup2=num;
		while(dup>0) {
			dup/=10;
			count++;
		}
		while(dup2>0) {
			int rem2=dup2%10;
			int mul=1;
			int power=count;
			while(power>0) {
				mul=mul*rem2;
				power--;
			}
			sum=sum+mul;
			dup2/=10;
		}
		if(num==sum) {
			System.out.println("arm");
		}
		else {
			System.out.println("not");
		}
	}

}
