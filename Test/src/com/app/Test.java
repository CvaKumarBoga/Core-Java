package com.app;

import java.util.Scanner;

public class Test {
	
	public void fun(int a, int b) {
		System.out.println("Addition is: "+(a+b));
	}
	
	public void fun(int a, int b, int c) {
		System.out.println("Multiplication is: "+(a*b*c));
	}
	
	public void fun(int a, int b, int c,int d) {
		System.out.println("Subtraction is: "+(a-b-c-d));
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of nmbers: ");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter numbers: ");

		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		
		Test test = new Test();
		if(arr.length == 2) 
			test.fun(arr[0], arr[1]);
		else if (arr.length == 3) 
			test.fun(arr[0], arr[1], arr[2]);	
		else 
			test.fun(arr[0], arr[1], arr[2], arr[3]);
	}

}
