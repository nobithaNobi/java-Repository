package com.srinivas;

import java.util.Scanner;

public class StudentGrading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your marks");
		int marks = sc.nextInt();
		if(marks< 35) {
			System.out.println("fail");
		}
		if(marks>35) {
			System.out.println("pass");
		}
		
		else {
			System.out.println("fail");
		}
		sc.close();
	}

}

