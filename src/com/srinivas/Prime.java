package com.srinivas;

public class Prime {

	 static public void main(String[] args) {
		
		 		int a=1;
		 		int count=0;
		 		int pro = 1;
		 		int sum = 0;
		 		for(int i=1;i<=a;i++){
		 			if(a%i==0){
		 				sum+=i;
		 				pro*=i;
		 			}
		 		}
		 		if(sum==pro){
		 			for(int j=1;j<=sum;j++){
		 				if(sum%j==0){
		 					count++;
		 				}
		 			}
		 			if(count==2){
		 				System.out.println("prime");
		 			}
		 			else{
		 				System.out.println("not prime");
		 			}
		 		}
		 		else{
		 			System.out.println("sum!=pro");
		 		}

		 	}
		 
	}


