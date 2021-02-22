package com.oops.polymorphism;

import java.util.ArrayDeque;

public class OverloadingStaticbinding {

	public void add(int a, long b) {
		System.out.println("1");
	}

	public void add(long a, int b) {
		System.out.println("2");

	}
	
	public void print(String s) {
		System.out.println("String");

	}

	/*
	 * public void print(Integer s) { System.out.println("Integer");
	 * 
	 * }
	 */
	public void print(Object s) {
		System.out.println("Object");

	}

	public static void main(String[] args) {
//		new OverloadingStaticbinding().add(1, 3);
//		new OverloadingStaticbinding().print(3);
		new OverloadingStaticbinding().print("ee");
		new OverloadingStaticbinding().print(null);
	}

}
