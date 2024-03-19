package com.constructors.practice;

public class ConstructorOL {
	String name;
	String voterID;
	long aadharCard;
	long panCard;
	
	public ConstructorOL(String name,String voterID) {
		this.name=name;
		this.voterID=voterID;
		System.out.println(name);
		System.out.println(voterID);
		
	}
	public ConstructorOL(String name,long aadharCard) {
		this.name=name;
		this.aadharCard=aadharCard;
		System.out.println(name);
		System.out.println(aadharCard);
	}
	public ConstructorOL(long panCard,String name)  {
		this.panCard=panCard;
		this.name=name;
		System.out.println(name);
		System.out.println(panCard);
	}
	
 

}
