package com.oops.inheritance.parameterizedconstructor;

public class Child extends Parent {
	int b;
	public Child(int a, int b) {
		super(a);
		this.b=b;
		// TODO Auto-generated constructor stub
	}

	
	
	void c1() {
		System.out.println("C1");
	}
	
	void display() {
		System.out.println("inside child = "+b + ","+this.a);
	}
}
