package com.app;

public class ArrangeArrays {
	public static void main(String[] args) {
		int arr[] = {1,0,3,5,7,0,8,0,6};
		
		int start = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				arr[start] = arr[i];
				start ++;		
			}
		}
		while (start <= arr.length-1) {
			arr[start] = 0;
			start ++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		
	}

}
