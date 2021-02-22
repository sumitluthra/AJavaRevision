package com.oops.inheritance;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Child extends Parent {

	public Child() {
		System.out.println("Child constructor");
	}

	void c1() {
		System.out.println("C1");
	}
	
	void c2() {
		System.out.println("C2");
		int p2 = super.p2();
		System.out.println("Value of int is "+p2 + ". Accessing variable using super:"+super.var);
		
		System.out.println("C2");
	}
	
	public void common() {
		System.out.println("inside child");
	}
}
