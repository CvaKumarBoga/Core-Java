package com.app.sort;

import java.util.ArrayList;
import com.app.app.Employee;

public class SortingDemo {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Siva", "Dev", 40000.0);
		Employee e2 = new Employee("Pavan", "Test", 30000.0);
		Employee e3 = new Employee("Ravi", "UAT", 44000.0);
		Employee e4 = new Employee("Jani", "HR", 50000.0);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.forEach((s)->System.out.println(s));
		
		System.out.println();
		list.sort((Employee emp1,Employee emp2)->emp2.getSal().compareTo(emp1.getSal()));
		list.forEach((s)->System.out.println(s));
		
		System.out.println();
		list.sort((Employee emp1,Employee emp2)->emp1.getSal().compareTo(emp2.getSal()));
		list.forEach((s)->System.out.println(s));	
	}
}
