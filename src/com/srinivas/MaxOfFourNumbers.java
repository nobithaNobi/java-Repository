package com.srinivas;

public class MaxOfFourNumbers {

	public static void main(String[] args) {
		int a = 5;
		int b=16;
		int c=3;
		int d=10;
		//int e = 6;
		/*int num1=1;
		int num2=-15;
		int num3=13;
		int num4=8;*/

		
		//String res= a>b && a>c && a>d ? a+"is max":(b>c && b>d ? b+"is max":(c>d ? c+"is max":d+"is max"));
		
		//String res = a<b && a<c ? a +"is min" :(b<c ? b +"is min":c +"is min");
		
		//String res= num1<num2 && num1<num3 && num1<num4 ? num1+"is min":(num2<num3 && num2<num4 ? num2+"is min":(num3<num4 ? num3+"is min":num4+"is min"));
		
		//String res = (a>b) ? ((a>c) ? a +"is max" : c+"is max") : ((b>c) ? b+"is max" : c+"is max");
		
			/*int res = (a>b ? a:b)> (c>d ? c:d) ? (a>b? a:b) : (c>d ? c:d);
		System.out.println(res);*/
		
		if(a>b) {
			if(a>c) {
				if(a>d) {
					System.out.println("a is max");
				}
				else {
					System.out.println("d is max");
				}
			}else if(c>d) {
				if( c>d) {
					System.out.println("b is max");
				}
				else {
					System.out.println("d is max");
				}
				
			}
		}else if (c>d) {
			System.out.println("c is max");
		}
		else {
			System.out.println("d is max");
		}
	}

}
