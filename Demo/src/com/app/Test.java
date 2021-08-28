package com.app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1,"ACB",20000));
		list.add(new Employee(2,"BSA",15000));
		list.add(new Employee(3,"ADC",25000));
		list.add(new Employee(4,"DRE",30000));
		list.add(new Employee(5,"EBN",18000));
		list.add(new Employee(6,"FSD",35000));
		list.add(new Employee(7,"DGJ",25000));
		list.add(new Employee(8,"HDQ",28000));
		list.add(new Employee(9,"DEI",30000));
		list.add(new Employee(10,"WRJ",22000));
		
		
		//Sort
		list.sort((Employee e1,Employee e2)->e1.getSalary().compareTo(e2.getSalary()));
		list.forEach(System.out::print);
		
		//Get based on salary value
		list.stream().filter(emp->emp.getSalary() > 20000).forEach(System.out::print);
		System.out.println();
		
		//Get Start with character
		list.stream().filter(emp->emp.getName().startsWith("D")).forEach(System.out::print);
		
		//Print average salary
		System.out.println();
		Double collect = list.stream().collect(Collectors.averagingInt(Employee::getSalary));
		System.out.println("Average Salary: "+collect);
		
		//Minimum salary
		Optional<Employee> collect2 = list.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
		if (collect2.isPresent()) {
			System.out.println(collect2.get());
		}
		
		//Maximum salary
		Optional<Employee> collect3 = list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		if(collect3.isPresent()) {
			System.out.println(collect3.get());
		}
		
		//Getting Equal salary employees
		Map<Integer, List<Employee>> collect4 = list.stream().collect(Collectors.groupingBy(Employee::getSalary));
		Set<Entry<Integer, List<Employee>>> entrySet = collect4.entrySet();
		System.out.println(entrySet);
		for (Entry<Integer, List<Employee>> entry : entrySet) {
			if (entry.getKey()==25000) {
				System.out.println(entry.getValue());
			}
			
		}
		
		
	}
}
