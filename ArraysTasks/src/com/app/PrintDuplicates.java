package com.app;

public class PrintDuplicates {
	public static void main(String[] args) {
		int arr[]= {1,2,3,1,4,3,7,8,5,9,5};

		System.out.print("Duplicates: ");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.print(" "+arr[j]);
				}
			}
		}
	}
}
