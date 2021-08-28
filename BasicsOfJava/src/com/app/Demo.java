package com.app;

public class Demo {
	/**
	 * @Author Sivakumar Boga
	 */
	public static void main(String[] args) {
		
		/* break statement is transfer the control from inside loop to outside loop */
		for(int i=0;i<=10;i++) {
			System.out.print(i);
			if(i==5)
				break;
		}
		System.out.println("\nOut side loop");
		/*
		 * continue statement is used to skip the current iteration and continue
		 * remaining
		 */
		for(int i=0;i<=15;i++) {
			if(i%2==0)
				continue;
			System.out.println(i);
		}
	}
}
