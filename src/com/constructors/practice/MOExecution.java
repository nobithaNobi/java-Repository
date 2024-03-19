package com.constructors.practice;

public class MOExecution {

	public static void main(String[] args) {
		MethodOverLoadingRT emp1=new MethodOverLoadingRT("ramu", 125463, "12/04/1985");
		MethodOverLoadingRT	emp2=new MethodOverLoadingRT("somu", 458236, "25/08/1992");
		
		emp1.searchEmployee(125463);
		emp1.searchEmployee("somu", "12/04/1985");
		emp2.searchEmployee("ramu", 125463);
		emp2.searchEmployee("somu", "25/08/1992");
	}

}
