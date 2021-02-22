package com.collections.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListEqualCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(3);
		list1.add(2);
		list1.add(null);
		
		list2.add(2);
		list2.add(1);
		list2.add(3);
//		list.add
//		(1,2,4)
//		list2 (4,2,1)
		System.out.println(list1);
		
		Collections.sort(list2,(a,b)->b.compareTo(a));
		System.out.println(list2);
		
		if(list1.equals(list2)) {
			System.out.println("equal");
		}else {
			System.out.println("Not equ");
		}

		// ? what this will return ?
		
		ListIterator<Integer> iterator = list2.listIterator();//list1.iterator();
		while (iterator.hasPrevious()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
			iterator.remove();
			
		}
		System.out.println(list1+"hi");
	}

}
