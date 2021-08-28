package com.app.overriding;

public class Parent {
	
	int property = 5;
	final static String str= "positive";
	
	public void property() {
		System.out.println("Parent share "+property+"cros property his Child in 2019.");
	}
	
	public static void DNA() {
		System.out.println("Parent and child is tested DNA test result is: "+str);
	}

}
