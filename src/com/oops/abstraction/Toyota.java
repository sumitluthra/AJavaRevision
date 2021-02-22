package com.oops.abstraction;

public class Toyota extends Car {
	int numOfWheels = 6;

	public Toyota(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	void m1() {
		// TODO Auto-generated method stub
		System.out.println("In toyota num of wheelk : " + super.numOfWheels);
	}
}