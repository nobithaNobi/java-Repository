package com.srinivas;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("number");
		int s = sc.nextInt();
		System.out.println();
		for(int i=1;i<=s;i++) {
			for(int j=1;j<=i;j++) {
				System.out.println(" * ");

			}
			System.out.println();
		}
	}

}
