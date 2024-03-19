package com.srinivas;

public class Bank {
	static int currentBalance = 2000;
	 String name = "Srinivas yadav";
	public static void greetings() {
		System.out.println("Welcome to the application");
	}
	public void deposit(int amount) {
		currentBalance = currentBalance + amount;
		System.out.println("Amount is deposited successfully");
	}
	public void withdrawl(int amount) {
		currentBalance = currentBalance - amount;
		System.out.println("amt is withdrawn successfully");
		
	}
	public int getCurrentBalance() {
		return currentBalance;
	}
	public void  setName(String newName) {
		name = newName;
		
		
		
	}
	public static void main(String[] args) {
		Bank bk= new Bank();
		greetings();
		System.out.println("your current balance is :"+ bk.getCurrentBalance());
		bk.deposit(1200);
		System.out.println("your current balance is :"+bk.getCurrentBalance());
		bk.withdrawl(500);
		System.out.println("your current balance is :"+bk.getCurrentBalance());
		System.out.println("current acc holder name ="+bk.name);
		bk.setName("sandya");
		System.out.println("your updated acc holder name is " +bk.name);
		
		
		
	}
}
