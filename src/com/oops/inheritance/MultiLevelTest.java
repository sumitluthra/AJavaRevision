package com.oops.inheritance;

public class MultiLevelTest {

	public static void main(String[] args) {
		int balance=100;
		int withdraw=200;
		try {
		assert(withdraw<balance):"balance is less";
		}catch(Throwable e) {
			System.out.println("hi..less balance bro"+e.getMessage());
			e.printStackTrace();
		}
		
		Parent p = new Parent();
		p.p1();
		p.common();
		System.out.println("---------------");
		Child c = new Child();
		c.c1();
		c.p1();
		c.c2();
		c.common();
		System.out.println("---------------Overidingcase--------");
		Parent parent = new Child();
		parent.p1();
//		parent.c1(); The method c1() is undefined for the type Parent
		parent.common();
		System.out.println("---------------Overidingcase-2 not possible-------");
		//Exception in thread "main" java.lang.ClassCastException:
		Child child = (Child) new Parent();
		
		
	}
}
