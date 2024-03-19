package com.constructors.practice;

public class CarExecution {

	public static void main(String[] args) {
		ConstructorRT car1=new ConstructorRT("NEXON", 25632, 2022, 3255688743L);
		car1.detailsOfCar();
		System.out.println("---------------------------");
		ConstructorRT car2=new ConstructorRT("HARRIER", 235417, 2023, 864874631L);
			car2.detailsOfCar();
			System.out.println("---------------------------");
		ConstructorRT car3 = new ConstructorRT("PUNCH", 864896, 2023, 47896541l);
		car3.detailsOfCar();
		System.out.println("---------------------------");

		ConstructorRT car4 = new ConstructorRT("ALTROZ", 423697, 2021, 7569843147l);
		car4.detailsOfCar();
			
	}

}
