package com.app;

import java.util.Scanner;

import com.app.phone.OS;
import com.app.phone.OSFactory;

public class FactoryMain {
	public static void main(String[] args) {
		OSFactory osFactory = new OSFactory();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product:");
		String input = sc.next();
		OS instance = osFactory.getInstance(input);
		instance.spec();
	}
}
