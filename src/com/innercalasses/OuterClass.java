package com.innercalasses;

public class OuterClass {

	public static void m1() {
		System.out.println("in m1");
	}

	public static void main(String[] args) {
		
		OuterClass.m1();
		OuterClass.InnerClass.m1();

		InnerClass innerClass = new InnerClass();
		innerClass.m2();
		System.out.println("innerClass.y+"+innerClass.y);
		
		OuterClass class1 = new OuterClass();
		
		/*
		 * //No enclosing instance of type OuterClass is accessible. Must qualify the
		 * allocation with an enclosing instance of type OuterClass (e.g. x.new A()
		 * where x is an instance of OuterClass). 
		 * 
		 * NonStaticInnerClass nonStaticInnerClass = new NonStaticInnerClass();
		 */
		
		NonStaticInnerClass nonStaticInnerClass = class1.new NonStaticInnerClass();
		nonStaticInnerClass.method();
	}

	class NonStaticInnerClass {

		/*
		 * //The method m1 cannot be declared static; static methods can only be
		 * declared in a static or top level type 
		 * 
		 * private static void m1() {
		 * System.out.println("in static m1"); }
		 */

		private void method() {
			System.out.println("non static inner class method");
		}

	}

	static class InnerClass {

		int y=1;
		private static void m1() {
			System.out.println("in static m1");
		}

		private void m2() {
			System.out.println("non static method of inner class, valur os y is"+this.y);
		}

	}

}
