package com.collections.lists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import com.beans.Employee;

public class SomethingTricky {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>();

		Employee employee = new Employee(100, "Coolie");
		Employee employee2 = new Employee(100, "Hero");

		list.add(new Employee(400, "Xyz"));
		list.add(new Employee(200, "Sumit"));
		list.add(employee);
		list.add(employee2);
		list.add(new Employee(300, "Luthra"));

		System.out.println(list);

		ArrayList<Employee> listFiltered = new ArrayList<Employee>();

		for (Employee e : list) {
			if (e.getId() > 200) {
				listFiltered.add(e);
			}
		}

		// List<Employee> listFiltered = list.stream().filter(e ->
		// e.getId()>200).collect(Collectors.toList());

		for (Employee e : listFiltered) {
			if (e.getId() == 400) {
				e.setName("Vardan");
			}
		}
		System.out.println(listFiltered);
		System.out.println(list);

	}
}
