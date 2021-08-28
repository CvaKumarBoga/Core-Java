package com.app.overriding;

public class Child extends Parent{
	
	public void property() {
		Parent p = new Parent();
		int hisProperty = 2;
		System.out.println("Child got "+p.property+"cros property of his parent in 2019.");
		System.out.println("Child having "+(hisProperty)+"cros property 2021.--->Total: "
		+(p.property+hisProperty) +"cros");
	}

	/*
	 * static methods can't be overriding because static method is invoked by class
	 * loading time but overriding concept is related to load runtime and static
	 * method is share the same copy of data in every object.
	 */
	//@Override
	public static void DNA() {
		final String str= "negative";
		System.out.println("Child is tested DNA test result is: "+str);
	}

}
