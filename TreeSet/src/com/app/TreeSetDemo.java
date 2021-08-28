package com.app;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return i2.compareTo(i1);
			};
		});
		set.add(15);
		set.add(25);
		set.add(05);
		set.add(55);
		set.add(35);
		set.add(45);
		/* By default print in sorted order */
		System.out.println(set);
		/* If we want in descending order we need to implement comparator interface */
		System.out.println(set);
	}

}
