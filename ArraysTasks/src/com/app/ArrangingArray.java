package com.app;

public class ArrangingArray {
	public static void main(String[] args) {
		Integer arr[]= {1,2,0,3,4,0,5,0,8};
		
        int current = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[current] = arr[i];
                current--;
            }
        }
        System.out.println(current);
        
        while (current >= 0) {
            arr[current] = 0;
            current--;
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
		
	}

}
