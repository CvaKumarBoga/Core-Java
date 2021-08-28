package com.app.streem;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreemDemo {
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Siva");
		list.add("Sreenu");
		list.add("Pavan");
		list.add("Sunny");
		list.add("Kumar");
		list.add("Kumar");
		
		String string = list.get(1);
		System.out.println(string);
		char e = 'e';
		
		List<String> collect2 = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect2);
		
		long count = string.chars().filter(s->s == e).count();
		System.out.println("******"+count);
		
		Stream<String> filter = list.stream().filter(name -> name.startsWith("S"));
		List<String> collect = filter.collect(Collectors.toList());
		System.out.println(collect);
		
		long count2 = list.stream().filter(name -> name.startsWith("S")).count();
		System.out.println(count2);
		
		List<String> list2 = list.stream().distinct().collect(Collectors.toList());
		System.out.println(list2);
	
	}

}
