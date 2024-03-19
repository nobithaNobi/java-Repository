package com.constructors.practice;

public class Deposit extends Bank {
		public double deposit(double amt) {
			bal=bal+amt;
			return bal;
		}
		public void checkBalance() {
			System.out.println("amount is deposited successfully ,your balance is : "+bal);
		}
		
}
