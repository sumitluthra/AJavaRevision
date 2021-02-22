package com.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.beans.Employee;

public class TreeSetDemo {

	public static void main(String[] args) {
		Employee employee = new Employee(100, "Coolie");
		Employee employee2 = new Employee(100, "Hero");
//		Set<Employee> set = new TreeSet<>();
		Set<Employee> set = new HashSet<>();
		
		set.add(new Employee(400, "Xyz"));
		set.add(new Employee(200, "Sumit"));
		set.add(employee);
		set.add(employee2);
		set.add(new Employee(300, "Luthra"));
		
		System.out.println(employee.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println(set);
	}
}
