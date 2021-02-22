package com.oops.inheritance.parameterizedconstructor;

public class Parent {
	
	public int a;
	public Parent(int a) {
		// TODO Auto-generated constructor stub
		this.a = a;
	}
	
	void p1() {
		System.out.println("p1");
	}
	
	void display() {
		System.out.println("inside parent: "+this.a);
	}
}
