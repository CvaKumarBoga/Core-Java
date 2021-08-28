package com.app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintOccurrence {
	Integer arr[] = {1,2,5,3,5,1,2,3,4,3,9,3};
	List<Integer> list = Arrays.asList(arr);
	int count = 0;
	public void display(int num) {
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==num)
				count++;
			System.out.println(count);
		}
		

		int frequency = Collections.frequency(list, num);
		System.out.println(frequency);
		System.out.println(Arrays.asList(arr));
	}

	public static void main(String[] args) {
		PrintOccurrence o = new PrintOccurrence();
		o.display(3);
	}

}
