package com.oops.inheritance;

public class SingleInheritance {

	void m1() {
		System.out.println("M1");
	}
	public static void main(String[] args) throws Throwable {
		SingleInheritance inheritance = new SingleInheritance();
		inheritance.m1();
		
		//These methods are not in our class
		//but every class implicitly extends/inherits java.log.object
		inheritance.hashCode();
		inheritance.clone();
		inheritance.finalize(); //throws throwable
		inheritance.wait();
		inheritance.notify();
		inheritance.toString();
	}
}
