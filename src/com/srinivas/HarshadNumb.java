package com.srinivas;

public class HarshadNumb {

	public static void main(String[] args) {
		int num=171;
		//duplicate the number
		int dup=num;
		//to store the sum of digits
		int sum=0;
		//to stote the last digit
		int lastnum=0;
		//int res=0;
		//to check whether the num >0
		while(num>0) {
			//to get the last digit of number
			lastnum=num%10;
			//to sum all the last digits
			sum+=lastnum;
			//to eliminate the last digit
			num/=10;
			//res=num/sum;
		}
		//to check the dup % sum==0
		if(dup%sum==0) {
			System.out.println("harshad");
		}
		else {
			System.out.println("not");
		}
	}

}
