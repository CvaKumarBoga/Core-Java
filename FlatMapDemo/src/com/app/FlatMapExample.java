package com.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

	String str = "Hi Siva Hi Ravi Hi Sunil Hi Kumar";
	public static void main(String[] args) {
		Integer [][] arr = { {20,10} , {30,40} , {31,42} , {50,18} , {11,22} };

		//Convert 2D array in to list
		
		/**
		 * Convert the 2-d array into stream. 
		 * Map each element in stream (which should be an array) into a List using Arrays::asList API 
		 * Reduce the stream into a new List
		 */
		
		List<List<Integer>> l = Arrays.stream(arr)
				.map(Arrays::asList)
				.collect(Collectors.toList());
		System.out.println("Convert 2D in to list: "+l);
		
		//Covert multiple objects in to single list using flat map
		List<Integer> collect = l.stream().flatMap(list->list.stream()).collect(Collectors.toList());
		System.out.println("\nConverting to one flat Object: "+collect);

		//FlatMap is will convert complex object to small objects
		ArrayList<String> al = new ArrayList<>();
		al.add("Hi hello siva");
		al.add("hi hello ravi hi hello suman");

		Stream<String> flatMap = al.stream().flatMap((String s)->{
			String[] val = s.split(" ");
			return Arrays.asList(val).stream();
		});
		
		/*
		 * List<String> collect1 = flatMap.collect(Collectors.toList());
		 * System.out.println(collect1);
		 */

		/*Objects print individually
		 * Object[] array = flatMap.toArray();
		 *	for(Object o:array) {
		 *	System.out.println(o);
		 *}
		 */
		flatMap.forEach((x)->{
			System.out.println(x);
		});
	} 
}

