package com.app;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int arr[]= {1,2,3,1,4,3,7,8,5,9,5};

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					arr[j]=0;
				}
			}
		}

		//Here array size is fix 
		for (int k = 0; k < arr.length; k++) {
			if(arr[k]!=0) {
				System.out.print(arr[k] +" ");
			}
		}
	}
}
