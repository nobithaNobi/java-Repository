package com.constructors.practice;

public class ConstructorRT {
	String modelName;
	long modelNo;
	int year;
	long chassisNo;
	static String carName = "TATA";
	
	public ConstructorRT(String modelName,long modelNo,int year,long chassisNo) {
		this.modelName=modelName;
		this.modelNo=modelNo;
		this.year=year;
		this.chassisNo=chassisNo;
	}
	
	public void detailsOfCar() {
		System.out.println(modelName);
		System.out.println(modelNo);
		System.out.println(year);
		System.out.println(chassisNo);
		System.out.println(carName);
	}

}
