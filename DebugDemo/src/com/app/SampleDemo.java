package com.app;

public class SampleDemo {

	public static void main(String[] args) {

		int a = 12;

		int b = 10;

		m1();
		a = a+10;

		b = b+10;

		if(a>b) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}

		m2();

	}

	public static void m1() {
		System.out.println("m1 Method");
	}

	public static void m2() {
		System.out.println("m2 Method");
	}

}
