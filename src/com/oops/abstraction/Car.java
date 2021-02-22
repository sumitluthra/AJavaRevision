package com.oops.abstraction;

public abstract class Car {

	int numOfWheels;
	
//	public Car() {
//		// TODO Auto-generated constructor stub
//		numOfWheels=4;
//	}
	public Car(int n) {
		// TODO Auto-generated constructor stub
		numOfWheels=n;
		System.out.println("abstract class constructor with numOfWheels:"+numOfWheels);
	}
	abstract void m1();

	void m2() {
		System.out.println("in m2");
	}

}
