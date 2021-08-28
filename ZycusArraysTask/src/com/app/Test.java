package com.app;

import java.util.Arrays;
import java.util.Scanner;

/**
Input:
N = 5
A[] = {5,5,4,6,4}
Output: 4 4 5 5 6
 */
public class Test {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements in array: ");
		for(int i=0;i<size;i++) {
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}
}
