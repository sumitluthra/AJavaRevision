package com.oops.inheritance;

public class CovairantReturnType {
	public static void main(String[] args) {
		SuperClass tester = new Tester();
		tester.get();
	}
}

class SuperClass {
	SuperClass get() {
		System.out.println("SuperClass");
		return new Tester();
	}
}

class Tester extends SuperClass {
	SuperClass get() {
		System.out.println("SubClass");
		return this;
	}

}