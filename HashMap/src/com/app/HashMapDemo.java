package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * HashMap is implementation class of Map interface,HashMap is storing the element in key and value 
 * format and Hash map does not allow the duplicate keys but allow duplicate values and HashMap is not
 * Synchronized.
 */
public class HashMapDemo {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		/* Key and value pair */
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(101,"Siva");
		map.put(102,"Kumar");
		map.put(103,"Raghu");
		map.put(104,"Peter");

		for(Map.Entry e:map.entrySet()) {
			System.out.println(e.getKey()+" -> "+e.getValue());
		}
		
		/* One key and multiple values */
		
		HashMap<Integer,List<String>> mlist = new HashMap<>();

		ArrayList<String> list = new ArrayList<>();
		list.add("siva");
		list.add("Ramesh");
		list.add("Bharath");
		mlist.put(105,list);
		System.out.println("\n"+mlist);
		System.out.println(mlist.get(105)+"\n");
		
		/* 
		 * Synchronized HashMap we need to use Collections.synchronizedMap(hashmap).It returns a
		 * thread safe map backed up by the specified HashMap.Other important point is to note 
		 * that iterator should be used in a synchronized block even if we have synchronized the
		 * HashMap explicitly.
		 */
		HashMap<Integer,String> m2 = new HashMap<>();
		m2.put(111, "Apple");
		m2.put(112, "Mango");
		m2.put(113, "Banana");
		m2.put(114, "Grapes");
	//	m2.put(112,"AAA");
		Map syn = Collections.synchronizedMap(m2);
		Set set = syn.entrySet();

		synchronized (syn) {
			Iterator iterator = set.iterator();
			//Display elements
			while (iterator.hasNext()) {
				Map.Entry e = (Map.Entry) iterator.next();
				System.out.println(e.getKey()+" -> "+e.getValue());
			}
			System.out.println("Size is: "+m2.size());
		}
	}
}
