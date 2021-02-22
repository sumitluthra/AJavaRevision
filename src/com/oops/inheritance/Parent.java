package com.oops.inheritance;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Parent {
	
	public String var="hi";

	public Parent() {
		System.out.println("parent constructor");
	}

	void p1() {
		System.out.println("p1");
	}
	
	int p2() {
		System.out.println("hi im getting called using super");
		return 1;
	}
	
	protected void common()  {
		System.out.println("inside parent");
	}
}
