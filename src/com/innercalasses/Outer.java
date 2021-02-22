package com.innercalasses;

public class Outer {

	static int x = 50;
	int y;

	public Outer(int y) {
		this.y = y;
	}
	
	class Inner {
		int y;
		
		public Inner(int y) {
			this.y = y;
		}
		
		public void m1() {
			System.out.println("Outer x"+ x);
			System.out.println("Outer x second way "+ Outer.x);
			System.out.println("Outer y"+ Outer.this.y);
			System.out.println("inner y"+ this.y);
			
		}
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer(80);
		Inner inner = outer.new Inner(30);
		inner.m1();
	}

}
