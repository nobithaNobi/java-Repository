package com.constructors.practice;

public class MethodOverLoadingRT {
	String employeeName;
	int empId;
	
	String dOB;
	
	public MethodOverLoadingRT(String employeeName,int empId,String dOB) {
		this.employeeName=employeeName;
		this.empId=empId;
		
		this.dOB=dOB;
	}
	
	public void searchEmployee(String employeeName,int empId) {
		System.out.println("the employee name is "+employeeName);
		System.out.println("the empid is "+empId);
	}
	public void searchEmployee(int empId) {
		if(this.empId==empId) {
			System.out.println(this.employeeName);
		}
		else {
			System.out.println("no results");
		}
	}
	public void searchEmployee(String employeeName,String dOB) {
		if(this.employeeName==employeeName) {
			if(this.dOB==dOB) {
				System.out.println("searched successfully");
			}
			else {
				System.out.println("no results found");
			}
		}
		else {
			System.out.println("no results found");
		}
	}
}
