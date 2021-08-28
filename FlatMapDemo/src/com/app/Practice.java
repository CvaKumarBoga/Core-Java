package com.app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {

	public static void main(String[] args) {
		Integer[][] arr = {{10,20},{21,72},{15,16},{18,50},{44,21}};
		//convert to list
		List<List<Integer>> li = Arrays.stream(arr)
				.map(Arrays::asList)
				.collect(Collectors.toList());
		System.out.println(li);

		//convert single list
		List<Integer> collect = li.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(collect);

		//split the objects
		Integer[] res = Stream.of(arr).flatMap(Stream::of).toArray(Integer[]::new);
		for(Integer i:res) {
			System.out.print("  "+i);
		}
	}
}
