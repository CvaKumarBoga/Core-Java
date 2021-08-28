package com.app;

import java.util.ArrayList;

/*ArrayList is implementation class of list interface,It allow duplicates, null values and not 
 * synchronized*/
public class ArrayListDemo {
	
	public static void main(String[] args) {
		//Initialize array list
		ArrayList<Integer> al = new ArrayList<>();
		//add student to list
		al.add(1102091);
		al.add(1102092);
		al.add(1102093);
		al.add(1102094);
		al.add(1102091);
		//remove
		al.remove(0);
		//replace
		al.set(0, 1102099);
		//get one element
		System.out.println("Get no: "+al.get(2));

		for (Integer str:al) {
			System.out.println("Student roll no's is "+str);
		}
	}

}
