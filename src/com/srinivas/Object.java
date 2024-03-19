package com.srinivas;

public class Object {
	int a,b;
	public Object() {
		
	}
	public Object(int a,int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		
		Object c1 = new Object(35,30);
		Object c2 = new Object(40,6);
		System.out.println(c1.sub());
		System.out.println(c2.sub());
		System.out.println(c1==c2);

	}
	public int sub() {
		return a+b;
	}

}
